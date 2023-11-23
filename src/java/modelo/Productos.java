package modelo;

/**
 *
 * @author angel
 */
public class Productos {
    private String nombre;
    private String descripcion;
    private String categoria;
    private Double precio;
    private byte[] imagenen;
    private String a_Adicionales;

    public Productos(String nombre, String descripcion, String categoria, Double precio, byte[] imagenen, String a_Adicionales) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.categoria = categoria;
        this.precio = precio;
        this.imagenen = imagenen;
        this.a_Adicionales = a_Adicionales;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public byte[] getImagenen() {
        return imagenen;
    }

    public void setImagenen(byte[] imagenen) {
        this.imagenen = imagenen;
    }

    public String getA_Adicionales() {
        return a_Adicionales;
    }

    public void setA_Adicionales(String a_Adicionales) {
        this.a_Adicionales = a_Adicionales;
    }
}
