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

create table if not exists student (
  id INT PRIMARY KEY AUTO_INCREMENT,
  name varchar(255),
  age INT,
  class INT,
  gradedetails INT,
  FOREIGN KEY(gradedetails) REFERENCES grade(grade)
);