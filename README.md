"# SpringbootMysqlJdbcTemplate" 
Create schema
CREATE SCHEMA `panakj`;

Create table
CREATE TABLE student(id int, name varchar(50), city varchar(50));

Insert data into table
INSERT INTO student (id, name, city) values(1, "Pankaj", "Pune");

Check code files for springboot using mysql with jdbc template

Rest calls

http://localhost:8080/getStudents

http://localhost:8080/insertStudent

http://localhost:8080/deleteStudent

http://localhost:8080/updateStudent

