package net.adisan.bean;

import com.google.gson.annotations.Expose;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;
import java.util.List;
import net.adisan.exceptions.MyException;

public class AnaliticaBean implements BeanInterface {

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
    private MedicoBean id_medico;
    @Expose(serialize = false)
    private DependenciaBean id_dependencia;
    @Expose(serialize = false)
    private CatalogoAnaliticasBean id_catalogoanaliticas;
    @Expose
    private Double importe;
    @Expose(serialize = false)
    private EpisodioBean id_episodio;
    @Expose(deserialize = false)
    private Integer id_medico_obj;
    @Expose(deserialize = false)
    private Integer id_dependencia_obj;
    @Expose(deserialize = false)
    private Integer id_catalogoanaliticas_obj;
    @Expose(deserialize = false)
    private Integer id_episodio_obj;
    @Expose
    private Boolean canCreate;
    @Expose
    private Boolean canUpdate;
    @Expose
    private Boolean canDelete;

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

    public MedicoBean getId_medico() {
        return id_medico;
    }

    public void setId_medico(MedicoBean id_medico) {
        this.id_medico = id_medico;
    }

    public DependenciaBean getId_dependencia() {
        return id_dependencia;
    }

    public void setId_dependencia(DependenciaBean id_dependencia) {
        this.id_dependencia = id_dependencia;
    }

    public CatalogoAnaliticasBean getId_catalogoanaliticas() {
        return id_catalogoanaliticas;
    }

    public void setId_catalogoanaliticas(CatalogoAnaliticasBean id_catalogoanaliticas) {
        this.id_catalogoanaliticas = id_catalogoanaliticas;
    }

    public Double getImporte() {
        return importe;
    }

    public void setImporte(Double importe) {
        this.importe = importe;
    }

    public EpisodioBean getId_episodio() {
        return id_episodio;
    }

    public void setId_episodio(EpisodioBean id_episodio) {
        this.id_episodio = id_episodio;
    }

    public Integer getId_medico_obj() {
        return id_medico_obj;
    }

    public void setId_medico_obj(Integer id_medico_obj) {
        this.id_medico_obj = id_medico_obj;
    }

    public Integer getId_dependencia_obj() {
        return id_dependencia_obj;
    }

    public void setId_dependencia_obj(Integer id_dependencia_obj) {
        this.id_dependencia_obj = id_dependencia_obj;
    }

    public Integer getId_catalogoanaliticas_obj() {
        return id_catalogoanaliticas_obj;
    }

    public void setId_catalogoanaliticas_obj(Integer id_catalogoanaliticas_obj) {
        this.id_catalogoanaliticas_obj = id_catalogoanaliticas_obj;
    }

    public Integer getId_episodio_obj() {
        return id_episodio_obj;
    }

    public void setId_episodio_obj(Integer id_episodio_obj) {
        this.id_episodio_obj = id_episodio_obj;
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
    public Integer getId() {
        return id;
    }

    @Override
    public void setId(Integer id) {
        this.id = id;
    }

    @Override
    public AnaliticaBean fill(ResultSet oResultSet, Connection oConnection,
            int spread, UsuarioBean oUsuarioBeanSession) throws Exception {
        this.setId(oResultSet.getInt("id"));
        this.setDescripcion(oResultSet.getString("descripcion"));
        /*this.setUsuario_id(oResultSet.getInt("usuario_id"));
        if (oUsuarioBeanSession != null) {
            DaoInterface oFacturaDao = DaoFactory.getDao(oConnection, "compra", oUsuarioBeanSession);
            this.setLink_compra(oFacturaDao.getCount(id, "factura"));

            if (this.getLink_compra() > 0) {
                this.setCanDelete(false);
            } else {
                this.setCanDelete(true);
            }

            if (spread > 0) {
                spread--;
                DaoInterface oUsuarioDao = DaoFactory.getDao(oConnection, "usuario", oUsuarioBeanSession);
                UsuarioBean oUsuarioBean;
                oUsuarioBean = (UsuarioBean) oUsuarioDao.get(this.usuario_id);
                this.usuario_obj = oUsuarioBean;
            }
        }*/
        return this;
    }

    @Override
    public PreparedStatement orderSQL(List<String> orden,
            PreparedStatement oPreparedStatement) throws Exception {
        for (int i = 1; i < orden.size(); i++) {
            if (orden.get((i - 1)).equalsIgnoreCase("id")) {
                oPreparedStatement.setInt(i, 1);
            } else if (orden.get((i - 1)).equalsIgnoreCase("fecha")) {
                oPreparedStatement.setInt(i, 2);
            } else if (orden.get((i - 1)).equalsIgnoreCase("objeto_obj")) {
                oPreparedStatement.setInt(i, 3);
            }
        }
        return oPreparedStatement;
    }

    @Override
    public String getFieldInsert() {
        return " (fecha,usuario_id) VALUES(?,?)";
    }

    private String getFieldFilter(String campo) {
        return " OR " + campo + " LIKE ? ";
    }

    @Override
    public String getFieldConcat() {

        return " id LIKE ? "
                + getFieldFilter("fecha");
               
    }

    @Override
    public PreparedStatement setFilter(int numparam,
            PreparedStatement oPreparedStatement, String word, int rpp, int offset)
            throws Exception {
        for (int i = 0; i <= 2; i++) {
            oPreparedStatement.setString(++numparam, "%"+word+"%");
        }
        oPreparedStatement.setInt(++numparam, rpp);
        oPreparedStatement.setInt(++numparam, offset);
        return oPreparedStatement;
    }

    @Override
    public PreparedStatement setFieldInsert(BeanInterface oBeanParam, PreparedStatement oPreparedStatement)
            throws Exception {
        AnaliticaBean oFacturaBean = (AnaliticaBean) oBeanParam;
/*        oPreparedStatement.setDate(1, new java.sql.Date(oFacturaBean.getFecha().getTime()));       
        oPreparedStatement.setInt(2, oFacturaBean.getUsuario_id());*/
        return oPreparedStatement;
    }

    @Override
    public String getFieldUpdate() {
        return " fecha=?,usuario_id=? ";
    }

    @Override
    public PreparedStatement setFieldUpdate(BeanInterface oBeanParam, PreparedStatement oPreparedStatement)
            throws Exception {/*
        AnaliticaBean oFacturaBean = (AnaliticaBean) oBeanParam;
        oPreparedStatement.setDate(1, new java.sql.Date(oFacturaBean.getFecha().getTime()));
        oPreparedStatement.setInt(2, oFacturaBean.getUsuario_id());
        oPreparedStatement.setInt(3, oFacturaBean.getId());*/
        return oPreparedStatement;
    }

    @Override
    public String getFieldLink() {
        return "link_compra";
    }

    @Override
    public String getFieldId(String filter) {
       if (filter.equalsIgnoreCase("episodio")) {
            return "id_episodio";
        } else if (filter.equalsIgnoreCase("dependencia")) {
            return "id_dependencia";
        }else if (filter.equalsIgnoreCase("catalogoanaliticas")) {
            return "id_catalogoanaliticas";
        }else {
            return "id_medico";
        }
    }

    @Override
    public PreparedStatement setFieldId(int numparam, PreparedStatement oPreparedStatement, int id, int rpp, int offset) throws MyException, SQLException {
        oPreparedStatement.setInt(++numparam, id);
        oPreparedStatement.setInt(++numparam, rpp);
        oPreparedStatement.setInt(++numparam, offset);
        return oPreparedStatement;
    }

    @Override
    public String getFieldOrder(String orden) {
        return orden.matches("id|fecha|usuario_id") ? orden : null;
    }
}