package Ex2_TD2;

public class FabriqueVehiculeElectricite implements FabriqueVehicule{
	@Override
	public Automobile creeAutomobile(String modele, String Couleur, int puissance, double espace) {
		return new AutomobileElectricite(modele,Couleur,puissance,espace);
	}

	@Override
	public Scooter creeScooter(String modele, String couleur, int puissance) {
		return new ScooterElectricite(modele,couleur,puissance);
	}
}
