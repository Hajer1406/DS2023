package ds2023;

public class Arbre extends Plante{
	private String type_Feuillage;
	private static double AbsorMoyenne=22;
	
	public Arbre(String nom, int hauteur, int age, double prix,String type_Feuillage) {
		super(nom,hauteur,age,prix);
		this.type_Feuillage=type_Feuillage;
	}
	
	public String description() {
		return super.description()+"type de feuillage : "+type_Feuillage+"la moyenne d’absorption de CO2 par l’arbre : "+AbsorMoyenne+"\n";
	}
	public String getPerteFeuilles() {
        if (type_Feuillage.equals("caduque"))
            return "caduque";
        else
            return "persistant";
    }
	public double absorptionCO2()
	{
		if(hauteur>50)
			
		  return AbsorMoyenne+3;
		else 
			return AbsorMoyenne;
	}

	public String getType_Feuillage() {
		return type_Feuillage;
	}

	public void setType_Feuillage(String type_Feuillage) {
		this.type_Feuillage=type_Feuillage;
	}
	
	
}
