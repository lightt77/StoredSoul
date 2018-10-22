create procedure GET_ALL_AVAILABLE_PRODUCTS()
begin
	select * from product where (Select count(*) from product_instance where product_instance.product_id=product.product_id)>0;
end