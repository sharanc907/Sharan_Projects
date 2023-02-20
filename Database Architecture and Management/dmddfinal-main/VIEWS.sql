-------------------------RIDE_CHARGE VIEW-------------------------
create or replace view RIDE_CHARGES AS
select r.user_id,ut.user_type_id,ut.charges,u.first_name,
((EXTRACT (DAY FROM (r.end_time))*24*60*60+EXTRACT (HOUR FROM (r.end_time))*60*60+EXTRACT (MINUTE FROM (r.end_time))*60+EXTRACT (SECOND FROM (r.end_time)))/60)
- ((EXTRACT (DAY FROM (r.start_time))*24*60*60+EXTRACT (HOUR FROM (r.start_time))*60*60+EXTRACT (MINUTE FROM (r.start_time))*60+EXTRACT (SECOND FROM (r.start_time)))/60) as ride_time,
(((EXTRACT (DAY FROM (r.end_time))*24*60*60+EXTRACT (HOUR FROM (r.end_time))*60*60+EXTRACT (MINUTE FROM (r.end_time))*60+EXTRACT (SECOND FROM (r.end_time)))/60)
- ((EXTRACT (DAY FROM (r.start_time))*24*60*60+EXTRACT (HOUR FROM (r.start_time))*60*60+EXTRACT (MINUTE FROM (r.start_time))*60+EXTRACT (SECOND FROM (r.start_time)))/60))*ut.charges as ride_amount
from ride r, user1 u, usertype ut
where r.user_id=u.user_id and u.user_type_id=ut.user_type_id;

-------------------------ELECTRICITY_CALCULATION VIEW-------------------------
create or replace view electricity_cal
as
select s.station_name,e.emeter_id,d.distributor_id,d.distributor_name,e.unit_consumed,(e.unit_consumed*d.rate_per_unit) as cost
from station s, distributor d, electricity_consumption e
where s.station_id=e.station_id and e.distributor_id=d.distributor_id;
/

-------------------------USER_TYPE VIEW-------------------------
create or replace view user_type_view
as
select a.user_id,a.first_name,a.last_name,a.user_name,a.phone_number,a.user_location,a.ID_proof,b.user_type
from user1 a
join usertype b
on a.user_type_id=b.user_type_id;
/