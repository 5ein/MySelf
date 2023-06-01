-- 무럭 DDL 생성 코드 --

-- multi.card definition

CREATE TABLE `card` (
  `card_no` int NOT NULL AUTO_INCREMENT,
  `card_name` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL COMMENT '식물 이름',
  `card_species` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL COMMENT '종',
  `card_birth` date NOT NULL COMMENT '반려일',
  `card_mmti` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL COMMENT '식물 성향',
  `card_img` varchar(200) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL COMMENT '사진 첨부',
  `card_date` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '발급일',
  PRIMARY KEY (`card_no`)
) ENGINE=InnoDB AUTO_INCREMENT=231 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;


-- muluck.community definition

CREATE TABLE `community` (
  `community_no` int NOT NULL,
  `community_category` varchar(200) NOT NULL,
  PRIMARY KEY (`community_no`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;


-- muluck.`member` definition

CREATE TABLE `member` (
  `member_no` int NOT NULL AUTO_INCREMENT,
  `member_id` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `member_pw` varchar(100) NOT NULL,
  `member_email` varchar(100) NOT NULL,
  `member_name` varchar(100) NOT NULL,
  `member_tel` int NOT NULL,
  `member_nickname` varchar(100) NOT NULL,
  `member_img` varchar(100) DEFAULT NULL,
  `member_gender` varchar(100) DEFAULT NULL,
  `member_ageRange` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`member_no`),
  UNIQUE KEY `member_un` (`member_id`,`member_email`,`member_tel`,`member_nickname`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;


-- muluck.bbs definition

CREATE TABLE `bbs` (
  `bbs_no` int NOT NULL AUTO_INCREMENT,
  `bbs_title` varchar(200) NOT NULL,
  `bbs_content` text NOT NULL,
  `bbs_img` varchar(200) DEFAULT NULL,
  `member_no` int NOT NULL,
  `community_no` int NOT NULL,
  PRIMARY KEY (`bbs_no`),
  KEY `bbs_FK` (`community_no`),
  KEY `bbs_FK1` (`member_no`),
  CONSTRAINT `bbs_FK` FOREIGN KEY (`community_no`) REFERENCES `community` (`community_no`),
  CONSTRAINT `bbs_FK1` FOREIGN KEY (`member_no`) REFERENCES `member` (`member_no`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;


-- muluck.bookmark definition

CREATE TABLE `bookmark` (
  `bookmark_no` int NOT NULL AUTO_INCREMENT,
  `member_no` int NOT NULL,
  `bbs_no` int NOT NULL,
  PRIMARY KEY (`bookmark_no`),
  KEY `bookmark_FK` (`bbs_no`),
  KEY `bookmark_FK_1` (`member_no`),
  CONSTRAINT `bookmark_FK` FOREIGN KEY (`bbs_no`) REFERENCES `bbs` (`bbs_no`),
  CONSTRAINT `bookmark_FK_1` FOREIGN KEY (`member_no`) REFERENCES `member` (`member_no`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;


-- muluck.business definition

CREATE TABLE `business` (
  `b_no` int NOT NULL AUTO_INCREMENT COMMENT '게시판 번호',
  `b_title` varchar(200) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL COMMENT '게시글제목',
  `b_date` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '게시한 시간',
  `b_write` mediumtext CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL COMMENT '작성한 글',
  `b_image` varchar(200) DEFAULT NULL COMMENT '거래 장소',
  `member_no` int NOT NULL COMMENT 'member테이블의 id',
  `b_choose` tinyint(1) DEFAULT NULL COMMENT '예약중?',
  PRIMARY KEY (`b_no`),
  KEY `business_FK` (`member_no`),
  CONSTRAINT `business_FK` FOREIGN KEY (`member_no`) REFERENCES `member` (`member_no`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;


-- muluck.calendar definition

CREATE TABLE `calendar` (
  `member_no` int DEFAULT NULL,
  `calendar_id` int DEFAULT NULL,
  `calendar_start` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL,
  `calendar_end` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL,
  `calendar_title` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `calendar__mood` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL,
  `created_at` timestamp NULL DEFAULT CURRENT_TIMESTAMP
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- muluck.diary definition

CREATE TABLE `diary` (
  `D_img` varchar(300) DEFAULT NULL,
  `D_title` varchar(300) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `D_contents` varchar(500) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `D_mood` varchar(100) DEFAULT NULL,
  `D_date` datetime NOT NULL,
  `D_no` int NOT NULL AUTO_INCREMENT,
  `member_no` int NOT NULL,
  `card_no` int NOT NULL,
  PRIMARY KEY (`D_no`),
  KEY `diary_FK` (`member_no`),
  KEY `diary_FK_1` (`card_no`),
  CONSTRAINT `diary_FK` FOREIGN KEY (`member_no`) REFERENCES `member` (`member_no`),
  CONSTRAINT `diary_FK_1` FOREIGN KEY (`card_no`) REFERENCES `card` (`card_no`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;


-- muluck.follow definition

CREATE TABLE `follow` (
  `follow_no` int NOT NULL AUTO_INCREMENT,
  `follower_id` varchar(200) NOT NULL,
  `following_id` varchar(200) NOT NULL,
  `follow_management` tinyint(1) NOT NULL,
  `member_no` int NOT NULL,
  PRIMARY KEY (`follow_no`),
  KEY `follow_FK` (`member_no`),
  CONSTRAINT `follow_FK` FOREIGN KEY (`member_no`) REFERENCES `member` (`member_no`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;


-- muluck.heart definition

CREATE TABLE `heart` (
  `heart_no` int NOT NULL AUTO_INCREMENT,
  `member_no` int NOT NULL,
  `bbs_no` int NOT NULL,
  PRIMARY KEY (`heart_no`),
  KEY `heart_FK` (`bbs_no`),
  KEY `heart_FK_1` (`member_no`),
  CONSTRAINT `heart_FK` FOREIGN KEY (`bbs_no`) REFERENCES `bbs` (`bbs_no`),
  CONSTRAINT `heart_FK_1` FOREIGN KEY (`member_no`) REFERENCES `member` (`member_no`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;


-- muluck.reply definition

CREATE TABLE `reply` (
  `reply_no` int NOT NULL AUTO_INCREMENT,
  `reply_content` varchar(200) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `member_no` int NOT NULL,
  `bbs_no` int NOT NULL,
  PRIMARY KEY (`reply_no`),
  KEY `reply_FK` (`bbs_no`),
  KEY `reply_FK_1` (`member_no`),
  CONSTRAINT `reply_FK` FOREIGN KEY (`bbs_no`) REFERENCES `bbs` (`bbs_no`),
  CONSTRAINT `reply_FK_1` FOREIGN KEY (`member_no`) REFERENCES `member` (`member_no`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;


-- muluck.memberactivity definition

CREATE TABLE `memberactivity` (
  `activity_no` int NOT NULL AUTO_INCREMENT,
  `bbs_no` int DEFAULT NULL,
  `reply_no` int DEFAULT NULL,
  `heart_no` int DEFAULT NULL,
  `bookmark_no` int DEFAULT NULL,
  PRIMARY KEY (`activity_no`),
  KEY `memberactivity_FK_1` (`reply_no`),
  KEY `memberactivity_FK_2` (`heart_no`),
  KEY `memberactivity_FK` (`bbs_no`),
  KEY `memberactivity_FK_3` (`bookmark_no`),
  CONSTRAINT `memberactivity_FK` FOREIGN KEY (`bbs_no`) REFERENCES `bbs` (`bbs_no`),
  CONSTRAINT `memberactivity_FK_1` FOREIGN KEY (`reply_no`) REFERENCES `reply` (`reply_no`),
  CONSTRAINT `memberactivity_FK_2` FOREIGN KEY (`heart_no`) REFERENCES `heart` (`heart_no`),
  CONSTRAINT `memberactivity_FK_3` FOREIGN KEY (`bookmark_no`) REFERENCES `bookmark` (`bookmark_no`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;