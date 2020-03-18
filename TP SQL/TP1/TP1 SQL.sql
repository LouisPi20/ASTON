create database nombrevisiteur;
create table visiteur
(adresse_ip VARCHAR(39) PRIMARY KEY UNIQUE NOT NULL,
premiere_visite DATETIME,
derniere_visite DATETIME DEFAULT NOW(),
nombre_visite INT);
# compter le nombre de visiteurs
SELECT COUNT(*) as "Nombre de visiteurs" FROM visiteur;
# ajouter un visiteur (avec son adresse IP)
insert into visiteur(adresse_ip, premiere_visite, derniere_visite, nombre_visite) values("192.168.16.149", now(), now(),0);
# Ajouter une visite au nombre de visite de l'adresse IP 251.15.25.36
UPDATE visiteur set nombre_visite = (nombre_visite + 1) where adresse_ip = "251.15.25.36";

  
  