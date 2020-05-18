package net.adisan.bean;

import com.google.gson.annotations.Expose;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Date;
import java.util.List;
import net.adisan.dao.daointerface.DaoInterface;
import net.adisan.factory.DaoFactory;

public class PacienteBean implements BeanInterface {

    @Expose
    private Integer id;
    @Expose
    private String dni;
    @Expose
    private String nombre;
    @Expose
    private String primer_apellido;
    @Expose
    private String segundo_apellido;
    @Expose
    private String direccion;
    @Expose
    private String ciudad;
    @Expose
    private String codigo_postal;
    @Expose
    private String provincia;
    @Expose
    private String pais;
    @Expose
    private String email;
    @Expose
    private String telefono1;
    @Expose
    private String telefono2;
    @Expose
    private String nombre_padre;
    @Expose
    private String nombre_madre;
    @Expose
    private Date fecha_nacimiento;
    @Expose
    private String ciudad_nacimiento;
    @Expose
    private String pais_nacimiento;
    @Expose
    private String sip_aseguradora;
    @Expose(serialize = false)
    private Integer id_tipopago;
    @Expose(serialize = false)
    private Integer id_sexo;
    @Expose(serialize = false)
    private Integer id_usuario;
    @Expose(deserialize = false)
    private TipoPagoBean id_tipopago_obj;
    @Expose(deserialize = false)
    private SexoBean id_sexo_obj;
    @Expose(deserialize = false)
    private UsuarioBean id_usuario_obj;
    @Expose(deserialize = false)
    private Integer link_episodio;
    @Expose
    private Boolean canCreate;
    @Expose
    private Boolean canUpdate;
    @Expose
    private Boolean canDelete;

    public Integer getLink_episodio() {
        return link_episodio;
    }

    public void setLink_episodio(Integer link_episodio) {
        this.link_episodio = link_episodio;
    }

    public TipoPagoBean getId_tipopago_obj() {
        return id_tipopago_obj;
    }

    public void setId_tipopago_obj(TipoPagoBean id_tipopago_obj) {
        this.id_tipopago_obj = id_tipopago_obj;
    }

    public SexoBean getId_sexo_obj() {
        return id_sexo_obj;
    }

    public void setId_sexo_obj(SexoBean id_sexo_obj) {
        this.id_sexo_obj = id_sexo_obj;
    }

    public UsuarioBean getId_usuario_obj() {
        return id_usuario_obj;
    }

    public void setId_usuario_obj(UsuarioBean id_usuario_obj) {
        this.id_usuario_obj = id_usuario_obj;
    }

    @Override
    public Integer getId() {
        return id;
    }

    @Override
    public void setId(Integer id) {
        this.id = id;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
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

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getCodigo_postal() {
        return codigo_postal;
    }

    public void setCodigo_postal(String codigo_postal) {
        this.codigo_postal = codigo_postal;
    }

    public String getProvincia() {
        return provincia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefono1() {
        return telefono1;
    }

    public void setTelefono1(String telefono1) {
        this.telefono1 = telefono1;
    }

    public String getTelefono2() {
        return telefono2;
    }

    public void setTelefono2(String telefono2) {
        this.telefono2 = telefono2;
    }

    public String getNombre_padre() {
        return nombre_padre;
    }

    public void setNombre_padre(String nombre_padre) {
        this.nombre_padre = nombre_padre;
    }

    public String getNombre_madre() {
        return nombre_madre;
    }

    public void setNombre_madre(String nombre_madre) {
        this.nombre_madre = nombre_madre;
    }

    public Date getFecha_nacimiento() {
        return fecha_nacimiento;
    }

    public void setFecha_nacimiento(Date fecha_nacimiento) {
        this.fecha_nacimiento = fecha_nacimiento;
    }

    public String getCiudad_nacimiento() {
        return ciudad_nacimiento;
    }

    public void setCiudad_nacimiento(String ciudad_nacimiento) {
        this.ciudad_nacimiento = ciudad_nacimiento;
    }

    public String getPais_nacimiento() {
        return pais_nacimiento;
    }

    public void setPais_nacimiento(String pais_nacimiento) {
        this.pais_nacimiento = pais_nacimiento;
    }

    public String getSip_aseguradora() {
        return sip_aseguradora;
    }

    public void setSip_aseguradora(String sip_aseguradora) {
        this.sip_aseguradora = sip_aseguradora;
    }

    public Integer getId_tipopago() {
        return id_tipopago;
    }

    public void setId_tipopago(Integer id_tipopago) {
        this.id_tipopago = id_tipopago;
    }

    public Integer getId_sexo() {
        return id_sexo;
    }

    public void setId_sexo(Integer id_sexo) {
        this.id_sexo = id_sexo;
    }

    public Integer getId_usuario() {
        return id_usuario;
    }

    public void setId_usuario(Integer id_usuario) {
        this.id_usuario = id_usuario;
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
            } else if (orden.get((i - 1)).equalsIgnoreCase("dni")) {
                oPreparedStatement.setInt(i, 2);
            } else if (orden.get((i - 1)).equalsIgnoreCase("nombre")) {
                oPreparedStatement.setInt(i, 3);
            } else if (orden.get((i - 1)).equalsIgnoreCase("primer_apellido")) {
                oPreparedStatement.setInt(i, 4);
            } else if (orden.get((i - 1)).equalsIgnoreCase("segundo_apellido")) {
                oPreparedStatement.setInt(i, 5);
            } else if (orden.get((i - 1)).equalsIgnoreCase("direccion")) {
                oPreparedStatement.setInt(i, 6);
            } else if (orden.get((i - 1)).equalsIgnoreCase("ciudad")) {
                oPreparedStatement.setInt(i, 7);
            } else if (orden.get((i - 1)).equalsIgnoreCase("codigo_postal")) {
                oPreparedStatement.setInt(i, 8);
            }
            else if (orden.get((i - 1)).equalsIgnoreCase("provincia")) {
                oPreparedStatement.setInt(i, 9);
            }
            else if (orden.get((i - 1)).equalsIgnoreCase("pais")) {
                oPreparedStatement.setInt(i, 10);
            }
            else if (orden.get((i - 1)).equalsIgnoreCase("email")) {
                oPreparedStatement.setInt(i, 11);
            }
            else if (orden.get((i - 1)).equalsIgnoreCase("telefono1")) {
                oPreparedStatement.setInt(i, 12);
            }
            else if (orden.get((i - 1)).equalsIgnoreCase("telefono2")) {
                oPreparedStatement.setInt(i, 13);
            }
            else if (orden.get((i - 1)).equalsIgnoreCase("nombre_padre")) {
                oPreparedStatement.setInt(i, 14);
            }
            else if (orden.get((i - 1)).equalsIgnoreCase("nombre_madre")) {
                oPreparedStatement.setInt(i, 15);
            }
            else if (orden.get((i - 1)).equalsIgnoreCase("fecha_nacimiento")) {
                oPreparedStatement.setInt(i, 16);
            }
            else if (orden.get((i - 1)).equalsIgnoreCase("ciudad_nacimiento")) {
                oPreparedStatement.setInt(i, 17);
            }
            else if (orden.get((i - 1)).equalsIgnoreCase("pais_nacimiento")) {
                oPreparedStatement.setInt(i, 18);
            }
            else if (orden.get((i - 1)).equalsIgnoreCase("sip_aseguradora")) {
                oPreparedStatement.setInt(i, 19);
            }
            else if (orden.get((i - 1)).equalsIgnoreCase("id_tipopago_obj")) {
                oPreparedStatement.setInt(i, 20);
            }
            else if (orden.get((i - 1)).equalsIgnoreCase("id_sexo_obj")) {
                oPreparedStatement.setInt(i, 21);
            }
            else if (orden.get((i - 1)).equalsIgnoreCase("id_usuario_obj")) {
                oPreparedStatement.setInt(i, 22);
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
            oPreparedStatement.setString(++numparam, "%"+word+"%");
        }
        oPreparedStatement.setInt(++numparam, rpp);
        oPreparedStatement.setInt(++numparam, offset);
        return oPreparedStatement;
    }

    @Override
    public PreparedStatement setFieldInsert(BeanInterface oBeanParam, PreparedStatement oPreparedStatement)
            throws Exception {
        PacienteBean oUsuarioBean = (PacienteBean) oBeanParam;
        oPreparedStatement.setString(1, oUsuarioBean.getDni());
        oPreparedStatement.setString(2, oUsuarioBean.getNombre());
        oPreparedStatement.setString(3, oUsuarioBean.getPrimer_apellido());
        oPreparedStatement.setString(4, oUsuarioBean.getSegundo_apellido());
        oPreparedStatement.setString(5, oUsuarioBean.getDireccion());
        oPreparedStatement.setString(6, oUsuarioBean.getCiudad());
        oPreparedStatement.setString(7, oUsuarioBean.getCodigo_postal());
        oPreparedStatement.setString(8, oUsuarioBean.getProvincia());
        oPreparedStatement.setString(9, oUsuarioBean.getPais());
        oPreparedStatement.setString(10, oUsuarioBean.getEmail());
        oPreparedStatement.setString(11, oUsuarioBean.getTelefono1());
        oPreparedStatement.setString(12, oUsuarioBean.getTelefono2());
        oPreparedStatement.setString(13, oUsuarioBean.getNombre_padre());
        oPreparedStatement.setString(14, oUsuarioBean.getNombre_madre());
        oPreparedStatement.setDate(15, new java.sql.Date(oUsuarioBean.getFecha_nacimiento().getTime()));
        oPreparedStatement.setString(16, oUsuarioBean.getCiudad_nacimiento());
        oPreparedStatement.setString(17, oUsuarioBean.getPais_nacimiento());
        oPreparedStatement.setString(18, oUsuarioBean.getSip_aseguradora());
        oPreparedStatement.setInt(19, oUsuarioBean.getId_tipopago());
        oPreparedStatement.setInt(20, oUsuarioBean.getId_sexo());
        oPreparedStatement.setInt(21, oUsuarioBean.getId_usuario());
        return oPreparedStatement;
    }

    @Override
    public String getFieldUpdate() {
        return " dni=?,nombre=?,apellido1=?,apellido2=?,email=?,login=?,id_tipousuario=? ";
    }

    @Override
    public PreparedStatement setFieldUpdate(BeanInterface oBeanParam, PreparedStatement oPreparedStatement)
            throws Exception {
        PacienteBean oUsuarioBean = (PacienteBean) oBeanParam;
        oPreparedStatement.setString(1, oUsuarioBean.getDni());
        oPreparedStatement.setString(2, oUsuarioBean.getNombre());
        oPreparedStatement.setString(3, oUsuarioBean.getPrimer_apellido());
        oPreparedStatement.setString(4, oUsuarioBean.getSegundo_apellido());
        oPreparedStatement.setString(5, oUsuarioBean.getDireccion());
        oPreparedStatement.setString(6, oUsuarioBean.getCiudad());
        oPreparedStatement.setString(7, oUsuarioBean.getCodigo_postal());
        oPreparedStatement.setString(8, oUsuarioBean.getProvincia());
        oPreparedStatement.setString(9, oUsuarioBean.getPais());
        oPreparedStatement.setString(10, oUsuarioBean.getEmail());
        oPreparedStatement.setString(11, oUsuarioBean.getTelefono1());
        oPreparedStatement.setString(12, oUsuarioBean.getTelefono2());
        oPreparedStatement.setString(13, oUsuarioBean.getNombre_padre());
        oPreparedStatement.setString(14, oUsuarioBean.getNombre_madre());
        oPreparedStatement.setDate(15, new java.sql.Date(oUsuarioBean.getFecha_nacimiento().getTime()));
        oPreparedStatement.setString(16, oUsuarioBean.getCiudad_nacimiento());
        oPreparedStatement.setString(17, oUsuarioBean.getPais_nacimiento());
        oPreparedStatement.setString(18, oUsuarioBean.getSip_aseguradora());
        oPreparedStatement.setInt(19, oUsuarioBean.getId_tipopago());
        oPreparedStatement.setInt(20, oUsuarioBean.getId_sexo());
        oPreparedStatement.setInt(21, oUsuarioBean.getId_usuario());
        return oPreparedStatement;
    }

    @Override
    public String getFieldLink() {
        return "link_episodio";
    }

    @Override
    public String getFieldId(String filter) {
        if (filter.equalsIgnoreCase("tipopago")) {
            return "id_tipopago";
        } else if (filter.equalsIgnoreCase("sexo")) {
            return "id_sexo";
        } else {
            return "id_usuario";
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
        return orden.matches("id|dni|nombre|apellido1|login|email") ? orden : null;
    }

    @Override
    public PacienteBean fill(ResultSet oResultSet, Connection oConnection,
            int spread, UsuarioBean oUsuarioBeanSession) throws Exception {
        this.setId(oResultSet.getInt("id"));
        this.setDni(oResultSet.getString("dni"));
        this.setNombre(oResultSet.getString("nombre"));
        this.setPrimer_apellido(oResultSet.getString("primer_apellido"));
        this.setSegundo_apellido(oResultSet.getString("segundo_apellido"));
        this.setDireccion(oResultSet.getString("direccion"));
        this.setCiudad(oResultSet.getString("ciudad"));
        this.setCodigo_postal(oResultSet.getString("codigo_postal"));
        this.setProvincia(oResultSet.getString("provincia"));
        this.setPais(oResultSet.getString("pais"));
        this.setEmail(oResultSet.getString("email"));
        this.setTelefono1(oResultSet.getString("telefono1"));
        this.setTelefono2(oResultSet.getString("telefono2"));
        this.setNombre_padre(oResultSet.getString("nombre_padre"));
        this.setNombre_madre(oResultSet.getString("nombre_madre"));
        this.setFecha_nacimiento(oResultSet.getDate("fecha_nacimiento"));
        this.setCiudad_nacimiento(oResultSet.getString("ciudad_nacimiento"));
        this.setPais_nacimiento(oResultSet.getString("pais_nacimiento"));

        this.setSip_aseguradora(oResultSet.getString("sip_aseguradora"));
        this.setId_tipopago(oResultSet.getInt("id_tipopago"));

        this.setId_sexo(oResultSet.getInt("id_sexo"));
        this.setId_usuario(oResultSet.getInt("id_usuario"));

        if (oUsuarioBeanSession != null) {
            DaoInterface oEpisodioDao = DaoFactory.getDao(oConnection, "episodio", oUsuarioBeanSession);
                this.setLink_episodio(oEpisodioDao.getCount(id, "paciente"));

            if (this.getLink_episodio() > 0) {
                this.setCanDelete(false);
            } else {
                this.setCanDelete(true);
            }

            if (spread > 0) {
                spread--;
                DaoInterface oTipoPagoDao = DaoFactory.getDao(oConnection, "tipopago", oUsuarioBeanSession);
                TipoPagoBean oTipoPagoBean;
                oTipoPagoBean = (TipoPagoBean) oTipoPagoDao.get(this.id_tipopago);
                this.id_tipopago_obj = oTipoPagoBean;

                DaoInterface oSexoDao = DaoFactory.getDao(oConnection, "sexo", oUsuarioBeanSession);
                SexoBean oSexoBean;
                oSexoBean = (SexoBean) oSexoDao.get(this.id_sexo);
                this.id_sexo_obj = oSexoBean;
                
                DaoInterface oUsuarioDao = DaoFactory.getDao(oConnection, "usuario", oUsuarioBeanSession);
                UsuarioBean oUsusarioBean;
                oUsusarioBean = (UsuarioBean) oUsuarioDao.get(this.id_usuario);
                this.id_usuario_obj = oUsusarioBean;
            }
        }
        return this;

    }


    

    
}