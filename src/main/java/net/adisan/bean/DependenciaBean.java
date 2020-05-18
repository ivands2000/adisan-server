package net.adisan.bean;

import com.google.gson.annotations.Expose;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;

public class DependenciaBean implements BeanInterface {

    @Expose
    private Integer id;
    @Expose
    private String codigo;
    @Expose
    private String descripcion;
    @Expose(serialize = false)
    private Integer id_tipodependencia;
    @Expose(serialize = false)
    private Integer id_centrosanitario;    
    @Expose(deserialize = false)
    private TipoDependenciaBean id_tipodependencia_obj;
    @Expose(deserialize = false)
    private CentroSanitarioBean id_centrosanitario_obj;
    @Expose
    private Boolean canCreate;
    @Expose
    private Boolean canUpdate;
    @Expose
    private Boolean canDelete;

    @Override
    public Integer getId() {
        return id;
    }

    @Override
    public void setId(Integer id) {
        this.id = id;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Integer getId_tipodependencia() {
        return id_tipodependencia;
    }

    public void setId_tipodependencia(Integer id_tipodependencia) {
        this.id_tipodependencia = id_tipodependencia;
    }

    public Integer getId_centrosanitario() {
        return id_centrosanitario;
    }

    public void setId_centrosanitario(Integer id_centrosanitario) {
        this.id_centrosanitario = id_centrosanitario;
    }

    public TipoDependenciaBean getId_tipodependencia_obj() {
        return id_tipodependencia_obj;
    }

    public void setId_tipodependencia_obj(TipoDependenciaBean id_tipodependencia_obj) {
        this.id_tipodependencia_obj = id_tipodependencia_obj;
    }

    public CentroSanitarioBean getId_centrosanitario_obj() {
        return id_centrosanitario_obj;
    }

    public void setId_centrosanitario_obj(CentroSanitarioBean id_centrosanitario_obj) {
        this.id_centrosanitario_obj = id_centrosanitario_obj;
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
            } else if (orden.get((i - 1)).equalsIgnoreCase("codigo")) {
                oPreparedStatement.setInt(i, 2);
            } else if (orden.get((i - 1)).equalsIgnoreCase("descripcion")) {
                oPreparedStatement.setInt(i, 3);
            } else if (orden.get((i - 1)).equalsIgnoreCase("id_tipodependencia_obj")) {
                oPreparedStatement.setInt(i, 4);
            } else if (orden.get((i - 1)).equalsIgnoreCase("id_centrosanitario_obj")) {
                oPreparedStatement.setInt(i, 5);
            }
        }
        return oPreparedStatement;
    }


    @Override
    public String getFieldOrder(String orden) {
        return orden.matches("id|codigo|descripcion|") ? orden : null;
    }

    @Override
    public BeanInterface fill(ResultSet oResultSet, Connection oConnection, int spread, UsuarioBean oUsuarioBeanSession) throws Exception {
this.setId(oResultSet.getInt("id"));
this.setCodigo(oResultSet.getString("codigo"));
        this.setDescripcion(oResultSet.getString("descripcion"));
        this.setId_tipodependencia(oResultSet.getInt("id_tipodependencia"));
        this.setId_centrosanitario(oResultSet.getInt("id_centrosanitario")); 
    return this;    }

    @Override
    public String getFieldInsert() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getFieldConcat() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getFieldLink() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getFieldId(String filter) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public PreparedStatement setFieldId(int numparam, PreparedStatement oPreparedStatement, int id, int rpp, int offset) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public PreparedStatement setFilter(int numparam, PreparedStatement oPreparedStatement, String word, int rpp, int offset) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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