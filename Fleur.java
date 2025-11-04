package ds2023;

public class Fleur extends Plante{
	private String couleur;
	private int moisF;
	
	
	
	public Fleur(String nom,int hauteur,int age,double prix,String couleur,int moisF) {
	    super(nom,hauteur,age,prix);
	    this.couleur=couleur;
	    this.moisF=moisF;
	}


	public String description() {
		return super.description()+" couleur : "+" mois de florissant : "+moisF+"\n";
	}
	
	public boolean fleurir() {
		return (moisF==4||moisF==5||moisF==6);
	}
	
	public String getEtatFloraison() {
	    if(fleurir())
	    	return"La fleur est en fleurs.";
	    else
	    	return"La fleur n'est pas en fleurs.";
	}


	public String getCouleur() {
		return couleur;
	}


	public void setCouleur(String couleur) {
		this.couleur = couleur;
	}
	
}
