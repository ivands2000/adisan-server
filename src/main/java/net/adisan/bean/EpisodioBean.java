package net.adisan.bean;

import com.google.gson.annotations.Expose;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Date;
import java.util.List;
import net.adisan.dao.daointerface.DaoInterface;
import net.adisan.dao.specificdao_4.AnaliticaDao_3;
import net.adisan.dao.specificdao_4.Prueba_InformadaDao_3;
import net.adisan.dao.specificdao_4.TratamientoDao_3;
import net.adisan.factory.DaoFactory;

public class EpisodioBean implements BeanInterface {

    @Expose
    private Integer id;
    @Expose
    private Date fecha_firma;
    @Expose
    private Date fecha_inicio;
    @Expose
    private Date fecha_alta;
    @Expose
    private Double importe;
    @Expose
    private Boolean finalizado;
    @Expose
    private Boolean bloqueado;
    @Expose(serialize = false)
    private Integer id_servicio;
    @Expose(serialize = false)
    private Integer id_paciente;
    @Expose(serialize = false)
    private Integer id_factura;
    @Expose(serialize = false)
    private Integer id_dependencia;
    @Expose(serialize = false)
    private Integer id_medico;
    @Expose(serialize = false)
    private Integer id_tipoepisodio;
    @Expose(serialize = false)
    private Integer id_episodio;
    @Expose(serialize = false)
    private Integer id_circunstanciasalta;
    @Expose(serialize = false)
    private Integer id_destinoalta;
    @Expose(serialize = false)
    private Integer id_modalidadepisodio;
    @Expose(serialize = false)
    private Integer id_usuario;
    @Expose
    private String motivo_ingreso;
    @Expose
    private String antecedentes;
    @Expose
    private String historia_actual;
    @Expose
    private String exploracion_fisica;
    @Expose
    private String evolucion_comentarios;
    @Expose
    private String diagnostico_principal;
    @Expose
    private String diagnostico_secundarios;
    @Expose
    private String procedimientos;
    @Expose
    private String tratamiento_recomendaciones;
    @Expose
    private String tratamiento_farmacos;
    @Expose
    private String recomendaciones;
    @Expose(deserialize = false)
    private ServicioBean id_servicio_obj;
    @Expose(deserialize = false)
    private PacienteBean id_paciente_obj;
    @Expose(deserialize = false)
    private AnaliticaBean id_factura_obj;
    @Expose(deserialize = false)
    private DependenciaBean id_dependencia_obj;
    @Expose(deserialize = false)
    private MedicoBean id_medico_obj;
    @Expose(deserialize = false)
    private TipoEpisodioBean id_tipoepisodio_obj;
    @Expose(deserialize = false)
    private EpisodioBean id_episodio_obj;
    @Expose(deserialize = false)
    private CircunstanciasaltaBean id_circunstanciasalta_obj;
    @Expose(deserialize = false)
    private DestinoAltaBean id_destinoalta_obj;
    @Expose(deserialize = false)
    private ModalidadEpisodioBean id_modalidadepisodio_obj;
    @Expose(deserialize = false)
    private UsuarioBean id_usuario_obj;
    @Expose(deserialize = false)
    private Integer link_prueba_informada;
    @Expose(deserialize = false)
    private Integer link_analitica;
    @Expose(deserialize = false)
    private Integer link_tratamiento;
    @Expose(deserialize = false)
    private Integer link_procedimiento;
    @Expose(deserialize = false)
    private Integer link_episodiodiagnostico;

    @Expose
    private Boolean canCreate;
    @Expose
    private Boolean canUpdate;
    @Expose
    private Boolean canDelete;

    public Integer getLink_prueba_informada() {
        return link_prueba_informada;
    }

    public void setLink_prueba_informada(Integer link_prueba_informada) {
        this.link_prueba_informada = link_prueba_informada;
    }

    public Integer getLink_analitica() {
        return link_analitica;
    }

    public void setLink_analitica(Integer link_analitica) {
        this.link_analitica = link_analitica;
    }

    public Integer getLink_tratamiento() {
        return link_tratamiento;
    }

    public void setLink_tratamiento(Integer link_tratamiento) {
        this.link_tratamiento = link_tratamiento;
    }

    public Integer getLink_procedimiento() {
        return link_procedimiento;
    }

    public void setLink_procedimiento(Integer link_procedimiento) {
        this.link_procedimiento = link_procedimiento;
    }

    public Integer getLink_episodiodiagnostico() {
        return link_episodiodiagnostico;
    }

    public void setLink_episodiodiagnostico(Integer link_episodiodiagnostico) {
        this.link_episodiodiagnostico = link_episodiodiagnostico;
    }

    @Override
    public Integer getId() {
        return id;
    }

    @Override
    public void setId(Integer id) {
        this.id = id;
    }

    public Date getFecha_firma() {
        return fecha_firma;
    }

    public void setFecha_firma(Date fecha_firma) {
        this.fecha_firma = fecha_firma;
    }

    public Date getFecha_inicio() {
        return fecha_inicio;
    }

    public void setFecha_inicio(Date fecha_inicio) {
        this.fecha_inicio = fecha_inicio;
    }

    public Date getFecha_alta() {
        return fecha_alta;
    }

    public void setFecha_alta(Date fecha_alta) {
        this.fecha_alta = fecha_alta;
    }

    public Double getImporte() {
        return importe;
    }

    public void setImporte(Double importe) {
        this.importe = importe;
    }

    public Boolean getFinalizado() {
        return finalizado;
    }

    public void setFinalizado(Boolean finalizado) {
        this.finalizado = finalizado;
    }

    public Boolean getBloqueado() {
        return bloqueado;
    }

    public void setBloqueado(Boolean bloqueado) {
        this.bloqueado = bloqueado;
    }

    public Integer getId_servicio() {
        return id_servicio;
    }

    public void setId_servicio(Integer id_servicio) {
        this.id_servicio = id_servicio;
    }

    public Integer getId_paciente() {
        return id_paciente;
    }

    public void setId_paciente(Integer id_paciente) {
        this.id_paciente = id_paciente;
    }

    public Integer getId_factura() {
        return id_factura;
    }

    public void setId_factura(Integer id_factura) {
        this.id_factura = id_factura;
    }

    public Integer getId_dependencia() {
        return id_dependencia;
    }

    public void setId_dependencia(Integer id_dependencia) {
        this.id_dependencia = id_dependencia;
    }

    public Integer getId_medico() {
        return id_medico;
    }

    public void setId_medico(Integer id_medico) {
        this.id_medico = id_medico;
    }

    public Integer getId_tipoepisodio() {
        return id_tipoepisodio;
    }

    public void setId_tipoepisodio(Integer id_tipoepisodio) {
        this.id_tipoepisodio = id_tipoepisodio;
    }

    public Integer getId_episodio() {
        return id_episodio;
    }

    public void setId_episodio(Integer id_episodio) {
        this.id_episodio = id_episodio;
    }

    public Integer getId_circunstanciasalta() {
        return id_circunstanciasalta;
    }

    public void setId_circunstanciasalta(Integer id_circunstanciasalta) {
        this.id_circunstanciasalta = id_circunstanciasalta;
    }

    public Integer getId_destinoalta() {
        return id_destinoalta;
    }

    public void setId_destinoalta(Integer id_destinoalta) {
        this.id_destinoalta = id_destinoalta;
    }

    public Integer getId_modalidadepisodio() {
        return id_modalidadepisodio;
    }

    public void setId_modalidadepisodio(Integer id_modalidadepisodio) {
        this.id_modalidadepisodio = id_modalidadepisodio;
    }

    public Integer getId_usuario() {
        return id_usuario;
    }

    public void setId_usuario(Integer id_usuario) {
        this.id_usuario = id_usuario;
    }

    public String getMotivo_ingreso() {
        return motivo_ingreso;
    }

    public void setMotivo_ingreso(String motivo_ingreso) {
        this.motivo_ingreso = motivo_ingreso;
    }

    public String getAntecedentes() {
        return antecedentes;
    }

    public void setAntecedentes(String antecedentes) {
        this.antecedentes = antecedentes;
    }

    public String getHistoria_actual() {
        return historia_actual;
    }

    public void setHistoria_actual(String historia_actual) {
        this.historia_actual = historia_actual;
    }

    public String getExploracion_fisica() {
        return exploracion_fisica;
    }

    public void setExploracion_fisica(String exploracion_fisica) {
        this.exploracion_fisica = exploracion_fisica;
    }

    public String getEvolucion_comentarios() {
        return evolucion_comentarios;
    }

    public void setEvolucion_comentarios(String evolucion_comentarios) {
        this.evolucion_comentarios = evolucion_comentarios;
    }

    public String getDiagnostico_principal() {
        return diagnostico_principal;
    }

    public void setDiagnostico_principal(String diagnostico_principal) {
        this.diagnostico_principal = diagnostico_principal;
    }

    public String getDiagnostico_secundarios() {
        return diagnostico_secundarios;
    }

    public void setDiagnostico_secundarios(String diagnostico_secundarios) {
        this.diagnostico_secundarios = diagnostico_secundarios;
    }

    public String getProcedimientos() {
        return procedimientos;
    }

    public void setProcedimientos(String procedimientos) {
        this.procedimientos = procedimientos;
    }

    public String getTratamiento_recomendaciones() {
        return tratamiento_recomendaciones;
    }

    public void setTratamiento_recomendaciones(String tratamiento_recomendaciones) {
        this.tratamiento_recomendaciones = tratamiento_recomendaciones;
    }

    public String getTratamiento_farmacos() {
        return tratamiento_farmacos;
    }

    public void setTratamiento_farmacos(String tratamiento_farmacos) {
        this.tratamiento_farmacos = tratamiento_farmacos;
    }

    public String getRecomendaciones() {
        return recomendaciones;
    }

    public void setRecomendaciones(String recomendaciones) {
        this.recomendaciones = recomendaciones;
    }

    public ServicioBean getId_servicio_obj() {
        return id_servicio_obj;
    }

    public void setId_servicio_obj(ServicioBean id_servicio_obj) {
        this.id_servicio_obj = id_servicio_obj;
    }

    public PacienteBean getId_paciente_obj() {
        return id_paciente_obj;
    }

    public void setId_paciente_obj(PacienteBean id_paciente_obj) {
        this.id_paciente_obj = id_paciente_obj;
    }

    public AnaliticaBean getId_factura_obj() {
        return id_factura_obj;
    }

    public void setId_factura_obj(AnaliticaBean id_factura_obj) {
        this.id_factura_obj = id_factura_obj;
    }

    public DependenciaBean getId_dependencia_obj() {
        return id_dependencia_obj;
    }

    public void setId_dependencia_obj(DependenciaBean id_dependencia_obj) {
        this.id_dependencia_obj = id_dependencia_obj;
    }

    public MedicoBean getId_medico_obj() {
        return id_medico_obj;
    }

    public void setId_medico_obj(MedicoBean id_medico_obj) {
        this.id_medico_obj = id_medico_obj;
    }

    public TipoEpisodioBean getId_tipoepisodio_obj() {
        return id_tipoepisodio_obj;
    }

    public void setId_tipoepisodio_obj(TipoEpisodioBean id_tipoepisodio_obj) {
        this.id_tipoepisodio_obj = id_tipoepisodio_obj;
    }

    public EpisodioBean getId_episodio_obj() {
        return id_episodio_obj;
    }

    public void setId_episodio_obj(EpisodioBean id_episodio_obj) {
        this.id_episodio_obj = id_episodio_obj;
    }

    public CircunstanciasaltaBean getId_circunstanciasalta_obj() {
        return id_circunstanciasalta_obj;
    }

    public void setId_circunstanciasalta_obj(CircunstanciasaltaBean id_circunstanciasalta_obj) {
        this.id_circunstanciasalta_obj = id_circunstanciasalta_obj;
    }

    public DestinoAltaBean getId_destinoalta_obj() {
        return id_destinoalta_obj;
    }

    public void setId_destinoalta_obj(DestinoAltaBean id_destinoalta_obj) {
        this.id_destinoalta_obj = id_destinoalta_obj;
    }

    public ModalidadEpisodioBean getId_modalidadepisodio_obj() {
        return id_modalidadepisodio_obj;
    }

    public void setId_modalidadepisodio_obj(ModalidadEpisodioBean id_modalidadepisodio_obj) {
        this.id_modalidadepisodio_obj = id_modalidadepisodio_obj;
    }

    public UsuarioBean getId_usuario_obj() {
        return id_usuario_obj;
    }

    public void setId_usuario_obj(UsuarioBean id_usuario_obj) {
        this.id_usuario_obj = id_usuario_obj;
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
        EpisodioBean oUsuarioBean = (EpisodioBean) oBeanParam;
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

        return oPreparedStatement;
    }

    @Override
    public String getFieldUpdate() {
        return " dni=?,nombre=?,apellido1=?,apellido2=?,email=?,login=?,id_tipousuario=? ";
    }

    @Override
    public PreparedStatement setFieldUpdate(BeanInterface oBeanParam, PreparedStatement oPreparedStatement)
            throws Exception {
        EpisodioBean oUsuarioBean = (EpisodioBean) oBeanParam;
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
        return oPreparedStatement;
    }

    @Override
    public String getFieldLink() {
        return "link_factura";
    }

    @Override
    public String getFieldId(String filter) {
        return "id_paciente";
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
    public EpisodioBean fill(ResultSet oResultSet, Connection oConnection, int spread, UsuarioBean oUsuarioBeanSession) throws Exception {

        this.setId(oResultSet.getInt("id"));
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
            /*DaoInterface oProcDao = DaoFactory.getDao(oConnection, "procedimiento", oUsuarioBeanSession);
            if (oProcDao != null) {

                ProcedimientoDao_3 oProcedimientoDao_3 = (ProcedimientoDao_3) oProcDao;
                this.setLink_procedimiento(oProcedimientoDao_3.getCount(id, "episodio"));

            }
*/
            DaoInterface oTratDao = DaoFactory.getDao(oConnection, "tratamiento", oUsuarioBeanSession);
            if (oTratDao != null) {

                TratamientoDao_3 oTratoDao_3 = (TratamientoDao_3) oTratDao;
                this.setLink_tratamiento(oTratoDao_3.getCount(id, "episodio"));

            }
            DaoInterface oAnDao = DaoFactory.getDao(oConnection, "analitica", oUsuarioBeanSession);
            if (oAnDao != null) {

                AnaliticaDao_3 oAnDao_3 = (AnaliticaDao_3) oAnDao;
                this.setLink_analitica(oAnDao_3.getCount(id, "episodio"));

            }
            /*DaoInterface oEpDiagDao = DaoFactory.getDao(oConnection, "episodiodiagnostico", oUsuarioBeanSession);
            if (oEpDiagDao != null) {

                EpisodioDiagnosticoDao_3 oEpiDagDao_3 = (EpisodioDiagnosticoDao_3) oEpDiagDao;
                this.setLink_episodiodiagnostico(oEpiDagDao_3.getCount(id, "episodio"));

            }*/
            if (this.getLink_analitica() > 0) {
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

            /*Claves ajenas*/
            /*
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

            }*/
        }

        return this;
    }
}
