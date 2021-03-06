create database StoredSoul;

use StoredSoul;

create table user(
    user_id int primary key not null unique auto_increment,
    email_id varchar(30) not null unique,
    password varchar(30) not null,
    image_path varchar(100) unique
);

create table product(
	product_id int not null auto_increment primary key,
    name varchar(30) not null unique,
    type enum('tshirt', 'tshirt-dress', 'mobile-cover', 'backpack', 'dufflebag', 'boxer', 'badge', 'mug', 'magnet', 'socks', 'cap', 'flopflops', 'notebook', 'poster', 'sticker', 'tote-bag', 'hoodie', 'action-figure', 'keychain', 'others') default 'others',
	colour varchar(20) not null,
    size enum('XXS', 'XS', 'S', 'M', 'L', 'XL', 'XXL'),
    price int not null,
    artist_id int not null,
    date_added datetime default now(),
    no_of_purchases int default 0,
    image_path varchar(100) unique,
    foreign key(artist_id) references user(user_id)
);

create table product_instance(
	product_instance_id INT not null auto_increment primary key,
    product_id int not null,
    purchaser_id int,	# null here means available
    foreign key(product_id) references product(product_id),
    foreign key(purchaser_id) references user(user_id)
);

create table tag(
	tag_id int not null auto_increment primary key,
    tag_name varchar(20) not null unique
);

create table product_to_tag(
	product_id int not null,
    tag_id int not null,
    foreign key(product_id) references product(product_id),
    foreign key(tag_id) references tag(tag_id)
);