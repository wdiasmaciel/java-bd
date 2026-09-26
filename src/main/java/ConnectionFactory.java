import java.sql.Connection;
import java.sql.DriverManager;

/** Classe para criação de conexões com o banco de dados. */
public class ConnectionFactory {
    private Connection connection = null;

    public ConnectionFactory() {
    }

    public Connection createConnection() {
        try {
            // Conectar ao banco de dados SQLite:
            this.connection = DriverManager.getConnection("jdbc:sqlite:teste.db");
            System.out.println("Conexão com SQLite estabelecida!");
        } catch (Exception e) {
            System.err.println("Não foi possível estabelecer conexão com SQLite!");
            e.printStackTrace();
        }
        return this.connection;    
    }
}