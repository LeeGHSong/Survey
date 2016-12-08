--------------------------------------------------------
--  File created - Wednesday-December-07-2016   
--------------------------------------------------------
--------------------------------------------------------
--  DDL for Table SANSWERS
--------------------------------------------------------

  CREATE TABLE "ORA1"."SANSWERS" 
   (	"EMAIL" VARCHAR2(20 BYTE), 
	"FNAME" VARCHAR2(20 BYTE), 
	"LNAME" VARCHAR2(20 BYTE), 
	"GENDER" VARCHAR2(20 BYTE), 
	"COLOR" VARCHAR2(20 BYTE), 
	"ANIMAL" VARCHAR2(20 BYTE), 
	"PARTY" VARCHAR2(20 BYTE), 
	"MARRIED" VARCHAR2(20 BYTE)
   ) SEGMENT CREATION IMMEDIATE 
  PCTFREE 10 PCTUSED 40 INITRANS 1 MAXTRANS 255 
 NOCOMPRESS LOGGING
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1
  BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "USERS" ;
REM INSERTING into ORA1.SANSWERS
SET DEFINE OFF;
Insert into ORA1.SANSWERS (EMAIL,FNAME,LNAME,GENDER,COLOR,ANIMAL,PARTY,MARRIED) values ('test@test.com','qwer','asdf','other','blue','cat','green','SINGLE');
Insert into ORA1.SANSWERS (EMAIL,FNAME,LNAME,GENDER,COLOR,ANIMAL,PARTY,MARRIED) values ('test@test.com','qwer','asdf','other','blue','cat','green','SINGLE');
Insert into ORA1.SANSWERS (EMAIL,FNAME,LNAME,GENDER,COLOR,ANIMAL,PARTY,MARRIED) values ('test@test.com','qwer','asdf','female','red','cat','Democrat','MARRIED');
Insert into ORA1.SANSWERS (EMAIL,FNAME,LNAME,GENDER,COLOR,ANIMAL,PARTY,MARRIED) values ('test@test.com','qwer','asdf','female',',red,blue','cat','Republican','MARRIED');
Insert into ORA1.SANSWERS (EMAIL,FNAME,LNAME,GENDER,COLOR,ANIMAL,PARTY,MARRIED) values ('test@test.com','qwer','asdf','female',null,'cat','Republican','DIVORCED');
Insert into ORA1.SANSWERS (EMAIL,FNAME,LNAME,GENDER,COLOR,ANIMAL,PARTY,MARRIED) values ('test@test.com','qwer','asdf','female',null,'cat','Republican','DIVORCED');
Insert into ORA1.SANSWERS (EMAIL,FNAME,LNAME,GENDER,COLOR,ANIMAL,PARTY,MARRIED) values ('test@test.com','qwer','asdf','male','green','dog','Republican','SINGLE');
Insert into ORA1.SANSWERS (EMAIL,FNAME,LNAME,GENDER,COLOR,ANIMAL,PARTY,MARRIED) values ('test@test.com','qwer','asdf','male','green','dog','Republican','SINGLE');
Insert into ORA1.SANSWERS (EMAIL,FNAME,LNAME,GENDER,COLOR,ANIMAL,PARTY,MARRIED) values ('test@test.com','qwer','asdf','male','green,blue','dog','Republican','MARRIED');
Insert into ORA1.SANSWERS (EMAIL,FNAME,LNAME,GENDER,COLOR,ANIMAL,PARTY,MARRIED) values ('test@test.com','qwer','asdf','male','red,green,blue','dog','Republican','MARRIED');
Insert into ORA1.SANSWERS (EMAIL,FNAME,LNAME,GENDER,COLOR,ANIMAL,PARTY,MARRIED) values ('test@test.com','qwer','asdf','male','red,green,blue','dog','Republican','DIVORCED');
Insert into ORA1.SANSWERS (EMAIL,FNAME,LNAME,GENDER,COLOR,ANIMAL,PARTY,MARRIED) values ('test@test.com','erty','asdf','male','red,green','bird','Democrat','DIVORCED');
Insert into ORA1.SANSWERS (EMAIL,FNAME,LNAME,GENDER,COLOR,ANIMAL,PARTY,MARRIED) values ('test@test.com','erty','asdf','male','red,green','bird','Democrat','SINGLE');
Insert into ORA1.SANSWERS (EMAIL,FNAME,LNAME,GENDER,COLOR,ANIMAL,PARTY,MARRIED) values ('zxc@zxc.com','fgh','rty','female','green,blue','dragon','Republican','SINGLE');
Insert into ORA1.SANSWERS (EMAIL,FNAME,LNAME,GENDER,COLOR,ANIMAL,PARTY,MARRIED) values ('qwer@ghjk.com','iuyt','poui','other','blue',null,'Republican',null);
Insert into ORA1.SANSWERS (EMAIL,FNAME,LNAME,GENDER,COLOR,ANIMAL,PARTY,MARRIED) values ('test@test.com','qwer','asdf','other','blue','cat','green','MARRIED');
Insert into ORA1.SANSWERS (EMAIL,FNAME,LNAME,GENDER,COLOR,ANIMAL,PARTY,MARRIED) values ('zxc@zxc.com','fgh','rty','female','green,blue','dragon','Republican','MARRIED');
