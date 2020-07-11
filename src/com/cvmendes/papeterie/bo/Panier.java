package com.cvmendes.papeterie.bo;

import java.util.ArrayList;
import java.util.List;

public class Panier {
	
	private float montant;
	private Ligne ligne;
	private List<Ligne> lignesPanier = new ArrayList<>();
	
	public Panier() {
	}

	public float getMontant() {
		return montant;
	}

	public Ligne getLigne(int index) {
		return lignesPanier.get(index);
	}

	public List<Ligne> getLignesPanier() {
		return lignesPanier;
	}
	
	public void setMontant(float montant) {
		this.montant = montant;
	}
	
	public void addLigne(int qte, Article article) {
		Ligne newLigne = new Ligne(qte, article);
		lignesPanier.add(newLigne);
		
	}
	
	public void updateLigne(int index, int newQte) {
		lignesPanier.get(index).setQte(newQte);
		
	}
	
	public void removeLigne(int index) {
		lignesPanier.remove(index);
		
	}

	@Override
	public String toString() {
		StringBuffer strbf =new StringBuffer();
		strbf.append("Panier : \n\n");
		for (Ligne ligne : lignesPanier) {
			if (ligne != null){
				strbf.append("ligne " + lignesPanier.indexOf(ligne) + " :\t");
				strbf.append(ligne.toString());
				strbf.append("\n");
			} else break;
		}
		strbf.append("\nValeur du panier : " + getMontant());
		strbf.append("\n\n");
		return strbf.toString();
	}
	
	

}
