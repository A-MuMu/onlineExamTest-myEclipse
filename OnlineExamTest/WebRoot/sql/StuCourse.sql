CREATE OR REPLACE VIEW `exam`.`StuCourse`
AS
SELECT stu.id , stu.idStu , stu.nameStu , daan.DaJuan ,daan.shijuan, daan.date , daan.zongFen , daan.zuZhuFenShu FROM student stu inner join daanjuan daan WHERE stu.id = daan.idStu
