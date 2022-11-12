# numerous-carriage-9825
Crime Information Management System
![Logo](https://github.com/nikhilkharat/numerous-carriage-9825/blob/day-5/Crime_Investigation_Management_System/Images/gs_article_img_157183295712.jpg)


# Crime-Information-Management-System
The main aim of this system is to maintain and manage the detail information of the crime happened in  an  area under a particular police station. 
This software could be used by the police officials in the Police station.


## Things before running the application

If you want to run this java application in your system then you need to take care of some things before running in your system. 

1) You need mySql install in your system.

2) In Crime Investigation Management System I created two table which is
   -> Crime Detail Table
   -> Criminal Details Table
   with the help of these two table I make 3rd Table which is
   -> Criminal BY Police Station
   
   We Can add Crime details information in Crime Table
   
   We can add Criminal information in Criminal Table
   
   Also we can see list of Both Crime and Criminal as per our Requirement.
   
   Apart from these we can access information like as following
   -> Criminal By Crime.
   -> Criminal By Crime Place.
   -> Criminal By Crime Type.
   -> Crime in Month.
   -> Criminal Case Status.


Table crimeDetails :
====================
create crimeDetails (
    CrimeId int primary key,
    DateOfCrime varchar(20),
    CrimePlace varchar(20),
    CrimeType varchar(20),
    CrimeDescription varchar(50),
    Victims varchar(20)
);

Table Criminal :
=====================
create table CriminalDetails
 (
    
    CriminalName varchar(20) primary key,
    Age int not null,
    Gender varchar(20) not null,
    Identity varchar(50) not null

);

Table CriminalByPoliceStatio :
==================
create table CriminalByPoliceStation (
	CrimeId int,
	CriminalName varchar(20),
	foreign key (CrimeId) references crimeDetails(CrimeId),
    foreign key (CriminalName) references Bus(CriminalName)
);


For accessing the database as Admin use Username: "Admin" and Password: "1234"
