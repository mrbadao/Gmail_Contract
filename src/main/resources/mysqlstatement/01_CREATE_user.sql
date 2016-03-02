# Project: Gmail_Contract
# Author: hieunc
# Created: 23/02/2016 08:13

CREATE USER marketing_admin@localhost IDENTIFIED BY 'marketing';
GRANT ALL PRIVILEGES ON marketing.* TO 'marketing_admin'@'localhost';
FLUSH PRIVILEGES;