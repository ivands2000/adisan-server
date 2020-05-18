package net.adisan.factory;

import javax.servlet.http.HttpServletRequest;
import net.adisan.bean.UsuarioBean;
import net.adisan.service.specificservice_0.UsuarioService_0;
import net.adisan.service.specificservice_4.CatalogoImagenesService_3;
import net.adisan.service.specificservice_4.DependenciaService_3;
import net.adisan.service.specificservice_4.EpisodioService_3;
import net.adisan.service.specificservice_4.FacturaService_3;
import net.adisan.service.specificservice_4.ImagenService_3;
import net.adisan.service.specificservice_4.MedicoService_3;
import net.adisan.service.specificservice_4.PacienteService_3;
import net.adisan.service.specificservice_4.Prueba_Informada_Service_3;
import net.adisan.service.specificservice_4.TecnicoService_3;
import net.adisan.service.specificservice_4.TipoUsuarioService_3;
import net.adisan.service.specificservice_4.UsuarioService_3;

public class ServiceCall {

    HttpServletRequest oRequest;

    public static String executeService(HttpServletRequest oRequest) throws Exception {
        String ob = oRequest.getParameter("ob");
        String op = oRequest.getParameter("op");
        String strResult;

        int idSessionUserTipe;
        UsuarioBean oUsuarioBeanSession = (UsuarioBean) oRequest.getSession().getAttribute("usuario");
        if (oUsuarioBeanSession != null) {
            idSessionUserTipe = oUsuarioBeanSession.getId_tipousuario();
        } else {
            idSessionUserTipe = 0;
        }
        switch (idSessionUserTipe) {
            case 0:
                switch (ob) {
                    case "usuario":
                        UsuarioService_0 oUsuarioService = new UsuarioService_0(oRequest);
                        switch (op) {
                            case "login":
                                strResult = oUsuarioService.login();
                                break;
                            case "check":
                                strResult = oUsuarioService.check();
                                break;
                            case "signup":
                                strResult = oUsuarioService.signup();
                                break;
                            case "recover":
                                strResult = oUsuarioService.recover();
                                break;
                            case "changePassword":
                                strResult = oUsuarioService.changePassword();
                                break;
                            default:
                                strResult = "Operation doesn't exist";
                                break;
                        }
                        break;
                    default:
                        strResult = "Object doesn't exist";
                        break;
                }
                break;
            case 4:
                switch (ob) {
                    case "tipousuario":
                        TipoUsuarioService_3 oTipousuarioService = new TipoUsuarioService_3(oRequest);
                        switch (op) {

                            case "get":
                                strResult = oTipousuarioService.get();
                                break;
                            case "insert":
                                strResult = oTipousuarioService.insert();
                                break;
                            case "update":
                                strResult = oTipousuarioService.update();
                                break;
                            case "remove":
                                strResult = oTipousuarioService.remove();
                                break;
                            case "getcount":
                                strResult = oTipousuarioService.getCount();
                                break;
                            case "getpage":
                                strResult = oTipousuarioService.getPage();
                                break;
                            default:
                                strResult = "Operation doesn't exist";
                                break;
                        }
                        break;
                    case "usuario":
                        UsuarioService_3 oUsuarioService = new UsuarioService_3(oRequest);
                        switch (op) {

                            case "get":
                                strResult = oUsuarioService.get();
                                break;
                            case "insert":
                                strResult = oUsuarioService.insert();
                                break;
                            case "update":
                                strResult = oUsuarioService.update();
                                break;
                            case "remove":
                                strResult = oUsuarioService.remove();
                                break;
                            case "getcount":
                                strResult = oUsuarioService.getCount();
                                break;
                            case "getpage":
                                strResult = oUsuarioService.getPage();
                                break;
                            case "fill":
                                strResult = oUsuarioService.fill();
                                break;
                            case "login":
                                strResult = oUsuarioService.login();
                                break;
                            case "logout":
                                strResult = oUsuarioService.logout();
                                break;
                            case "check":
                                strResult = oUsuarioService.check();
                                break;
                            default:
                                strResult = "Operation doesn't exist";
                                break;
                        }
                        break;
                    case "paciente":
                        PacienteService_3 oPacienteService = new PacienteService_3(oRequest);
                        switch (op) {
                            case "get":
                                strResult = oPacienteService.get();
                                break;
                            case "insert":
                                strResult = oPacienteService.insert();
                                break;
                            case "update":
                                strResult = oPacienteService.update();
                                break;
                            case "remove":
                                strResult = oPacienteService.remove();
                                break;
                            case "getcount":
                                strResult = oPacienteService.getCount();
                                break;
                            case "getpage":
                                strResult = oPacienteService.getPage();
                                break;
                            case "fill":
                                strResult = oPacienteService.fill();
                                break;
                            default:
                                strResult = "Operation doesn't exist";
                                break;
                        }
                        break;
                    case "imagen":
                        ImagenService_3 oImagenService = new ImagenService_3(oRequest);
                        switch (op) {
                            case "get":
                                strResult = oImagenService.get();
                                break;
                            case "insert":
                                strResult = oImagenService.insert();
                                break;
                            case "update":
                                strResult = oImagenService.update();
                                break;
                            case "remove":
                                strResult = oImagenService.remove();
                                break;
                            case "getcount":
                                strResult = oImagenService.getCount();
                                break;
                            case "getpage":
                                strResult = oImagenService.getPage();
                                break;
                            case "addimage":
                                strResult = oImagenService.addimage();
                                break;
                            default:
                                strResult = "Operation doesn't exist";
                                break;
                        }
                        break;
                        case "tecnico":
                            TecnicoService_3 oTecncicoService_3 = new TecnicoService_3(oRequest);
                        switch (op) {
                            case "get":
                                strResult = oTecncicoService_3.get();
                                break;
                            case "insert":
                                strResult = oTecncicoService_3.insert();
                                break;
                            case "update":
                                strResult = oTecncicoService_3.update();
                                break;
                            case "remove":
                                strResult = oTecncicoService_3.remove();
                                break;
                            case "fill":
                                strResult = oTecncicoService_3.fill();
                                break;
                            case "getcount":
                                strResult = oTecncicoService_3.getCount();
                                break;
                            case "getpage":
                                strResult = oTecncicoService_3.getPage();
                                break;
                            default:
                                strResult = "Operation doesn't exist";
                                break;
                        }
                        break;
                    case "episodio":
                        EpisodioService_3 oEpisodioService_3 = new EpisodioService_3(oRequest);
                        switch (op) {
                            case "get":
                                strResult = oEpisodioService_3.get();
                                break;
                            case "insert":
                                strResult = oEpisodioService_3.insert();
                                break;
                            case "update":
                                strResult = oEpisodioService_3.update();
                                break;
                            case "remove":
                                strResult = oEpisodioService_3.remove();
                                break;
                            case "fill":
                                strResult = oEpisodioService_3.fill();
                                break;
                            case "getcount":
                                strResult = oEpisodioService_3.getCount();
                                break;
                            case "getpage":
                                strResult = oEpisodioService_3.getPage();
                                break;
                            default:
                                strResult = "Operation doesn't exist";
                                break;
                        }
                        break;
                    case "dependencia":
                        DependenciaService_3 oDependenciaService = new DependenciaService_3(oRequest);
                        switch (op) {
                            case "get":
                                strResult = oDependenciaService.get();
                                break;
                            case "insert":
                                strResult = oDependenciaService.insert();
                                break;
                            case "update":
                                strResult = oDependenciaService.update();
                                break;
                            case "remove":
                                strResult = oDependenciaService.remove();
                                break;
                            case "getcount":
                                strResult = oDependenciaService.getCount();
                                break;
                            case "getpage":
                                strResult = oDependenciaService.getPage();
                                break;
                            case "addimage":
                                strResult = oDependenciaService.addimage();
                                break;
                            default:
                                strResult = "Operation doesn't exist";
                                break;
                        }
                        break;
                        case "catalogoimagenes":
                        CatalogoImagenesService_3 oCatService = new CatalogoImagenesService_3(oRequest);
                        switch (op) {
                            case "get":
                                strResult = oCatService.get();
                                break;
                            case "insert":
                                strResult = oCatService.insert();
                                break;
                            case "update":
                                strResult = oCatService.update();
                                break;
                            case "remove":
                                strResult = oCatService.remove();
                                break;
                            case "getcount":
                                strResult = oCatService.getCount();
                                break;
                            case "getpage":
                                strResult = oCatService.getPage();
                                break;
                            case "addimage":
                                strResult = oCatService.addimage();
                                break;
                            default:
                                strResult = "Operation doesn't exist";
                                break;
                        }
                        break;
                    case "medico":
                        MedicoService_3 oMedicoService = new MedicoService_3(oRequest);
                        switch (op) {
                            case "get":
                                strResult = oMedicoService.get();
                                break;
                            case "insert":
                                strResult = oMedicoService.insert();
                                break;
                            case "update":
                                strResult = oMedicoService.update();
                                break;
                            case "remove":
                                strResult = oMedicoService.remove();
                                break;
                            case "getcount":
                                strResult = oMedicoService.getCount();
                                break;
                            case "getpage":
                                strResult = oMedicoService.getPage();
                                break;
                            case "addimage":
                                strResult = oMedicoService.addimage();
                                break;
                            default:
                                strResult = "Operation doesn't exist";
                                break;
                        }
                        break;
                    case "prueba_informada":
                        Prueba_Informada_Service_3 oPrueba_Informada_Service_3 = new Prueba_Informada_Service_3(oRequest);
                        switch (op) {
                            case "get":
                                strResult = oPrueba_Informada_Service_3.get();
                                break;
                            case "insert":
                                strResult = oPrueba_Informada_Service_3.insert();
                                break;
                            case "update":
                                strResult = oPrueba_Informada_Service_3.update();
                                break;
                            case "remove":
                                strResult = oPrueba_Informada_Service_3.remove();
                                break;
                            case "getcount":
                                strResult = oPrueba_Informada_Service_3.getCount();
                                break;
                            case "getpage":
                                strResult = oPrueba_Informada_Service_3.getPage();
                                break;
                            default:
                                strResult = "Operation doesn't exist";
                                break;
                        }
                        break;
                    default:
                        strResult = "Object doesn't exist";
                        break;
                }
                break;        
            default:
                strResult = "profile doesn't exist";
                break;
        }
        return strResult;
    }
}
