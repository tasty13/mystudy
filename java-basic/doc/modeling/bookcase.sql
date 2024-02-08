-- 회원
DROP TABLE IF EXISTS TABLE6 RESTRICT;

-- 중고거래게시판
DROP TABLE IF EXISTS TABLE11 RESTRICT;

-- 북케이스
DROP TABLE IF EXISTS TABLE9 RESTRICT;

-- 장르
DROP TABLE IF EXISTS Temporary RESTRICT;

-- 책
DROP TABLE IF EXISTS TABLE7 RESTRICT;

-- 작가
DROP TABLE IF EXISTS Temporary2 RESTRICT;

-- 리뷰
DROP TABLE IF EXISTS TABLE8 RESTRICT;

-- 북케이스내부책
DROP TABLE IF EXISTS TABLE18 RESTRICT;

-- 팔로우한 작가
DROP TABLE IF EXISTS TABLE RESTRICT;

-- 팔로우한 작가
DROP TABLE IF EXISTS TABLE2 RESTRICT;

-- 채팅방
DROP TABLE IF EXISTS TABLE3 RESTRICT;

-- 채팅방유저
DROP TABLE IF EXISTS TABLE4 RESTRICT;

-- 채팅
DROP TABLE IF EXISTS TABLE5 RESTRICT;

-- 좋아한 리뷰
DROP TABLE IF EXISTS TABLE10 RESTRICT;

-- 좋아한 장르
DROP TABLE IF EXISTS TABLE12 RESTRICT;

-- 알림
DROP TABLE IF EXISTS TABLE13 RESTRICT;

-- 판매처
DROP TABLE IF EXISTS TABLE14 RESTRICT;

-- 거래문의
DROP TABLE IF EXISTS TABLE15 RESTRICT;

-- 회원
CREATE TABLE TABLE6 (
  COL  <데이터 타입 없음> NOT NULL COMMENT '회원번호', -- 회원번호
  COL5 <데이터 타입 없음> NULL     COMMENT '아이디', -- 아이디
  COL2 <데이터 타입 없음> NULL     COMMENT '이메일', -- 이메일
  COL3 <데이터 타입 없음> NULL     COMMENT '이름', -- 이름
  COL4 <데이터 타입 없음> NULL     COMMENT '닉네임', -- 닉네임
  COL6 <데이터 타입 없음> NULL     COMMENT '비밀번호', -- 비밀번호
  COL7 <데이터 타입 없음> NULL     COMMENT '가입일' -- 가입일
)
COMMENT '회원';

-- 회원
ALTER TABLE TABLE6
  ADD CONSTRAINT PK_TABLE6 -- 회원 기본키
  PRIMARY KEY (
  COL -- 회원번호
  );

-- 중고거래게시판
CREATE TABLE TABLE11 (
  COL  <데이터 타입 없음> NOT NULL COMMENT '게시글번호', -- 게시글번호
  COL7 <데이터 타입 없음> NULL     COMMENT '회원번호', -- 회원번호
  COL2 <데이터 타입 없음> NULL     COMMENT '제목', -- 제목
  COL4 <데이터 타입 없음> NULL     COMMENT '내용', -- 내용
  COL6 <데이터 타입 없음> NULL     COMMENT '작성일', -- 작성일
  COL5 <데이터 타입 없음> NULL     COMMENT '거래상태' -- 거래상태
)
COMMENT '중고거래게시판';

-- 중고거래게시판
ALTER TABLE TABLE11
  ADD CONSTRAINT PK_TABLE11 -- 중고거래게시판 기본키
  PRIMARY KEY (
  COL -- 게시글번호
  );

-- 북케이스
CREATE TABLE TABLE9 (
  COL  <데이터 타입 없음> NOT NULL COMMENT '북케이스번호', -- 북케이스번호
  COL6 <데이터 타입 없음> NULL     COMMENT '회원번호', -- 회원번호
  COL2 <데이터 타입 없음> NULL     COMMENT '제목', -- 제목
  COL4 <데이터 타입 없음> NULL     COMMENT '북마크여부', -- 북마크여부
  COL5 <데이터 타입 없음> NULL     COMMENT '공개여부', -- 공개여부
  COL3 <데이터 타입 없음> NULL     COMMENT '생성일' -- 생성일
)
COMMENT '북케이스';

-- 북케이스
ALTER TABLE TABLE9
  ADD CONSTRAINT PK_TABLE9 -- 북케이스 기본키
  PRIMARY KEY (
  COL -- 북케이스번호
  );

-- 장르
CREATE TABLE Temporary (
  COL  <데이터 타입 없음> NOT NULL COMMENT '장르번호', -- 장르번호
  COL6 <데이터 타입 없음> NULL     COMMENT '장르명' -- 장르명
)
COMMENT '장르';

-- 장르
ALTER TABLE Temporary
  ADD CONSTRAINT PK_Temporary -- 장르 기본키
  PRIMARY KEY (
  COL -- 장르번호
  );

-- 책
CREATE TABLE TABLE7 (
  COL  <데이터 타입 없음> NOT NULL COMMENT '책번호', -- 책번호
  COL2 <데이터 타입 없음> NULL     COMMENT '책제목', -- 책제목
  COL4 <데이터 타입 없음> NULL     COMMENT '작가번호', -- 작가번호
  COL5 <데이터 타입 없음> NULL     COMMENT '역자', -- 역자
  COL3 <데이터 타입 없음> NULL     COMMENT '출판사', -- 출판사
  COL6 <데이터 타입 없음> NULL     COMMENT '장르번호', -- 장르번호
  COL7 <데이터 타입 없음> NULL     COMMENT '판매처번호' -- 판매처번호
)
COMMENT '책';

-- 책
ALTER TABLE TABLE7
  ADD CONSTRAINT PK_TABLE7 -- 책 기본키
  PRIMARY KEY (
  COL -- 책번호
  );

-- 작가
CREATE TABLE Temporary2 (
  COL  <데이터 타입 없음> NOT NULL COMMENT '작가번호', -- 작가번호
  COL4 <데이터 타입 없음> NULL     COMMENT '작가명', -- 작가명
  COL2 <데이터 타입 없음> NULL     COMMENT '작가소개' -- 작가소개
)
COMMENT '작가';

-- 작가
ALTER TABLE Temporary2
  ADD CONSTRAINT PK_Temporary2 -- 작가 기본키
  PRIMARY KEY (
  COL -- 작가번호
  );

-- 리뷰
CREATE TABLE TABLE8 (
  COL  <데이터 타입 없음> NOT NULL COMMENT '리뷰번호', -- 리뷰번호
  COL2 <데이터 타입 없음> NULL     COMMENT '책번호', -- 책번호
  COL7 <데이터 타입 없음> NULL     COMMENT '작성자', -- 작성자
  COL4 <데이터 타입 없음> NULL     COMMENT '별점', -- 별점
  COL5 <데이터 타입 없음> NULL     COMMENT '내용', -- 내용
  COL6 <데이터 타입 없음> NULL     COMMENT '작성일' -- 작성일
)
COMMENT '리뷰';

-- 리뷰
ALTER TABLE TABLE8
  ADD CONSTRAINT PK_TABLE8 -- 리뷰 기본키
  PRIMARY KEY (
  COL -- 리뷰번호
  );

-- 리뷰 유니크 인덱스
CREATE UNIQUE INDEX UIX_TABLE8
  ON TABLE8 ( -- 리뷰
    COL2 ASC, -- 책번호
    COL7 ASC  -- 작성자
  );

-- 북케이스내부책
CREATE TABLE TABLE18 (
  COL4 <데이터 타입 없음> NOT NULL COMMENT '북케이스번호', -- 북케이스번호
  COL2 <데이터 타입 없음> NOT NULL COMMENT '책번호' -- 책번호
)
COMMENT '북케이스내부책';

-- 북케이스내부책
ALTER TABLE TABLE18
  ADD CONSTRAINT PK_TABLE18 -- 북케이스내부책 기본키
  PRIMARY KEY (
  COL4, -- 북케이스번호
  COL2  -- 책번호
  );

-- 팔로우한 작가
CREATE TABLE TABLE (
)
COMMENT '팔로우한 작가';

-- 팔로우한 작가
CREATE TABLE TABLE2 (
  COL  <데이터 타입 없음> NOT NULL COMMENT '회원번호', -- 회원번호
  COL2 <데이터 타입 없음> NOT NULL COMMENT '작가번호' -- 작가번호
)
COMMENT '팔로우한 작가';

-- 팔로우한 작가
ALTER TABLE TABLE2
  ADD CONSTRAINT PK_TABLE2 -- 팔로우한 작가 기본키
  PRIMARY KEY (
  COL,  -- 회원번호
  COL2  -- 작가번호
  );

-- 채팅방
CREATE TABLE TABLE3 (
  COL  <데이터 타입 없음> NOT NULL COMMENT '채팅방번호', -- 채팅방번호
  COL2 <데이터 타입 없음> NULL     COMMENT '제목', -- 제목
  COL3 <데이터 타입 없음> NULL     COMMENT '게시글번호' -- 게시글번호
)
COMMENT '채팅방';

-- 채팅방
ALTER TABLE TABLE3
  ADD CONSTRAINT PK_TABLE3 -- 채팅방 기본키
  PRIMARY KEY (
  COL -- 채팅방번호
  );

-- 채팅방유저
CREATE TABLE TABLE4 (
  id   <데이터 타입 없음> NOT NULL COMMENT 'no', -- no
  COL  <데이터 타입 없음> NULL     COMMENT '회원번호', -- 회원번호
  COL2 <데이터 타입 없음> NULL     COMMENT '채팅방번호' -- 채팅방번호
)
COMMENT '채팅방유저';

-- 채팅방유저
ALTER TABLE TABLE4
  ADD CONSTRAINT PK_TABLE4 -- 채팅방유저 기본키
  PRIMARY KEY (
  id -- no
  );

-- 채팅
CREATE TABLE TABLE5 (
  COL2 <데이터 타입 없음> NOT NULL COMMENT '채팅번호', -- 채팅번호
  COL  <데이터 타입 없음> NULL     COMMENT 'sender', -- sender
  COL3 <데이터 타입 없음> NULL     COMMENT 'msg', -- msg
  COL4 <데이터 타입 없음> NULL     COMMENT '보낸시간', -- 보낸시간
  COL5 <데이터 타입 없음> NULL     COMMENT '채팅방번호' -- 채팅방번호
)
COMMENT '채팅';

-- 채팅
ALTER TABLE TABLE5
  ADD CONSTRAINT PK_TABLE5 -- 채팅 기본키
  PRIMARY KEY (
  COL2 -- 채팅번호
  );

-- 좋아한 리뷰
CREATE TABLE TABLE10 (
  COL2 <데이터 타입 없음> NOT NULL COMMENT '회원번호', -- 회원번호
  COL  <데이터 타입 없음> NOT NULL COMMENT '리뷰번호' -- 리뷰번호
)
COMMENT '좋아한 리뷰';

-- 좋아한 리뷰
ALTER TABLE TABLE10
  ADD CONSTRAINT PK_TABLE10 -- 좋아한 리뷰 기본키
  PRIMARY KEY (
  COL2, -- 회원번호
  COL   -- 리뷰번호
  );

-- 좋아한 장르
CREATE TABLE TABLE12 (
  COL  <데이터 타입 없음> NULL COMMENT '장르번호', -- 장르번호
  COL2 <데이터 타입 없음> NULL COMMENT '회원번호' -- 회원번호
)
COMMENT '좋아한 장르';

-- 알림
CREATE TABLE TABLE13 (
  COL  <데이터 타입 없음> NOT NULL COMMENT '알림번호', -- 알림번호
  COL2 <데이터 타입 없음> NULL     COMMENT '회원번호' -- 회원번호
)
COMMENT '알림';

-- 알림
ALTER TABLE TABLE13
  ADD CONSTRAINT PK_TABLE13 -- 알림 기본키
  PRIMARY KEY (
  COL -- 알림번호
  );

-- 판매처
CREATE TABLE TABLE14 (
  COL  <데이터 타입 없음> NOT NULL COMMENT '판매처번호', -- 판매처번호
  COL2 <데이터 타입 없음> NULL     COMMENT '판매처' -- 판매처
)
COMMENT '판매처';

-- 판매처
ALTER TABLE TABLE14
  ADD CONSTRAINT PK_TABLE14 -- 판매처 기본키
  PRIMARY KEY (
  COL -- 판매처번호
  );

-- 거래문의
CREATE TABLE TABLE15 (
  COL  <데이터 타입 없음> NOT NULL COMMENT '거래문의번호', -- 거래문의번호
  COL2 <데이터 타입 없음> NULL     COMMENT '게시글번호', -- 게시글번호
  COL3 <데이터 타입 없음> NULL     COMMENT '회원번호', -- 회원번호
  COL4 <데이터 타입 없음> NULL     COMMENT '내용', -- 내용
  COL6 <데이터 타입 없음> NULL     COMMENT '답변', -- 답변
  COL5 <데이터 타입 없음> NULL     COMMENT '등록일' -- 등록일
)
COMMENT '거래문의';

-- 거래문의
ALTER TABLE TABLE15
  ADD CONSTRAINT PK_TABLE15 -- 거래문의 기본키
  PRIMARY KEY (
  COL -- 거래문의번호
  );

-- 중고거래게시판
ALTER TABLE TABLE11
  ADD CONSTRAINT FK_TABLE6_TO_TABLE11 -- 회원 -> 중고거래게시판
  FOREIGN KEY (
  COL7 -- 회원번호
  )
  REFERENCES TABLE6 ( -- 회원
  COL -- 회원번호
  );

-- 북케이스
ALTER TABLE TABLE9
  ADD CONSTRAINT FK_TABLE6_TO_TABLE9 -- 회원 -> 북케이스
  FOREIGN KEY (
  COL6 -- 회원번호
  )
  REFERENCES TABLE6 ( -- 회원
  COL -- 회원번호
  );

-- 책
ALTER TABLE TABLE7
  ADD CONSTRAINT FK_Temporary_TO_TABLE7 -- 장르 -> 책
  FOREIGN KEY (
  COL6 -- 장르번호
  )
  REFERENCES Temporary ( -- 장르
  COL -- 장르번호
  );

-- 책
ALTER TABLE TABLE7
  ADD CONSTRAINT FK_Temporary2_TO_TABLE7 -- 작가 -> 책
  FOREIGN KEY (
  COL4 -- 작가번호
  )
  REFERENCES Temporary2 ( -- 작가
  COL -- 작가번호
  );

-- 책
ALTER TABLE TABLE7
  ADD CONSTRAINT FK_TABLE14_TO_TABLE7 -- 판매처 -> 책
  FOREIGN KEY (
  COL7 -- 판매처번호
  )
  REFERENCES TABLE14 ( -- 판매처
  COL -- 판매처번호
  );

-- 리뷰
ALTER TABLE TABLE8
  ADD CONSTRAINT FK_TABLE6_TO_TABLE8 -- 회원 -> 리뷰
  FOREIGN KEY (
  COL7 -- 작성자
  )
  REFERENCES TABLE6 ( -- 회원
  COL -- 회원번호
  );

-- 리뷰
ALTER TABLE TABLE8
  ADD CONSTRAINT FK_TABLE7_TO_TABLE8 -- 책 -> 리뷰
  FOREIGN KEY (
  COL2 -- 책번호
  )
  REFERENCES TABLE7 ( -- 책
  COL -- 책번호
  );

-- 북케이스내부책
ALTER TABLE TABLE18
  ADD CONSTRAINT FK_TABLE7_TO_TABLE18 -- 책 -> 북케이스내부책
  FOREIGN KEY (
  COL2 -- 책번호
  )
  REFERENCES TABLE7 ( -- 책
  COL -- 책번호
  );

-- 북케이스내부책
ALTER TABLE TABLE18
  ADD CONSTRAINT FK_TABLE9_TO_TABLE18 -- 북케이스 -> 북케이스내부책
  FOREIGN KEY (
  COL4 -- 북케이스번호
  )
  REFERENCES TABLE9 ( -- 북케이스
  COL -- 북케이스번호
  );

-- 팔로우한 작가
ALTER TABLE TABLE2
  ADD CONSTRAINT FK_Temporary2_TO_TABLE2 -- 작가 -> 팔로우한 작가
  FOREIGN KEY (
  COL2 -- 작가번호
  )
  REFERENCES Temporary2 ( -- 작가
  COL -- 작가번호
  );

-- 팔로우한 작가
ALTER TABLE TABLE2
  ADD CONSTRAINT FK_TABLE6_TO_TABLE2 -- 회원 -> 팔로우한 작가
  FOREIGN KEY (
  COL -- 회원번호
  )
  REFERENCES TABLE6 ( -- 회원
  COL -- 회원번호
  );

-- 채팅방
ALTER TABLE TABLE3
  ADD CONSTRAINT FK_TABLE11_TO_TABLE3 -- 중고거래게시판 -> 채팅방
  FOREIGN KEY (
  COL3 -- 게시글번호
  )
  REFERENCES TABLE11 ( -- 중고거래게시판
  COL -- 게시글번호
  );

-- 채팅방유저
ALTER TABLE TABLE4
  ADD CONSTRAINT FK_TABLE6_TO_TABLE4 -- 회원 -> 채팅방유저
  FOREIGN KEY (
  COL -- 회원번호
  )
  REFERENCES TABLE6 ( -- 회원
  COL -- 회원번호
  );

-- 채팅방유저
ALTER TABLE TABLE4
  ADD CONSTRAINT FK_TABLE3_TO_TABLE4 -- 채팅방 -> 채팅방유저
  FOREIGN KEY (
  COL2 -- 채팅방번호
  )
  REFERENCES TABLE3 ( -- 채팅방
  COL -- 채팅방번호
  );

-- 채팅
ALTER TABLE TABLE5
  ADD CONSTRAINT FK_TABLE3_TO_TABLE5 -- 채팅방 -> 채팅
  FOREIGN KEY (
  COL5 -- 채팅방번호
  )
  REFERENCES TABLE3 ( -- 채팅방
  COL -- 채팅방번호
  );

-- 채팅
ALTER TABLE TABLE5
  ADD CONSTRAINT FK_TABLE6_TO_TABLE5 -- 회원 -> 채팅
  FOREIGN KEY (
  COL -- sender
  )
  REFERENCES TABLE6 ( -- 회원
  COL -- 회원번호
  );

-- 좋아한 리뷰
ALTER TABLE TABLE10
  ADD CONSTRAINT FK_TABLE8_TO_TABLE10 -- 리뷰 -> 좋아한 리뷰
  FOREIGN KEY (
  COL -- 리뷰번호
  )
  REFERENCES TABLE8 ( -- 리뷰
  COL -- 리뷰번호
  );

-- 좋아한 리뷰
ALTER TABLE TABLE10
  ADD CONSTRAINT FK_TABLE6_TO_TABLE10 -- 회원 -> 좋아한 리뷰
  FOREIGN KEY (
  COL2 -- 회원번호
  )
  REFERENCES TABLE6 ( -- 회원
  COL -- 회원번호
  );

-- 좋아한 장르
ALTER TABLE TABLE12
  ADD CONSTRAINT FK_Temporary_TO_TABLE12 -- 장르 -> 좋아한 장르
  FOREIGN KEY (
  COL -- 장르번호
  )
  REFERENCES Temporary ( -- 장르
  COL -- 장르번호
  );

-- 좋아한 장르
ALTER TABLE TABLE12
  ADD CONSTRAINT FK_TABLE6_TO_TABLE12 -- 회원 -> 좋아한 장르
  FOREIGN KEY (
  COL2 -- 회원번호
  )
  REFERENCES TABLE6 ( -- 회원
  COL -- 회원번호
  );

-- 알림
ALTER TABLE TABLE13
  ADD CONSTRAINT FK_TABLE6_TO_TABLE13 -- 회원 -> 알림
  FOREIGN KEY (
  COL2 -- 회원번호
  )
  REFERENCES TABLE6 ( -- 회원
  COL -- 회원번호
  );

-- 거래문의
ALTER TABLE TABLE15
  ADD CONSTRAINT FK_TABLE11_TO_TABLE15 -- 중고거래게시판 -> 거래문의
  FOREIGN KEY (
  COL2 -- 게시글번호
  )
  REFERENCES TABLE11 ( -- 중고거래게시판
  COL -- 게시글번호
  );

-- 거래문의
ALTER TABLE TABLE15
  ADD CONSTRAINT FK_TABLE6_TO_TABLE15 -- 회원 -> 거래문의
  FOREIGN KEY (
  COL3 -- 회원번호
  )
  REFERENCES TABLE6 ( -- 회원
  COL -- 회원번호
  );