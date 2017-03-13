/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.edu.upeu.utils;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author Josmarl
 */
public class FechaSistema {

    public String anioEnNumeros(Date date) {

        if (date == null) {

            return null;

        } else {

            String formato = "yyyy";
            SimpleDateFormat dateFormat = new SimpleDateFormat(formato);
            int anio = Integer.parseInt(dateFormat.format(date));
            return Integer.toString(anio);

        }

    }

    public Date fecha() {
        java.util.Date dates = new java.util.Date();
        long fechaSis = dates.getTime();
        java.sql.Date d = new java.sql.Date(fechaSis);
        return d;
    }

    public String diaEnLetras() {

        String vectorDay[] = {
            "Domingo",
            "Lunes",
            "Martes",
            "Miercoles",
            "Jueves",
            "Viernes",
            "Sabado",
            "Domingo"
        };
        return vectorDay[fecha().getDay()];
    }

    public String mesEnLetras() {

        String vectorMonth[] = {
            "Enero",
            "Febrero",
            "Marzo",
            "Abril",
            "Mayo",
            "Junio",
            "Julio",
            "Agosto",
            "Septiembre",
            "Octubre",
            "Noviembre",
            "Diciembre"
        };
        return vectorMonth[fecha().getMonth()];
    }

    public String diaEnNumeros() {
        int dia = fecha().getDate();
        return Integer.toString(dia);
    }

    public String fechaFormat(Date fecha) {
        DateFormat df = DateFormat.getDateInstance();
        String s = df.format(fecha);
        return s;
    }

    public static void main(String[] args) {
        
        FechaSistema fs = new FechaSistema();
        System.out.println(fs.fechaFormat(fs.fecha()));
    }

    public FechaSistema fs() {
        return new FechaSistema();
    }
}
