create table product (
  id serial primary key,
  name varchar(255) unique,
  brand varchar(255),
  model varchar(255),
  description varchar(5000),
  category varchar(255),
  price decimal,
  marketPrice decimal
);