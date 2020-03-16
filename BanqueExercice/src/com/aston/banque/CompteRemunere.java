package com.aston.banque;

public class CompteRemunere extends Compte {

	private double taux;
	public CompteRemunere(int numero, double solde, double taux) {
		super(numero, solde);
		this.taux = taux; 	
	}
	
	public double getTaux( ) {
		return taux;
		
	}
	
	public void setTaux(double taux) {
		if(taux < 0.0) {
			this.taux = 0.0;
		if(taux > 1.0)
			this.taux = 1.0;
		else
			this.taux = taux ;
		
		}
	}
	
	public double calculerInterets() {
		return this.taux = this.getSolde();
		
	}
	
	public void verserInterets() {
		this.ajouter(this);
	}

	private void ajouter(CompteRemunere compteRemunere) {
		// TODO Auto-generated method stub
		
	}
}
