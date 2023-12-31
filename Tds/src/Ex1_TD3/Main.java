package Ex1_TD3;

public class Main {
public static void main(String[] args) {
	Noeud arbre = new NoeudPlus(
			new NoeudValeur(5),
			new NoeudMoins(
			new NoeudValeur(10),
			new NoeudValeur(3)
			)
			);
VisiteurArbre visiteur=new OperationArbre();
arbre.accept(visiteur);
}
}
