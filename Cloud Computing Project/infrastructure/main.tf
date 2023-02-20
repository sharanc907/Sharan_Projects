

resource "aws_vpc" "vpc01" {
  cidr_block                       = var.vpc_cider
  instance_tenancy                 = "default"
  enable_dns_support               = local.enable_dns_support
  enable_dns_hostnames             = local.enable_dns_hostnames
  enable_classiclink_dns_support   = local.enable_classiclink_dns_support
  assign_generated_ipv6_cidr_block = local.assign_generated_ipv6_cidr_block

  tags = {
    
  }
}
locals {
 
  enable_dns_support               = true
  enable_dns_hostnames             = true
  enable_classiclink_dns_support   = true
  assign_generated_ipv6_cidr_block = false
}

resource "aws_subnet" "vpc02" {
  depends_on              = [aws_vpc.vpc_01]
  count                   = length(var.subnet_cidrs)
  vpc_id                  = aws_vpc.vpc_01.id
  cidr_block              = var.subnet_cidrs[count.index]
  availability_zone       = var.subnet_az[count.index]
  map_public_ip_on_launch = true

  tags = {
    Name = var.subnet_names[count.index]
  }
}

resource "aws_internet_gateway" "gateway" {
  depends_on = [aws_vpc.vpc_01]
  vpc_id     = aws_vpc.vpc_01.id

  tags = {
    Name = ""
  }
}

resource "aws_route_table" "tab" {
  depends_on = [aws_vpc.vpc_01, aws_internet_gateway.vpc_01_internet-gateway]
  vpc_id     = aws_vpc.vpc_01.id

  route {
    cidr_block = "0.0.0.0/0"
    gateway_id = aws_internet_gateway.vpc_01_internet-gateway.id
  }

  tags = {
    Name = "vpc_01 Route Table"
  }
}

resource "aws_route_table_association" "subnetroutetable" {
  count          = length(var.subnet_cidrs)
  subnet_id      = aws_subnet.vpc_01_subnet[count.index].id
  route_table_id = aws_route_table.vpc_01_route-table.id
}

data "aws_ami" "csyeami" {
  most_recent = true

  owners = ["485491949476", "196158705191"]

  filter {
    name   = "name"
    values = ["csye6225-fall2021-*"]
  }

  filter {
    name   = "root-device-type"
    values = ["ebs"]
  }

  filter {
    name   = "virtualization-type"
    values = ["hvm"]
  }

  filter {
    name   = "state"
    values = ["available"]
  }
}

resource "aws_security_group" "app" {
  name        = "application"
 


  ingress = [
    {
      from_port        = 443
      to_port          = 443
      protocol         = "tcp"
      
      cidr_blocks      = [aws_vpc.vpc_01.cidr_block]
      ipv6_cidr_blocks = []
      prefix_list_ids  = []
      security_groups  = []
      self             = false
    },
    {
      from_port        = 22
      to_port          = 22
      protocol         = "tcp"
      
      cidr_blocks      = ["0.0.0.0/0"]
      ipv6_cidr_blocks = []
      prefix_list_ids  = []
      security_groups  = []
      self             = false
    },
    {
      from_port        = 80
      to_port          = 80
      protocol         = "tcp"
      
      cidr_blocks      = [aws_vpc.vpc_01.cidr_block]
      ipv6_cidr_blocks = []
      prefix_list_ids  = []
      security_groups  = []
      self             = false
    },
    {
     
      from_port        = 3000
      to_port          = 3000
      protocol         = "tcp"
      cidr_blocks      = ["0.0.0.0/0"]
      ipv6_cidr_blocks = []
      prefix_list_ids = []
      security_groups = []
      self = false
    }
  ]
egress = [
    {
     
      from_port        = 80
      to_port          = 80
      protocol         = "tcp"
      cidr_blocks      = ["0.0.0.0/0"]
      ipv6_cidr_blocks = []
      prefix_list_ids = []
      security_groups = []
      self = false
    },
    {
     
      from_port        = 443
      to_port          = 443
      protocol         = "tcp"
      cidr_blocks      = ["0.0.0.0/0"]
      ipv6_cidr_blocks = []
      prefix_list_ids = []
      security_groups = []
      self = false
    },
    {
      
      from_port        = 3306
      to_port          = 3306
      protocol         = "tcp"
      cidr_blocks      = ["0.0.0.0/0"]
      ipv6_cidr_blocks = []
      prefix_list_ids = []
      security_groups = []
      self = false
    },
  ]
  tags = {
    Name = "app"
  }
}

resource "aws_security_group" "db" {

  depends_on  = [aws_vpc.vpc_01, aws_security_group.application]
  name        = "db"
 
  vpc_id      = aws_vpc.vpc_01.id

  ingress = [
    {
     
      from_port        = 3306
      to_port          = 3306
      protocol         = "tcp"
      cidr_blocks      = [aws_vpc.vpc_01.cidr_block]
      security_groups  = [aws_security_group.application.id]
      self             = false
      ipv6_cidr_blocks = []
      prefix_list_ids  = []
    }
  ]
  tags = {
    Name = "database"
  }
}

resource "aws_db_subnet_group" "subrds" {
  name = "subrds"
  subnet_ids = [aws_subnet.vpc_01_subnet[0].id, aws_subnet.vpc_01_subnet[1].id, aws_subnet.vpc_01_subnet[2].id]

  tags = {
    Name = "rds"
  }
}


resource "aws_db_parameter_group" "rds" {
  name   = "rds"
  family = "mysql5.6"

 

resource "aws_db_instance" "csye6225fall2021" {

  engine                 = "mysql"
  engine_version         = "5.7"
  instance_class         = "db.t3.micro"
  name                   = "admin"
  username               = "admin"
  password               = var.password
  db_subnet_group_name   = aws_db_subnet_group.rds-subnet.name
  vpc_security_group_ids = [aws_security_group.database.id]

  multi_az                  = false
  identifier                = "csye6225"
  publicly_accessible       = false
  allocated_storage         = 10
  apply_immediately         = true
  backup_retention_period   = 0
  final_snapshot_identifier = true
  skip_final_snapshot =  true
}
resource "random_string" "buckname" {
 upper   = false
 lower   = true
 special = false
 length  = 3
}

resource "aws_s3_bucket" "s3bucket" {
  bucket = "${random_string.s3_bucket_name.id}.${var.aws_profile}.${var.s3_domain}"
  acl    = "private"
  force_destroy = true

    lifecycle_rule {
        id      = "long-term"
        enabled = true

        transition {
            days          = 30
            storage_class = "STANDARD_IA"
        }
    }

    server_side_encryption_configuration {
        rule {
            apply_server_side_encryption_by_default {
                sse_algorithm = "aws:kms"
            }
        }
    }
}

data "template_file" "dataconfig" {
  template = <<-EOF
		
        cd home/ubuntu
        mkdir server
        cd server
        echo "{\"db_host\":\"${aws_db_instance.csye6225.endpoint}\",\"db_user\":\"csye6225\",\"db_password\":\"${var.password}\",\"default_database\":\"csye6225\",\"port\":3306,\"s3_bucket\":\"${aws_s3_bucket.s3.bucket}\"}" > config.json
        cd ..
        sudo chmod -R 777 server
    EOF
}

resource "aws_iam_role" "accessrole" {
  name               = "EC2-CSYE6225"
  assume_role_policy = jsonencode({
    Version = "2012-10-17"
    Statement = [
      {
        Action = "sts:AssumeRole"
        Effect = "Allow"
        Sid    = ""
        Principal = {
          Service = "ec2.amazonaws.com"
        }
      },
    ]
  })
}

resource "aws_iam_policy" "webappolicy" {
    name = "WebAppS3"
   
    policy = <<-EOF
    {
    "Version": "2012-10-17",
    "Statement": [
        {
            "Action": [
              "s3:ListAllMyBuckets", 
              "s3:GetBucketLocation",
              "s3:GetObject",
              "s3:PutObject"
            ],
            "Effect": "Allow",
            "Resource": [
                "arn:aws:s3:::${aws_s3_bucket.s3.id}",
                "arn:aws:s3:::${aws_s3_bucket.s3.id}/*"
            ]
        }
    ]
    }
    EOF
}
        
resource "aws_iam_role_policy_attachment" "attachpolicy" {
  role       = aws_iam_role.ec2_s3_access_role.name
  policy_arn = aws_iam_policy.policy.arn
}

resource "aws_iam_instance_profile" "s3pro" {                             
    name  = "profile"                         
    role = aws_iam_role.ec2_s3_access_role.name
}


resource "aws_instance" "appcsye" {

  depends_on = [aws_db_instance.csye6225]
  ami           = data.aws_ami.csye_6225_custom_ami.id
  instance_type = "t2.micro"
  vpc_security_group_ids  = [aws_security_group.application.id]
  disable_api_termination = false

  subnet_id = aws_subnet.vpc_01_subnet[0].id
  key_name  = var.ec2_key

  root_block_device {
    delete_on_termination = true
    volume_size           = 20
    volume_type           = "gp2"
  }

  iam_instance_profile = "${aws_iam_instance_profile.s3_profile.name}"
    user_data = data.template_file.config_data.rendered
    tags = {
    Name = "appcsyeinstance"
  }
}
resource "aws_launch_configuration" "con" {
  name                   = "asfconf"
  image_id               =  data.aws_ami.csye_6225_custom_ami.id
  instance_type          = "t2.micro"
  security_groups        = ["${aws_security_group.application.id}"]
  key_name               = var.ec2_key
  iam_instance_profile   = "${aws_iam_instance_profile.s3_profile.name}"
  associate_public_ip_address = true
  user_data                   = data.template_file.config_data.rendered

  root_block_device {
    volume_type           = "gp2"
    volume_size           = 20
    delete_on_termination = true
  }
  depends_on = [aws_s3_bucket.s3, aws_db_instance.csye6225]
}



resource "aws_iam_role_policy" "deployec" {
  name = "cdec2"
  role = "${aws_iam_role.ec2_s3_access_role.id}"

  policy = <<EOF
{
  "Version": "2012-10-17",
  "Statement": [
    {
      "Action": [
        "s3:Get*",
        "s3:List*",
        "s3:PutObject",
        "s3:DeleteObject",
        "s3:DeleteObjectVersion"
      ],
      "Effect": "Allow",
      "Resource": [
        "arn:aws:s3:::codedeploy.${var.aws_profile_name}.${var}}/*",
        "arn:aws:s3:::webapp.${var.aws_profile_name}.${var}/*"
      ]
    }
  ]
}
EOF
}

resource "aws_iam_policy" "githubs3upl" {
  name   = "gh_uplogithubs3uplad_s3"
  policy = <<EOF
{
    "Version": "2012-10-17",
    "Statement": [
        {
            "Effect": "Allow",
            "Action": [
                  "s3:Get*",
                  "s3:List*",
                  "s3:PutObject",
                  "s3:DeleteObject",
                  "s3:DeleteObjectVersion"
            ],
            "Resource": [
                "arn:aws:s3:::codedeploy.${var.aws_profile_name}.${var.}",
                "arn:aws:s3:::codedeploy.${var.aws_profile_name}.${var.}/*"
              ]
        }
    ]
}
EOF
}



resource "aws_iam_policy" "cdgh" {
  name   = "cdgh"
  policy = <<EOF
{
  "Version": "2012-10-17",
  "Statement": [
    {
      "Effect": "Allow",
      "Action": [
        "codedeploy:RegisterApplicationRevision",
        "codedeploy:GetApplicationRevision"
      ],
      "Resource": [
        "arn:aws:codedeploy:${var.region}:${local.aws_user_account_id}:application:${aws_codedeploy_app.code_deploy_app.name}"
      ]
    },
    {
      "Effect": "Allow",
      "Action": [
        "codedeploy:CreateDeployment",
        "codedeploy:GetDeployment"
      ],
      "Resource": [
         "arn:aws:codedeploy:${var.region}:${local.aws_user_account_id}:deploymentgroup:${aws_codedeploy_app.code_deploy_app.name}/${aws_codedeploy_deployment_group.code_deploy_deployment_group.deployment_group_name}"
      ]
    },
    {
      "Effect": "Allow",
      "Action": [
        "codedeploy:GetDeploymentConfig"
      ],
      "Resource": [
        "arn:aws:codedeploy:${var.region}:${local.aws_user_account_id}:deploymentconfig:CodeDeployDefault.OneAtATime",
        "arn:aws:codedeploy:${var.region}:${local.aws_user_account_id}:deploymentconfig:CodeDeployDefault.HalfAtATime",
        "arn:aws:codedeploy:${var.region}:${local.aws_user_account_id}:deploymentconfig:CodeDeployDefault.AllAtOnce"
      ]
    }
  ]
}
EOF
}


resource "aws_iam_role" "cd" {
  name = "deploy"

  assume_role_policy = <<EOF
{
  "Version": "2012-10-17",
  "Statement": [
    {
      "Sid": "",
      "Effect": "Allow",
      "Principal": {
        "Service": "codedeploy.amazonaws.com"
      },
      "Action": "sts:AssumeRole"
    }
  ]
}
EOF
}

resource "aws_iam_policy" "gactions" {
  name   = "action"
  policy = <<-EOF
  {
      "Version": "2012-10-17",
      "Statement": [{
        "Effect": "Allow",
        "Action": [
          "ec2:AttachVolume",
          "ec2:AuthorizeSecurityGroupIngress",
          "ec2:CopyImage",
          "ec2:CreateImage",
          "ec2:CreateKeypair",
          "ec2:CreateSecurityGroup",
          "ec2:CreateSnapshot",
          "ec2:CreateTags",
          "ec2:CreateVolume",
          "ec2:DeleteKeyPair",
          "ec2:DeleteSecurityGroup",
          "ec2:DeleteSnapshot",
          "ec2:DeleteVolume",
          "ec2:DeregisterImage",
          "ec2:DescribeImageAttribute",
          "ec2:DescribeImages",
          "ec2:DescribeInstances",
          "ec2:DescribeInstanceStatus",
          "ec2:DescribeRegions",
          "ec2:DescribeSecurityGroups",
          "ec2:DescribeSnapshots",
          "ec2:DescribeSubnets",
          "ec2:DescribeTags",
          "ec2:DescribeVolumes",
          "ec2:DetachVolume",
          "ec2:GetPasswordData",
          "ec2:ModifyImageAttribute",
          "ec2:ModifyInstanceAttribute",
          "ec2:ModifySnapshotAttribute",
          "ec2:RegisterImage",
          "ec2:RunInstances",
          "ec2:StopInstances",
          "ec2:TerminateInstances"
        ],
        "Resource" : "*"
      }]
  }
  EOF

}



resource "aws_codedeploy_app" "app" {
  compute_platform = "Server"
  name             = "csye6225-webapp"
}

resource "aws_codedeploy_deployment_group" "group" {
  app_name               = "${aws_codedeploy_app.code_deploy_app.name}"
  deployment_group_name  = "csye6225-webapp-deployment"
  deployment_config_name = "CodeDeployDefault.AllAtOnce"
  service_role_arn       = "${aws_iam_role.code_deploy_role.arn}"
  autoscaling_groups = ["${aws_autoscaling_group.autoscaling.name}"]

  

  deployment_style {
    deployment_option = "WITHOUT_TRAFFIC_CONTROL"
    deployment_type   = "IN_PLACE"
  }

  auto_rollback_configuration {
    enabled = true
    events  = ["DEPLOYMENT_FAILURE"]
  }

  depends_on = [aws_codedeploy_app.code_deploy_app]
}






resource "aws_iam_role_policy_attachment" "deployrole" {
  policy_arn = "arn:aws:iam::aws:policy/service-role/deployrole"
  role       = "${aws_iam_role.code_deploy_role.name}"
}

resource "aws_iam_user_policy_attachment" "policyattach" {
  user       = "app"
  policy_arn = "${aws_iam_policy.ghactions-app_user_policy.arn}"
}

resource "aws_iam_user_policy_attachment" "ghactions-app_s3_policy_attach" {
  user       = "app"
  policy_arn = "${aws_iam_policy.gh_upload_s3.arn}"
}


resource "aws_iam_user_policy_attachment" "ghactions-app_codedeploy_policy_attach" {
  user       = "app"
  policy_arn = "${aws_iam_policy.GH_Code_Deploy.arn}"
}




 
data "aws_route53_zone" "r53" {
  name         = "${var.}"
  private_zone = false
}



resource "aws_iam_role_policy_attachment" "cwa" {
  policy_arn = "arn:aws:iam::aws:policy/CloudWatchAgentServerPolicy"
  role       = "${aws_iam_role.ec2_s3_access_role.name}"
}




resource "aws_lb_target_group" "atb" {
  name     = "atb"
  port     = "8000"
  protocol = "HTTP"
  vpc_id   = "${aws_vpc.vpc_01.id}"
  tags = {
    name = "albTargetGroup"
  }
  health_check {
    healthy_threshold   = 3
    unhealthy_threshold = 5
    timeout             = 5
    interval            = 30
    path                = "/healthstatus"
    port                = "8000"
    matcher             = "200"
  }
}
resource "aws_autoscaling_group" "as" {
  name                 = "atb-group"
  launch_configuration = "${aws_launch_configuration.as_conf.name}"
  min_size             = 3
  max_size             = 5
  default_cooldown     = 60
  desired_capacity     = 3
  vpc_zone_identifier = ["${aws_subnet.vpc_01_subnet[0].id}"]
  target_group_arns = ["${aws_lb_target_group.albTargetGroup.arn}"]
  tag {
    key                 = "Name"
    value               = "myEC2Instance"
    propagate_at_launch = true
  }
}

resource "aws_autoscaling_policy" "wssp" {
  name                   = "wssp"
  adjustment_type        = "ChangeInCapacity"
  autoscaling_group_name = "${aws_autoscaling_group.autoscaling.name}"
  cooldown               = 60
  scaling_adjustment     = 1
}

resource "aws_autoscaling_policy" "wssd" {
  name                   = "wssd"
  adjustment_type        = "ChangeInCapacity"
  autoscaling_group_name = "${aws_autoscaling_group.autoscaling.name}"
  cooldown               = 60
  scaling_adjustment     = -1
}

resource "aws_cloudwatch_metric_alarm" "sd" {
  alarm_name                = "terraform-sd"
  comparison_operator       = "LessThanOrEqualToThreshold"
  evaluation_periods        = "2"
  metric_name               = "CPUUtilization"
  namespace                 = "AWS/EC2"
  period                    = "120"
  statistic                 = "Average"
  threshold                 = "3"
  
  alarm_actions             = ["${aws_autoscaling_policy.WebServerScaleDownPolicy.arn}"]
  insufficient_data_actions = []
}

resource "aws_cloudwatch_metric_alarm" "su" {
  alarm_name                = "terraform-scaleUp"
  comparison_operator       = "GreaterThanOrEqualToThreshold"
  evaluation_periods        = "2"
  metric_name               = "CPUUtilization"
  namespace                 = "AWS/EC2"
  period                    = "120"
  statistic                 = "Average"
  threshold                 = "5"
  
  alarm_actions     = ["${aws_autoscaling_policy.WebServerScaleUpPolicy.arn}"]

  insufficient_data_actions = []
}



resource "aws_security_group" "lb" {
  name   = "loadBalance_security_group"
  vpc_id = "${aws_vpc.vpc_01.id}"
  ingress {
    from_port   = 80
    to_port     = 80
    protocol    = "tcp"
    cidr_blocks = ["0.0.0.0/0"]
  }
  egress {
    from_port   = 0
    to_port     = 0
    protocol    = "-1"
    cidr_blocks = ["0.0.0.0/0"]
  }
  tags = {
    Name        = "LoadBalancer Security Group"
    Environment = "${var.aws_profile_name}"
  }
}


resource "aws_lb" "albr" {
  name               = "albr"
  internal           = false
  load_balancer_type = "application"
  security_groups    = ["${aws_security_group.loadBalancer.id}"]
  subnets            = "${aws_subnet.vpc_01_subnet.*.id}"
  ip_address_type    = "ipv4"
  tags = {
    Environment = "${var.aws_profile_name}"
    Name        = "applicationLoadBalancer"
  }
}

resource "aws_lb_listener" "wlr" {
  load_balancer_arn = "${aws_lb.application-Load-Balancer.arn}"
  port              = "80"
  protocol          = "HTTP"
  default_action {
    type             = "forward"
    target_group_arn = "${aws_lb_target_group.albTargetGroup.arn}"
  }
}

