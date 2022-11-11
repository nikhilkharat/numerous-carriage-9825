# numerous-carriage-9825
Crime Information Management System

# Crime-Information-Management-System
The main aim of this system is to maintain and manage the detail information of the crime happened in  an  area under a particular police station. 
This software could be used by the police officials in the Police station.


## Things before running the application

If you want to run this java application in your system then you need to take care of some things before running in your system. 

1) You need mySql install in your system.

2) Some tables needs in managementSystem, you need to create managementSystem database then you need to create 4 tables first.


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

Table CriminalNyPoliceStatio :
==================
create table CriminalNyPoliceStation (
	CrimeId int,
	CriminalName varchar(20),
	foreign key (CrimeId) references crimeDetails(CrimeId),
    foreign key (CriminalName) references Bus(CriminalName)
);


For accessing the database as admin use Username: "Admin" and Password: "1234"
