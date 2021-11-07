package DB;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConnectionTest {
    @Test
    void testConnection() {
        Connection c1 = Connection.getConnection();
        Connection c2 = Connection.getConnection();
        assertTrue(c1 == c2);
    }
}