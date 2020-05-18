package net.adisan.connection;

public class ConnectionFactory {

    public static ConnectionInterface getConnection() {
        return new BoneCPImplementation();
    }
}
