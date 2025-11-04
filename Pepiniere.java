package ds2023;

public class Pepiniere{
	private Plante[]inventaire;
	private final int MAX_PLANTES=100;
	private int nombreDePlantes=0;
	
	public Pepiniere(){
		inventaire=new  Plante[MAX_PLANTES];
	}
	
	public void ajoutPlante(Plante plante) {
	        if (nombreDePlantes<inventaire.length) {
	        	inventaire[nombreDePlantes]=plante;
	        	nombreDePlantes++;
	        }
	        else {
	            System.out.println("Impossible d'ajouter une plante");
	        }
	 }
	
	public void afficherInventaire() {
	    System.out.println("Inventaire de la Pépinière");
	    for (int i=0;i<nombreDePlantes;i++) {
	        System.out.println("Plante # "+i+"\n"+inventaire[i].description());
	        if (inventaire[i] instanceof Fleur) {
	            Fleur f=(Fleur) inventaire[i];
	            System.out.println("État de floraison : " +f.fleurir());
	        }
	    }
	}
	
	public double totalAbsorptionTotaleCO2() {
	    double total=0;
	    for (int i=0;i<nombreDePlantes;i++) {
	        if (inventaire[i] instanceof Arbre) {
	            Arbre a=(Arbre) inventaire[i];
	            total +=a.absorptionCO2();
	        }
	    }
	    return total;
	}

	
	public int compterArbresCaduques() {
	    int nb=0;
	    for (int i=0;i<nombreDePlantes; i++) {
	        if (inventaire[i] instanceof Arbre) {
	            Arbre a=(Arbre) inventaire[i];
	            if (a.getType_Feuillage().equals("Caduque"))
	                nb++;
	        }
	    }
	    return nb;
	}


public static void main(String[] args) {
	System.out.println("             Pépinière GREEN HANDS             ");
	Pepiniere pepiniere=new Pepiniere();
	Fleur rose=new Fleur(null,30,12,15.99,"Rouge",2);
	Fleur tulipe=new Fleur("Tulipe",20,8,12.99,"Jaune", 4);
	Arbre chene=new Arbre("Chêne",200,60,89.99,"Caduque");
	Arbre sapin=new Arbre("Sapin",150,30,59.99,"Persistant");
	rose.setNom("Rose");
	System.out.println("La "+rose.getNom()+" a la couleur "+rose.getCouleur());
	pepiniere.ajoutPlante(rose);
	pepiniere.ajoutPlante(tulipe);
	pepiniere.ajoutPlante(chene);
	pepiniere.ajoutPlante(sapin);
	pepiniere.afficherInventaire();
	System.out.println("Total absorption CO₂ : "+pepiniere.totalAbsorptionTotaleCO2());
	System.out.println("Nombre d’arbres caduques dans la pépinière : "+pepiniere.compterArbresCaduques());

	
}
}