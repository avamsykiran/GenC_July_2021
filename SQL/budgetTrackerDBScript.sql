
CREATE DATABASE budget_tracker_db;

CREATE TABLE users(
    user_id     INT         AUTO_INCREMENT,
    firstName   VARCHAR(20) NOT NULL,
    lastName    VARCHAR(20) NOT NULL,
    emailId     VARCHAR(100) NOT NULL UNIQUE,
    mobile      CHAR(10)    NOT NULL UNIQUE,
    password    VARCHAR(20) NOT NULL,
    PRIAMRY KEY (user_id)
)

CREATE TABLE transactions(
   txnId        INT                         AUTO_INCREMENT,
   amount       DOUBLE                      NOT NULL CHECK(AMOUNT>=0),
   header       VARCHAR(50)                 NOT NULL,
   type         ENUM('CREDIT','DEBIT')      NOT NULL,
   dot          DATE                        NOT NULL,
   user_id      INT                         NOT NULL,
   PRIMARY KEY(txnId),
   FOREIGN KEY(user_id) REFERENCES users(user_id)
)



