alter table member  auto_increment= 1;



-- bbs테이블에서 member_no가 3인 bbs_no 들을 가져와서 
-- heart 테이블에서 bbs_no가 받아온 bbs_no들과 같은 칼럼의 수들의 합을 구하는 쿼리
-- 아래 두개가 같은것을 뜻하는 걸까?
SELECT bbs_no FROM bbs  WHERE member_no = 3

SELECT COUNT(h.bbs_no) AS heart_count
FROM bbs AS b
LEFT JOIN heart AS h ON b.bbs_no = h.bbs_no
WHERE b.member_no = 3;

SELECT COUNT(*) AS heart_count
FROM heart
WHERE bbs_no IN (
  SELECT bbs_no
  FROM bbs
  WHERE member_no = 3
);

SELECT COUNT(*) AS heart_count FROM heart
WHERE bbs_no IN (
  SELECT bbs_no FROM bbs
  WHERE member_no = 3
);

-- bbs 게시물 리스트 가져오기
SELECT
	ROW_NUMBER() OVER (ORDER BY bbs_no) AS post_no,
	bbs.bbs_no,
	bbs.bbs_title,
	(SELECT COUNT(*) FROM heart WHERE heart.bbs_no = bbs.bbs_no) AS heart_count,
	(SELECT COUNT(*) FROM reply WHERE reply.bbs_no = bbs.bbs_no) AS reply_count
FROM bbs WHERE bbs.member_no = 3;

-- reply 댓글 리스트 가져오기
SELECT ROW_NUMBER() OVER () AS my_no, b.bbs_title, r.reply_content, r.reply_no, r.bbs_no
FROM reply r
JOIN bbs b ON r.bbs_no = b.bbs_no
WHERE r.member_no = 1;

-- bookmark 북마크 리스트 가져오기
SELECT ROW_NUMBER() OVER (ORDER BY bbs.bbs_no) AS my_bookmark, bbs.bbs_title, community.community_category
FROM bookmark
JOIN bbs ON bookmark.bbs_no = bbs.bbs_no
JOIN community ON bbs.community_no = community.community_no
WHERE bookmark.member_no = 1;

