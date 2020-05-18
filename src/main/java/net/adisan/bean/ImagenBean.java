package net.adisan.bean;

import com.google.gson.annotations.Expose;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Date;
import java.util.List;
import net.adisan.dao.daointerface.DaoInterface;
import net.adisan.factory.DaoFactory;

public class ImagenBean implements BeanInterface {

    @Expose
    private Integer id;
    @Expose
    private String descripcion;
    @Expose
    private Date fecha_prevista;
    @Expose
    private Date fecha_realizacion;
    @Expose
    private String ubicacion;
    @Expose(serialize = false)
    private Integer id_catalogoimagenes;
    @Expose(serialize = false)
    private Integer id_pruebainformada;
    @Expose(serialize = false)
    private Integer id_dependencia;
    @Expose
    private Double importe;
     @Expose(serialize = false)
    private Integer id_tecnico;
     @Expose
    private Integer id_usuario;
    
    @Expose(deserialize = false)
    private CatalogoImagenesBean id_catalogo_obj;
    @Expose(deserialize = false)
    private Prueba_InformadaBean id_prueba_obj;
    @Expose(deserialize = false)
    private DependenciaBean id_dependencia_obj;
    @Expose(deserialize = false)
    private TecnicoBean id_tecnico_obj;
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

    public Integer getId_usuario() {
        return id_usuario;
    }

    public void setId_usuario(Integer id_usuario) {
        this.id_usuario = id_usuario;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Date getFecha_prevista() {
        return fecha_prevista;
    }

    public void setFecha_prevista(Date fecha_prevista) {
        this.fecha_prevista = fecha_prevista;
    }

    public Date getFecha_realizacion() {
        return fecha_realizacion;
    }

    public void setFecha_realizacion(Date fecha_realizacion) {
        this.fecha_realizacion = fecha_realizacion;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public Integer getId_catalogoimagenes() {
        return id_catalogoimagenes;
    }

    public void setId_catalogoimagenes(Integer id_catalogoimagenes) {
        this.id_catalogoimagenes = id_catalogoimagenes;
    }

    public Integer getId_pruebainformada() {
        return id_pruebainformada;
    }

    public void setId_pruebainformada(Integer id_pruebainformada) {
        this.id_pruebainformada = id_pruebainformada;
    }

    public Integer getId_dependencia() {
        return id_dependencia;
    }

    public void setId_dependencia(Integer id_dependencia) {
        this.id_dependencia = id_dependencia;
    }

    public Double getImporte() {
        return importe;
    }

    public void setImporte(Double importe) {
        this.importe = importe;
    }

    public Integer getId_tecnico() {
        return id_tecnico;
    }

    public void setId_tecnico(Integer id_tecnico) {
        this.id_tecnico = id_tecnico;
    }

    public CatalogoImagenesBean getId_catalogo_obj() {
        return id_catalogo_obj;
    }

    public void setId_catalogo_obj(CatalogoImagenesBean id_catalogo_obj) {
        this.id_catalogo_obj = id_catalogo_obj;
    }

    public Prueba_InformadaBean getId_prueba_obj() {
        return id_prueba_obj;
    }

    public void setId_prueba_obj(Prueba_InformadaBean id_prueba_obj) {
        this.id_prueba_obj = id_prueba_obj;
    }

    public DependenciaBean getId_dependencia_obj() {
        return id_dependencia_obj;
    }

    public void setId_dependencia_obj(DependenciaBean id_dependencia_obj) {
        this.id_dependencia_obj = id_dependencia_obj;
    }

    public TecnicoBean getId_tecnico_obj() {
        return id_tecnico_obj;
    }

    public void setId_tecnico_obj(TecnicoBean id_tecnico_obj) {
        this.id_tecnico_obj = id_tecnico_obj;
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
    public ImagenBean fill(ResultSet oResultSet, Connection oConnection,
            int spread, UsuarioBean oUsuarioBeanSession) throws Exception {
        this.setId(oResultSet.getInt("id"));
        this.setDescripcion(oResultSet.getString("descripcion"));
        this.setFecha_prevista(oResultSet.getDate("fecha_prevista"));
        this.setFecha_realizacion(oResultSet.getDate("fecha_realizacion"));
        this.setUbicacion(oResultSet.getString("ubicacion"));
        this.setId_catalogoimagenes(oResultSet.getInt("id_catalogoimagenes"));
        this.setId_pruebainformada(oResultSet.getInt("id_pruebainformada"));
        this.setId_dependencia(oResultSet.getInt("id_dependencia"));
        this.setImporte(oResultSet.getDouble("importe"));
        this.setId_tecnico(oResultSet.getInt("id_tecnico"));
        this.setId_usuario(oResultSet.getInt("id_usuario"));
        
        
        
        if (oUsuarioBeanSession != null) {

            if (spread > 0) {
                spread--;
                
                DaoInterface oCatalogoDao = DaoFactory.getDao(oConnection, "catalogoimagenes", oUsuarioBeanSession);
                CatalogoImagenesBean oCatalogoBean;
                oCatalogoBean = (CatalogoImagenesBean) oCatalogoDao.get(this.id_catalogoimagenes);
                this.id_catalogo_obj = oCatalogoBean;
                
                DaoInterface oPruebaDao = DaoFactory.getDao(oConnection, "prueba_informada", oUsuarioBeanSession);
                Prueba_InformadaBean oPruebaBean;
                oPruebaBean = (Prueba_InformadaBean) oPruebaDao.get(this.id_pruebainformada);
                this.id_prueba_obj = oPruebaBean;

                DaoInterface oDependenciaDao = DaoFactory.getDao(oConnection, "dependencia", oUsuarioBeanSession);
                DependenciaBean oDependenciaBean;
                oDependenciaBean = (DependenciaBean) oDependenciaDao.get(this.id_dependencia);
                this.id_dependencia_obj = oDependenciaBean;
                
                DaoInterface oTecnicoDao = DaoFactory.getDao(oConnection, "tecnico", oUsuarioBeanSession);
                TecnicoBean oTecnicoBean;
                oTecnicoBean = (TecnicoBean) oTecnicoDao.get(this.id_tecnico);
                this.id_tecnico_obj = oTecnicoBean;

            }
        }
        
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
        return " (descripcion,fecha_prevista,fecha_realizacion,ubicacion,id_catalogoimagenes,id_pruebainformada,id_dependencia,importe,id_tecnico,id_usuario) VALUES(?,?,?,?,?,?,?,?,?,?)";
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
        ImagenBean oImagenBean = (ImagenBean) oBeanParam;
        oPreparedStatement.setString(1, oImagenBean.getDescripcion());
        oPreparedStatement.setDate(2, new java.sql.Date(oImagenBean.getFecha_prevista().getTime()));
        oPreparedStatement.setDate(3, new java.sql.Date(oImagenBean.getFecha_realizacion().getTime()));
        oPreparedStatement.setString(4, oImagenBean.getUbicacion());
        oPreparedStatement.setInt(5, oImagenBean.getId_catalogoimagenes());
        oPreparedStatement.setInt(6, oImagenBean.getId_pruebainformada());
        oPreparedStatement.setInt(7, oImagenBean.getId_dependencia());
        oPreparedStatement.setDouble(8, oImagenBean.getImporte());
        oPreparedStatement.setInt(9, oImagenBean.getId_tecnico());
        oPreparedStatement.setInt(10, oImagenBean.getId_usuario());
        return oPreparedStatement;
    }

    @Override
    public String getFieldUpdate() {
        return " dni=?,nombre=?,apellido1=?,apellido2=?,email=?,login=?,id_tipousuario=? ";
    }

    @Override
    public PreparedStatement setFieldUpdate(BeanInterface oBeanParam, PreparedStatement oPreparedStatement)
            throws Exception {
        ImagenBean oImagenBean = (ImagenBean) oBeanParam;
        oPreparedStatement.setString(1, oImagenBean.getDescripcion());
        oPreparedStatement.setDate(2, new java.sql.Date(oImagenBean.getFecha_prevista().getTime()));
        oPreparedStatement.setDate(3, new java.sql.Date(oImagenBean.getFecha_realizacion().getTime()));
        oPreparedStatement.setString(4, oImagenBean.getUbicacion());
        oPreparedStatement.setInt(5, oImagenBean.getId_catalogoimagenes());
        oPreparedStatement.setInt(6, oImagenBean.getId_pruebainformada());
        oPreparedStatement.setInt(7, oImagenBean.getId_dependencia());
        oPreparedStatement.setDouble(8, oImagenBean.getImporte());
        oPreparedStatement.setInt(9, oImagenBean.getId_tecnico());
        oPreparedStatement.setInt(10, oImagenBean.getId_tecnico());
        return oPreparedStatement;
    }

    @Override
    public String getFieldLink() {
        return "link_factura";
    }

    @Override
    public String getFieldId(String filter) {
         
            return "id_pruebainformada";
       
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
        return orden.matches("id|descripcion|fecha_prevista|fecha_realizacion|ubicacion|id_catalogoimagenes|id_pruebainformada|id_dependencia|importe|id_tecnico|id_usuario") ? orden : null;
    }

    
}