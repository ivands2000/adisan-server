package net.adisan.dao.specificdao_4;

import net.adisan.dao.daointerface.DaoInterface;
import java.sql.Connection;
import net.adisan.bean.UsuarioBean;
import net.adisan.dao.genericdao.GenericDao;

public class TipoPagoDao_3 extends GenericDao implements DaoInterface {

    public TipoPagoDao_3(Connection oConnection, String ob, UsuarioBean oUsuarioBeanSession) {
        super(oConnection, "tipopago", oUsuarioBeanSession);
    }
}
