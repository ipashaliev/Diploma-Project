INSERT  INTO swap_shop_db.roles (name) VALUES('ROLE_USER');
INSERT  INTO swap_shop_db.roles (name) VALUES('ROLE_ADMIN');
INSERT IGNORE INTO swap_shop_db.users (email, password, username) VALUES ("user1@example.com", "user123", "user1");