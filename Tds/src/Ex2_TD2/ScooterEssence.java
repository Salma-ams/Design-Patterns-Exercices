package Ex2_TD2;

public class ScooterEssence extends Scooter{
	public ScooterEssence(String modele,String couleur,int puissance) {
		super(modele,couleur,puissance);
	}
	public void afficheCaracteristique() {
		System.out.println("Scooter a essence de modele:"+modele+" de couleur: "+couleur+" de puissance: "+puissance);
	}
}
