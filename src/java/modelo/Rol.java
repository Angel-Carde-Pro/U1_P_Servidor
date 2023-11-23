package modelo;

import java.util.ArrayList;

/**
 *
 * @author angel
 */
public class Rol {

    private int id_rol;
    private String rol;
    private String decripcion;
    private ArrayList<UsuarioRol> listaUsuarioRol;

    public Rol() {
        listaUsuarioRol = new ArrayList<>();
    }

    public Rol(int id_rol, String rol, String decripcion) {
        this.id_rol = id_rol;
        this.rol = rol;
        this.decripcion = decripcion;
    }

    public int getId_rol() {
        return id_rol;
    }

    public void setId_rol(int id_rol) {
        this.id_rol = id_rol;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    public String getDecripcion() {
        return decripcion;
    }

    public void setDecripcion(String decripcion) {
        this.decripcion = decripcion;
    }

    public ArrayList<UsuarioRol> getListaUsuarioRol() {
        return listaUsuarioRol;
    }

    public void setListaUsuarioRol(ArrayList<UsuarioRol> listaUsuarioRol) {
        this.listaUsuarioRol = listaUsuarioRol;
    }
}