package net.adisan.factory;

import com.google.gson.Gson;
import net.adisan.bean.BeanInterface;

import net.adisan.bean.CircunstanciasaltaBean;
import net.adisan.bean.DependenciaBean;
import net.adisan.bean.DestinoAltaBean;
import net.adisan.bean.EpisodioBean;
import net.adisan.bean.AnaliticaBean;
import net.adisan.bean.CatalogoImagenesBean;
import net.adisan.bean.EpisodioDiagnosticoBean;
import net.adisan.bean.ImagenBean;
import net.adisan.bean.MedicoBean;
import net.adisan.bean.ModalidadEpisodioBean;
import net.adisan.bean.PacienteBean;
import net.adisan.bean.ProcedimientoBean;
import net.adisan.bean.Prueba_InformadaBean;
import net.adisan.bean.ServicioBean;
import net.adisan.bean.SexoBean;
import net.adisan.bean.TecnicoBean;
import net.adisan.bean.TipoEpisodioBean;
import net.adisan.bean.TipoPagoBean;
import net.adisan.bean.TipoUsuarioBean;
import net.adisan.bean.TratamientoBean;
import net.adisan.bean.UsuarioBean;

public class BeanFactory {

    public static BeanInterface getBean(String ob) {
        BeanInterface oBean = null;
        switch (ob) {
            case "paciente":
                oBean = new PacienteBean();
                break;
            case "episodio":
                oBean = new EpisodioBean();
                break;
            case "factura":
                oBean = new AnaliticaBean();
                break;
            case "imagen":
                oBean = new ImagenBean();
                break;
            case "tipousuario":
                oBean = new TipoUsuarioBean();
                break;
            case "usuario":
                oBean = new UsuarioBean();
                break;
            case "sexo":
                oBean = new SexoBean();
                break;
            case "tipopago":
                oBean = new TipoPagoBean();
                break;
            case "prueba_informada":
                oBean = new Prueba_InformadaBean();
                break;
             case "servicio":
                oBean = new ServicioBean();
                break;
            case "modalidadepisodio":
                oBean = new ModalidadEpisodioBean();
                break;
            case "destinoalta":
                oBean = new DestinoAltaBean();
                break;
            case "circunstanciasalta":
                oBean = new CircunstanciasaltaBean();
                break;
            case "tipoepisodio":
                oBean = new TipoEpisodioBean();
                break;
            case "medico":
                oBean = new MedicoBean();
                break;
            case "episodiodiagnostico":
                oBean = new EpisodioDiagnosticoBean();
                break;
            case "tratamiento":
                oBean = new TratamientoBean();
                break;   
            case "procedimiento":
                oBean = new ProcedimientoBean();
                break;
            case "analitica":
                oBean = new AnaliticaBean();
                break;
            case "dependencia":
                oBean = new DependenciaBean();
                break;
            case "tecnico":
                oBean = new TecnicoBean();
                break;
            case "catalogoimagenes":
                oBean = new CatalogoImagenesBean();
                break;
             
                
        }
        return oBean;
    }

    public static BeanInterface getBeanFromJson(String ob, String data) {
        BeanInterface oBean = null;
        Gson oGson = GsonFactory.getGson();
        switch (ob) {
            case "paciente":
                oBean = oGson.fromJson(data, PacienteBean.class);
                break;
            case "usuario":
                oBean = oGson.fromJson(data, UsuarioBean.class);
                break;
            case "prueba_informada":
                oBean = oGson.fromJson(data, Prueba_InformadaBean.class);
                break;
            case "factura":
                oBean = oGson.fromJson(data, AnaliticaBean.class);
                break;
            case "imagen":
                oBean = oGson.fromJson(data, ImagenBean.class);
                break;
            case "tipousuario":
                oBean = oGson.fromJson(data, TipoUsuarioBean.class);
                break;
            case "sexo":
                oBean = oGson.fromJson(data, SexoBean.class);
                break;
            case "tipopago":
                oBean = oGson.fromJson(data, TipoPagoBean.class);
                break;
            case "servicio":
                oBean = oGson.fromJson(data, ServicioBean.class);
                break;
            case "modalidadepisodio":
                oBean = oGson.fromJson(data, ModalidadEpisodioBean.class);
                break;
            case "destinoalta":
                oBean = oGson.fromJson(data, DestinoAltaBean.class);
                break;
            case "circunstanciasalta":
                oBean = oGson.fromJson(data, CircunstanciasaltaBean.class);
                break;    
           
            case "tipoepisodio":
                oBean = oGson.fromJson(data, TipoEpisodioBean.class);
                break;
            case "medico":
                oBean = oGson.fromJson(data, MedicoBean.class);
                break;
            case "episodiodiagnostico":
                oBean = oGson.fromJson(data, EpisodioDiagnosticoBean.class);
                break;
            case "tratamiento":
                oBean = oGson.fromJson(data, TratamientoBean.class);
                break;
            case "procedimiento":
                oBean = oGson.fromJson(data, ProcedimientoBean.class);
                break;
                case "analitica":
                    oBean = oGson.fromJson(data, AnaliticaBean.class);
                break;
            case "dependencia":
                oBean = oGson.fromJson(data, DependenciaBean.class);
                break;
                case "tecnico":
                oBean = oGson.fromJson(data, TecnicoBean.class);
                break;
                case "catalogoimagenes":
                oBean = oGson.fromJson(data, CatalogoImagenesBean.class);
                break;
        }
        return oBean;
    }

}
