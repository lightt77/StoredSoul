create procedure ADD_TAG_TO_PRODUCT(in p_product_name varchar(255), in p_tag_name varchar(255))
begin
	insert into product_to_tag(product_id, tag_id) values((select product_id from product where name=p_product_name), (select tag_id from tag where tag_name=p_tag_name));
end