package modelo;

import java.util.ArrayList;

/**
 *
 * @author angel
 */
public class Usuario {

    private int id_usuario;
    private String nombre;
    private String apellido;
    private String cedula;
    private String dirreccion;
    private String n_telefono;
    private String email;
    private String password;
    private ArrayList<UsuarioRol> listaRolesUsuario;

    public Usuario() {
        listaRolesUsuario = new ArrayList<>();
    }

    public Usuario(int id_usuario, String nombre, String apellido, String cedula, String dirreccion, String n_telefono, String email, String password, ArrayList<UsuarioRol> listaRolesUsuario) {
        this.id_usuario = id_usuario;
        this.nombre = nombre;
        this.apellido = apellido;
        this.cedula = cedula;
        this.dirreccion = dirreccion;
        this.n_telefono = n_telefono;
        this.email = email;
        this.password = password;
        this.listaRolesUsuario = listaRolesUsuario;
    }

    public int getId_usuario() {
        return id_usuario;
    }

    public void setId_usuario(int id_usuario) {
        this.id_usuario = id_usuario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getDirreccion() {
        return dirreccion;
    }

    public void setDirreccion(String dirreccion) {
        this.dirreccion = dirreccion;
    }

    public String getN_telefono() {
        return n_telefono;
    }

    public void setN_telefono(String n_telefono) {
        this.n_telefono = n_telefono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public ArrayList<UsuarioRol> getListaRolesUsuario() {
        return listaRolesUsuario;
    }

    public void setListaRolesUsuario(ArrayList<UsuarioRol> listaRolesUsuario) {
        this.listaRolesUsuario = listaRolesUsuario;
    }
}
