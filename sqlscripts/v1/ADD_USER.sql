create procedure ADD_USER(in email_id varchar(255), in password varchar(255), in image_path varchar(255))
begin
	insert into User(email_id, password, image_path) values(email_id, password, image_path);
end