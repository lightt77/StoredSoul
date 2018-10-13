create procedure ADD_PRODUCT_INSTANCE(in p_product_name varchar(255))
begin
	insert into product_instance(product_id) values((select product_id from product where name=p_product_name));
end