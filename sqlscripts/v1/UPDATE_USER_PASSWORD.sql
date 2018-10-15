drop procedure if exists UPDATE_USER_PASSWORD//
create procedure UPDATE_USER_PASSWORD(in p_email_id varchar(255), in p_password varchar(255))
begin
	update User set password = p_password where email_id=p_email_id;
end

call UPDATE_USER_PASSWORD('shikamaru@ss.com', 'shadowclone');