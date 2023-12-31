package Ex1_TD3;

public class OperationArbre implements VisiteurArbre{

	@Override
	public void visiterNoeudPlus(NoeudPlus noeud) {
		System.out.println("addition");
	}

	@Override
	public void visiterNoeudMoins(NoeudMoins noeud) {
		System.out.println("soustraction");
	}

	@Override
	public void visiterNoeudValeur(NoeudValeur noeud) {
		System.out.println("valeur");
	}

}
