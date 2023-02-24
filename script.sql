SET foreign_key_checks = 'ON'

create database if not exists dbvols; ADD

use dbvols; 

-- Creation de la table pilote
create table pilote (
    id int PRIMARY KEY auto_increment, 
    nom VARCHAR(45),
    prenom VARCHAR(45),
) ENGINE = InnoDB;

-- Remplissage de la table pilote
insert into pilote values (null,'Buzz','Aldrin');
insert into pilote values (null,'Neil','Armstrong');
insert into pilote values (null,'le Baron','rouge');
insert into pilote values (null,'Gordon','Cooper');
insert into pilote values (null,'Youri','Gagarine');
insert into pilote values (null,'Roland','Garros');
insert into pilote values (null,'Hermann','Göring');
insert into pilote values (null,'Gérard','Greindl');
insert into pilote values (null,'John','Glenn');
insert into pilote values (null,'Charles','Lindbergh');
insert into pilote values (null,'Jean','Mermoz');
insert into pilote values (null,'Francis','Gary Powers');
insert into pilote values (null,'Antoine','de Saint-Exupéry');
insert into pilote values (null,'Henri','Guillaumet');
insert into pilote values (null,'Chuck','Yeager');
insert into pilote values (null,'Roland','GLAVANY');
insert into pilote values (null,'Adolphe','PEGOUD');
insert into pilote values (null,'Amelia','EARHART');
insert into pilote values (null,'Amelia','EARHART');
insert into pilote values (null,'Anthony','FOKKER');
insert into pilote values (null,'Bessie','COLEMAN');
insert into pilote values (null,'Charles','LINDBERGH');
insert into pilote values (null,'Elise','DEROCHE');
insert into pilote values (null,'Emile','FAYOLLE');

create table avion (
    id int PRIMARY KEY auto_increment, 
    compagnie VARCHAR(45),
    type VARCHAR(45)
) ENGINE = InnoDB; 

insert into Avion values (null,'Avion A380-01','AIRBUS A380');
insert into Avion values (null,'Avion A380-02','AIRBUS A380');
insert into Avion values (null,'Avion B707-03','Boeing 707');
insert into Avion values (null,'Avion B707-04','Boeing 707');
insert into Avion values (null,'Avion A320-05','Airbus A320');
insert into Avion values (null,'Avion A320-06','Airbus A320');
insert into Avion values (null,'Avion B727-07','Boeing 727');
insert into Avion values (null,'Avion B727-08','Boeing 727');
insert into Avion values (null,'Avion B767-09','Boeing 767');
insert into Avion values (null,'Avion B767-10','Boeing 767');
insert into Avion values (null,'Avion B757-11','Boeing 757');
insert into Avion values (null,'Avion B757-12','Boeing 757');
insert into Avion values (null,'Avion B787-13','Boeing 787');
insert into Avion values (null,'Avion B787-14','Boeing 787');
insert into Avion values (null,'Avion B787M-15','Boeing 787 MAX');
insert into Avion values (null,'Avion B787M-16','Boeing 787 MAX');
insert into Avion values (null,'Avion B787M-17','Boeing 787 MAX');
insert into Avion values (null,'Avion B787-18','Boeing 787');


create table trajet (
    id int PRIMARY KEY auto_increment, 
    aeroport_depart VARCHAR(70),
    aeroport_arrive VARCHAR(70),
    duree DATETIME
) ENGINE = InnoDB; 

insert into trajet values (null,'Mohammed V International Airport','Aéroport de bordeaux Mérignac','1900-01-01 03:30:00');
insert into trajet values (null,'Al Massira Airport','Aéroport de bordeaux Mérignac','1900-01-01 04:30:00');
insert into trajet values (null,'Aalborg Airport','Ibn Batouta Airport','1900-01-01 03:20:00');
insert into trajet values (null,'Aarhus Airport','Moulay Ali Cherif Airport','1900-01-01 07:30:00');
insert into trajet values (null,'Aasiaat Airport','Ibn Batouta Airport','1900-01-01 04:50:00');
insert into trajet values (null,'Aba Tenna Dejazmach Yilma International Airport','Mohammed V International Airport','1900-01-01 06:20:00');
insert into trajet values (null,'Abbotsford Airport','Moulay Ali Cherif Airport','1900-01-01 09:00:00');
insert into trajet values (null,'Abeid Amani Karume International Airport','Mohammed V International Airport','1900-01-01 04:40:00');
insert into trajet values (null,'Abel Santamaria Airport','Mohammed V International Airport','1900-01-01 03:30:00');
insert into trajet values (null,'Aberdeen Dyce Airport','Ibn Batouta Airport','1900-01-01 04:35:00');
insert into trajet values (null,'Aberdeen Regional Airport','Nador International Airport','1900-01-01 08:20:00');
insert into trajet values (null,'Abha Regional Airport','Nador International Airport','1900-01-01 01:30:00');

create table vol (
    id int PRIMARY KEY auto_increment, 
    date_decollage VARCHAR(45),
    id_pilote int,
    id_avion int,
    id_trajet int,
) ENGINE = InnoDB;

alter table vol add constraint fk_vol_pilote FOREIGN key (id_pilote) REFERENCES pilote(id_pilote);

alter table vol add constraint fk_vol_avion FOREIGN key (id_avion) REFERENCES pilote(id_avion);

alter table vol add constraint fk_vol_trajet FOREIGN key (id_trajet) REFERENCES pilote(id_trajet);

insert into vol values (null, '2023-02-25 04:50:00',1,1,1);
insert into vol values (null, '2023-02-25 01:30:00',2,2,2);
insert into vol values (null, '2023-02-25 10:20:00',3,3,3);
insert into vol values (null, '2023-02-25 20:00:00',4,4,4);
insert into vol values (null, '2023-02-25 23:10:00',5,5,5);
 