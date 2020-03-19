DROP TABLE IF EXISTS USER;

CREATE TABLE USER (
  ID INT AUTO_INCREMENT  PRIMARY KEY,
  First_Name VARCHAR(250) NOT NULL,
  Last_Name VARCHAR(250) NOT NULL,
  Address VARCHAR(250) DEFAULT NULL,
  Account_Number INT DEFAULT NULL
);

INSERT INTO USER (First_Name, Last_Name, Address,Account_Number ) VALUES
  ('Deep', 'Patel', '405 Manning blvd',1234567890);
 INSERT INTO USER (First_Name, Last_Name, Address,Account_Number ) VALUES
   ('AAnand', 'Shah', '200 Homestead Ave',1237462837);
   INSERT INTO USER (First_Name, Last_Name, Address,Account_Number ) VALUES
     ('Jinesh', 'Kaam', '189 xyz street',1836283624);