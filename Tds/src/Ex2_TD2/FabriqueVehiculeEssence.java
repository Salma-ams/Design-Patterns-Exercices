package Ex2_TD2;

public class FabriqueVehiculeEssence implements FabriqueVehicule{

	@Override
	public Automobile creeAutomobile(String modele, String Couleur, int puissance, double espace) {
		return new AutomobileEssence(modele,Couleur,puissance,espace);
	}

	@Override
	public Scooter creeScooter(String modele, String couleur, int puissance) {
		return new ScooterEssence(modele,couleur,puissance);
	}

}
