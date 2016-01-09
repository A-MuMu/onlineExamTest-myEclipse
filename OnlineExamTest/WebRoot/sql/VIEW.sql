CREATE OR REPLACE VIEW `exam`.`user`
AS
(SELECT u.loginId as id , u.loginPsw as psw , u.loginName as name FROM admin u)
UNION
(SELECT u.idStu as id , u.pswStu as psw , u.nameStu as name FROM student u)
UNION
(SELECT u.TeaID as id , u.PwsTea as psw , u.Name as name FROM teacher u)