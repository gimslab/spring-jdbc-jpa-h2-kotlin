drop table IF EXISTS member;

create TABLE if not exists member (
  id INT AUTO_INCREMENT,
  name VARCHAR(250),
  age INT
);

insert into member (name, age) values
  ('Aliko', 11),
  ('Bill', 22),
  ('Folrunsho', 33);