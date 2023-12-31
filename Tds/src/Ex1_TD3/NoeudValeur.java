package Ex1_TD3;

public class NoeudValeur implements Noeud {
private int valeur;
public NoeudValeur(int valeur) {
	this.valeur=valeur;
}
@Override
public void accept(VisiteurArbre visiteur) {
visiteur.visiterNoeudValeur(this);	
}

}
