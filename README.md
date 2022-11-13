# numerous-carriage-9825
# Crime-Information-Management-System

![Logo](https://github.com/nikhilkharat/numerous-carriage-9825/blob/day-5/Crime_Investigation_Management_System/Images/gs_article_img_157183295712.jpg)



The main aim of this system is to maintain and manage the detail information of the crime happened in  an  area under a particular police station. 
This software could be used by the police officials in the Police station.


## Things before running the application

If you want to run this java application in your system then you need to take care of some things before running in your system. 

1) You need mySql install in your system.

2) In Crime Investigation Management System I created two table which is<br>
   -> Crime Detail Table<br>
   -> Criminal Details Table<br>
   with the help of these two table I make 3rd Table which is<br>
   -> Criminal BY Police Station<br>
   
   We Can add Crime details information in Crime Table
   
   We can add Criminal information in Criminal Table
   
   Also we can see list of Both Crime and Criminal as per our Requirement.
   
   Apart from these we can access information like as following<br>
   -> Criminal By Crime.<br>
   -> Criminal By Crime Place.<br>
   -> Criminal By Crime Type.<br>
   -> Crime in Month.<br>
   -> Criminal Case Status.<br>
   -> All Case Details <br>
   -> Update Case Status (Solved/Unsolved)<br>

-----------------------------------------------------------------
| Field            | Type        | Null | Key | Default | Extra |
------------------------------------------------------------------
| CrimeId          | int         | NO   | PRI | NULL    |       |
| DateOfCrime      | date        | YES  |     | NULL    |       |
| CrimePlace       | varchar(15) | YES  |     | NULL    |       |
| CrimeType        | varchar(15) | YES  |     | NULL    |       |
| CrimeDescription | varchar(50) | YES  |     | NULL    |       |
| Victims          | varchar(50) | YES  |     | NULL    |       |
-----------------------------------------------------------------

Table crimeDetails :
====================
create crimeDetails <br>
(<br>
    CrimeId int primary key,<br>
    DateOfCrime varchar(20),<br>
    CrimePlace varchar(20),<br>
    CrimeType varchar(20),<br>
    CrimeDescription varchar(50),<br>
    Victims varchar(20)<br>
);

Table Criminal :
=====================
create table CriminalDetails<br>
(<br>
    CriminalName varchar(20) primary key,<br>
    Age int not null,<br>
    Gender varchar(20) not null,<br>
    Identity varchar(50) not null<br>
    CaseStatus varchar(15) <br>
);

Table CriminalByPoliceStation :
==================
create table CriminalByPoliceStation <br>
(<br>
    CrimeId int,<br>
    CriminalName varchar(20),<br>
    foreign key (CrimeId) references crimeDetails(CrimeId),<br>
    foreign key (CriminalName) references Bus(CriminalName)<br>
);


For accessing the database as Admin use Username: "Admin" and Password: "1234"

# 👉 [Click here](https://drive.google.com/file/d/1kKWC5dUw0bd2ESU9o_2k4L9_i6JaqKXS/view) to go through detail explanation of this application 


# Technology used 

- Java
- MySQL
- Git & GitHub

# Lessons Learned

- Gain excessive knowledge on application of Java and MySQL.
- Enjoyed the process of learning and creating the application.


# Feedback
> Valuable feedback will be appreciated.
> You can reach out to me via below medium.

- [Email](nikhil.kharat8a@gmail.com)
- [Linkedin](https://www.linkedin.com/in/nikhil-kharat-872608109)
# Contributor
#### Nikhil Kharat
>[GitHub](https://github.com/nikhilkharat)