package Ex4_TD2;

public class Journalisation {
	private static Journalisation instance;
    private StringBuilder logs;

    private Journalisation() {
        logs = new StringBuilder();
    }

    public static Journalisation getInstance() {
        if (instance == null) {
            instance = new Journalisation();
        }
        return instance;
    }

    public void ajouterLog(String message) {
        logs.append(message).append("\n");
    }

    public String getLogs() {
        return logs.toString();
    }

}
