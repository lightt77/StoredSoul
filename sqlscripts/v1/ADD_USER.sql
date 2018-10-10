create procedure ADD_USER(in email_id varchar(255), in password varchar(255))
begin
	insert into User(email_id, password) values(email_id, password);
end

call ADD_USER('shikamaru@ss.com', 'shikamaru');