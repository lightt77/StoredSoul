create procedure ADD_PRODUCT(in p_name varchar(255), in p_type varchar(255), in p_colour varchar(255), in p_size varchar(255), in p_price int, in p_artist_id int)
begin
	insert into product(name, type, colour, size, price, artist_id) values(p_name, p_type, p_colour, p_size, p_price, p_artist_id);
end

call ADD_PRODUCT('Batman T-shirt new', 'tshirt', 'black', 'XL', 499, 1);