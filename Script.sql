alter table member auto_increment= 1;

alter table inquiry auto_increment= 3;

SELECT DATE_FORMAT(inquiry_udate, '%Y-%m-%d') AS formatted_udate FROM inquiry;

SELECT 
	ROW_NUMBER() OVER (ORDER BY i.inquiry_udate DESC) AS myinquiry_no,
	i.inquiry_no,
	i.inquiry_writer,
	i.inquiry_title,
	DATE_FORMAT(i.inquiry_udate, '%Y-%m-%d') AS inquiry_udate,
	CASE WHEN i.inquiry_manager IS NULL THEN '답변전' ELSE '답변완료' END AS answer_check,
	DATE_FORMAT(i.inquiry_adate, '%Y-%m-%d') AS inquiry_adate
FROM inquiry i
WHERE i.inquiry_writer = 2
ORDER BY i.inquiry_udate DESC;


-- 답변전 문의글 목록

SELECT 
    ROW_NUMBER() OVER(ORDER BY i.inquiry_udate) AS no,
    i.inquiry_no,
    i.inquiry_title,
    i.inquiry_writer,
    m.member_nickname AS writer_nickname,
    DATE_FORMAT(i.inquiry_udate, '%Y-%m-%d') AS inquiry_udate
FROM 
    inquiry i
LEFT JOIN 
    member m ON i.inquiry_writer = m.member_no
WHERE 
    i.inquiry_manager IS NULL
ORDER BY 
    i.inquiry_udate;
    
   
-- 답변완료 문의글 목록
   
SELECT 
    ROW_NUMBER() OVER(ORDER BY i.inquiry_adate DESC) AS no,
    i.inquiry_no,
    i.inquiry_title,
    i.inquiry_writer,
    m_writer.member_nickname AS writer_nickname,
    DATE_FORMAT(i.inquiry_udate, '%Y-%m-%d') AS inquiry_udate,
    i.inquiry_manager,
    m_manager.member_nickname AS answer_nickname,
    DATE_FORMAT(i.inquiry_adate, '%Y-%m-%d') AS inquiry_adate
FROM 
    inquiry i
LEFT JOIN 
    member m_writer ON i.inquiry_writer = m_writer.member_no
LEFT JOIN 
    member m_manager ON i.inquiry_manager = m_manager.member_no
WHERE 
    i.inquiry_manager IS NOT NULL
ORDER BY 
    i.inquiry_adate DESC;

   
-- 매니저 승인 대기 목록
   
SELECT 
    ROW_NUMBER() OVER(ORDER BY m.member_no) AS no,
    m.member_no,
    m.member_nickname,
    m.member_name,		    
    m.member_id,
    m.member_email,
    m.member_tel,
    m.member_manager
FROM 
    member m
WHERE 
    m.member_manager = 2
ORDER BY 
    m.member_no;
    
   
-- 매니저 목록 가져오기
   
SELECT 
    ROW_NUMBER() OVER(ORDER BY m.member_no) AS no,
    m.member_no,
    m.member_nickname,
    m.member_name,		    
    m.member_id,
    m.member_email,
    m.member_tel,
    m.member_manager
FROM 
    member m
WHERE 
    m.member_manager = 1
ORDER BY 
    m.member_no;
    
-- 관리자 no가 답한 문의글 목록
   
	SELECT 
	    ROW_NUMBER() OVER(ORDER BY i.inquiry_adate DESC) AS no,
	    i.inquiry_no,
	    i.inquiry_title,
	    i.inquiry_writer,
	    m_writer.member_nickname AS writer_nickname,
	    DATE_FORMAT(i.inquiry_udate, '%Y-%m-%d') AS inquiry_udate,
	    i.inquiry_manager,
	    m_manager.member_nickname AS answer_nickname,
	    DATE_FORMAT(i.inquiry_adate, '%Y-%m-%d') AS inquiry_adate
	FROM 
	    inquiry i
	LEFT JOIN 
	    member m_writer ON i.inquiry_writer = m_writer.member_no
	LEFT JOIN 
	    member m_manager ON i.inquiry_manager = m_manager.member_no
	WHERE 
	    i.inquiry_manager IS NOT NULL AND i.inquiry_manager = 3
	ORDER BY 
	    i.inquiry_adate DESC;