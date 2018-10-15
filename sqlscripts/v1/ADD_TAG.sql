create procedure ADD_TAG(in p_tag_name varchar(20))
begin
	insert into tag(tag_name) values(p_tag_name);
end;