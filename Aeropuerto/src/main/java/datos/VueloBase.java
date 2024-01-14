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
public class VueloBase {
    
    private String codigoVuelo;
    //forma1
    private String codigoIATAOrigen;
    private String codigoIATADestino;
    //forma2
    private Aeropuerto aeropuertoOrigen;
    private Aeropuerto aeropuertoDestino;
    
    private int numeroPlazas;
    private Date horaSalida;
    private Date horaLlegada;
    private String diasSemanaVuelo;

    //forma1
    public VueloBase(String codigoVuelo, String codigoIATAOrigen, String codigoIATADestino, int numeroPlazas, Date horaSalida, Date horaLlegada, String diasSemanaVuelo) {
        this.codigoVuelo = codigoVuelo;
        this.codigoIATAOrigen = codigoIATAOrigen;
        this.codigoIATADestino = codigoIATADestino;
        this.numeroPlazas = numeroPlazas;
        this.horaSalida = horaSalida;
        this.horaLlegada = horaLlegada;
        this.diasSemanaVuelo = diasSemanaVuelo;
    }

    //forma2
    public VueloBase(String codigoVuelo, Aeropuerto aeropuertoOrigen, Aeropuerto aeropuertoDestino, int numeroPlazas, Date horaSalida, Date horaLlegada, String diasSemanaVuelo) {
        this.codigoVuelo = codigoVuelo;
        this.aeropuertoOrigen = aeropuertoOrigen;
        this.aeropuertoDestino = aeropuertoDestino;
        this.numeroPlazas = numeroPlazas;
        this.horaSalida = horaSalida;
        this.horaLlegada = horaLlegada;
        this.diasSemanaVuelo = diasSemanaVuelo;
    }

    public String getCodigoVuelo() {
        return codigoVuelo;
    }

    public void setCodigoVuelo(String codigoVuelo) {
        this.codigoVuelo = codigoVuelo;
    }

    public String getCodigoIATAOrigen() {
        return codigoIATAOrigen;
    }

    public void setCodigoIATAOrigen(String codigoIATAOrigen) {
        this.codigoIATAOrigen = codigoIATAOrigen;
    }

    public String getCodigoIATADestino() {
        return codigoIATADestino;
    }

    public void setCodigoIATADestino(String codigoIATADestino) {
        this.codigoIATADestino = codigoIATADestino;
    }

    public Aeropuerto getAeropuertoOrigen() {
        return aeropuertoOrigen;
    }

    public void setAeropuertoOrigen(Aeropuerto aeropuertoOrigen) {
        this.aeropuertoOrigen = aeropuertoOrigen;
    }

    public Aeropuerto getAeropuertoDestino() {
        return aeropuertoDestino;
    }

    public void setAeropuertoDestino(Aeropuerto aeropuertoDestino) {
        this.aeropuertoDestino = aeropuertoDestino;
    }

    public int getNumeroPlazas() {
        return numeroPlazas;
    }

    public void setNumeroPlazas(int numeroPlazas) {
        this.numeroPlazas = numeroPlazas;
    }

    public Date getHoraSalida() {
        return horaSalida;
    }

    public void setHoraSalida(Date horaSalida) {
        this.horaSalida = horaSalida;
    }

    public Date getHoraLlegada() {
        return horaLlegada;
    }

    public void setHoraLlegada(Date horaLlegada) {
        this.horaLlegada = horaLlegada;
    }

    public String getDiasSemanaVuelo() {
        return diasSemanaVuelo;
    }

    public void setDiasSemanaVuelo(String diasSemanaVuelo) {
        this.diasSemanaVuelo = diasSemanaVuelo;
    }
    
    
}
