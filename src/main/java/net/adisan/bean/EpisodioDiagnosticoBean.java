package net.adisan.bean;

import com.google.gson.annotations.Expose;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Date;
import java.util.List;

public class EpisodioDiagnosticoBean implements BeanInterface {

    @Expose
    private Integer id;
    @Expose
    private Date fecha;
    @Expose(deserialize = false)
    private Integer id_tipodiagnostico;
    @Expose(deserialize = false)
    private Integer id_episodio;
    @Expose(deserialize = false)
    private Integer id_diagnostico;
    @Expose(deserialize = false)
    private Integer id_poa;
    @Expose(deserialize = false)
    private EpisodioDiagnosticoBean id_tipodiagnostico_obj;
    @Expose(deserialize = false)
    private CircunstanciasaltaBean id_episodio_obj;
    /* @Expose(deserialize = false)
    private DiagnosticoBean id_diagnostico_obj;
    @Expose(deserialize = false)
    private PoaBean id_poa_obj;
     */
    @Expose
    private Boolean canCreate;
    @Expose
    private Boolean canUpdate;
    @Expose
    private Boolean canDelete;

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Integer getId_tipodiagnostico() {
        return id_tipodiagnostico;
    }

    public void setId_tipodiagnostico(Integer id_tipodiagnostico) {
        this.id_tipodiagnostico = id_tipodiagnostico;
    }

    public Integer getId_diagnostico() {
        return id_diagnostico;
    }

    public void setId_diagnostico(Integer id_diagnostico) {
        this.id_diagnostico = id_diagnostico;
    }

    public Integer getId_poa() {
        return id_poa;
    }

    public void setId_poa(Integer id_poa) {
        this.id_poa = id_poa;
    }

    public EpisodioDiagnosticoBean getId_tipodiagnostico_obj() {
        return id_tipodiagnostico_obj;
    }

    public void setId_tipodiagnostico_obj(EpisodioDiagnosticoBean id_tipodiagnostico_obj) {
        this.id_tipodiagnostico_obj = id_tipodiagnostico_obj;
    }

    public CircunstanciasaltaBean getId_episodio_obj() {
        return id_episodio_obj;
    }

    public void setId_episodio_obj(CircunstanciasaltaBean id_episodio_obj) {
        this.id_episodio_obj = id_episodio_obj;
    }

    @Override
    public Integer getId() {
        return id;
    }

    @Override
    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getId_episodio() {
        return id_episodio;
    }

    public void setId_episodio(Integer id_episodio) {
        this.id_episodio = id_episodio;
    }

    public Boolean getCanCreate() {
        return canCreate;
    }

    public void setCanCreate(Boolean canCreate) {
        this.canCreate = canCreate;
    }

    public Boolean getCanUpdate() {
        return canUpdate;
    }

    public void setCanUpdate(Boolean canUpdate) {
        this.canUpdate = canUpdate;
    }

    public Boolean getCanDelete() {
        return canDelete;
    }

    public void setCanDelete(Boolean canDelete) {
        this.canDelete = canDelete;
    }

    @Override
    public PreparedStatement orderSQL(List<String> orden,
            PreparedStatement oPreparedStatement) throws Exception {
        for (int i = 1; i < orden.size(); i++) {
            if (orden.get((i - 1)).equalsIgnoreCase("id")) {
                oPreparedStatement.setInt(i, 1);
            } else if (orden.get((i - 1)).equalsIgnoreCase("fecha_firma")) {
                oPreparedStatement.setInt(i, 2);
            } else if (orden.get((i - 1)).equalsIgnoreCase("fecha_inicio")) {
                oPreparedStatement.setInt(i, 3);
            } else if (orden.get((i - 1)).equalsIgnoreCase("fecha_alta")) {
                oPreparedStatement.setInt(i, 4);
            } else if (orden.get((i - 1)).equalsIgnoreCase("importe")) {
                oPreparedStatement.setInt(i, 5);
            } else if (orden.get((i - 1)).equalsIgnoreCase("finalizado")) {
                oPreparedStatement.setInt(i, 6);
            } else if (orden.get((i - 1)).equalsIgnoreCase("bloqueado")) {
                oPreparedStatement.setInt(i, 7);
            } else if (orden.get((i - 1)).equalsIgnoreCase("motivo_ingreso")) {
                oPreparedStatement.setInt(i, 8);
            } else if (orden.get((i - 1)).equalsIgnoreCase("antecedentes")) {
                oPreparedStatement.setInt(i, 9);
            } else if (orden.get((i - 1)).equalsIgnoreCase("historia_actual")) {
                oPreparedStatement.setInt(i, 10);
            } else if (orden.get((i - 1)).equalsIgnoreCase("exploracion_fisica")) {
                oPreparedStatement.setInt(i, 11);
            } else if (orden.get((i - 1)).equalsIgnoreCase("evolucion_comentarios")) {
                oPreparedStatement.setInt(i, 12);
            } else if (orden.get((i - 1)).equalsIgnoreCase("diagnostico_principal")) {
                oPreparedStatement.setInt(i, 13);
            } else if (orden.get((i - 1)).equalsIgnoreCase("diagnostico_secundarios")) {
                oPreparedStatement.setInt(i, 14);
            } else if (orden.get((i - 1)).equalsIgnoreCase("procedimientos")) {
                oPreparedStatement.setInt(i, 15);
            } else if (orden.get((i - 1)).equalsIgnoreCase("tratamiento_recomendaciones")) {
                oPreparedStatement.setInt(i, 16);
            } else if (orden.get((i - 1)).equalsIgnoreCase("tratamiento_farmacos")) {
                oPreparedStatement.setInt(i, 17);
            } else if (orden.get((i - 1)).equalsIgnoreCase("recomendaciones")) {
                oPreparedStatement.setInt(i, 18);
            }
        }
        return oPreparedStatement;
    }

    @Override
    public String getFieldInsert() {
        return " (fecha_firma,fecha_inicio,fecha_alta,importe,finalizado,bloqueado,id_servicio,id_paciente,id_factura,id_dependencia,id_medico,id_tipoepisodio,id_episodio,id_circunstanciasalta,id_destinoalta,id_modalidadepisodio,id_usuario,motivo_ingreso,antecedentes,historia_actual,exploracion_fisica,evolucion_comentarios,diagnostico_principal,diagnostico_secundarios,procedimientos,tratamiento_recomendaciones,tratamiento_farmacos,recomendaciones) VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
    }

    private String getFieldFilter(String campo) {
        return " OR " + campo + " LIKE ?";
    }

    @Override
    public String getFieldConcat() {

        return " id LIKE ?"
                + getFieldFilter("dni")
                + getFieldFilter("nombre")
                + getFieldFilter("apellido1")
                + getFieldFilter("apellido2")
                + getFieldFilter("email")
                + getFieldFilter("login");
    }

    @Override
    public PreparedStatement setFilter(int numparam,
            PreparedStatement oPreparedStatement, String word, int rpp, int offset)
            throws Exception {
        for (int i = 0; i <= 6; i++) {
            oPreparedStatement.setString(++numparam, "%" + word + "%");
        }
        oPreparedStatement.setInt(++numparam, rpp);
        oPreparedStatement.setInt(++numparam, offset);
        return oPreparedStatement;
    }

    @Override
    public PreparedStatement setFieldInsert(BeanInterface oBeanParam, PreparedStatement oPreparedStatement)
            throws Exception {
        /*   EpisodioDiagnosticoBean oUsuarioBean = (EpisodioDiagnosticoBean) oBeanParam;
        oPreparedStatement.setDate(1, new java.sql.Date(oUsuarioBean.getFecha_firma().getTime()));
        oPreparedStatement.setDate(2, new java.sql.Date(oUsuarioBean.getFecha_inicio().getTime()));
        oPreparedStatement.setDate(3, new java.sql.Date(oUsuarioBean.getFecha_alta().getTime()));
        oPreparedStatement.setDouble(4, oUsuarioBean.getImporte());
        oPreparedStatement.setBoolean(5, oUsuarioBean.getFinalizado());
        oPreparedStatement.setBoolean(6, oUsuarioBean.getBloqueado());
        oPreparedStatement.setInt(7, oUsuarioBean.getId_servicio());
        oPreparedStatement.setInt(8, oUsuarioBean.getId_paciente());
        oPreparedStatement.setInt(9, oUsuarioBean.getId_factura());
        oPreparedStatement.setInt(10, oUsuarioBean.getId_dependencia());
        oPreparedStatement.setInt(11, oUsuarioBean.getId_medico());
        oPreparedStatement.setInt(12, oUsuarioBean.getId_tipoepisodio());
        oPreparedStatement.setInt(13, oUsuarioBean.getId_episodio());
        oPreparedStatement.setInt(14, oUsuarioBean.getId_circunstanciasalta());
        oPreparedStatement.setInt(15, oUsuarioBean.getId_destinoalta());
        oPreparedStatement.setInt(16, oUsuarioBean.getId_modalidadepisodio());
        oPreparedStatement.setInt(17, oUsuarioBean.getId_usuario());
        oPreparedStatement.setString(18, oUsuarioBean.getMotivo_ingreso());
        oPreparedStatement.setString(19, oUsuarioBean.getAntecedentes());
        oPreparedStatement.setString(20, oUsuarioBean.getHistoria_actual());
        oPreparedStatement.setString(21, oUsuarioBean.getExploracion_fisica());
        oPreparedStatement.setString(22, oUsuarioBean.getEvolucion_comentarios());
        oPreparedStatement.setString(23, oUsuarioBean.getDiagnostico_principal());
        oPreparedStatement.setString(24, oUsuarioBean.getDiagnostico_secundarios());
        oPreparedStatement.setString(25, oUsuarioBean.getProcedimientos());
        oPreparedStatement.setString(26, oUsuarioBean.getTratamiento_recomendaciones());
        oPreparedStatement.setString(27, oUsuarioBean.getTratamiento_farmacos());
        oPreparedStatement.setString(28, oUsuarioBean.getRecomendaciones()
        );
         */
        return oPreparedStatement;
    }

    @Override
    public String getFieldUpdate() {
        return " dni=?,nombre=?,apellido1=?,apellido2=?,email=?,login=?,id_tipousuario=? ";
    }

    @Override
    public PreparedStatement setFieldUpdate(BeanInterface oBeanParam, PreparedStatement oPreparedStatement)
            throws Exception {
        /*  EpisodioDiagnosticoBean oUsuarioBean = (EpisodioDiagnosticoBean) oBeanParam;
        oPreparedStatement.setDate(1, new java.sql.Date(oUsuarioBean.getFecha_firma().getTime()));
        oPreparedStatement.setDate(2, new java.sql.Date(oUsuarioBean.getFecha_inicio().getTime()));
        oPreparedStatement.setDate(3, new java.sql.Date(oUsuarioBean.getFecha_alta().getTime()));
        oPreparedStatement.setDouble(4, oUsuarioBean.getImporte());
        oPreparedStatement.setBoolean(5, oUsuarioBean.getFinalizado());
        oPreparedStatement.setBoolean(6, oUsuarioBean.getBloqueado());
        oPreparedStatement.setInt(7, oUsuarioBean.getId_servicio());
        oPreparedStatement.setInt(8, oUsuarioBean.getId_paciente());
        oPreparedStatement.setInt(9, oUsuarioBean.getId_factura());
        oPreparedStatement.setInt(10, oUsuarioBean.getId_dependencia());
        oPreparedStatement.setInt(11, oUsuarioBean.getId_medico());
        oPreparedStatement.setInt(12, oUsuarioBean.getId_tipoepisodio());
        oPreparedStatement.setInt(13, oUsuarioBean.getId_episodio());
        oPreparedStatement.setInt(14, oUsuarioBean.getId_circunstanciasalta());
        oPreparedStatement.setInt(15, oUsuarioBean.getId_destinoalta());
        oPreparedStatement.setInt(16, oUsuarioBean.getId_modalidadepisodio());
        oPreparedStatement.setInt(17, oUsuarioBean.getId_usuario());
        oPreparedStatement.setString(18, oUsuarioBean.getMotivo_ingreso());
        oPreparedStatement.setString(19, oUsuarioBean.getAntecedentes());
        oPreparedStatement.setString(20, oUsuarioBean.getHistoria_actual());
        oPreparedStatement.setString(21, oUsuarioBean.getExploracion_fisica());
        oPreparedStatement.setString(22, oUsuarioBean.getEvolucion_comentarios());
        oPreparedStatement.setString(23, oUsuarioBean.getDiagnostico_principal());
        oPreparedStatement.setString(24, oUsuarioBean.getDiagnostico_secundarios());
        oPreparedStatement.setString(25, oUsuarioBean.getProcedimientos());
        oPreparedStatement.setString(26, oUsuarioBean.getTratamiento_recomendaciones());
        oPreparedStatement.setString(27, oUsuarioBean.getTratamiento_farmacos());
        oPreparedStatement.setString(28, oUsuarioBean.getRecomendaciones()
        );*/
        return oPreparedStatement;
    }

    @Override
    public String getFieldLink() {
        return "link_factura";
    }

    @Override
    public String getFieldId(String filter) {
        if (filter.equalsIgnoreCase("tipopago")) {
            return "id_tipopago";
        } else if (filter.equalsIgnoreCase("sexo")) {
            return "id_sexo";
        } else if (filter.equalsIgnoreCase("factura")) {
            return "id_factura";
        } else if (filter.equalsIgnoreCase("dependencia")) {
            return "id_dependencia";
        } else if (filter.equalsIgnoreCase("medico")) {
            return "id_medico";
        } else if (filter.equalsIgnoreCase("tipoepisodio")) {
            return "id_tipoepisodio";
        } else if (filter.equalsIgnoreCase("episodio")) {
            return "id_episodio";
        } else if (filter.equalsIgnoreCase("circunstanciasalta")) {
            return "id_circunstanciasalta";
        } else if (filter.equalsIgnoreCase("destinoalta")) {
            return "id_destinoalta";
        } else if (filter.equalsIgnoreCase("modalidadepisodio")) {
            return "id_modalidadepisodio";
        } else {
            return "id_usuario";
        }
    }

    @Override
    public PreparedStatement setFieldId(int numparam,
            PreparedStatement oPreparedStatement, int id, int rpp, int offset) throws Exception {
        oPreparedStatement.setInt(++numparam, id);
        oPreparedStatement.setInt(++numparam, rpp);
        oPreparedStatement.setInt(++numparam, offset);
        return oPreparedStatement;
    }

    @Override
    public String getFieldOrder(String orden
    ) {
        return orden.matches("id|fecha_firma|fecha_inicio|fecha_alta|importe|finalizado|bloqueado|motivo_ingreso|antecedentes|historia_actual|exploracion_fisica|evolucion_comentarios|diagnostico_principal|diagnostico_secundarios|procedimientos|tratamiento_recomendaciones|tratamiento_farmacos|recomendaciones") ? orden : null;
    }

    @Override
    public EpisodioDiagnosticoBean fill(ResultSet oResultSet, Connection oConnection, int spread, UsuarioBean oUsuarioBeanSession) throws Exception {

        /*   this.setId(oResultSet.getInt("id"));
        this.setFecha_firma(oResultSet.getDate("fecha_firma"));
        this.setFecha_inicio(oResultSet.getDate("fecha_inicio"));
        this.setFecha_alta(oResultSet.getDate("fecha_alta"));
        this.setImporte(oResultSet.getDouble("importe"));
        this.setFinalizado(oResultSet.getBoolean("finalizado"));
        this.setBloqueado(oResultSet.getBoolean("bloqueado"));
        this.setId_servicio(oResultSet.getInt("id_servicio"));
        this.setId_paciente(oResultSet.getInt("id_paciente"));
        this.setId_factura(oResultSet.getInt("id_factura"));
        this.setId_dependencia(oResultSet.getInt("id_dependencia"));
        this.setId_medico(oResultSet.getInt("id_medico"));
        this.setId_tipoepisodio(oResultSet.getInt("id_tipoepisodio"));
        this.setId_episodio(oResultSet.getInt("id_episodio"));
        this.setId_circunstanciasalta(oResultSet.getInt("id_circunstanciasalta"));
        this.setId_destinoalta(oResultSet.getInt("id_destinoalta"));
        this.setId_modalidadepisodio(oResultSet.getInt("id_modalidadepisodio"));
        this.setId_usuario(oResultSet.getInt("id_usuario"));
        this.setMotivo_ingreso(oResultSet.getString("motivo_ingreso"));
        this.setAntecedentes(oResultSet.getString("antecedentes"));
        this.setHistoria_actual(oResultSet.getString("historia_actual"));
        this.setExploracion_fisica(oResultSet.getString("exploracion_fisica"));
        this.setEvolucion_comentarios(oResultSet.getString("evolucion_comentarios"));
        this.setDiagnostico_principal(oResultSet.getString("diagnostico_principal"));
        this.setDiagnostico_secundarios(oResultSet.getString("diagnostico_secundarios"));
        this.setProcedimientos(oResultSet.getString("procedimientos"));
        this.setTratamiento_recomendaciones(oResultSet.getString("tratamiento_recomendaciones"));
        this.setTratamiento_farmacos(oResultSet.getString("tratamiento_farmacos"));
        this.setRecomendaciones(oResultSet.getString("recomendaciones"));

        if (oUsuarioBeanSession != null) {

            DaoInterface oPIDao = DaoFactory.getDao(oConnection, "prueba_informada", oUsuarioBeanSession);
            if (oPIDao != null) {

                Prueba_InformadaDao_3 oPIDao_3 = (Prueba_InformadaDao_3) oPIDao;
                this.setLink_prueba_informada(oPIDao_3.getCount(id, "episodio"));

            }

            DaoInterface oAnaliticaDao = DaoFactory.getDao(oConnection, "analitica", oUsuarioBeanSession);
            if (oAnaliticaDao != null) {

                AnaliticaDao_3 oAnaliticaDao_3 = (AnaliticaDao_3) oAnaliticaDao;
                this.setLink_analitica(oAnaliticaDao_3.getCount(id, "episodio"));

            }

            DaoInterface oProcDao = DaoFactory.getDao(oConnection, "procedimiento", oUsuarioBeanSession);
            if (oProcDao != null) {

                ProcedimientoDao_3 oProcedimientoDao_3 = (ProcedimientoDao_3) oProcDao;
                this.setLink_procedimiento(oProcedimientoDao_3.getCount(id, "episodio"));

            }

            DaoInterface oTratDao = DaoFactory.getDao(oConnection, "tratamiento", oUsuarioBeanSession);
            if (oTratDao != null) {

                TratamientoDao_3 oTratoDao_3 = (TratamientoDao_3) oTratDao;
                this.setLink_tratamiento(oTratoDao_3.getCount(id, "episodio"));

            }

            DaoInterface oEpDiagDao = DaoFactory.getDao(oConnection, "episodiodiagnostico", oUsuarioBeanSession);
            if (oEpDiagDao != null) {

                EpisodioDiagnosticoDao_3 oEpiDagDao_3 = (EpisodioDiagnosticoDao_3) oEpDiagDao;
                this.setLink_episodiodiagnostico(oEpiDagDao_3.getCount(id, "episodio"));

            }
            if (this.getLink_analitica() > 0) {
                this.setCanDelete(false);
            } else {
                this.setCanDelete(true);
            }
            if (this.getLink_episodiodiagnostico() > 0) {
                this.setCanDelete(false);
            } else {
                this.setCanDelete(true);
            }
            if (this.getLink_procedimiento() > 0) {
                this.setCanDelete(false);
            } else {
                this.setCanDelete(true);
            }
            if (this.getLink_prueba_informada() > 0) {
                this.setCanDelete(false);
            } else {
                this.setCanDelete(true);
            }
            if (this.getLink_tratamiento() > 0) {
                this.setCanDelete(false);
            } else {
                this.setCanDelete(true);
            }

            
            if (spread > 0) {
                spread--;
                DaoInterface oServicioDao = DaoFactory.getDao(oConnection, "servicio", oUsuarioBeanSession);
                ServicioBean oServicioBean;
                oServicioBean = (ServicioBean) oServicioDao.get(this.id_servicio);
                this.id_servicio_obj = oServicioBean;

                DaoInterface oPacienteDao = DaoFactory.getDao(oConnection, "paciente", oUsuarioBeanSession);
                PacienteBean oPacienteBean;
                oPacienteBean = (PacienteBean) oPacienteDao.get(this.id_paciente);
                this.id_paciente_obj = oPacienteBean;

                DaoInterface oFacturaDao = DaoFactory.getDao(oConnection, "factura", oUsuarioBeanSession);
                AnaliticaBean oFacturaBean;
                oFacturaBean = (AnaliticaBean) oFacturaDao.get(this.id_factura);
                this.id_factura_obj = oFacturaBean;

                DaoInterface oDependenciaDao = DaoFactory.getDao(oConnection, "dependencia", oUsuarioBeanSession);
                DependenciaBean oDependenciaBean;
                oDependenciaBean = (DependenciaBean) oDependenciaDao.get(this.id_dependencia);
                this.id_dependencia_obj = oDependenciaBean;

                DaoInterface oMedicoDao = DaoFactory.getDao(oConnection, "medico", oUsuarioBeanSession);
                MedicoBean oMedicoBean;
                oMedicoBean = (MedicoBean) oMedicoDao.get(this.id_medico);
                this.id_medico_obj = oMedicoBean;

                DaoInterface oTeDao = DaoFactory.getDao(oConnection, "tipoepisodio", oUsuarioBeanSession);
                TipoEpisodioBean oTeBean;
                oTeBean = (TipoEpisodioBean) oTeDao.get(this.id_tipoepisodio);
                this.id_tipoepisodio_obj = oTeBean;

                DaoInterface oEpisodioDao = DaoFactory.getDao(oConnection, "episodio", oUsuarioBeanSession);
                EpisodioDiagnosticoBean oEpisodioBean;
                oEpisodioBean = (EpisodioDiagnosticoBean) oEpisodioDao.get(this.id_episodio);
                this.id_episodio_obj = oEpisodioBean;

                DaoInterface oCsDao = DaoFactory.getDao(oConnection, "circunstanciasalta", oUsuarioBeanSession);
                CircunstanciasaltaBean oCsBean;
                oCsBean = (CircunstanciasaltaBean) oCsDao.get(this.id_circunstanciasalta);
                this.id_circunstanciasalta_obj = oCsBean;

                DaoInterface oDaDao = DaoFactory.getDao(oConnection, "destinoalta", oUsuarioBeanSession);
                DestinoAltaBean oDaBean;
                oDaBean = (DestinoAltaBean) oDaDao.get(this.id_destinoalta);
                this.id_destinoalta_obj = oDaBean;

                DaoInterface oMeDao = DaoFactory.getDao(oConnection, "modalidadepisodio", oUsuarioBeanSession);
                ModalidadEpisodioBean oCSBean;
                oCSBean = (ModalidadEpisodioBean) oMeDao.get(this.id_modalidadepisodio);
                this.id_modalidadepisodio_obj = oCSBean;

                DaoInterface oUsuarioDao = DaoFactory.getDao(oConnection, "usuario", oUsuarioBeanSession);
                UsuarioBean oUsuarioBean;
                oUsuarioBean = (UsuarioBean) oUsuarioDao.get(this.id_usuario);
                this.id_usuario_obj = oUsuarioBean;

            }
        }
         */
        return this;
    }
}
