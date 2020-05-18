package net.adisan.factory;

import net.adisan.connection.ConnectionInterface;
import net.adisan.connection.implementation.BoneCPConnectionImplementation;
import net.adisan.connection.implementation.C3P0ConnectionImplementation;
import net.adisan.connection.implementation.DBCPConnectionImplementation;
import net.adisan.connection.implementation.HikariConnectionImplementation;
import net.adisan.connection.implementation.ViburConnectionImplementation;
import net.adisan.setting.ConnectionSettings;

public class ConnectionFactory {

    public static ConnectionInterface getConnection(ConnectionSettings.EnumConstans enumConnection) {
        ConnectionInterface oConnectionInterface;
        switch (enumConnection) {
            case Hikari:
                oConnectionInterface = new HikariConnectionImplementation();
                break;
            case DBCP:
                oConnectionInterface = new DBCPConnectionImplementation();
                break;
            case BoneCP:
                oConnectionInterface = new BoneCPConnectionImplementation();
                break;
            case C3P0:
                oConnectionInterface = new C3P0ConnectionImplementation();
                break;
            case Vibur:
                oConnectionInterface = new ViburConnectionImplementation();
                break;
            default:
                oConnectionInterface = new HikariConnectionImplementation();
                break;
        }
        return oConnectionInterface;

    }
}
