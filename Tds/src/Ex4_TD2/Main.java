package Ex4_TD2;

public class Main {
public static void main(String[] args) {
	 CompteBancaire compte1 = new CompteBancaire(123, 0);
     CompteBancaire compte2 = new CompteBancaire(321, 0);

     compte1.deposerArgent(100);
     compte1.retirerArgent(80);

     compte2.deposerArgent(200);
     compte2.retirerArgent(110);

     System.out.println("Logs de journalisation :");
     System.out.println(Journalisation.getInstance().getLogs());
}
}
