package net.adisan.service.specificservice_4;

import com.google.gson.Gson;
import java.sql.Connection;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import net.adisan.bean.ResponseBean;
import net.adisan.bean.UsuarioBean;
import net.adisan.connection.ConnectionInterface;
import net.adisan.dao.specificdao_4.UsuarioDao_3;
import net.adisan.exceptions.MyException;
import net.adisan.factory.ConnectionFactory;
import net.adisan.factory.GsonFactory;
import net.adisan.helper.Log4jHelper;
import net.adisan.service.genericservice.GenericService;
import net.adisan.service.serviceinterface.ServiceInterface;
import net.adisan.setting.ConnectionSettings;

public class Prueba_Informada_Service_3 extends GenericService implements ServiceInterface {

    Connection oConnection = null;
    ResponseBean oResponseBean = null;
    Gson oGson = GsonFactory.getGson();
    ConnectionInterface oConnectionImplementation = null;
    HttpSession oSession = oRequest.getSession();

    public Prueba_Informada_Service_3(HttpServletRequest oRequest) {
        super(oRequest);
        ob = oRequest.getParameter("ob");
    }

    public String login() throws Exception {
        try {
            oConnectionImplementation = ConnectionFactory.getConnection(ConnectionSettings.connectionPool);
            oConnection = oConnectionImplementation.newConnection();
            UsuarioDao_3 oUsuarioDao = new UsuarioDao_3(oConnection, ob, oUsuarioBeanSession);
            UsuarioBean oUsuarioBean;
            String login = oRequest.getParameter("username");
            String password = oRequest.getParameter("password");
            oUsuarioBean = oUsuarioDao.get(login, password);

            if (oUsuarioBean != null) {
                if (oRequest.getParameter("username").equals(oUsuarioBean.getLogin()) && oRequest.getParameter("password").equalsIgnoreCase(oUsuarioBean.getPassword())) {
                    oSession.setAttribute("usuario", oRequest.getParameter("username"));
                    oResponseBean = new ResponseBean(200, "Welcome");
                } else {
                    oResponseBean = new ResponseBean(500, "Wrong password");
                }
            } else {
                oResponseBean = new ResponseBean(500, "Wrong password");
            }

            return oGson.toJson(oResponseBean);
        } catch (MyException ex) {
            String msg = this.getClass().getName() + ":" + (ex.getStackTrace()[0]).getMethodName() + " ob:" + ob;
            Log4jHelper.errorLog(msg, ex);
            ex.addDescripcion(msg);
            throw ex;
        } finally {
            if (oConnection != null) {
                oConnection.close();
            }
            if (oConnectionImplementation != null) {
                oConnectionImplementation.disposeConnection();
            }
        }
    }

    public String check() throws Exception {
        try {
            oConnectionImplementation = ConnectionFactory.getConnection(ConnectionSettings.connectionPool);
            oConnection = oConnectionImplementation.newConnection();
            UsuarioBean oUsuarioBean;
            oUsuarioBean = (UsuarioBean) oSession.getAttribute("usuario");
            UsuarioDao_3 oUsuarioDao = new UsuarioDao_3(oConnection, ob, oUsuarioBeanSession);

            if (oUsuarioBean == null) {
                oResponseBean = new ResponseBean(500, "No autorizado");
            } else {
                oUsuarioBean = oUsuarioDao.get(oUsuarioBean.getLogin());
                return "{\"status\":200,\"message\":" + oGson.toJson(oUsuarioBean) + "}";
            }

        } catch (MyException ex) {
            String msg = this.getClass().getName() + ":" + (ex.getStackTrace()[0]).getMethodName() + " ob:" + ob;
            Log4jHelper.errorLog(msg, ex);
            ex.addDescripcion(msg);
            throw ex;
        } finally {
            if (oConnection != null) {
                oConnection.close();
            }
            if (oConnectionImplementation != null) {
                oConnectionImplementation.disposeConnection();
            }
        }
        return oGson.toJson(oResponseBean);
    }

    public String logout() {
        oRequest.getSession().invalidate();
        oResponseBean = new ResponseBean(200, "No active session");
        return oGson.toJson(oResponseBean);
    }

    /*FILL*/
    String[] nombre = {"Marcos", "Carlos", "Cecilia", "Paco",
        "Jose", "Nacho", "Fernandito", "Maurici", "Eudald", "Miquel", "Benito", "Jaumet", "Pepet"};
    String[] apellido1 = {"de Cal", "el de", "de la",
        "dels", "de Can", "de les", "Ca la", "de"};
    String[] apellido2 = {"Ferrandis", "Montes",
        "Orriols", "Letilo", "Berchiche", "Cazorla", "Barrigon", "Alberga", "Matines", "Surmano", "Arias", "Cebes", "Gonzalez"};

    public String fill() throws Exception {
        try {
            oConnectionImplementation = ConnectionFactory
                    .getConnection(ConnectionSettings.connectionPool);
            oConnection = oConnectionImplementation.newConnection();
            UsuarioDao_3 oUsuarioDao = new UsuarioDao_3(oConnection, ob, oUsuarioBeanSession);

            int numUsuario = Integer.parseInt(oRequest.getParameter("number"));
            for (int i = 0; i < numUsuario; i++) {
                UsuarioBean oUsuarioBean = new UsuarioBean();
                
                String nombrePersona = nombre[(int) (Math.random() * nombre.length) + 0];
                String apellido1Persona = apellido1[(int) (Math.random() * apellido1.length) + 0];
                String apellido2Persona = apellido2[(int) (Math.random() * apellido2.length) + 0];
                String username = nombrePersona.substring(0, 2).toLowerCase().trim()
                        + apellido1Persona.substring(0, 2).toLowerCase().trim()
                        + apellido2Persona.substring(0, 2).toLowerCase().trim()
                        + (int) Math.floor(Math.random() * (1000 - 9999) + 9999);
                oUsuarioBean.setNombre(nombrePersona);
                oUsuarioBean.setPrimer_apellido(apellido1Persona);
                oUsuarioBean.setSegundo_apellido(apellido2Persona);
                oUsuarioBean.setEmail(username + "@adisan.com");
                oUsuarioBean.setLogin(username);
                oUsuarioBean.setPassword("da8ab09ab4889c6208116a675cad0b13e335943bd7fc418782d054b32fdfba04");
                oUsuarioBean.setId_tipousuario(2);
                oUsuarioBean.setToken(null);
                oUsuarioBean.setValidado(Boolean.TRUE);
                oUsuarioDao.insert(oUsuarioBean);
            }
            oResponseBean = new ResponseBean(200, "Insertados los registros con exito");
        } catch (MyException ex) {
            String msg = this.getClass().getName() + ":" + (ex.getStackTrace()[0]).getMethodName() + " ob:" + ob;
            Log4jHelper.errorLog(msg, ex);
            ex.addDescripcion(msg);
            throw ex;
        } finally {
            if (oConnection != null) {
                oConnection.close();
            }
            if (oConnectionImplementation != null) {
                oConnectionImplementation.disposeConnection();
            }
        }
        return oGson.toJson(oResponseBean);
    }

}
