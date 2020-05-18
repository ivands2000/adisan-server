package net.adisan.bean;

import com.google.gson.annotations.Expose;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Date;
import java.util.List;

public class MedicoBean implements BeanInterface {

    @Expose
    private Integer id;
    @Expose(serialize = false)
    private Integer id_servicio;
    @Expose(serialize = false)
    private Integer id_especialidad;
    @Expose
    private String dni;
    @Expose
    private String nombre;
    @Expose
    private String primer_apellido;
    @Expose
    private String segundo_apellido;
    @Expose
    private Date fecha_nacimiento;
    @Expose
    private String num_colegiado;
    @Expose
    private String email;
    @Expose(serialize = false)
    private Integer id_categoriaprofesional;
    @Expose
    private Integer id_centrosanitario;  
    @Expose(deserialize = false)
    private ServicioBean id_servicio_obj;
    @Expose(deserialize = false)
    private EspecialidadBean id_especialidad_obj;
    @Expose(deserialize = false)
    private CategoriaProfesionalBean id_categoriaprofesional_obj;
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

    public Integer getId_servicio() {
        return id_servicio;
    }

    public void setId_servicio(Integer id_servicio) {
        this.id_servicio = id_servicio;
    }

    public Integer getId_especialidad() {
        return id_especialidad;
    }

    public void setId_especialidad(Integer id_especialidad) {
        this.id_especialidad = id_especialidad;
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

    public Date getFecha_nacimiento() {
        return fecha_nacimiento;
    }

    public void setFecha_nacimiento(Date fecha_nacimiento) {
        this.fecha_nacimiento = fecha_nacimiento;
    }

    public String getNum_colegiado() {
        return num_colegiado;
    }

    public void setNum_colegiado(String num_colegiado) {
        this.num_colegiado = num_colegiado;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getId_categoriaprofesional() {
        return id_categoriaprofesional;
    }

    public void setId_categoriaprofesional(Integer id_categoriaprofesional) {
        this.id_categoriaprofesional = id_categoriaprofesional;
    }

    public Integer getId_centrosanitario() {
        return id_centrosanitario;
    }

    public void setId_centrosanitario(Integer id_centrosanitario) {
        this.id_centrosanitario = id_centrosanitario;
    }

    public ServicioBean getId_servicio_obj() {
        return id_servicio_obj;
    }

    public void setId_servicio_obj(ServicioBean id_servicio_obj) {
        this.id_servicio_obj = id_servicio_obj;
    }

    public EspecialidadBean getId_especialidad_obj() {
        return id_especialidad_obj;
    }

    public void setId_especialidad_obj(EspecialidadBean id_especialidad_obj) {
        this.id_especialidad_obj = id_especialidad_obj;
    }

    public CategoriaProfesionalBean getId_categoriaprofesional_obj() {
        return id_categoriaprofesional_obj;
    }

    public void setId_categoriaprofesional_obj(CategoriaProfesionalBean id_categoriaprofesional_obj) {
        this.id_categoriaprofesional_obj = id_categoriaprofesional_obj;
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
            } else if (orden.get((i - 1)).equalsIgnoreCase("id_servicio_obj")) {
                oPreparedStatement.setInt(i, 2);
            } else if (orden.get((i - 1)).equalsIgnoreCase("id_especialidad_obj")) {
                oPreparedStatement.setInt(i, 3);
            } else if (orden.get((i - 1)).equalsIgnoreCase("dni")) {
                oPreparedStatement.setInt(i, 4);
            } else if (orden.get((i - 1)).equalsIgnoreCase("nombre")) {
                oPreparedStatement.setInt(i, 5);
            } else if (orden.get((i - 1)).equalsIgnoreCase("primer_apellido")) {
                oPreparedStatement.setInt(i, 6);
            } else if (orden.get((i - 1)).equalsIgnoreCase("segundo_apellido")) {
                oPreparedStatement.setInt(i, 7);
            } else if (orden.get((i - 1)).equalsIgnoreCase("fecha_nacimiento")) {
                oPreparedStatement.setInt(i, 8);
            } else if (orden.get((i - 1)).equalsIgnoreCase("num_colegiado")) {
                oPreparedStatement.setInt(i, 9);
            } else if (orden.get((i - 1)).equalsIgnoreCase("email")) {
                oPreparedStatement.setInt(i, 10);
            } else if (orden.get((i - 1)).equalsIgnoreCase("id_categoriaprofesional_obj")) {
                oPreparedStatement.setInt(i, 11);
            } else if (orden.get((i - 1)).equalsIgnoreCase("id_centrosanitario_obj")) {
                oPreparedStatement.setInt(i, 12);
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
        return orden.matches("id|id_servicio|id_especialidad|dni|nombre|primer_apellido|segundo_apellido|fecha_nacimiento|num_colegiado|email|id_categoriaprofesional|id_centrosanitario") ? orden : null;
    }

    @Override
    public MedicoBean fill(ResultSet oResultSet, Connection oConnection,
            int spread, UsuarioBean oUsuarioBeanSession) throws Exception {
        this.setId(oResultSet.getInt("id"));
        this.setId_servicio(oResultSet.getInt("id_servicio"));
        this.setId_especialidad(oResultSet.getInt("id_especialidad"));
        this.setDni(oResultSet.getString("dni"));
        this.setNombre(oResultSet.getString("nombre"));
        this.setPrimer_apellido(oResultSet.getString("primer_apellido"));
        this.setSegundo_apellido(oResultSet.getString("segundo_apellido"));
        this.setFecha_nacimiento(oResultSet.getDate("fecha_nacimiento"));
        this.setNum_colegiado(oResultSet.getString("num_colegiado"));
        this.setEmail(oResultSet.getString("email"));
        this.setId_categoriaprofesional(oResultSet.getInt("id_categoriaprofesional"));
        this.setId_centrosanitario(oResultSet.getInt("id_centrosanitario"));
      
        /* if (oUsuarioBeanSession != null) {
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
