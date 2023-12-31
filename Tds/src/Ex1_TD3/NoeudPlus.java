package Ex1_TD3;

public class NoeudPlus implements Noeud{
		private Noeud gauche;
		private Noeud droit;
		public NoeudPlus(Noeud gauche,Noeud droit) {
			this.gauche=gauche;
			this.droit=droit;
		}
		@Override
		public void accept(VisiteurArbre visiteur) {
		visiteur.visiterNoeudPlus(this);
		}

}
