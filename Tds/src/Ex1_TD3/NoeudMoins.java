package Ex1_TD3;

public class NoeudMoins implements Noeud{
private Noeud gauche;
private Noeud droit;
public NoeudMoins(Noeud gauche,Noeud droit) {
	this.gauche=gauche;
	this.droit=droit;
}
@Override
public void accept(VisiteurArbre visiteur) {
visiteur.visiterNoeudMoins(this);	
}

}
