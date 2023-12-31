package Ex2_TD2;

public class ScooterElectricite extends Scooter{
public ScooterElectricite(String modele,String couleur,int puissance) {
	super(modele,couleur,puissance);
}
public void afficheCaracteristique() {
	System.out.println("Scooter electrique de modele:"+modele+" de couleur: "+couleur+" de puissance: "+puissance);
}
}
