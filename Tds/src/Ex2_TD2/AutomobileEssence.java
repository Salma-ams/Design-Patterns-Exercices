package Ex2_TD2;

public class AutomobileEssence extends Automobile{
	public AutomobileEssence(String modele,String couleur,int puissance,double espace) {
		super(modele,couleur,puissance,espace);
	}
	@Override
	public void afficheCaracteristique() {
System.out.println("Automobile a essence de modele: "+modele+"de couleur: "+couleur+" de puissance: "+puissance+"d'espace: "+espace);		
	};
	
}
