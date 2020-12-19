--DROP TABLE IF EXISTS books;
DROP TABLE books;

CREATE TABLE books (
 isbn VARCHAR2(13) PRIMARY KEY,
 title VARCHAR2(100) NOT NULL,
 author VARCHAR2(100) ,
 publisher VARCHAR2(20) ,
 price NUMBER(10, 2) ,
 img_url VARCHAR2(100) ,
 introduce VARCHAR2(200)	
);

INSERT INTO books VALUES ('9781617293986','Spring Microservices in Action','John Carnell','Manning', 59.92 , '/book_images/spring.jpg','Spring Boot and Spring Cloud offer Java developers an easy ' );
INSERT INTO books VALUES ('9781491954621','Learning React','Alex Banks , Eve Porcello','O`Relly',49.19,'/book_images/react.jpg','Interested in React but find yourself confused');
INSERT INTO books VALUES ('9780321125217','Domain-Driven Design','Eric Evans','Addison-Wesley', 73.33,'/book_images/domain.jpg','Explains how to incorporate effective domain modeling');
INSERT INTO books VALUES ('9781617294471','Kafka Streams in Action','Bill Bejeck','Manning',43.82,'/book_images/kafka.jpg','Kafka Streams is a library designed to allow');
INSERT INTO books VALUES ('9780596805524','JavaScript','John Carnell','O`Relly',49.19,'/book_images/javascript.jpg','Whether you need an example-driven programmer`s guide');

COMMIT;