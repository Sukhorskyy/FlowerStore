package DB;

public class Connection {
    private Connection() {}

    private static class ConnectionHolder {
        static final Connection INSTANCE = new Connection();
    }

    public static Connection getConnection() {
        return ConnectionHolder.INSTANCE;
    }
}
