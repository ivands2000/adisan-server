package net.adisan.bean;

import com.google.gson.annotations.Expose;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Date;
import java.util.List;
import net.adisan.dao.daointerface.DaoInterface;
import net.adisan.factory.DaoFactory;

public class Prueba_InformadaBean implements BeanInterface {

    @Expose
    private Integer id;
    @Expose
    private String informe;
    @Expose
    private Date fecha_peticion;
    @Expose
    private Double importe;
    @Expose(serialize = false)
    private Integer id_episodio;
   
    @Expose(serialize = false)
    private Integer id_medico;
    @Expose
    private Integer id_usuario;
    @Expose(deserialize = false)
    private EpisodioBean id_episodio_obj;
    
    @Expose(deserialize = false)
    private MedicoBean id_medico_obj;
    
    @Expose(deserialize = false)
    private Integer link_imagen;
    @Expose
    private Boolean canCreate;
    @Expose
    private Boolean canUpdate;
    @Expose
    private Boolean canDelete;

    public Integer getId_usuario() {
        return id_usuario;
    }

    public void setId_usuario(Integer id_usuario) {
        this.id_usuario = id_usuario;
    }

   
    public Integer getLink_imagen() {
        return link_imagen;
    }

    public void setLink_imagen(Integer link_imagen) {
        this.link_imagen = link_imagen;
    }

    @Override
    public Integer getId() {
        return id;
    }

    @Override
    public void setId(Integer id) {
        this.id = id;
    }

    public String getInforme() {
        return informe;
    }

    public void setInforme(String informe) {
        this.informe = informe;
    }

    public Date getFecha_peticion() {
        return fecha_peticion;
    }

    public void setFecha_peticion(Date fecha_peticion) {
        this.fecha_peticion = fecha_peticion;
    }

    public Double getImporte() {
        return importe;
    }

    public void setImporte(Double importe) {
        this.importe = importe;
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

    public EpisodioBean getId_episodio_obj() {
        return id_episodio_obj;
    }

    public void setId_episodio_obj(EpisodioBean id_episodio_obj) {
        this.id_episodio_obj = id_episodio_obj;
    }

    public MedicoBean getId_medico_obj() {
        return id_medico_obj;
    }

    public void setId_medico_obj(MedicoBean id_medico_obj) {
        this.id_medico_obj = id_medico_obj;
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
    public Prueba_InformadaBean fill(ResultSet oResultSet, Connection oConnection,
            int spread, UsuarioBean oUsuarioBeanSession) throws Exception {
        this.setId(oResultSet.getInt("id"));
        this.setInforme(oResultSet.getString("informe"));
        this.setFecha_peticion(oResultSet.getDate("fecha_peticion"));
        this.setImporte(oResultSet.getDouble("importe"));
        this.setId_episodio(oResultSet.getInt("id_episodio"));
        this.setId_medico(oResultSet.getInt("id_medico"));
        this.setId_medico(oResultSet.getInt("id_usuario"));

        if (oUsuarioBeanSession != null) {
            DaoInterface oImagenDao = DaoFactory.getDao(oConnection, "imagen", oUsuarioBeanSession);
            this.setLink_imagen(oImagenDao.getCount(id, "prueba_informada"));

            if (this.getLink_imagen() > 0) {
                this.setCanDelete(false);
            } else {
                this.setCanDelete(true);
            }

            if (spread > 0) {
                spread--;
                DaoInterface oEpisodioDao = DaoFactory.getDao(oConnection, "episodio", oUsuarioBeanSession);
                EpisodioBean oEpisodioBean;
                oEpisodioBean = (EpisodioBean) oEpisodioDao.get(this.id_episodio);
                this.id_episodio_obj = oEpisodioBean;

                DaoInterface oMedicoDao = DaoFactory.getDao(oConnection, "medico", oUsuarioBeanSession);
                MedicoBean oMedicoBean;
                oMedicoBean = (MedicoBean) oMedicoDao.get(this.id_medico);
                this.id_medico_obj = oMedicoBean;

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
            } else if (orden.get((i - 1)).equalsIgnoreCase("informe")) {
                oPreparedStatement.setInt(i, 2);
            } else if (orden.get((i - 1)).equalsIgnoreCase("fecha_peticion")) {
                oPreparedStatement.setInt(i, 3);
            } else if (orden.get((i - 1)).equalsIgnoreCase("importe")) {
                oPreparedStatement.setInt(i, 4);
            } else if (orden.get((i - 1)).equalsIgnoreCase("id_episodio_obj")) {
                oPreparedStatement.setInt(i, 5);
            } else if (orden.get((i - 1)).equalsIgnoreCase("id_medico_obj")) {
                oPreparedStatement.setInt(i, 6);
            } else if (orden.get((i - 1)).equalsIgnoreCase("id_usuario")) {
                oPreparedStatement.setInt(i, 7);
            }
        }
        return oPreparedStatement;
    }

    @Override
    public PreparedStatement setFieldInsert(BeanInterface oBeanParam,
            PreparedStatement oPreparedStatement) throws Exception {
        Prueba_InformadaBean oPruebaInformadaBean = (Prueba_InformadaBean) oBeanParam;
        oPreparedStatement.setString(1, oPruebaInformadaBean.getInforme());
        oPreparedStatement.setDate(2, new java.sql.Date(oPruebaInformadaBean.getFecha_peticion().getTime()));
        oPreparedStatement.setDouble(3, oPruebaInformadaBean.getImporte());
        oPreparedStatement.setInt(4, oPruebaInformadaBean.getId_episodio());
        oPreparedStatement.setInt(5, oPruebaInformadaBean.getId_medico());
        oPreparedStatement.setInt(6, oPruebaInformadaBean.getId_usuario());

        return oPreparedStatement;
    }
    
    @Override
    public String getFieldInsert() {
        return " (informe,fecha_peticion,importe,id_episodio,id_medico,id_usuario) VALUES(?,?,?,?,?,?)";
    }
    @Override
    public PreparedStatement setFieldUpdate(BeanInterface oBeanParam,
            PreparedStatement oPreparedStatement) throws Exception {
        Prueba_InformadaBean oPruebaInformadaBean = (Prueba_InformadaBean) oBeanParam;
        oPreparedStatement.setString(1, oPruebaInformadaBean.getInforme());
        oPreparedStatement.setDate(2, new java.sql.Date(oPruebaInformadaBean.getFecha_peticion().getTime()));
        oPreparedStatement.setDouble(3, oPruebaInformadaBean.getImporte());
        oPreparedStatement.setInt(4, oPruebaInformadaBean.getId_episodio());
        oPreparedStatement.setInt(5, oPruebaInformadaBean.getId_medico());
        oPreparedStatement.setInt(6, oPruebaInformadaBean.getId_usuario());
        oPreparedStatement.setInt(7, oPruebaInformadaBean.getId());
        return oPreparedStatement;
    }

    private String getFieldFilter(String campo) {
        return " OR " + campo + " LIKE ?";
    }

    @Override
    public String getFieldConcat() {

        return " id LIKE ?"
                + getFieldFilter("informe")
                + getFieldFilter("fecha_peticion")
                + getFieldFilter("importe")
                + getFieldFilter("id_episodio")
                + getFieldFilter("id_medico")
                + getFieldFilter("id_usuario");
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
        return "link_imagen";
    }

    @Override
    public String getFieldId(String filter) {
        return "id_episodio";
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
        return orden.matches("id|informe|fecha_peticion|importe") ? orden : null;
    }

    

    @Override
    public String getFieldUpdate() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
}
