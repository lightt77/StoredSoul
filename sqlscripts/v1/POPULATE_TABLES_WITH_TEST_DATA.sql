# add users
call ADD_USER('abhishek@ss.com', 'test@123');
call ADD_USER('user1@ss.com','test@123');
call ADD_USER('artist1@ss.com','test@123');
call ADD_USER('naruto@ss.com', 'test@123');
call ADD_USER('sasuke@ss.com', 'test@123');
call ADD_USER('sakura@ss.com', 'test@123');
call ADD_USER('shikamaru@ss.com', 'test@123');
call ADD_USER('kakashi@ss.com', 'test@123');
call ADD_USER('gai@ss.com', 'test@123');
call ADD_USER('itachi@ss.com', 'test@123');
call ADD_USER('obito@ss.com', 'test@123');
call ADD_USER('madara@ss.com', 'test@123');
call ADD_USER('hashirama@ss.com', 'test@123');
call ADD_USER('sai@ss.com', 'test@123');
call ADD_USER('deidara@ss.com', 'test@123');
call ADD_USER('sasori@ss.com', 'test@123');

# add products
call ADD_PRODUCT('Batman T-shirt', 'tshirt', 'black', 'XL', 499, 15);
call ADD_PRODUCT('Pyaar-ek-dhokha-hai T-shirt', 'tshirt', 'black', 'L', 499, 16);
call ADD_PRODUCT('Dont-play-crazy-with-me Tshirt', 'tshirt', 'black', 'XL', 499, 14);

# add tags
call ADD_TAG('Anime');
call ADD_TAG('Comics');
call ADD_TAG('one-liners');

# add product-instances
call ADD_PRODUCT_INSTANCE('Batman T-shirt');
call ADD_PRODUCT_INSTANCE('Batman T-shirt');
call ADD_PRODUCT_INSTANCE('Batman T-shirt');
call ADD_PRODUCT_INSTANCE('Pyaar-ek-dhokha-hai T-shirt');
call ADD_PRODUCT_INSTANCE('Dont-play-crazy-with-me Tshirt');
call ADD_PRODUCT_INSTANCE('Dont-play-crazy-with-me Tshirt');

# add tags to products
call ADD_TAG_TO_PRODUCT('Batman T-shirt', 'Comics');
call ADD_TAG_TO_PRODUCT('Dont-play-crazy-with-me Tshirt', 'Comics');
call ADD_TAG_TO_PRODUCT('Dont-play-crazy-with-me Tshirt', 'one-liners');
call ADD_TAG_TO_PRODUCT('Pyaar-ek-dhokha-hai T-shirt', 'one-liners');