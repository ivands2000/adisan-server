package net.adisan.factory;

import java.sql.Connection;
import java.sql.SQLException;
import net.adisan.bean.UsuarioBean;
import net.adisan.dao.daointerface.DaoInterface;
import net.adisan.dao.specificdao_0.UsuarioDao_0;
import net.adisan.dao.specificdao_4.AnaliticaDao_3;
import net.adisan.dao.specificdao_4.CatalogoDao_3;
import net.adisan.dao.specificdao_4.DependenciaDao_3;
import net.adisan.dao.specificdao_4.DestinoAltaDao_3;
import net.adisan.dao.specificdao_4.EpisodioDao_3;
import net.adisan.dao.specificdao_4.EpisodioDiagnosticoDao_3;
import net.adisan.dao.specificdao_4.FacturaDao_3;
import net.adisan.dao.specificdao_4.ImagenDao_3;
import net.adisan.dao.specificdao_4.MedicoDao_3;
import net.adisan.dao.specificdao_4.ModalidadEpisodioDao_3;
import net.adisan.dao.specificdao_4.PacienteDao_3;
import net.adisan.dao.specificdao_4.ProcedimientoDao_3;
import net.adisan.dao.specificdao_4.Prueba_InformadaDao_3;
import net.adisan.dao.specificdao_4.ServicioDao_3;
import net.adisan.dao.specificdao_4.SexoDao_3;
import net.adisan.dao.specificdao_4.TecnicoDao_3;
import net.adisan.dao.specificdao_4.TipoEpisodioDao_3;
import net.adisan.dao.specificdao_4.TipoPagoDao_3;
import net.adisan.dao.specificdao_4.TipoUsuarioDao_3;
import net.adisan.dao.specificdao_4.TratamientoDao_3;
import net.adisan.dao.specificdao_4.UsuarioDao_3;
import net.adisan.exceptions.MyException;

public class DaoFactory {

    public static DaoInterface getDao(Connection oConnection, String ob, UsuarioBean oUsuarioBeanSession) throws MyException, SQLException {
        DaoInterface oDao = null;
        int idSessionUserTipe;
        if (oUsuarioBeanSession != null) {
            idSessionUserTipe = oUsuarioBeanSession.getId_tipousuario();
        } else {
            idSessionUserTipe = 0;
        }

        switch (idSessionUserTipe) {
            case 4:
                switch (ob) {
                    case "dependencia":
                        oDao = new DependenciaDao_3(oConnection, ob, oUsuarioBeanSession);
                        break;
                    case "factura":
                        oDao = new FacturaDao_3(oConnection, ob, oUsuarioBeanSession);
                        break;
                    case "tipousuario":
                        oDao = new TipoUsuarioDao_3(oConnection, ob, oUsuarioBeanSession);
                        break;
                    case "catalogoimagenes":
                        oDao = new CatalogoDao_3(oConnection, ob, oUsuarioBeanSession);
                        break;
                    case "tecnico":
                        oDao = new TecnicoDao_3(oConnection, ob, oUsuarioBeanSession);
                        break;
                    case "usuario":
                        oDao = new UsuarioDao_3(oConnection, ob, oUsuarioBeanSession);
                        break;
                    case "paciente":
                        oDao = new PacienteDao_3(oConnection, ob, oUsuarioBeanSession);
                        break;
                    case "episodio":
                        oDao = new EpisodioDao_3(oConnection, ob, oUsuarioBeanSession);
                        break;
                    case "imagen":
                        oDao = new ImagenDao_3(oConnection, ob, oUsuarioBeanSession);
                        break;
                    case "tipopago":
                        oDao = new TipoPagoDao_3(oConnection, ob, oUsuarioBeanSession);
                        break;
                    case "sexo":
                        oDao = new SexoDao_3(oConnection, ob, oUsuarioBeanSession);
                        break;
                    case "prueba_informada":
                        oDao = new Prueba_InformadaDao_3(oConnection, ob, oUsuarioBeanSession);
                        break;
                    case "servicio":
                        oDao = new ServicioDao_3(oConnection, ob, oUsuarioBeanSession);
                        break;
                    case "modalidadepisodio":
                        oDao = new ModalidadEpisodioDao_3(oConnection, ob, oUsuarioBeanSession);
                        break;
                    case "destinoalta":
                        oDao = new DestinoAltaDao_3(oConnection, ob, oUsuarioBeanSession);
                        break;
                    case "circunstanciasalta":
                        oDao = new ServicioDao_3(oConnection, ob, oUsuarioBeanSession);
                        break;
                    case "tipoepisodio":
                        oDao = new TipoEpisodioDao_3(oConnection, ob, oUsuarioBeanSession);
                        break;
                    case "medico":
                        oDao = new MedicoDao_3(oConnection, ob, oUsuarioBeanSession);
                        break;
                    case "episodiodiagnostico":
                        oDao = new EpisodioDiagnosticoDao_3(oConnection, ob, oUsuarioBeanSession);
                        break;
                    case "tratamiento":
                        oDao = new TratamientoDao_3(oConnection, ob, oUsuarioBeanSession);
                        break;
                    case "procedimiento":
                        oDao = new ProcedimientoDao_3(oConnection, ob, oUsuarioBeanSession);
                        break;
                    case "analitica":
                        oDao = new AnaliticaDao_3(oConnection, ob, oUsuarioBeanSession);
                        break;
                }
                break;
            case 0:
                switch (ob) {
                    case "usuario":
                        oDao = new UsuarioDao_0(oConnection, ob, oUsuarioBeanSession);
                        break;
                }
                break;
            default:
                throw new MyException(7000, "Error en Dao factory de " + ob);
        }
        return oDao;
    }
}
