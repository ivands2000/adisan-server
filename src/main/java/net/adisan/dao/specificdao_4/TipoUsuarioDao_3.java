package net.adisan.dao.specificdao_4;

import net.adisan.dao.daointerface.DaoInterface;
import java.sql.Connection;
import net.adisan.bean.UsuarioBean;
import net.adisan.dao.genericdao.GenericDao;

public class TipoUsuarioDao_3 extends GenericDao implements DaoInterface {

    public TipoUsuarioDao_3(Connection oConnection, String ob, UsuarioBean oUsuarioBeanSession) {
        super(oConnection, "tipousuario", oUsuarioBeanSession);
    }
}
