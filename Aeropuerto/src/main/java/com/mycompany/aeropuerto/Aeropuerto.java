/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.aeropuerto;

import com.opencsv.bean.CsvToBeanBuilder;
import com.opencsv.bean.StatefulBeanToCsv;
import com.opencsv.bean.StatefulBeanToCsvBuilder;
import com.opencsv.exceptions.CsvDataTypeMismatchException;
import com.opencsv.exceptions.CsvRequiredFieldEmptyException;
import datos.Company;
import interfaz.FrmPrincipal;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.List;
import logica.LogicaNegocio;

/**
 *
 * @author jrubioa
 */
public class Aeropuerto {

    public static void main(String[] args) throws FileNotFoundException, IOException, CsvDataTypeMismatchException, CsvRequiredFieldEmptyException  {
        LogicaNegocio.initializesystem();
        
        FrmPrincipal.main(args);
        
        
        /*List<Company> lstCompanyFromFile = new CsvToBeanBuilder(new FileReader("src/main/resources/company.csv"))
                .withType(Company.class).build().parse();
        
        
        lstCompanyFromFile.forEach(c -> LogicaNegocio.addCompany(c));
        
        
        // ESTOS DATOS SE TIENEN QUE METER CON LA INTERFACE
        //LogicaNegocio.addCompany(new Company(1, "AA", "American Airlines", "Desconocida", "00000", "Desconocida", "Desconocida"));
        //LogicaNegocio.addCompany(new Company(5, "CO", "Continental Airlines, Inc.", "Desconocida", "00000", "Desconocida", "Desconocida"));
        //LogicaNegocio.addCompany(new Company(6, "DL", "Delta Airlines Inc.", "Desconocida", "00000", "Desconocida", "Desconocida"));
        //LogicaNegocio.addCompany(new Company(7, "N7", "National Airlines Inc.", "Desconocida", "00000", "Desconocida", "Desconocida"));
        //LogicaNegocio.addCompany(new Company(12, "NW", "Northwest Airlines Inc.", "Desconocida", "00000", "Desconocida", "Desconocida"));
    
        //LogicaNegocio.deleteCompany(6);
        
        //ACTUALIZACION
        //Company comp = LogicaNegocio.getCompanyByPrefijo(5);
        //comp.setDireccion("Chicago");
        
        //List<Company> l = LogicaNegocio.getAllCompany();
        
        Writer writer = new FileWriter("src/main/resources/company.csv");
        StatefulBeanToCsv beanToCsv = new StatefulBeanToCsvBuilder(writer).build();
        beanToCsv.write(LogicaNegocio.getAllCompany());
        writer.close();*/
        
    }

}


