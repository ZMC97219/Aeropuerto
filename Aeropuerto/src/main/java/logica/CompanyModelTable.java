/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logica;

import java.util.List;
import javax.swing.table.AbstractTableModel;
import datos.Company;
import java.util.ArrayList;

/**
 *
 * @author usuario
 */
public class CompanyModelTable extends AbstractTableModel{
    
    private List<Company> listacompany;
    private ArrayList<String> columnNames; // nombre de las columnas
    private ArrayList<Class> columnClasses; // Clases de las columnas

    public CompanyModelTable(List<Company> listacompany) {
        this.listacompany = listacompany;
        columnNames = new ArrayList<>();
        columnNames.add("Prefijo");
        columnNames.add("Codigo");
        columnNames.add("Nombre");
        columnNames.add("Telefono de atencion");
        columnClasses = new ArrayList<>();
        columnClasses.add(Integer.class);
        columnClasses.add(String.class);
        columnClasses.add(String.class);
        columnClasses.add(String.class);
        
    }
    
    
    

    @Override
    public int getRowCount() {
        return listacompany.size();
    }

    @Override
    public int getColumnCount() {
        return this.columnNames.size();
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Company comp = this.listacompany.get(rowIndex);
        switch (columnIndex) {
            case 0: 
                return comp.getPrefijo();
            case 1: 
                return comp.getCodigo();
            case 2: 
                return comp.getNombre();
            case 3: 
                return comp.getTelefonoPasajero();
            default:
                return "";
        }
         
    }
    
    @Override
    public Class getColumnClass(int col) {
        return this.columnClasses.get(col);
    }
    @Override
    public String getColumnName(int col) {
        return this.columnNames.get(col);
    }
}
