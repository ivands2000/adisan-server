package net.adisan.bean;

import com.google.gson.annotations.Expose;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;

public class GrupoBean implements BeanInterface {

    @Expose
    private Integer id;
    @Expose
    private String codigo;
   
    @Expose(serialize = false)
    private Integer id_curso;
    @Expose(serialize = false)
    private Integer id_usuario;

    @Expose(deserialize = false)
    private Integer link_compra;
    @Expose
    private Boolean canCreate;
    @Expose
    private Boolean canUpdate;
    @Expose
    private Boolean canDelete;

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

    public Integer getLink_compra() {
        return link_compra;
    }

    public void setLink_compra(Integer link_compra) {
        this.link_compra = link_compra;
    }

    public GrupoBean() {
    }

    public GrupoBean(Integer id) {
        this.id = id;
    }

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

   
    public Integer getId_curso() {
        return id_curso;
    }

    public void setId_curso(Integer id_curso) {
        this.id_curso = id_curso;
    }

    public Integer getId_usuario() {
        return id_usuario;
    }

    public void setId_usuario(Integer id_usuario) {
        this.id_usuario = id_usuario;
    }




    @Override
    public GrupoBean fill(ResultSet oResultSet, Connection oConnection,
            int spread, UsuarioBean oUsuarioBeanSession) throws Exception {
     /*   this.setId(oResultSet.getInt("id"));
        this.setCodigo(oResultSet.getString("codigo"));
        this.setExistencias(oResultSet.getInt("existencias"));
        this.setPrecio(oResultSet.getDouble("precio"));
        this.setImagen(oResultSet.getString("imagen"));
        this.setDescripcion(oResultSet.getString("descripcion"));
        this.setId_curso(oResultSet.getInt("marca_id"));
        this.setId_usuario(oResultSet.getInt("categoria_id"));

        if (oUsuarioBeanSession != null) {
            DaoInterface oCompraDao = DaoFactory.getDao(oConnection, "compra", oUsuarioBeanSession);
            this.setLink_compra(oCompraDao.getCount(id, "producto"));

            if (this.getLink_compra() > 0) {
                this.setCanDelete(false);
            } else {
                this.setCanDelete(true);
            }
/*
            if (spread > 0) {
                spread--;
                DaoInterface oMarcaDao = DaoFactory.getDao(oConnection, "marca", oUsuarioBeanSession);
                MarcaBean oMarcaBean;
                oMarcaBean = (MarcaBean) oMarcaDao.get(this.id_curso);
                this.marca_obj = oMarcaBean;

                DaoInterface oCategoriaDao = DaoFactory.getDao(oConnection, "categoria", oUsuarioBeanSession);
                CategoriaBean oCategoriaBean;
                oCategoriaBean = (CategoriaBean) oCategoriaDao.get(this.id_usuario);
                this.categoria_obj = oCategoriaBean;
            }
        }*/
        return this;

    }

    @Override
    public PreparedStatement orderSQL(List<String> orden, PreparedStatement oPreparedStatement)
            throws Exception {
        for (int i = 1; i < orden.size(); i++) {
            if (orden.get((i - 1)).equalsIgnoreCase("id")) {
                oPreparedStatement.setInt(i, 1);
            } else if (orden.get((i - 1)).equalsIgnoreCase("codigo")) {
                oPreparedStatement.setInt(i, 2);
            } else if (orden.get((i - 1)).equalsIgnoreCase("existencias")) {
                oPreparedStatement.setInt(i, 3);
            } else if (orden.get((i - 1)).equalsIgnoreCase("precio")) {
                oPreparedStatement.setInt(i, 4);
            } else if (orden.get((i - 1)).equalsIgnoreCase("imagen")) {
                oPreparedStatement.setInt(i, 5);
            } else if (orden.get((i - 1)).equalsIgnoreCase("descripcion")) {
                oPreparedStatement.setInt(i, 6);
            }
        }
        return oPreparedStatement;
    }

    @Override
    public String getFieldInsert() {
        return " (codigo,existencias,precio,imagen,descripcion,marca_id,categoria_id) VALUES(?,?,?,?,?,?,?)";
    }

    private String getFieldFilter(String campo) {
        return " OR UPPER(" + campo + ") LIKE ?";
    }

    @Override
    public String getFieldConcat() {

        return " id LIKE ?"
                + getFieldFilter("codigo")
                + getFieldFilter("existencias")
                + getFieldFilter("precio")
                + getFieldFilter("imagen")
                + getFieldFilter("descripcion");

    }

    @Override
    public PreparedStatement setFilter(int numparam,
            PreparedStatement oPreparedStatement, String word, int rpp, int offset)
            throws Exception {

        for (int i = 0; i <= 5; i++) {
            oPreparedStatement.setString(++numparam, "%" + word + "%");
        }
        oPreparedStatement.setInt(++numparam, rpp);
        oPreparedStatement.setInt(++numparam, offset);
        return oPreparedStatement;
    }

    @Override
    public PreparedStatement setFieldInsert(BeanInterface oBeanParam,
            PreparedStatement oPreparedStatement) throws Exception {
  /*      GrupoBean oProductoBean = (GrupoBean) oBeanParam;
        oPreparedStatement.setString(1, oProductoBean.getCodigo());
        oPreparedStatement.setInt(2, oProductoBean.getExistencias());
        oPreparedStatement.setDouble(3, oProductoBean.getPrecio());
        oPreparedStatement.setString(4, oProductoBean.getImagen());
        oPreparedStatement.setString(5, oProductoBean.getDescripcion());
        oPreparedStatement.setInt(6, oProductoBean.getId_curso());
        oPreparedStatement.setInt(7, oProductoBean.getId_usuario());
        */return oPreparedStatement;
    }

    @Override
    public String getFieldUpdate() {
        return " codigo=?,existencias=?,precio=?,imagen=?,descripcion=?,marca_id=?,categoria_id=? ";
    }

    @Override
    public PreparedStatement setFieldUpdate(BeanInterface oBeanParam,
            PreparedStatement oPreparedStatement) throws Exception {
      /*  GrupoBean oProductoBean = (GrupoBean) oBeanParam;
        oPreparedStatement.setString(1, oProductoBean.getCodigo());
        oPreparedStatement.setInt(2, oProductoBean.getExistencias());
        oPreparedStatement.setDouble(3, oProductoBean.getPrecio());
        oPreparedStatement.setString(4, oProductoBean.getImagen());
        oPreparedStatement.setString(5, oProductoBean.getDescripcion());
        oPreparedStatement.setInt(6, oProductoBean.getId_curso());
        oPreparedStatement.setInt(7, oProductoBean.getId_usuario());
        oPreparedStatement.setInt(8, oProductoBean.getId());
        */return oPreparedStatement;
    }

    @Override
    public String getFieldLink() {
        return "link_compra";
    }

    @Override
    public String getFieldId(String filter) {
        if (filter.equalsIgnoreCase("marca")) {
            return "marca_id";
        } else {
            return "categoria_id";
        }

    }

    @Override
    public PreparedStatement setFieldId(int numparam,
            PreparedStatement oPreparedStatement, int id, int rpp, int offset)
            throws Exception {
        oPreparedStatement.setInt(++numparam, id);
        oPreparedStatement.setInt(++numparam, rpp);
        oPreparedStatement.setInt(++numparam, offset);
        return oPreparedStatement;
    }

    @Override
    public String getFieldOrder(String orden) {
        return orden.matches("id|codigo|existencias|descripcion|precio") ? orden : null;
    }

}
