package Ex4_TD3;

import java.util.ArrayList;
import java.util.List;

public class VueCatalogue {
protected List<VueVehicule> contenu=new ArrayList<VueVehicule>();
	protected DessinCatalogue dessin;
	public VueCatalogue(DessinCatalogue dessin) {
		contenu.add(new VueVehicule("Vehicule bon marche"));
		contenu.add(new VueVehicule("Vehicule spacieux"));
		contenu.add(new VueVehicule("Vehicule rapide"));
		contenu.add(new VueVehicule("Vehicule confortable"));
		contenu.add(new VueVehicule("Vehicule sportif"));
		this.dessin=dessin;


	}
	public void dessine() {
		dessin.dessine(contenu);
	}
}
