import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public enum CorporateLogger {

    INSTANCE;

    private final String logFilePath = "corporate_logs_enum.txt";
    private final DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

    CorporateLogger() {
        System.out.println("CorporateLogger (Enum): Instância de logging criada. Inicializando conexões...");
    }

    public void logError(String source, String message) {
        recordLog(formatLog("ERROR", source, message));
    }

    public void logEvent(String source, String message) {
        recordLog(formatLog("EVENT", source, message));
    }

    public void logAudit(String source, String action) {
        recordLog(formatLog("AUDIT", source, action));
    }

    private String formatLog(String type, String source, String message) {
        String timestamp = LocalDateTime.now().format(formatter);
        return String.format("[%s] [%s] [%s] %s", timestamp, type, source, message);
    }

    private synchronized void recordLog(String logEntry) {
        System.out.println(logEntry);

        try (PrintWriter out = new PrintWriter(new FileWriter(logFilePath, true))) {
            out.println(logEntry);
        } catch (IOException e) {
            System.err.println("Erro ao escrever no arquivo de log: " + e.getMessage());
        }

    }
}