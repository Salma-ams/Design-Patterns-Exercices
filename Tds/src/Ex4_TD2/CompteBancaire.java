package Ex4_TD2;

public class CompteBancaire {
	private int numero;
    private double solde;

    public CompteBancaire(int numero, double solde) {
        this.numero = numero;
        this.solde = solde;
    }

    public void deposerArgent(double montant) {
        solde += montant;
        Journalisation.getInstance().ajouterLog("Dépôt sur le compte " + numero + ": " + montant + " DA");
    }

    public void retirerArgent(double montant) {
        if (montant <= solde) {
            solde -= montant;
            Journalisation.getInstance().ajouterLog("Retrait sur le compte " + numero + ": " + montant + " DA");
        } else {
            Journalisation.getInstance().ajouterLog("Retrait impossible sur le compte " + numero + ": Solde insuffisant");
        }
    }

    public int getNumero() {
        return numero;
    }

    public double getSolde() {
        return solde;
    }
}
