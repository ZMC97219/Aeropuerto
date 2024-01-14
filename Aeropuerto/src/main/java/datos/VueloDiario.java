/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package datos;

import java.util.Date;

/**
 *
 * @author jrubioa
 */
public class VueloDiario {
    
    //A lahora de instanciar, codigoVueloBase y VueloBase no pueden estar a la vez
    private String codigoVueloBase;
    private VueloBase VueloBase; // Para que el VueloDiario se relacione con el VueloBase
    
    private Date fechaVuelo;
    private Date horaSalidaReal;
    private Date horaLegadaReal;
    private int numeroPlazas;
    private float precio;
    
    // Se crea el contructor sin el VueloBase

    public VueloDiario(String codigoVueloBase, Date fechaVuelo, Date horaSalidaReal, Date horaLegadaReal, int numeroPlazas, float precio) {
        this.codigoVueloBase = codigoVueloBase;
        this.fechaVuelo = fechaVuelo;
        this.horaSalidaReal = horaSalidaReal;
        this.horaLegadaReal = horaLegadaReal;
        this.numeroPlazas = numeroPlazas;
        this.precio = precio;
    }
    
    // Se crea el contructor con el VueloBase sin el codigoVueloBase

    public VueloDiario(VueloBase VueloBase, Date fechaVuelo, Date horaSalidaReal, Date horaLegadaReal, int numeroPlazas, float precio) {
        this.VueloBase = VueloBase;
        this.fechaVuelo = fechaVuelo;
        this.horaSalidaReal = horaSalidaReal;
        this.horaLegadaReal = horaLegadaReal;
        this.numeroPlazas = numeroPlazas;
        this.precio = precio;
    }

    public String getCodigoVueloBase() {
        return codigoVueloBase;
    }

    public void setCodigoVueloBase(String codigoVueloBase) {
        this.codigoVueloBase = codigoVueloBase;
    }

    public VueloBase getVueloBase() {
        return VueloBase;
    }

    public void setVueloBase(VueloBase VueloBase) {
        this.VueloBase = VueloBase;
    }

    public Date getFechaVuelo() {
        return fechaVuelo;
    }

    public void setFechaVuelo(Date fechaVuelo) {
        this.fechaVuelo = fechaVuelo;
    }

    public Date getHoraSalidaReal() {
        return horaSalidaReal;
    }

    public void setHoraSalidaReal(Date horaSalidaReal) {
        this.horaSalidaReal = horaSalidaReal;
    }

    public Date getHoraLegadaReal() {
        return horaLegadaReal;
    }

    public void setHoraLegadaReal(Date horaLegadaReal) {
        this.horaLegadaReal = horaLegadaReal;
    }

    public int getNumeroPlazas() {
        return numeroPlazas;
    }

    public void setNumeroPlazas(int numeroPlazas) {
        this.numeroPlazas = numeroPlazas;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }
    
    
    
}
