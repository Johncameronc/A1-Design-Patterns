public class LoggerTestEnum {

    public static void main(String[] args) {

        System.out.println("--- Teste Singleton com Enum ---");

        CorporateLogger logger = CorporateLogger.INSTANCE;
        logger.logEvent("MainApp", "Aplicação iniciada.");

        CorporateLogger.INSTANCE.logAudit("User", "Configurações alteradas.");

        System.out.println("\nReferências são iguais? " + (logger == CorporateLogger.INSTANCE));

        new Thread(() -> {
            CorporateLogger.INSTANCE.logError("Thread-A", "Erro na Thread A.");
        }).start();

        new Thread(() -> {
            CorporateLogger.INSTANCE.logEvent("Thread-B", "Evento na Thread B.");
        }).start();
    }
}