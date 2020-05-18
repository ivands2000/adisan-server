package net.adisan.dao.specificdao_4;

import net.adisan.dao.daointerface.DaoInterface;
import java.sql.Connection;
import net.adisan.bean.UsuarioBean;
import net.adisan.dao.genericdao.GenericDao;

public class ProcedimientoDao_3 extends GenericDao implements DaoInterface {

    public ProcedimientoDao_3(Connection oConnection, String ob, UsuarioBean oUsuarioBeanSession) {
        super(oConnection, "procedimiento", oUsuarioBeanSession);
    }
}
