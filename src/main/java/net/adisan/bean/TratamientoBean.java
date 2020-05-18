package net.adisan.bean;

import com.google.gson.annotations.Expose;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Date;
import java.util.List;

public class TratamientoBean implements BeanInterface {

    @Expose
    private Integer id;
    @Expose
    private Date fecha_inicio;
    @Expose
    private Date fecha_fin;
    @Expose
    private String cuidados;
    @Expose
    private Double importe;
    @Expose(serialize = false)
    private Integer id_medicamento;
    @Expose(serialize = false)
    private Integer id_posologia;
    @Expose(serialize = false)
    private Integer id_via;
    @Expose(serialize = false)
    private Double id_episodio;
    @Expose(deserialize = false)
    private MedicamentoBean id_medicamento_obj;
    @Expose(deserialize = false)
    private PosologiaBean id_posologia_obj;
    @Expose(deserialize = false)
    private ViaBean id_via_obj;
    @Expose(deserialize = false)
    private EpisodioBean id_episodio_obj;
    @Expose
    private Boolean canCreate;
    @Expose
    private Boolean canUpdate;
    @Expose
    private Boolean canDelete;

    

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

    public String getCuidados() {
        return cuidados;
    }

    public void setCuidados(String cuidados) {
        this.cuidados = cuidados;
    }

    public Double getImporte() {
        return importe;
    }

    public void setImporte(Double importe) {
        this.importe = importe;
    }

    

    public Integer getId_medicamento() {
        return id_medicamento;
    }

    public void setId_medicamento(Integer id_medicamento) {
        this.id_medicamento = id_medicamento;
    }

    public Integer getId_posologia() {
        return id_posologia;
    }

    public void setId_posologia(Integer id_posologia) {
        this.id_posologia = id_posologia;
    }

    public Integer getId_via() {
        return id_via;
    }

    public void setId_via(Integer id_via) {
        this.id_via = id_via;
    }

    public Double getId_episodio() {
        return id_episodio;
    }

    public void setId_episodio(Double id_episodio) {
        this.id_episodio = id_episodio;
    }

    public MedicamentoBean getId_medicamento_obj() {
        return id_medicamento_obj;
    }

    public void setId_medicamento_obj(MedicamentoBean id_medicamento_obj) {
        this.id_medicamento_obj = id_medicamento_obj;
    }

    public PosologiaBean getId_posologia_obj() {
        return id_posologia_obj;
    }

    public void setId_posologia_obj(PosologiaBean id_posologia_obj) {
        this.id_posologia_obj = id_posologia_obj;
    }

    public ViaBean getId_via_obj() {
        return id_via_obj;
    }

    public void setId_via_obj(ViaBean id_via_obj) {
        this.id_via_obj = id_via_obj;
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
    public TratamientoBean fill(ResultSet oResultSet, Connection oConnection,
            int spread, UsuarioBean oUsuarioBeanSession) throws Exception {
       
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
            oPreparedStatement.setString(++numparam, "%"+word+"%");
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
        */return oPreparedStatement;
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
        }else if (filter.equalsIgnoreCase("via")) {
            return "id_via";
        }else {
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