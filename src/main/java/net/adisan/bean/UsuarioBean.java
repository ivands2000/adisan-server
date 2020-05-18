package net.adisan.bean;

import com.google.gson.annotations.Expose;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Date;
import java.util.List;
import net.adisan.dao.daointerface.DaoInterface;
import net.adisan.dao.specificdao_4.EpisodioDao_3;
import net.adisan.dao.specificdao_4.PacienteDao_3;
import net.adisan.factory.DaoFactory;

public class UsuarioBean implements BeanInterface {

    @Expose
    private Integer id;
    @Expose
    private String nombre;
    @Expose
    private String primer_apellido;
    @Expose
    private String segundo_apellido;
    @Expose
    private String login;
    @Expose(serialize = false)
    private String password;
    @Expose
    private String email;
    @Expose
    private String token;
    @Expose
    private Boolean activo;
    @Expose
    private Date fecha_alta;
    @Expose
    private Boolean validado;

    @Expose(serialize = false)
    private Integer id_tipousuario;
    @Expose(serialize = false)
    private Integer id_grupo;
    @Expose(serialize = false)
    private Integer id_centro;
    @Expose(serialize = false)
    private Integer id_centrosanitario;
    @Expose(deserialize = false)
    private TipoUsuarioBean id_tipousuario_obj;
    @Expose(deserialize = false)
    private GrupoBean id_grupo_obj;
    @Expose(deserialize = false)
    private CentroBean id_centro_obj;
    @Expose(deserialize = false)
    private CentroSanitarioBean id_centrosanitario_obj;
    @Expose(deserialize = false)
    private Integer link_grupo;
    @Expose(deserialize = false)
    private Integer link_paciente;
    @Expose(deserialize = false)
    private Integer link_episodio;
    @Expose
    private Boolean canCreate;
    @Expose
    private Boolean canUpdate;
    @Expose
    private Boolean canDelete;

    public Integer getLink_grupo() {
        return link_grupo;
    }

    public void setLink_grupo(Integer link_grupo) {
        this.link_grupo = link_grupo;
    }

    public Integer getLink_paciente() {
        return link_paciente;
    }

    public void setLink_paciente(Integer link_paciente) {
        this.link_paciente = link_paciente;
    }

    public Integer getLink_episodio() {
        return link_episodio;
    }

    public void setLink_episodio(Integer link_episodio) {
        this.link_episodio = link_episodio;
    }

    @Override
    public Integer getId() {
        return id;
    }

    @Override
    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPrimer_apellido() {
        return primer_apellido;
    }

    public void setPrimer_apellido(String primer_apellido) {
        this.primer_apellido = primer_apellido;
    }

    public String getSegundo_apellido() {
        return segundo_apellido;
    }

    public void setSegundo_apellido(String segundo_apellido) {
        this.segundo_apellido = segundo_apellido;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public Boolean getActivo() {
        return activo;
    }

    public void setActivo(Boolean activo) {
        this.activo = activo;
    }

    public Date getFecha_alta() {
        return fecha_alta;
    }

    public void setFecha_alta(Date fecha_alta) {
        this.fecha_alta = fecha_alta;
    }

    public Boolean getValidado() {
        return validado;
    }

    public void setValidado(Boolean validado) {
        this.validado = validado;
    }

    public Integer getId_tipousuario() {
        return id_tipousuario;
    }

    public void setId_tipousuario(Integer id_tipousuario) {
        this.id_tipousuario = id_tipousuario;
    }

    public Integer getId_grupo() {
        return id_grupo;
    }

    public void setId_grupo(Integer id_grupo) {
        this.id_grupo = id_grupo;
    }

    public Integer getId_centro() {
        return id_centro;
    }

    public void setId_centro(Integer id_centro) {
        this.id_centro = id_centro;
    }

    public Integer getId_centrosanitario() {
        return id_centrosanitario;
    }

    public void setId_centrosanitario(Integer id_centrosanitario) {
        this.id_centrosanitario = id_centrosanitario;
    }

    public TipoUsuarioBean getId_tipousuario_obj() {
        return id_tipousuario_obj;
    }

    public void setId_tipousuario_obj(TipoUsuarioBean id_tipousuario_obj) {
        this.id_tipousuario_obj = id_tipousuario_obj;
    }

    public GrupoBean getId_grupo_obj() {
        return id_grupo_obj;
    }

    public void setId_grupo_obj(GrupoBean id_grupo_obj) {
        this.id_grupo_obj = id_grupo_obj;
    }

    public CentroBean getId_centro_obj() {
        return id_centro_obj;
    }

    public void setId_centro_obj(CentroBean id_centro_obj) {
        this.id_centro_obj = id_centro_obj;
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
    public UsuarioBean fill(ResultSet oResultSet, Connection oConnection,
            int spread, UsuarioBean oUsuarioBeanSession) throws Exception {
        this.setId(oResultSet.getInt("id"));
        this.setNombre(oResultSet.getString("nombre"));
        this.setPrimer_apellido(oResultSet.getString("primer_apellido"));
        this.setSegundo_apellido(oResultSet.getString("segundo_apellido"));
        this.setLogin(oResultSet.getString("login"));
        this.setPassword(oResultSet.getString("password"));
        this.setEmail(oResultSet.getString("email"));
        this.setActivo(oResultSet.getBoolean("activo"));
        this.setFecha_alta(oResultSet.getDate("fecha_alta"));
        this.setValidado(oResultSet.getBoolean("validado"));
        this.setId_tipousuario(oResultSet.getInt("id_tipousuario"));
        this.setId_grupo(oResultSet.getInt("id_grupo"));
        this.setId_centro(oResultSet.getInt("id_centro"));
        this.setId_centrosanitario(oResultSet.getInt("id_centrosanitario"));

        if (oUsuarioBeanSession != null) {

            DaoInterface oPacienteDao = DaoFactory.getDao(oConnection, "paciente", oUsuarioBeanSession);
            if (oPacienteDao != null) {

                PacienteDao_3 oPacienteDao_3 = (PacienteDao_3) oPacienteDao;
                this.setLink_paciente(oPacienteDao_3.getCount(id, "usuario"));

            }

            DaoInterface oEpisodioDao = DaoFactory.getDao(oConnection, "episodio", oUsuarioBeanSession);
            if (oEpisodioDao != null) {

                EpisodioDao_3 oEpisodioDao_3 = (EpisodioDao_3) oEpisodioDao;
                this.setLink_episodio(oEpisodioDao_3.getCount(id, "usuario"));

            }

            if (this.getLink_paciente() > 0) {
                this.setCanDelete(false);
            } else {
                this.setCanDelete(true);
            }
            if (this.getLink_episodio()> 0) {
                this.setCanDelete(false);
            } else {
                this.setCanDelete(true);
            }

       /*     if (spread > 0) {
                spread--;
                

                DaoInterface oGrupoDao = DaoFactory.getDao(oConnection, "grupo", oUsuarioBeanSession);
                GrupoBean oGrupoBean;
                oGrupoBean = (GrupoBean) oGrupoDao.get(this.id_grupo);
                this.id_grupo_obj = oGrupoBean;

                DaoInterface oCentroDao = DaoFactory.getDao(oConnection, "centro", oUsuarioBeanSession);
                CentroBean oCentroBean;
                oCentroBean = (CentroBean) oCentroDao.get(this.id_centro);
                this.id_centro_obj = oCentroBean;

                DaoInterface oCentroSDao = DaoFactory.getDao(oConnection, "centrosanitario", oUsuarioBeanSession);
                CentroSanitarioBean oCSBean;
                oCSBean = (CentroSanitarioBean) oCentroSDao.get(this.id_centrosanitario);
                this.id_centrosanitario_obj = oCSBean;
                
                DaoInterface oTipoUsuarioDao = DaoFactory.getDao(oConnection, "tipousuario", oUsuarioBeanSession);
                TipoUsuarioBean oTipoUsuarioBean;
                oTipoUsuarioBean = (TipoUsuarioBean) oTipoUsuarioDao.get(this.id_tipousuario);
                this.id_tipousuario_obj = oTipoUsuarioBean;
            }*/
        }

        return this;
    }

    @Override
    public PreparedStatement orderSQL(List<String> orden,
            PreparedStatement oPreparedStatement) throws Exception {
        for (int i = 1; i < orden.size(); i++) {
            if (orden.get((i - 1)).equalsIgnoreCase("id")) {
                oPreparedStatement.setInt(i, 1);
            } else if (orden.get((i - 1)).equalsIgnoreCase("nombre")) {
                oPreparedStatement.setInt(i, 2);
            } else if (orden.get((i - 1)).equalsIgnoreCase("primer_apellido")) {
                oPreparedStatement.setInt(i, 3);
            } else if (orden.get((i - 1)).equalsIgnoreCase("segundo_apellido")) {
                oPreparedStatement.setInt(i, 4);
            } else if (orden.get((i - 1)).equalsIgnoreCase("login")) {
                oPreparedStatement.setInt(i, 5);
            } else if (orden.get((i - 1)).equalsIgnoreCase("password")) {
                oPreparedStatement.setInt(i, 6);
            } else if (orden.get((i - 1)).equalsIgnoreCase("email")) {
                oPreparedStatement.setInt(i, 7);
            } else if (orden.get((i - 1)).equalsIgnoreCase("token")) {
                oPreparedStatement.setInt(i, 8);
            } else if (orden.get((i - 1)).equalsIgnoreCase("activo")) {
                oPreparedStatement.setInt(i, 9);
            } else if (orden.get((i - 1)).equalsIgnoreCase("fecha_alta")) {
                oPreparedStatement.setInt(i, 10);
            } else if (orden.get((i - 1)).equalsIgnoreCase("validado")) {
                oPreparedStatement.setInt(i, 11);
            } else if (orden.get((i - 1)).equalsIgnoreCase("id_tipousuario_obj")) {
                oPreparedStatement.setInt(i, 12);
            } else if (orden.get((i - 1)).equalsIgnoreCase("id_grupo_obj")) {
                oPreparedStatement.setInt(i, 13);
            } else if (orden.get((i - 1)).equalsIgnoreCase("id_centro_obj")) {
                oPreparedStatement.setInt(i, 14);
            } else if (orden.get((i - 1)).equalsIgnoreCase("id_centrosanitario_obj")) {
                oPreparedStatement.setInt(i, 15);
            }
        }
        return oPreparedStatement;
    }

    @Override
    public String getFieldInsert() {
        return " (dni,nombre,primer_apellido,segundo_apellido,login,password,email,activo,fecha_alta,validado,id_tipousuario,id_grupo,id_centro,id_centrosanitario) VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
    }

    private String getFieldFilter(String campo) {
        return " OR " + campo + " LIKE ?";
    }

    @Override
    public String getFieldConcat() {

        return " id LIKE ?"
                + getFieldFilter("nombre")
                + getFieldFilter("primer_apellido")
                + getFieldFilter("segundo_apellido")
                + getFieldFilter("login")
                + getFieldFilter("password")
                + getFieldFilter("email")
                + getFieldFilter("token")
                + getFieldFilter("activo")
                + getFieldFilter("fecha_alta")
                + getFieldFilter("validado");
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
        UsuarioBean oUsuarioBean = (UsuarioBean) oBeanParam;
        oPreparedStatement.setString(1, oUsuarioBean.getNombre());
        oPreparedStatement.setString(2, oUsuarioBean.getPrimer_apellido());
        oPreparedStatement.setString(3, oUsuarioBean.getSegundo_apellido());
        oPreparedStatement.setString(4, oUsuarioBean.getLogin());
        oPreparedStatement.setString(5, oUsuarioBean.getPassword());
        oPreparedStatement.setString(6, oUsuarioBean.getEmail());
        oPreparedStatement.setString(7, oUsuarioBean.getToken());
        oPreparedStatement.setBoolean(8, oUsuarioBean.getActivo());
        oPreparedStatement.setDate(9, new java.sql.Date(oUsuarioBean.getFecha_alta().getTime()));
        oPreparedStatement.setBoolean(10, oUsuarioBean.getValidado());
        oPreparedStatement.setInt(11, oUsuarioBean.getId_tipousuario());
        oPreparedStatement.setInt(12, oUsuarioBean.getId_grupo());
        oPreparedStatement.setInt(13, oUsuarioBean.getId_centro());
        oPreparedStatement.setInt(14, oUsuarioBean.getId_centrosanitario());

        return oPreparedStatement;
    }

    @Override
    public String getFieldUpdate() {
        return " dni=?,nombre=?,apellido1=?,apellido2=?,email=?,login=?,id_tipousuario=? ";
    }

    @Override
    public PreparedStatement setFieldUpdate(BeanInterface oBeanParam, PreparedStatement oPreparedStatement)
            throws Exception {
        UsuarioBean oUsuarioBean = (UsuarioBean) oBeanParam;
        oPreparedStatement.setString(1, oUsuarioBean.getNombre());
        oPreparedStatement.setString(2, oUsuarioBean.getPrimer_apellido());
        oPreparedStatement.setString(3, oUsuarioBean.getSegundo_apellido());
        oPreparedStatement.setString(4, oUsuarioBean.getLogin());
        oPreparedStatement.setString(5, oUsuarioBean.getPassword());
        oPreparedStatement.setString(6, oUsuarioBean.getEmail());
        oPreparedStatement.setString(7, oUsuarioBean.getToken());
        oPreparedStatement.setBoolean(8, oUsuarioBean.getActivo());
        oPreparedStatement.setDate(9, new java.sql.Date(oUsuarioBean.getFecha_alta().getTime()));
        oPreparedStatement.setBoolean(10, oUsuarioBean.getValidado());
        oPreparedStatement.setInt(11, oUsuarioBean.getId_tipousuario());
        oPreparedStatement.setInt(12, oUsuarioBean.getId_grupo());
        oPreparedStatement.setInt(13, oUsuarioBean.getId_centro());
        oPreparedStatement.setInt(14, oUsuarioBean.getId_centrosanitario());
        oPreparedStatement.setInt(15, oUsuarioBean.getId());
        return oPreparedStatement;
    }

    @Override
    public String getFieldLink() {
        
            return "link_factura";
        
    }

    @Override
    public String getFieldId(String filter) {
        if (filter.equalsIgnoreCase("tipo_usuario")) {
            return "id_tipousuario";
        } else if (filter.equalsIgnoreCase("grupo")) {
            return "id_grupo";
        } else if (filter.equalsIgnoreCase("centro")) {
            return "id_centro";
        } else {
            return "id_centrosanitario";
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
        return orden.matches("id|nombre|primer_apellido|segundo_apellido|login|password|email|token|activo|fecha_alta|validado") ? orden : null;
    }

}
