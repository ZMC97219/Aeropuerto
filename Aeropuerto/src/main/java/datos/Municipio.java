/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Record.java to edit this template
 */
package datos;



/**
 *
 * @author jrubioa
 */
public record Municipio(String codigo,String nombre ) {
    
    //Se realiza el siguiente metodo para que en el combo solo muestre el nombre del municipio
    public String toString() {
        return nombre;
    }
}
