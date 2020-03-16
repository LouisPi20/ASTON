package com.aston.banque;

public class Run {

	public static void main(String[] args) {
		Client cli = new Client("Raoux", "Killian" , 18, 1);
		cli.ajouterCompte(new Compte(1, 1_000_000_000));
		System.out.println(cli);
		
	}
}
