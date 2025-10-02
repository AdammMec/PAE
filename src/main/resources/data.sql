insert into Student (matricule, name, genre, section) values
    (63000, 'Alice', 'F', 'DEV'),
    (63001, 'Bob', 'M', 'DEV');


insert into Course (sigle, titre, ects) values
    ('3DEV3', 'Dev', 4 ),
    ('3WEB3', 'Web', 4);


insert into student_courses (students_matricule, courses_sigle) values
    (63000, '3DEV3'),
    (63000, '3WEB3'),
    (63001, '3WEB3');