package net.adisan.dao.specificdao_0;

import net.adisan.dao.daointerface.DaoInterface;
import java.sql.Connection;
import net.adisan.bean.BeanInterface;
import net.adisan.bean.UsuarioBean;
import net.adisan.dao.genericdao.GenericDao;
import net.adisan.exceptions.MyException;

public class ProductoDao_0 extends GenericDao implements DaoInterface {

    public ProductoDao_0(Connection oConnection, String ob, UsuarioBean oUsuarioBeanSession) {
        super(oConnection, "producto", oUsuarioBeanSession);
    }

   
}
