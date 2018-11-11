create procedure ADD_PRODUCT(in p_name varchar(255), in p_type varchar(255), in p_colour varchar(255), in p_size varchar(255), in p_price int, in p_artist_id int, in p_image_path varchar(255))
begin
	insert into product(name, type, colour, size, price, artist_id, image_path) values(p_name, p_type, p_colour, p_size, p_price, p_artist_id, p_image_path);
end

call ADD_PRODUCT('Joker Glow', 'tshirt', 'black', 'XL', 499, 14, 'https://images.thesouledstore.com/public/theSoul/uploads/catalog/product/20181101175932-1.jpg');
