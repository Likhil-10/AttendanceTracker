create table if not exists teacher (
  id INT PRIMARY KEY AUTO_INCREMENT,
  name varchar(255),
  grade INT,
  age INT,
  email varchar(255),
  phone varchar(255)
);

create table if not exists grade (
  grade INT PRIMARY KEY,
  teacherid INT,
  strength INT,
  FOREIGN KEY(teacherid) REFERENCES teacher(id)
);

create table if not exists parent (
  parentid INT PRIMARY KEY AUTO_INCREMENT,
  fathername varchar(255),
  fatherage INT,
  mothername varchar(255),
  motherage INT,
  email varchar(255),
  phone varchar(255)
);

create table if not exists student (
  id INT PRIMARY KEY AUTO_INCREMENT,
  name varchar(255),
  age INT,
  class INT,
  gradedetails INT,
  parentid INT,
  FOREIGN KEY(gradedetails) REFERENCES grade(grade),
  FOREIGN KEY(parentid) REFERENCES parent(parentid)
);

create table if not exists principal (
  id INT PRIMARY KEY AUTO_INCREMENT,
  name varchar(255),
  age INT,
  principal_since varchar(255)
);

create table if not exists logindetails (
  username varchar(255),
  name varchar(255),
  password varchar(255)
);
