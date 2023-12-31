package Ex2_TD3;

public class VueVehicule implements Observateur{
	 protected Vehicule vehicule;
	 protected String texte="";

	    public VueVehicule(Vehicule vehicule) {
	        this.vehicule=vehicule;
	        vehicule.ajouterObservateur(this);
	        actualise();
	    }

	    public void actualise() {
	    	texte="Description "+vehicule.getDescription()+" Prix: "+vehicule.getPrix();
	    }
	    public void affiche() {
	    	System.out.println(texte);
	    }
}
