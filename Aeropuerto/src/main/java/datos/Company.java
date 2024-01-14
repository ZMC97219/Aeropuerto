/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package datos;

/**
 * Gestiona los datos basicos de una compañia, con el fin de almacenarlos
 * @author jrubioa
 */
public class Company {
    
    private int prefijo;
    private String codigo;
    private String nombre;
    private String direccion;
    private String codigoMunicipio;
    private String telefonoPasajero;
    private String telefonoAeropuerto;

    // contructor por defecto
    public Company(){
         
     }
     
    public Company(int prefijo, String codigo, String nombre, String direccion, String codigoMunicipio, String telefonoPasajero, String telefonoAeropuerto) {
        this.prefijo = prefijo;
        this.codigo = codigo;
        this.nombre = nombre;
        this.direccion = direccion;
        this.codigoMunicipio = codigoMunicipio;
        this.telefonoPasajero = telefonoPasajero;
        this.telefonoAeropuerto = telefonoAeropuerto;
    }

    /**
     * Obtiene el profijo de la compañia
     * @return Numero entero que tiene el prefijo de una compañia
     */
    public int getPrefijo() {
        return prefijo;
    }

    public void setPrefijo(int prefijo) {
        this.prefijo = prefijo;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getcodigoMunicipio() {
        return codigoMunicipio;
    }

    public void setcodigoMunicipio(String codigoMunicipio) {
        this.codigoMunicipio = codigoMunicipio;
    }

    public String getTelefonoPasajero() {
        return telefonoPasajero;
    }

    public void setTelefonoPasajero(String telefonoPasajero) {
        this.telefonoPasajero = telefonoPasajero;
    }

    public String getTelefonoAeropuerto() {
        return telefonoAeropuerto;
    }

    public void setTelefonoAeropuerto(String telefonoAeropuerto) {
        this.telefonoAeropuerto = telefonoAeropuerto;
    }
    
    
}
