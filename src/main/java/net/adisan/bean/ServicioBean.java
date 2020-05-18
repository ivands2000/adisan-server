package net.adisan.bean;

import com.google.gson.annotations.Expose;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;

public class ServicioBean implements BeanInterface {

    @Expose
    private Integer id;
    @Expose
    private String descripcion;
    @Expose
    private String codigo;
    @Expose
    private Integer id_tiposervicio;
    @Expose(serialize = false)
    private TipoServicioBean id_tiposervicio_obj;
    @Expose
    private Boolean canCreate;
    @Expose
    private Boolean canUpdate;
    @Expose
    private Boolean canDelete;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public Integer getId_tiposervicio() {
        return id_tiposervicio;
    }

    public void setId_tiposervicio(Integer id_tiposervicio) {
        this.id_tiposervicio = id_tiposervicio;
    }

    public TipoServicioBean getId_tiposervicio_obj() {
        return id_tiposervicio_obj;
    }

    public void setId_tiposervicio_obj(TipoServicioBean id_tiposervicio_obj) {
        this.id_tiposervicio_obj = id_tiposervicio_obj;
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
        return " (dni,nombre,apellido1,apellido2,email,login,password,id_tipousuario) VALUES(?,?,?,?,?,?,?,?)";
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
    public String getFieldLink() {
        return "link_factura";
    }

    @Override
    public String getFieldId(String filter) {
        return "id_tipousuario";
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
        return orden.matches("id|fecha_firma|fecha_inicio|fecha_alta|importe|finalizado|bloqueado|motivo_ingreso|antecedentes|historia_actual|exploracion_fisica|evolucion_comentarios|diagnostico_principal|diagnostico_secundarios|procedimientos|tratamiento_recomendaciones|tratamiento_farmacos|recomendaciones") ? orden : null;
    }

    @Override
    public BeanInterface fill(ResultSet oResultSet, Connection oConnection, int spread, UsuarioBean oUsuarioBeanSession) throws Exception {
        this.setId(oResultSet.getInt("id"));
        this.setDescripcion(oResultSet.getString("descripcion"));
        this.setCodigo(oResultSet.getString("codigo"));
        this.setId_tiposervicio(oResultSet.getInt("id_tiposervicio")); 
    return this;
    }

    @Override
    public PreparedStatement setFieldInsert(BeanInterface oBeanParam, PreparedStatement oPreparedStatement) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getFieldUpdate() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public PreparedStatement setFieldUpdate(BeanInterface oBeanParam, PreparedStatement oPreparedStatement) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
