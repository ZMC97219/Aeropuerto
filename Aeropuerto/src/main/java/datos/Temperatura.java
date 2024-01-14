/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package datos;

/**
 *
 * @author jrubioa
 */
public class Temperatura {
    
    private String codMunicipio;
    private int tempMinima;
    private int tempMaxima;
    
     //Contructor por defecto
    public Temperatura() {
    }

    public Temperatura(String codMunicipio, int tempMinima, int tempMaxima) {
        this.codMunicipio = codMunicipio;
        this.tempMinima = tempMinima;
        this.tempMaxima = tempMaxima;
    }

    public String getCodMunicipio() {
        return codMunicipio;
    }

    public void setCodMunicipio(String codMunicipio) {
        this.codMunicipio = codMunicipio;
    }

    public int getTempMinima() {
        return tempMinima;
    }

    public void setTempMinima(int tempMinima) {
        this.tempMinima = tempMinima;
    }

    public int getTempMaxima() {
        return tempMaxima;
    }

    public void setTempMaxima(int tempMaxima) {
        this.tempMaxima = tempMaxima;
    }
    

    
}
