CREATE OR REPLACE PACKAGE INSERTION
AS
PROCEDURE INSRT_USERTYPE(usertp in VARCHAR,charges in NUMBER);
PROCEDURE INSRT_USER1(fn in VARCHAR, ln in VARCHAR, email in VARCHAR,un in VARCHAR,pn in NUMBER,loc in VARCHAR,idp in VARCHAR,utid in number);
PROCEDURE INSRT_DISTRIBUTOR(rate in NUMBER, dname in VARCHAR);
PROCEDURE INSRT_STATION(sname in VARCHAR, lat in DECIMAL, lon in DECIMAL);
PROCEDURE INSRT_ELECTRICITY_CONSUMPTION(unit in NUMBER, stid in NUMBER, did in NUMBER);
PROCEDURE INSRT_BIKE(pyear in DATE, avail in VARCHAR, stid in NUMBER);
PROCEDURE INSRT_DEPARTMENT(dpname in VARCHAR);
PROCEDURE INSRT_EMPLOYEE(empname in VARCHAR,dpid in NUMBER);
PROCEDURE INSRT_CLIENT_SUPPORT(msg in VARCHAR,status in VARCHAR,empid in NUMBER, uid in number,tdate in TIMESTAMP);
PROCEDURE INSRT_MAINTENANCE_TICKET(issue in VARCHAR, status in VARCHAR, empid in NUMBER, bid in NUMBER);
PROCEDURE INSRT_RIDE(stime in TIMESTAMP, etime in TIMESTAMP, bid in NUMBER, uid in NUMBER, esid in NUMBER);
PROCEDURE INSRT_TRANSACTION(status in VARCHAR, tmethod in VARCHAR,tdate in TIMESTAMP, rid in NUMBER);
PROCEDURE INSRT_REVIEW(rating in VARCHAR, mes in VARCHAR, rvtime in TIMESTAMP,rid in NUMBER);
end;
/
-------------------------USERTYPE INSERTION-------------------------
CREATE OR REPLACE PACKAGE BODY INSERTION
AS
PROCEDURE INSRT_USERTYPE(usertp in VARCHAR, charges in NUMBER)
AS
BEGIN
dbms_output.put_line('----------------------------------------------------------');
insert into USERTYPE(USER_TYPE,CHARGES) values (usertp,charges);
dbms_output.put_line('Row inserted into USERTYPE Table');
dbms_output.put_line('----------------------------------------------------------');
commit;
exception
when dup_val_on_index then
dbms_output.put_line('Duplicate Value Found!! Insert Different Value');
when others then
dbms_output.put_line('Error while inserting data into USERTYPE Table');
rollback;
dbms_output.put_line('The error encountered is: ');
dbms_output.put_line(dbms_utility.format_error_stack);
dbms_output.put_line('----------------------------------------------------------');
end insrt_usertype;

-------------------------USER1 INSERTION-------------------------
PROCEDURE INSRT_USER1(fn in VARCHAR, ln in VARCHAR, email in VARCHAR,un in VARCHAR,pn in NUMBER,loc in VARCHAR,idp in VARCHAR,utid in NUMBER)
AS
BEGIN
dbms_output.put_line('----------------------------------------------------------');
insert into USER1(FIRST_NAME,LAST_NAME,EMAIL,USER_NAME,PHONE_NUMBER,USER_LOCATION,ID_PROOF,USER_TYPE_ID) values (fn,ln,email,un,pn,loc,idp,utid);
dbms_output.put_line('Row inserted into USER1 Table');
dbms_output.put_line('----------------------------------------------------------');
commit;
exception
when dup_val_on_index then
dbms_output.put_line('Duplicate Value Found');
when others then
dbms_output.put_line('Duplicate Value Found!! Insert Different Value');
rollback;
dbms_output.put_line('The error encountered is: ');
dbms_output.put_line(dbms_utility.format_error_stack);
dbms_output.put_line('----------------------------------------------------------');
end insrt_user1;

-------------------------DISTRIBUTOR INSERTION-------------------------
PROCEDURE INSRT_DISTRIBUTOR(rate in NUMBER, dname in VARCHAR)
AS
BEGIN
dbms_output.put_line('----------------------------------------------------------');
insert into DISTRIBUTOR(RATE_PER_UNIT,DISTRIBUTOR_NAME) values (rate,dname);
dbms_output.put_line('Row inserted into DISTRIBUTOR Table');
dbms_output.put_line('----------------------------------------------------------');
commit;
exception
when dup_val_on_index then
dbms_output.put_line('Duplicate Value Found!! Insert Different Value');
when others then
dbms_output.put_line('Error while inserting data into DISTRIBUTOR Table');
rollback;
dbms_output.put_line('The error encountered is: ');
dbms_output.put_line(dbms_utility.format_error_stack);
dbms_output.put_line('----------------------------------------------------------');
end insrt_distributor;


-------------------------STATION INSERTION-------------------------
PROCEDURE INSRT_STATION(sname in VARCHAR, lat in DECIMAL, lon in DECIMAL)
AS
BEGIN
dbms_output.put_line('----------------------------------------------------------');
insert into STATION(STATION_NAME,LATITUDE,LONGITUDE) values (sname,lat,lon);
dbms_output.put_line('Row inserted into STATION Table');
dbms_output.put_line('----------------------------------------------------------');
commit;
exception
when dup_val_on_index then
dbms_output.put_line('Duplicate Value Found!! Insert Different Value');
when others then
dbms_output.put_line('Error while inserting data into STATION Table');
rollback;
dbms_output.put_line('The error encountered is: ');
dbms_output.put_line(dbms_utility.format_error_stack);
dbms_output.put_line('----------------------------------------------------------');
end insrt_station;

-------------------------ELECTRICITY_CONSUMPTION INSERTION-------------------------
PROCEDURE INSRT_ELECTRICITY_CONSUMPTION(unit in NUMBER, stid in NUMBER, did in NUMBER)
AS
BEGIN
dbms_output.put_line('----------------------------------------------------------');
insert into ELECTRICITY_CONSUMPTION(UNIT_CONSUMED,STATION_ID,DISTRIBUTOR_ID) values (unit,stid,did);
dbms_output.put_line('Row inserted into ELECTRICITY Table');
dbms_output.put_line('----------------------------------------------------------');
commit;
exception
when dup_val_on_index then
dbms_output.put_line('Duplicate Value Found!! Insert Different Value');
when others then
dbms_output.put_line('Error while inserting data into ELECTRICITY Table');
rollback;
dbms_output.put_line('The error encountered is: ');
dbms_output.put_line(dbms_utility.format_error_stack);
dbms_output.put_line('----------------------------------------------------------');
end insrt_electricity_consumption;


-------------------------BIKE INSERTION-------------------------
PROCEDURE INSRT_BIKE(pyear in DATE, avail in VARCHAR, stid in NUMBER)
AS
BEGIN
dbms_output.put_line('----------------------------------------------------------');
insert into BIKE(PURCHASE_YEAR,AVAILABLE,STATION_ID) values (pyear,avail,stid);
dbms_output.put_line('Row inserted into BIKE Table');
dbms_output.put_line('----------------------------------------------------------');
commit;
exception
when dup_val_on_index then
dbms_output.put_line('Duplicate Value Found!! Insert Different Value');
when others then
dbms_output.put_line('Error while inserting data into BIKE Table');
rollback;
dbms_output.put_line('The error encountered is: ');
dbms_output.put_line(dbms_utility.format_error_stack);
dbms_output.put_line('----------------------------------------------------------');
end insrt_bike;

-------------------------DEPARTMENT INSERTION-------------------------
PROCEDURE INSRT_DEPARTMENT(dpname in VARCHAR)
AS
BEGIN
dbms_output.put_line('----------------------------------------------------------');
insert into DEPARTMENT(DEPARTMENT_NAME) values (dpname);
dbms_output.put_line('Row inserted into DEPARTMENT Table');
dbms_output.put_line('----------------------------------------------------------');
commit;
exception
when dup_val_on_index then
dbms_output.put_line('Duplicate Value Found!! Insert Different Value');
when others then
dbms_output.put_line('Error while inserting data into DEPARTMENT Table');
rollback;
dbms_output.put_line('The error encountered is: ');
dbms_output.put_line(dbms_utility.format_error_stack);
dbms_output.put_line('----------------------------------------------------------');
end insrt_department;

-------------------------EMPLOYEE INSERTION-------------------------
PROCEDURE INSRT_EMPLOYEE(empname in VARCHAR,dpid in NUMBER)
AS
BEGIN
dbms_output.put_line('----------------------------------------------------------');
insert into EMPLOYEE(EMPLOYEE_NAME,DEPARTMENT_ID) values (empname,dpid);
dbms_output.put_line('Row inserted into EMPLOYEE Table');
dbms_output.put_line('----------------------------------------------------------');
commit;
exception
when dup_val_on_index then
dbms_output.put_line('Duplicate Value Found!! Insert Different Value');
when others then
dbms_output.put_line('Error while inserting data into EMPLOYEE Table');
rollback;
dbms_output.put_line('The error encountered is: ');
dbms_output.put_line(dbms_utility.format_error_stack);
dbms_output.put_line('----------------------------------------------------------');
end insrt_employee;

-------------------------CLIENT_SUPPORT INSERTION-------------------------
PROCEDURE INSRT_CLIENT_SUPPORT(msg in VARCHAR,status in VARCHAR,empid in NUMBER, uid in number,tdate in TIMESTAMP)
AS
BEGIN
dbms_output.put_line('----------------------------------------------------------');
insert into CLIENT_SUPPORT(MESSAGE,STATUS,EMPLOYEE_ID,USER_ID,TICKET_DATE) values (msg,status,empid,uid,tdate);
dbms_output.put_line('Row inserted into CLIENT_SUPPORT Table');
dbms_output.put_line('----------------------------------------------------------');
commit;
exception
when dup_val_on_index then
dbms_output.put_line('Duplicate Value Found!! Insert Different Value');
when others then
dbms_output.put_line('Error while inserting data into EMPLOYEE Table');
rollback;
dbms_output.put_line('The error encountered is: ');
dbms_output.put_line(dbms_utility.format_error_stack);
dbms_output.put_line('----------------------------------------------------------');
end insrt_client_support;

-------------------------MAINTENANCE_TICKET INSERTION-------------------------
PROCEDURE INSRT_MAINTENANCE_TICKET(issue in VARCHAR, status in VARCHAR, empid in NUMBER, bid in NUMBER)
AS
BEGIN
dbms_output.put_line('----------------------------------------------------------');
insert into MAINTENANCE_TICKET(issues,status,Employee_ID,bike_ID) values (issue,status,empid,bid);
dbms_output.put_line('Row inserted into MAINTENANCE_TICKET Table');
dbms_output.put_line('----------------------------------------------------------');
commit;
exception
when dup_val_on_index then
dbms_output.put_line('Duplicate Value Found!! Insert Different Value');
when others then
dbms_output.put_line('Error while inserting data into MAINTENANCE_TICKET Table');
rollback;
dbms_output.put_line('The error encountered is: ');
dbms_output.put_line(dbms_utility.format_error_stack);
dbms_output.put_line('----------------------------------------------------------');
end INSRT_MAINTENANCE_TICKET;

-------------------------RIDE INSERTION-------------------------
PROCEDURE INSRT_RIDE(stime in TIMESTAMP, etime in TIMESTAMP, bid in NUMBER, uid in NUMBER, esid in NUMBER)
AS
BEGIN
dbms_output.put_line('----------------------------------------------------------');
insert into RIDE(start_time,end_time,bike_id,user_id,end_station_id) values (stime,etime,bid,uid,esid);
dbms_output.put_line('Row inserted into RIDE Table');
dbms_output.put_line('----------------------------------------------------------');
commit;
exception
when dup_val_on_index then
dbms_output.put_line('Duplicate Value Found!! Insert Different Value');
when others then
dbms_output.put_line('Error while inserting data into RIDE Table');
rollback;
dbms_output.put_line('The error encountered is: ');
dbms_output.put_line(dbms_utility.format_error_stack);
dbms_output.put_line('----------------------------------------------------------');
end INSRT_RIDE;

-------------------------TRANSACTION INSERTION-------------------------
PROCEDURE INSRT_TRANSACTION(status in VARCHAR, tmethod in VARCHAR,tdate in TIMESTAMP,rid in NUMBER)
AS
BEGIN
dbms_output.put_line('----------------------------------------------------------');
insert into TRANSACTION(status,transaction_method,transaction_date,ride_ID) values (status,tmethod,tdate,rid);
dbms_output.put_line('Row inserted into TRANSACTION Table');
dbms_output.put_line('----------------------------------------------------------');
commit;
exception
when dup_val_on_index then
dbms_output.put_line('Duplicate Value Found!! Insert Different Value');
when others then
dbms_output.put_line('Error while inserting data into TRANSACTION Table');
rollback;
dbms_output.put_line('The error encountered is: ');
dbms_output.put_line(dbms_utility.format_error_stack);
dbms_output.put_line('----------------------------------------------------------');
end INSRT_TRANSACTION;


-------------------------REVIEW INSERTION-------------------------
PROCEDURE INSRT_REVIEW(rating in VARCHAR, mes in VARCHAR, rvtime in TIMESTAMP,rid in NUMBER)
AS
BEGIN
dbms_output.put_line('----------------------------------------------------------');
insert into REVIEW(rating,message,review_time,ride_id) values (rating,mes,rvtime,rid);
dbms_output.put_line('Row inserted into REVIEW Table');
dbms_output.put_line('----------------------------------------------------------');
commit;
exception
when dup_val_on_index then
dbms_output.put_line('Duplicate Value Found!! Insert Different Value');
when others then
dbms_output.put_line('Error while inserting data into REVIEW Table');
rollback;
dbms_output.put_line('The error encountered is: ');
dbms_output.put_line(dbms_utility.format_error_stack);
dbms_output.put_line('----------------------------------------------------------');
end INSRT_REVIEW;
end;
/