package net.adisan.dao.specificdao_4;

import net.adisan.dao.daointerface.DaoInterface;
import java.sql.Connection;
import net.adisan.bean.UsuarioBean;
import net.adisan.dao.genericdao.GenericDao;

public class DestinoAltaDao_3 extends GenericDao implements DaoInterface {

    public DestinoAltaDao_3(Connection oConnection, String ob, UsuarioBean oUsuarioBeanSession) {
        super(oConnection, "destinoalta", oUsuarioBeanSession);
    }
}
