package net.adisan.bean;

import com.google.gson.annotations.Expose;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;
import net.adisan.dao.daointerface.DaoInterface;
import net.adisan.factory.DaoFactory;

public class TipoPagoBean implements BeanInterface {

    @Expose
    private Integer id;
    @Expose
    private String descripcion;
    @Expose(deserialize = false)
    private Integer link_paciente;
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

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Integer getLink_paciente() {
        return link_paciente;
    }

    public void setLink_paciente(Integer link_paciente) {
        this.link_paciente = link_paciente;
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
            } else if (orden.get((i - 1)).equalsIgnoreCase("descripcion")) {
                oPreparedStatement.setInt(i, 2);
            }
        }
        return oPreparedStatement;
    }

    @Override
    public String getFieldInsert() {
        return " (id,descripcion) VALUES(?,?)";
    }

    private String getFieldFilter(String campo) {
        return " OR " + campo + " LIKE ?";
    }

    @Override
    public String getFieldConcat() {

        return " id LIKE ?"
                + getFieldFilter("descripcion");
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
    public String getFieldOrder(String orden) {
        return orden.matches("id|descripcion") ? orden : null;
    }

    @Override
    public BeanInterface fill(ResultSet oResultSet, Connection oConnection, int spread, UsuarioBean oUsuarioBeanSession) throws Exception {
        this.setId(oResultSet.getInt("id"));
        this.setDescripcion(oResultSet.getString("descripcion"));

        DaoInterface oPacienteDao = DaoFactory.getDao(oConnection, "paciente", oUsuarioBeanSession);
        this.setLink_paciente(oPacienteDao.getCount(id, "tipopago"));

        if (this.getLink_paciente() > 0) {
            this.setCanDelete(false);
        } else {
            this.setCanDelete(true);
        }

        return this;
    }

    @Override
    public String getFieldLink() {
        return "link_paciente";
    }

    @Override
    public String getFieldId(String filter) {
        return "id";
    }

    @Override
    public PreparedStatement setFieldId(int numparam, PreparedStatement oPreparedStatement, int id, int rpp, int offset) throws Exception {
        oPreparedStatement.setInt(++numparam, id);
        oPreparedStatement.setInt(++numparam, rpp);
        oPreparedStatement.setInt(++numparam, offset);
        return oPreparedStatement;
    }

    @Override
    public PreparedStatement setFieldInsert(BeanInterface oBeanParam, PreparedStatement oPreparedStatement) throws Exception {
        TipoPagoBean oTipoPagoBean = (TipoPagoBean) oBeanParam;
        oPreparedStatement.setString(1, oTipoPagoBean.getDescripcion());
        return oPreparedStatement;
    }

    @Override
    public String getFieldUpdate() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public PreparedStatement setFieldUpdate(BeanInterface oBeanParam, PreparedStatement oPreparedStatement) throws Exception {
        TipoPagoBean oTipoPagoBean = (TipoPagoBean) oBeanParam;
        oPreparedStatement.setString(1, oTipoPagoBean.getDescripcion());
        oPreparedStatement.setInt(2, oTipoPagoBean.getId());

        return oPreparedStatement;
    }
}
