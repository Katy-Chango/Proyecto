/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ec.edu.ister.modelo;

/**
 *
 * @author hp
 */
public class Cliente {
    private String id;
    private String nombre;
    private String apellido;
    private String genero;
    private boolean isLicense;

    public Cliente() {
    }
    
   

    public Cliente(String id, String nombre, String apellido, String genero, boolean isLicense) {
        super();
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.genero = genero;
        this.isLicense = isLicense;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public boolean getIsLicense() {
        return isLicense;
    }

    public void setIsLicense(boolean isLicense) {
        this.isLicense = isLicense;
    }
    

    @Override
    public String toString() {
        return "Cliente{" + "id=" + id + ", nombre=" + nombre + ", apellido=" + apellido + ", genero=" + genero + ", isLicense=" + isLicense + '}';
    }

}
