package net.adisan.bean;

import com.google.gson.annotations.Expose;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Date;
import java.util.List;

public class ProcedimientoBean implements BeanInterface {

    @Expose
    private Integer id;
    @Expose
    private Date fecha_inicio;
    @Expose
    private Date fecha_fin;
    @Expose(serialize = false)
    private Integer id_instrumentalista;
    @Expose(serialize = false)
    private Integer id_episodio;
    @Expose(serialize = false)
    private Integer id_medico;
    @Expose(serialize = false)
    private Integer id_dependencia;
    @Expose
    private String informe;
    @Expose
    private String diagnostico_inicial;
    @Expose
    private String diagnostico_final;
    @Expose
    private String procedimiento_previsto;
    @Expose
    private String procedimiento_realizado;
    @Expose(serialize = false)
    private Integer id_prioridad;
    @Expose(serialize = false)
    private Integer id_procedimiento;
    @Expose(deserialize = false)
    private InstrumentalistaBean id_instrumentalista_obj;
    @Expose(deserialize = false)
    private EpisodioBean id_episodio_obj;
    @Expose(deserialize = false)
    private MedicoBean id_medico_obj;
    @Expose(deserialize = false)
    private DependenciaBean id_dependencia_obj;
    @Expose(deserialize = false)
    private PrioridadBean id_prioridad_obj;
    @Expose(deserialize = false)
    private ProcedimientoBean id_procedimiento_obj;
    @Expose
    private Boolean canCreate;
    @Expose
    private Boolean canUpdate;
    @Expose
    private Boolean canDelete;

    public Integer getId_instrumentalista() {
        return id_instrumentalista;
    }

    public void setId_instrumentalista(Integer id_instrumentalista) {
        this.id_instrumentalista = id_instrumentalista;
    }

    public Integer getId_episodio() {
        return id_episodio;
    }

    public void setId_episodio(Integer id_episodio) {
        this.id_episodio = id_episodio;
    }

    public Integer getId_medico() {
        return id_medico;
    }

    public void setId_medico(Integer id_medico) {
        this.id_medico = id_medico;
    }

    public Integer getId_dependencia() {
        return id_dependencia;
    }

    public void setId_dependencia(Integer id_dependencia) {
        this.id_dependencia = id_dependencia;
    }

    public String getInforme() {
        return informe;
    }

    public void setInforme(String informe) {
        this.informe = informe;
    }

    public String getDiagnostico_inicial() {
        return diagnostico_inicial;
    }

    public void setDiagnostico_inicial(String diagnostico_inicial) {
        this.diagnostico_inicial = diagnostico_inicial;
    }

    public String getDiagnostico_final() {
        return diagnostico_final;
    }

    public void setDiagnostico_final(String diagnostico_final) {
        this.diagnostico_final = diagnostico_final;
    }

    public String getProcedimiento_previsto() {
        return procedimiento_previsto;
    }

    public void setProcedimiento_previsto(String procedimiento_previsto) {
        this.procedimiento_previsto = procedimiento_previsto;
    }

    public String getProcedimiento_realizado() {
        return procedimiento_realizado;
    }

    public void setProcedimiento_realizado(String procedimiento_realizado) {
        this.procedimiento_realizado = procedimiento_realizado;
    }

    public Integer getId_prioridad() {
        return id_prioridad;
    }

    public void setId_prioridad(Integer id_prioridad) {
        this.id_prioridad = id_prioridad;
    }

    public Integer getId_procedimiento() {
        return id_procedimiento;
    }

    public void setId_procedimiento(Integer id_procedimiento) {
        this.id_procedimiento = id_procedimiento;
    }

    public InstrumentalistaBean getId_instrumentalista_obj() {
        return id_instrumentalista_obj;
    }

    public void setId_instrumentalista_obj(InstrumentalistaBean id_instrumentalista_obj) {
        this.id_instrumentalista_obj = id_instrumentalista_obj;
    }

    public MedicoBean getId_medico_obj() {
        return id_medico_obj;
    }

    public void setId_medico_obj(MedicoBean id_medico_obj) {
        this.id_medico_obj = id_medico_obj;
    }

    public DependenciaBean getId_dependencia_obj() {
        return id_dependencia_obj;
    }

    public void setId_dependencia_obj(DependenciaBean id_dependencia_obj) {
        this.id_dependencia_obj = id_dependencia_obj;
    }

    public PrioridadBean getId_prioridad_obj() {
        return id_prioridad_obj;
    }

    public void setId_prioridad_obj(PrioridadBean id_prioridad_obj) {
        this.id_prioridad_obj = id_prioridad_obj;
    }

    public ProcedimientoBean getId_procedimiento_obj() {
        return id_procedimiento_obj;
    }

    public void setId_procedimiento_obj(ProcedimientoBean id_procedimiento_obj) {
        this.id_procedimiento_obj = id_procedimiento_obj;
    }

    public Date getFecha_fin() {
        return fecha_fin;
    }

    public void setFecha_fin(Date fecha_fin) {
        this.fecha_fin = fecha_fin;
    }

    public Date getFecha_inicio() {
        return fecha_inicio;
    }

    public void setFecha_inicio(Date fecha_inicio) {
        this.fecha_inicio = fecha_inicio;
    }


   

    public EpisodioBean getId_episodio_obj() {
        return id_episodio_obj;
    }

    public void setId_episodio_obj(EpisodioBean id_episodio_obj) {
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
    public ProcedimientoBean fill(ResultSet oResultSet, Connection oConnection,
            int spread, UsuarioBean oUsuarioBeanSession) throws Exception {
         this.setId(oResultSet.getInt("id"));
        this.setFecha_inicio(oResultSet.getDate("fecha_inicio"));
        this.setFecha_fin(oResultSet.getDate("fecha_fin"));
        this.setId_instrumentalista(oResultSet.getInt("id_instrumentalista"));
        this.setId_episodio(oResultSet.getInt("id_episodio"));
        this.setId_medico(oResultSet.getInt("id_medico"));
        this.setId_dependencia(oResultSet.getInt("id_dependencia"));
        this.setInforme(oResultSet.getString("informe"));
        this.setDiagnostico_inicial(oResultSet.getString("diagnostico_inicial"));
        this.setDiagnostico_final(oResultSet.getString("diagnostico_final"));
        this.setProcedimiento_previsto(oResultSet.getString("procedimiento_previsto"));
        this.setProcedimiento_realizado(oResultSet.getString("procedimiento_realizado"));
        this.setId_prioridad(oResultSet.getInt("id_prioridad"));
        this.setId_procedimiento(oResultSet.getInt("id_procedimiento"));
   
     
        return this;
    }

    @Override
    public PreparedStatement orderSQL(List<String> orden,
            PreparedStatement oPreparedStatement) throws Exception {
        for (int i = 1; i < orden.size(); i++) {
            if (orden.get((i - 1)).equalsIgnoreCase("id")) {
                oPreparedStatement.setInt(i, 1);
            } else if (orden.get((i - 1)).equalsIgnoreCase("descripcion")) {
                oPreparedStatement.setInt(i, 2);
            } else if (orden.get((i - 1)).equalsIgnoreCase("fecha_prevista")) {
                oPreparedStatement.setInt(i, 3);
            } else if (orden.get((i - 1)).equalsIgnoreCase("fecha_realizacion")) {
                oPreparedStatement.setInt(i, 4);
            } else if (orden.get((i - 1)).equalsIgnoreCase("ubicacion")) {
                oPreparedStatement.setInt(i, 5);
            } else if (orden.get((i - 1)).equalsIgnoreCase("importe")) {
                oPreparedStatement.setInt(i, 6);
            }
        }
        return oPreparedStatement;
    }

    @Override
    public String getFieldInsert() {
        return " (descripcion,fecha_prevista,fecha_realizacion,ubicacion,id_catalogo,id_prueba,id_dependencia,importe,id_tecnico) VALUES(?,?,?,?,?,?,?,?,?)";
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
        /* TratamientoBean oImagenBean = (TratamientoBean) oBeanParam;
        oPreparedStatement.setString(1, oImagenBean.getDescripcion());
        oPreparedStatement.setDate(2, new java.sql.Date(oImagenBean.getFecha_prevista().getTime()));
        oPreparedStatement.setDate(3, new java.sql.Date(oImagenBean.getFecha_realizacion().getTime()));
        oPreparedStatement.setString(4, oImagenBean.getUbicacion());
        oPreparedStatement.setInt(5, oImagenBean.getId_catalogo());
        oPreparedStatement.setInt(6, oImagenBean.getId_prueba());
        oPreparedStatement.setInt(7, oImagenBean.getId_dependencia());
        oPreparedStatement.setDouble(8, oImagenBean.getImporte());
        oPreparedStatement.setDouble(9, oImagenBean.getId_tecnico());
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
        /*  TratamientoBean oImagenBean = (TratamientoBean) oBeanParam;
        oPreparedStatement.setString(1, oImagenBean.getDescripcion());
        oPreparedStatement.setDate(2, new java.sql.Date(oImagenBean.getFecha_prevista().getTime()));
        oPreparedStatement.setDate(3, new java.sql.Date(oImagenBean.getFecha_realizacion().getTime()));
        oPreparedStatement.setString(4, oImagenBean.getUbicacion());
        oPreparedStatement.setInt(5, oImagenBean.getId_catalogo());
        oPreparedStatement.setInt(6, oImagenBean.getId_prueba());
        oPreparedStatement.setInt(7, oImagenBean.getId_dependencia());
        oPreparedStatement.setDouble(8, oImagenBean.getImporte());
        oPreparedStatement.setDouble(9, oImagenBean.getId_tecnico());
         */ return oPreparedStatement;
    }

    @Override
    public String getFieldLink() {
        return "link_factura";
    }

    @Override
    public String getFieldId(String filter) {
        if (filter.equalsIgnoreCase("medicamento")) {
            return "id_medicamento";
        } else if (filter.equalsIgnoreCase("posologia")) {
            return "id_posologia";
        } else if (filter.equalsIgnoreCase("via")) {
            return "id_via";
        } else {
            return "id_episodio";
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
    public String getFieldOrder(String orden) {
        return orden.matches("id|descripcion|fecha_prevista|fecha_realizacion|ubicacion|id_catalogo|id_prueba|id_prueba|id_dependencia|importe|id_tecnico") ? orden : null;
    }

}
