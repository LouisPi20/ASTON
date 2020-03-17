package com.exo;

public class Client {

	private String nom;
	private String prenom;
	private int age; 

	public Adresse adresse;
	
//	Constructeur par défaut
	public Client() {
	}
	
	public Client(Adresse adresse) {
	}

//	Mes setters
	
	public void setNom(String nom) {
		this.nom = nom;
	}
	
	public void setAdresse(Adresse adresse) {
		this.adresse = adresse;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	
	public void setAge(int age) {
		this.age = age;
	}
	
	
//	Mes getters 
	
	public String getNom() {
		return nom;
	}

	public Adresse getAdresse() {
		return adresse;
	}

	public String getPrenom() {
		return prenom;
	}

	public int getAge() {
		return age;
	}

	@Override
	public String toString() {
		return "Client [nom=" + nom + ", prenom=" + prenom + ", age=" + age + adresse + "]";
	}

	
	
	
	
}
