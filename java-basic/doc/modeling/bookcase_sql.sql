-- 회원
DROP TABLE IF EXISTS user RESTRICT;

-- 중고거래게시판
DROP TABLE IF EXISTS sellboard RESTRICT;

-- 북케이스
DROP TABLE IF EXISTS bookcase RESTRICT;

-- 장르
DROP TABLE IF EXISTS genre RESTRICT;

-- 책
DROP TABLE IF EXISTS book RESTRICT;

-- 작가
DROP TABLE IF EXISTS writer RESTRICT;

-- 리뷰
DROP TABLE IF EXISTS review RESTRICT;

-- 북케이스내부책
DROP TABLE IF EXISTS inner_book RESTRICT;

-- 팔로우한 작가
DROP TABLE IF EXISTS TABLE RESTRICT;

-- 팔로우한 작가
DROP TABLE IF EXISTS writer_like RESTRICT;

-- 채팅방
DROP TABLE IF EXISTS TABLE3 RESTRICT;

-- 채팅방유저
DROP TABLE IF EXISTS TABLE4 RESTRICT;

-- 채팅
DROP TABLE IF EXISTS TABLE5 RESTRICT;

-- 좋아한 리뷰
DROP TABLE IF EXISTS review_like RESTRICT;

-- 좋아한 장르
DROP TABLE IF EXISTS TABLE12 RESTRICT;

-- 알림
DROP TABLE IF EXISTS TABLE13 RESTRICT;

-- 판매처
DROP TABLE IF EXISTS TABLE14 RESTRICT;

-- 거래문의
DROP TABLE IF EXISTS ask_tobuy RESTRICT;

-- 회원
CREATE TABLE user (
  no         INTEGER      NOT NULL COMMENT '회원번호', -- 회원번호
  id         VARCHAR(50)  NOT NULL COMMENT '아이디', -- 아이디
  email      VARCHAR(255) NULL     COMMENT '이메일', -- 이메일
  name       VARCHAR(50)  NOT NULL COMMENT '이름', -- 이름
  nick       VARCHAR(50)  NOT NULL COMMENT '닉네임', -- 닉네임
  password   VARCHAR(100) NOT NULL COMMENT '비밀번호', -- 비밀번호
  created_at DATETIME     NULL     COMMENT '가입일' -- 가입일
)
COMMENT '회원';

-- 회원
ALTER TABLE user
  ADD CONSTRAINT PK_user -- 회원 기본키
  PRIMARY KEY (
  no -- 회원번호
  );

-- 회원 유니크 인덱스
CREATE UNIQUE INDEX UIX_user
  ON user ( -- 회원
    id ASC -- 아이디
  );

-- 회원 유니크 인덱스2
CREATE UNIQUE INDEX UIX_user2
  ON user ( -- 회원
    email ASC -- 이메일
  );

-- 회원 유니크 인덱스3
CREATE UNIQUE INDEX UIX_user3
  ON user ( -- 회원
    nick ASC -- 닉네임
  );

ALTER TABLE user
  MODIFY COLUMN no INTEGER NOT NULL AUTO_INCREMENT COMMENT '회원번호';

-- 중고거래게시판
CREATE TABLE sellboard (
  no         INTEGER      NOT NULL COMMENT '게시글번호', -- 게시글번호
  user_no    INTEGER      NOT NULL COMMENT '회원번호', -- 회원번호
  title      VARCHAR(255) NOT NULL COMMENT '제목', -- 제목
  content    TEXT         NOT NULL COMMENT '내용', -- 내용
  created_at DATETIME     NULL     COMMENT '작성일', -- 작성일
  status     INTEGER      NOT NULL COMMENT '거래상태' -- 거래상태
)
COMMENT '중고거래게시판';

-- 중고거래게시판
ALTER TABLE sellboard
  ADD CONSTRAINT PK_sellboard -- 중고거래게시판 기본키
  PRIMARY KEY (
  no -- 게시글번호
  );

ALTER TABLE sellboard
  MODIFY COLUMN no INTEGER NOT NULL AUTO_INCREMENT COMMENT '게시글번호';

-- 북케이스
CREATE TABLE bookcase (
  no         INTEGER      NOT NULL COMMENT '북케이스번호', -- 북케이스번호
  user_no    INTEGER      NOT NULL COMMENT '회원번호', -- 회원번호
  title      VARCHAR(255) NOT NULL COMMENT '제목', -- 제목
  bookmark   CHAR(1)      NULL     COMMENT '북마크여부', -- 북마크여부
  public     CHAR(1)      NULL     COMMENT '공개여부', -- 공개여부
  created_at DATETIME     NULL     COMMENT '생성일' -- 생성일
)
COMMENT '북케이스';

-- 북케이스
ALTER TABLE bookcase
  ADD CONSTRAINT PK_bookcase -- 북케이스 기본키
  PRIMARY KEY (
  no -- 북케이스번호
  );

-- 장르
CREATE TABLE genre (
  no   INTEGER     NOT NULL COMMENT '장르번호', -- 장르번호
  name VARCHAR(50) NOT NULL COMMENT '장르명' -- 장르명
)
COMMENT '장르';

-- 장르
ALTER TABLE genre
  ADD CONSTRAINT PK_genre -- 장르 기본키
  PRIMARY KEY (
  no -- 장르번호
  );

-- 장르 유니크 인덱스
CREATE UNIQUE INDEX UIX_genre
  ON genre ( -- 장르
    name ASC -- 장르명
  );

-- 책
CREATE TABLE book (
  no        INTEGER      NOT NULL COMMENT '책번호', -- 책번호
  title     VARCHAR(255) NOT NULL COMMENT '책제목', -- 책제목
  writer_no INTEGER      NOT NULL COMMENT '작가번호', -- 작가번호
  publisher VARCHAR(50)  NOT NULL COMMENT '출판사', -- 출판사
  genre_no  INTEGER      NOT NULL COMMENT '장르번호' -- 장르번호
)
COMMENT '책';

-- 책
ALTER TABLE book
  ADD CONSTRAINT PK_book -- 책 기본키
  PRIMARY KEY (
  no -- 책번호
  );

-- 작가
CREATE TABLE writer (
  no        INTEGER     NOT NULL COMMENT '작가번호', -- 작가번호
  name      VARCHAR(50) NOT NULL COMMENT '작가명', -- 작가명
  introduce TEXT        NULL     COMMENT '작가소개' -- 작가소개
)
COMMENT '작가';

-- 작가
ALTER TABLE writer
  ADD CONSTRAINT PK_writer -- 작가 기본키
  PRIMARY KEY (
  no -- 작가번호
  );

-- 리뷰
CREATE TABLE review (
  COL        INTEGER  NOT NULL COMMENT '리뷰번호', -- 리뷰번호
  no         INTEGER  NOT NULL COMMENT '책번호', -- 책번호
  user_no    INTEGER  NOT NULL COMMENT '작성자', -- 작성자
  score      INTEGER  NOT NULL COMMENT '별점', -- 별점
  comment    TEXT     NULL     COMMENT '내용', -- 내용
  created_at DATETIME NULL     COMMENT '작성일' -- 작성일
)
COMMENT '리뷰';

-- 리뷰
ALTER TABLE review
  ADD CONSTRAINT PK_review -- 리뷰 기본키
  PRIMARY KEY (
  COL -- 리뷰번호
  );

-- 리뷰 유니크 인덱스
CREATE UNIQUE INDEX UIX_review
  ON review ( -- 리뷰
    no ASC,      -- 책번호
    user_no ASC  -- 작성자
  );

-- 북케이스내부책
CREATE TABLE inner_book (
  bookcase_no INTEGER NOT NULL COMMENT '북케이스번호', -- 북케이스번호
  book_no     INTEGER NOT NULL COMMENT '책번호' -- 책번호
)
COMMENT '북케이스내부책';

-- 북케이스내부책
ALTER TABLE inner_book
  ADD CONSTRAINT PK_inner_book -- 북케이스내부책 기본키
  PRIMARY KEY (
  bookcase_no, -- 북케이스번호
  book_no      -- 책번호
  );

-- 팔로우한 작가
CREATE TABLE TABLE (
)
COMMENT '팔로우한 작가';

-- 팔로우한 작가
CREATE TABLE writer_like (
  user_no   INTEGER NOT NULL COMMENT '회원번호', -- 회원번호
  writer_no INTEGER NOT NULL COMMENT '작가번호' -- 작가번호
)
COMMENT '팔로우한 작가';

-- 팔로우한 작가
ALTER TABLE writer_like
  ADD CONSTRAINT PK_writer_like -- 팔로우한 작가 기본키
  PRIMARY KEY (
  user_no,   -- 회원번호
  writer_no  -- 작가번호
  );

-- 채팅방
CREATE TABLE TABLE3 (
  COL  <데이터 타입 없음> NOT NULL COMMENT '채팅방번호', -- 채팅방번호
  COL2 <데이터 타입 없음> NULL     COMMENT '제목', -- 제목
  no   INTEGER            NULL     COMMENT '게시글번호' -- 게시글번호
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
  no   INTEGER            NULL     COMMENT '회원번호', -- 회원번호
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
  no   INTEGER            NULL     COMMENT 'sender', -- sender
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
CREATE TABLE review_like (
  user_no INTEGER NOT NULL COMMENT '회원번호', -- 회원번호
  COL     INTEGER NOT NULL COMMENT '리뷰번호' -- 리뷰번호
)
COMMENT '좋아한 리뷰';

-- 좋아한 리뷰
ALTER TABLE review_like
  ADD CONSTRAINT PK_review_like -- 좋아한 리뷰 기본키
  PRIMARY KEY (
  user_no, -- 회원번호
  COL      -- 리뷰번호
  );

-- 좋아한 장르
CREATE TABLE TABLE12 (
  no2 INTEGER NULL COMMENT '장르번호', -- 장르번호
  no  INTEGER NULL COMMENT '회원번호' -- 회원번호
)
COMMENT '좋아한 장르';

-- 알림
CREATE TABLE TABLE13 (
  COL <데이터 타입 없음> NOT NULL COMMENT '알림번호', -- 알림번호
  no  INTEGER            NULL     COMMENT '회원번호' -- 회원번호
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
CREATE TABLE ask_tobuy (
  no         INTEGER  NOT NULL COMMENT '거래문의번호', -- 거래문의번호
  board_no   INTEGER  NOT NULL COMMENT '게시글번호', -- 게시글번호
  user_no    INTEGER  NOT NULL COMMENT '회원번호', -- 회원번호
  content    TEXT     NOT NULL COMMENT '내용', -- 내용
  reply      TEXT     NULL     COMMENT '답변', -- 답변
  created_at DATETIME NULL     COMMENT '등록일' -- 등록일
)
COMMENT '거래문의';

-- 거래문의
ALTER TABLE ask_tobuy
  ADD CONSTRAINT PK_ask_tobuy -- 거래문의 기본키
  PRIMARY KEY (
  no -- 거래문의번호
  );

-- 중고거래게시판
ALTER TABLE sellboard
  ADD CONSTRAINT FK_user_TO_sellboard -- 회원 -> 중고거래게시판
  FOREIGN KEY (
  user_no -- 회원번호
  )
  REFERENCES user ( -- 회원
  no -- 회원번호
  );

-- 북케이스
ALTER TABLE bookcase
  ADD CONSTRAINT FK_user_TO_bookcase -- 회원 -> 북케이스
  FOREIGN KEY (
  user_no -- 회원번호
  )
  REFERENCES user ( -- 회원
  no -- 회원번호
  );

-- 책
ALTER TABLE book
  ADD CONSTRAINT FK_genre_TO_book -- 장르 -> 책
  FOREIGN KEY (
  genre_no -- 장르번호
  )
  REFERENCES genre ( -- 장르
  no -- 장르번호
  );

-- 책
ALTER TABLE book
  ADD CONSTRAINT FK_writer_TO_book -- 작가 -> 책
  FOREIGN KEY (
  writer_no -- 작가번호
  )
  REFERENCES writer ( -- 작가
  no -- 작가번호
  );

-- 리뷰
ALTER TABLE review
  ADD CONSTRAINT FK_user_TO_review -- 회원 -> 리뷰
  FOREIGN KEY (
  user_no -- 작성자
  )
  REFERENCES user ( -- 회원
  no -- 회원번호
  );

-- 리뷰
ALTER TABLE review
  ADD CONSTRAINT FK_book_TO_review -- 책 -> 리뷰
  FOREIGN KEY (
  no -- 책번호
  )
  REFERENCES book ( -- 책
  no -- 책번호
  );

-- 북케이스내부책
ALTER TABLE inner_book
  ADD CONSTRAINT FK_book_TO_inner_book -- 책 -> 북케이스내부책
  FOREIGN KEY (
  book_no -- 책번호
  )
  REFERENCES book ( -- 책
  no -- 책번호
  );

-- 북케이스내부책
ALTER TABLE inner_book
  ADD CONSTRAINT FK_bookcase_TO_inner_book -- 북케이스 -> 북케이스내부책
  FOREIGN KEY (
  bookcase_no -- 북케이스번호
  )
  REFERENCES bookcase ( -- 북케이스
  no -- 북케이스번호
  );

-- 팔로우한 작가
ALTER TABLE writer_like
  ADD CONSTRAINT FK_writer_TO_writer_like -- 작가 -> 팔로우한 작가
  FOREIGN KEY (
  writer_no -- 작가번호
  )
  REFERENCES writer ( -- 작가
  no -- 작가번호
  );

-- 팔로우한 작가
ALTER TABLE writer_like
  ADD CONSTRAINT FK_user_TO_writer_like -- 회원 -> 팔로우한 작가
  FOREIGN KEY (
  user_no -- 회원번호
  )
  REFERENCES user ( -- 회원
  no -- 회원번호
  );

-- 채팅방
ALTER TABLE TABLE3
  ADD CONSTRAINT FK_sellboard_TO_TABLE3 -- 중고거래게시판 -> 채팅방
  FOREIGN KEY (
  no -- 게시글번호
  )
  REFERENCES sellboard ( -- 중고거래게시판
  no -- 게시글번호
  );

-- 채팅방유저
ALTER TABLE TABLE4
  ADD CONSTRAINT FK_user_TO_TABLE4 -- 회원 -> 채팅방유저
  FOREIGN KEY (
  no -- 회원번호
  )
  REFERENCES user ( -- 회원
  no -- 회원번호
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
  ADD CONSTRAINT FK_user_TO_TABLE5 -- 회원 -> 채팅
  FOREIGN KEY (
  no -- sender
  )
  REFERENCES user ( -- 회원
  no -- 회원번호
  );

-- 좋아한 리뷰
ALTER TABLE review_like
  ADD CONSTRAINT FK_review_TO_review_like -- 리뷰 -> 좋아한 리뷰
  FOREIGN KEY (
  COL -- 리뷰번호
  )
  REFERENCES review ( -- 리뷰
  COL -- 리뷰번호
  );

-- 좋아한 리뷰
ALTER TABLE review_like
  ADD CONSTRAINT FK_user_TO_review_like -- 회원 -> 좋아한 리뷰
  FOREIGN KEY (
  user_no -- 회원번호
  )
  REFERENCES user ( -- 회원
  no -- 회원번호
  );

-- 좋아한 장르
ALTER TABLE TABLE12
  ADD CONSTRAINT FK_genre_TO_TABLE12 -- 장르 -> 좋아한 장르
  FOREIGN KEY (
  no2 -- 장르번호
  )
  REFERENCES genre ( -- 장르
  no -- 장르번호
  );

-- 좋아한 장르
ALTER TABLE TABLE12
  ADD CONSTRAINT FK_user_TO_TABLE12 -- 회원 -> 좋아한 장르
  FOREIGN KEY (
  no -- 회원번호
  )
  REFERENCES user ( -- 회원
  no -- 회원번호
  );

-- 알림
ALTER TABLE TABLE13
  ADD CONSTRAINT FK_user_TO_TABLE13 -- 회원 -> 알림
  FOREIGN KEY (
  no -- 회원번호
  )
  REFERENCES user ( -- 회원
  no -- 회원번호
  );

-- 거래문의
ALTER TABLE ask_tobuy
  ADD CONSTRAINT FK_sellboard_TO_ask_tobuy -- 중고거래게시판 -> 거래문의
  FOREIGN KEY (
  board_no -- 게시글번호
  )
  REFERENCES sellboard ( -- 중고거래게시판
  no -- 게시글번호
  );

-- 거래문의
ALTER TABLE ask_tobuy
  ADD CONSTRAINT FK_user_TO_ask_tobuy -- 회원 -> 거래문의
  FOREIGN KEY (
  user_no -- 회원번호
  )
  REFERENCES user ( -- 회원
  no -- 회원번호
  );