-- alter table (테이블명) auto_increment= (시작하고싶은숫자);

alter table member  auto_increment= 1;



INSERT INTO muluck.`member`
(member_id, member_pw, member_email, member_name, member_tel, member_nickname, member_img, member_ageRange, member_manager)
VALUES('', '', '', '', '', '', 'myprofile.png', NULL, 0);
-- default 값은 null대신 default로 적어주기 mysql에서는 아얘 언급 안하기

INSERT INTO test (content, gender) value (?)

INSERT INTO test (content, gender) value (?)