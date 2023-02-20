variable "vpc_cider" {
  type        = string
 
}

variable "vpc_name" {
  type        = string
  
}
variable "subnet_cidrs" {
  type        = list(string)
 
}

variable "subnet_az" {
  type        = list(string)

}

variable "subnet_names" {
  type        = list(string)
 
}

variable "password" {
  type        = string
 
}

variable "ec2_key" {
  type        = string
 
}

variable "aws_profile" {
  type        = string
  

variable "s3_domain" {
  type = string
}

variable "s3_name" {
  type = string
}

variable "aws_profile_name"{
    type = string
}
variable "domain_Name"{
    type = string
}

variable "region" {
  type = string
}