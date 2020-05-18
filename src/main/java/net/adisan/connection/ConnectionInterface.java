package net.adisan.connection;

import java.sql.Connection;
import java.sql.SQLException;

public interface ConnectionInterface {

    public Connection newConnection() throws SQLException;

    public void disposeConnection() throws SQLException;

}
