CREATE TABLE UNIVERSITY(
    UNIVERSITY_ID   NUMBER(10) PRIMARY KEY NOT NULL,
    UNIVERSITY_NAME VARCHAR2(100)          NOT NULL,
    ADDRESS         VARCHAR2(100)          NOT NULL,
    STATE           VARCHAR2(100)          NOT NULL);

CREATE TABLE DEPARTMENT(
    DEPARTMENT_ID   NUMBER(10) PRIMARY KEY NOT NULL,
    DEPARTMENT_NAME VARCHAR2(100)          NOT NULL,
    TOTAL_MEMBERS   NUMBER(10) DEFAULT NULL,
    UNIVERSITY_ID   NUMBER(10)             NOT NULL,
    FOREIGN KEY (UNIVERSITY_ID) REFERENCES UNIVERSITY (UNIVERSITY_ID));

CREATE TABLE PROGRAM(
    PROGRAM_ID    NUMBER(10) PRIMARY KEY NOT NULL,
    PROGRAM_NAME  VARCHAR2(100)          NOT NULL,
    DURATION      NUMBER(10) DEFAULT NULL,
    TOTAL_SEATS   NUMBER(10)             NOT NULL,
    SEMESTERS     NUMBER(2)              NOT NULL,
    UNIVERSITY_ID NUMBER(10)             NOT NULL,
    DEPARTMENT_ID NUMBER(10)             NOT NULL,
    FOREIGN KEY (DEPARTMENT_ID) REFERENCES DEPARTMENT (DEPARTMENT_ID),
    FOREIGN KEY (UNIVERSITY_ID) REFERENCES UNIVERSITY (UNIVERSITY_ID));
CREATE TABLE COURSE(
    COURSE_ID      NUMBER(10) PRIMARY KEY NOT NULL,
    COURSE_NAME    VARCHAR2(100)          NOT NULL,
    COURSE_CODE    VARCHAR2(100)          NOT NULL,
    COURSE_CREDITS NUMBER(2)              NOT NULL,
    PROGRAM_ID     NUMBER(2)              NOT NULL,
    TOTAL_LECTURES NUMBER(2)              NOT NULL,
    FOREIGN KEY (PROGRAM_ID) REFERENCES PROGRAM (PROGRAM_ID));

CREATE TABLE SYLLABUS(
    SYLLABUS_ID   NUMBER(10) PRIMARY KEY NOT NULL,
    SYLLABUS_NAME VARCHAR2(100)          NOT NULL,
    TOTAL_UNITS   NUMBER(2)              NOT NULL,
    TOTAL_COURSES NUMBER(2)              NOT NULL,
    FOREIGN KEY (SYLLABUS_ID) REFERENCES COURSE (COURSE_ID) ON DELETE CASCADE);

CREATE TABLE FACULTY(
    FACULTY_ID             NUMBER(10) PRIMARY KEY NOT NULL,
    FACULTY_NAME           VARCHAR2(200)          NOT NULL,
    TOTAL_STAFF            NUMBER(3)              NULL,
    ADDRESS                VARCHAR(200)           NOT NULL,
    FACULTY_SPECIALIZATION VARCHAR(200)           NOT NULL,
    DEPARTMENT_ID          NUMBER(10)             NOT NULL,
    FOREIGN KEY (DEPARTMENT_ID) REFERENCES DEPARTMENT (DEPARTMENT_ID));

CREATE TABLE TEACHER(
    TEACHER_ID   INT PRIMARY KEY NOT NULL,
    TEACHER_NAME VARCHAR(100)    NOT NULL,
    FACULTY_ID   NUMBER(10)      NOT NULL,
    FOREIGN KEY (FACULTY_ID) REFERENCES FACULTY (FACULTY_ID) ON DELETE CASCADE);

               --Create secondary index for each table.
CREATE INDEX UNIVERSITY_NAME ON UNIVERSITY (UNIVERSITY_NAME);
CREATE INDEX DEPARTMENT_NAME ON DEPARTMENT (DEPARTMENT_NAME);
CREATE INDEX PROGRAM_NAME ON PROGRAM (PROGRAM_NAME);
CREATE INDEX COURSE_NAME ON COURSE (COURSE_NAME);
CREATE INDEX SYLLABUS_NAME ON SYLLABUS (SYLLABUS_NAME);
CREATE INDEX FACULTY_NAME ON FACULTY (FACULTY_NAME);
CREATE INDEX TEACHER_NAME ON TEACHER (TEACHER_NAME);

--Insert at least 5 relevant records in each of the created tables.

INSERT INTO UNIVERSITY VALUES (001, 'Aligarh Muslim University', 'Aligarh', 'Uttar Pradesh');
INSERT INTO UNIVERSITY VALUES (002, 'Jamia Millia Islamia', 'Jamia Nagar, Okhla, New Delhi, 110025', 'Delhi');
INSERT INTO UNIVERSITY VALUES (003, 'Jawaharlal Nehru University', 'New Mehrauli Road, JNU Ring Rd, New Delhi, 110067', 'Delhi');
INSERT INTO UNIVERSITY VALUES (004, 'Delhi University', 'Benito Juarez Marg, South Campus, South Moti Bagh, New Delhi, 110021', 'Delhi');
INSERT INTO UNIVERSITY VALUES (005, 'IIT Madras', 'Chennai', 'Tamil Nadu');
INSERT INTO UNIVERSITY VALUES (006, 'University of Jammu', 'Baba Saheb Ambedkar Road, Jammu Tawi (J&K)-180006 (INDIA)', 'Delhi');
INSERT INTO UNIVERSITY VALUES (007, 'University of Hyderabad', 'Gachibowli, Hyderabad, Telangana 500046', 'Telangana');
INSERT INTO UNIVERSITY VALUES (008, 'IIT Bombay', 'Mumbai', 'Maharashtra');
INSERT INTO UNIVERSITY VALUES (009, 'IIT Delhi', 'New Delhi', 'Delhi');
INSERT INTO UNIVERSITY VALUES (010, 'IIT Kharagpur', 'Kharagpur', 'West Bengal');
INSERT INTO UNIVERSITY VALUES (011, 'IIT Kanpur', 'Kanpur', 'Uttar Pradesh');
INSERT INTO UNIVERSITY VALUES (012, 'IIT Roorkee', 'Roorkee', 'Uttarakhand');

INSERT INTO DEPARTMENT VALUES (001, 'Computer Science', 100, 001);
INSERT INTO DEPARTMENT VALUES (002, 'Electronics', 100, 001);
INSERT INTO DEPARTMENT VALUES (003, 'Mechanical', 100, 001);
INSERT INTO DEPARTMENT VALUES (004, 'Civil', 100, 001);
INSERT INTO DEPARTMENT VALUES (005, 'Electrical', 100, 007);
INSERT INTO DEPARTMENT VALUES (006, 'Chemical', 100, 001);
INSERT INTO DEPARTMENT VALUES (007, 'Mathematics', 100, 003);
INSERT INTO DEPARTMENT VALUES (008, 'Physics', 100, 001);
INSERT INTO DEPARTMENT VALUES (009, 'Chemistry', 100, 009);
INSERT INTO DEPARTMENT VALUES (010, 'Computer Science', 100, 004);

INSERT INTO PROGRAM VALUES (001, 'B.Tech', 4, 100, 8, 001, 001);
INSERT INTO PROGRAM VALUES (002, 'M.Tech', 4, 100, 8, 001, 002);
INSERT INTO PROGRAM VALUES (003, 'M.Tech', 4, 100, 8, 001, 003);
INSERT INTO PROGRAM VALUES (004, 'MCA', 4, 100, 8, 001, 001);
INSERT INTO PROGRAM VALUES (005, 'BCA', 4, 100, 8, 001, 005);
INSERT INTO PROGRAM VALUES (006, 'MBA', 4, 100, 8, 001, 006);
INSERT INTO PROGRAM VALUES (007, 'B.Tech', 4, 100, 8, 002, 001);
INSERT INTO PROGRAM VALUES (008, 'M.Tech', 4, 100, 8, 002, 002);
INSERT INTO PROGRAM VALUES (009, 'M.Tech', 4, 100, 8, 002, 003);
INSERT INTO PROGRAM VALUES (010, 'MCA', 4, 100, 8, 002, 004);
INSERT INTO PROGRAM VALUES (011, 'BCA', 4, 100, 8, 002, 005);
INSERT INTO PROGRAM VALUES (012, 'MBA', 4, 100, 8, 002, 006);
INSERT INTO PROGRAM VALUES (013, 'B.Tech', 4, 100, 8, 003, 001);
INSERT INTO PROGRAM VALUES (014, 'M.Tech', 4, 100, 8, 003, 002);
INSERT INTO PROGRAM VALUES (015, 'M.Tech', 4, 100, 8, 003, 003);
INSERT INTO PROGRAM VALUES (016, 'MCA', 4, 100, 8, 003, 004);
INSERT INTO PROGRAM VALUES (017, 'BCA', 4, 100, 8, 003, 005);
INSERT INTO PROGRAM VALUES (018, 'MBA', 4, 100, 8, 003, 006);
INSERT INTO PROGRAM VALUES (019, 'B.Tech', 4, 100, 8, 004, 001);
INSERT INTO PROGRAM VALUES (020, 'M.Tech', 4, 100, 8, 004, 002);
INSERT INTO PROGRAM VALUES (021, 'M.Tech', 4, 100, 8, 004, 003);
INSERT INTO PROGRAM VALUES (022, 'MCA', 4, 100, 8, 004, 004);
INSERT INTO PROGRAM VALUES (023, 'BCA', 4, 100, 8, 006, 005);
INSERT INTO PROGRAM VALUES (024, 'MBA', 4, 100, 8, 006, 006);


INSERT INTO COURSE VALUES (001, 'CS101', 'Introduction to Computer Science', 4, 001, 001);
INSERT INTO COURSE VALUES (002, 'CS102', 'Data Structures', 4, 001, 002);
INSERT INTO COURSE VALUES (003, 'CS103', 'Algorithms', 4, 003, 003);
INSERT INTO COURSE VALUES (004, 'CS104', 'Operating Systems', 4, 001, 004);
INSERT INTO COURSE VALUES (005, 'CS105', 'Computer Networks', 4, 004, 005);
INSERT INTO COURSE VALUES (006, 'CS106', 'Database Systems', 4, 001, 006);
INSERT INTO COURSE VALUES (007, 'CS107', 'Artificial Intelligence', 4, 001, 007);
INSERT INTO COURSE VALUES (008, 'CS108', 'Compiler Design', 4, 004, 008);
INSERT INTO COURSE VALUES (009, 'CS109', 'Computer Graphics', 4, 001, 009);
INSERT INTO COURSE VALUES (010, 'CS110', 'Software Engineering', 4, 001, 010);
INSERT INTO COURSE VALUES (011, 'CS111', 'Computer Architecture', 4, 001, 011);
INSERT INTO COURSE VALUES (012, 'CS112', 'Computer Organization', 4, 001, 012);
INSERT INTO SYLLABUS VALUES (001, 'Operating System', 4, 5);
INSERT INTO SYLLABUS VALUES (002, 'Computer Networks', 4, 5);
INSERT INTO SYLLABUS VALUES (003, 'Data Structures', 4, 5);
INSERT INTO SYLLABUS VALUES (004, 'Algorithms', 4, 5);
INSERT INTO SYLLABUS VALUES (005, 'Database Management System', 4, 5);
INSERT INTO SYLLABUS VALUES (006, 'Artificial Intelligence', 4, 5);
INSERT INTO SYLLABUS VALUES (007, 'Compiler Design', 4, 5);
INSERT INTO SYLLABUS VALUES (008, 'Computer Graphics', 4, 5);
INSERT INTO SYLLABUS VALUES (009, 'Software Engineering', 4, 5);
INSERT INTO SYLLABUS VALUES (010, 'Computer Architecture', 4, 5);
INSERT INTO SYLLABUS VALUES (011, 'Computer Organization', 4, 5);


INSERT INTO FACULTY VALUES (001, 'Faculty of Science', 100, 'Aligarh', 'Computer Science', 001);
INSERT INTO FACULTY VALUES (002, 'Faculty of Science', 100, 'Aligarh', 'Computer Science', 002);
INSERT INTO FACULTY VALUES (003, 'Faculty of Science', 100, 'Aligarh', 'Information Security', 003);
INSERT INTO FACULTY VALUES (004, 'Faculty of Science', 100, 'Aligarh', 'Computer Science', 004);
INSERT INTO FACULTY VALUES (005, 'Faculty of Science', 100, 'Aligarh', 'Computer Science', 005);
INSERT INTO FACULTY VALUES (006, 'Faculty of Science', 100, 'Aligarh', 'Computer Science', 006);
INSERT INTO FACULTY VALUES (007, 'Faculty of Science', 100, 'Aligarh', 'Information Security', 007);
INSERT INTO FACULTY VALUES (008, 'Faculty of Science', 100, 'Aligarh', 'Computer Science', 008);
INSERT INTO FACULTY VALUES (009, 'Faculty of Science', 100, 'Delhi', 'Computer Graphics', 010);


INSERT INTO TEACHER VALUES (001, 'Dr. A', 001);
INSERT INTO TEACHER VALUES (002, 'Dr. B', 002);
INSERT INTO TEACHER VALUES (003, 'Dr. C', 003);
INSERT INTO TEACHER VALUES (004, 'Dr. D', 004);
INSERT INTO TEACHER VALUES (005, 'Dr. E', 005);

--List of Universities situated at Delhi.
SELECT UNIVERSITY_NAME, STATE
    FROM UNIVERSITY
    WHERE STATE = 'Delhi';

-- ii) List of all the departments in Aligarh Muslim University.
SELECT DEPARTMENT_ID,
       DEPARTMENT_NAME,
       UNIVERSITY_NAME
    FROM DEPARTMENT,
         UNIVERSITY
    WHERE DEPARTMENT.UNIVERSITY_ID = UNIVERSITY.UNIVERSITY_ID
      AND UNIVERSITY.UNIVERSITY_NAME = 'Aligarh Muslim University';
-- iii) Find the location of JNU
SELECT UNIVERSITY_NAME, ADDRESS, STATE
    FROM UNIVERSITY
    WHERE UNIVERSITY_NAME = 'Jawaharlal Nehru University';
-- iv) List of all Programs run by University of Jammu.
SELECT UNIVERSITY_NAME, PROGRAM_NAME, DURATION
    FROM PROGRAM,  UNIVERSITY
    WHERE PROGRAM.UNIVERSITY_ID = UNIVERSITY.UNIVERSITY_ID
      AND UNIVERSITY.UNIVERSITY_NAME = 'University of Jammu';

-- vi) List of Courses of "MCA" run by AMU.
SELECT UNIVERSITY_NAME, PROGRAM_NAME, COURSE_NAME, COURSE_CODE
    FROM COURSE,
         PROGRAM,
         UNIVERSITY
    WHERE COURSE.PROGRAM_ID = PROGRAM.PROGRAM_ID
      AND PROGRAM.UNIVERSITY_ID = UNIVERSITY.UNIVERSITY_ID
      AND UNIVERSITY.UNIVERSITY_NAME = 'Aligarh Muslim University'
      AND PROGRAM_NAME = 'MCA';

-- vii) List of Faculties specialized in "Information Security" across different universities.
SELECT UNIVERSITY_NAME, FACULTY_NAME, FACULTY_SPECIALIZATION
    FROM FACULTY,
         UNIVERSITY,
         DEPARTMENT
    WHERE FACULTY.DEPARTMENT_ID = DEPARTMENT.DEPARTMENT_ID
      AND DEPARTMENT.UNIVERSITY_ID = UNIVERSITY.UNIVERSITY_ID
      AND FACULTY.FACULTY_SPECIALIZATION = 'Information Security';

-- viii) Syllabus of "Computer Architecture" of different Universities.
SELECT UNIVERSITY_NAME, SYLLABUS_NAME, SEMESTERS, TOTAL_UNITS, TOTAL_COURSES
    FROM SYLLABUS,
         COURSE,
         DEPARTMENT,
         UNIVERSITY,
         PROGRAM
    WHERE SYLLABUS.SYLLABUS_ID = COURSE.COURSE_ID
      AND COURSE.PROGRAM_ID = PROGRAM.PROGRAM_ID
      AND PROGRAM.DEPARTMENT_ID = DEPARTMENT.DEPARTMENT_ID
      AND DEPARTMENT.UNIVERSITY_ID = UNIVERSITY.UNIVERSITY_ID
      AND SYLLABUS_NAME = 'Computer Architecture';

-- ix) List of all faculties of Department of Computer Science of Delhi University.
SELECT FACULTY_NAME, FACULTY_SPECIALIZATION, DEPARTMENT_NAME, UNIVERSITY_NAME
    FROM FACULTY,
         DEPARTMENT,
         UNIVERSITY
    WHERE FACULTY.DEPARTMENT_ID = DEPARTMENT.DEPARTMENT_ID
      AND DEPARTMENT.UNIVERSITY_ID = UNIVERSITY.UNIVERSITY_ID
      AND UNIVERSITY.UNIVERSITY_NAME = 'Delhi University'
      AND DEPARTMENT_NAME = 'Computer Science';

-- x) Find the University which has maximum Departments.
SELECT UNIVERSITY_NAME, COUNT(DEPARTMENT_NAME) AS DEPARTMENT_COUNT
    FROM DEPARTMENT,
         UNIVERSITY
    WHERE DEPARTMENT.UNIVERSITY_ID = UNIVERSITY.UNIVERSITY_ID
    GROUP BY UNIVERSITY_NAME
    ORDER BY DEPARTMENT_COUNT DESC
        FETCH FIRST 1 ROWS ONLY;