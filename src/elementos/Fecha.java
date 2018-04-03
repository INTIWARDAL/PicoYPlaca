package elementos;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 *
 * @author COOP
 */
public class Fecha {

    private String fecha;
    private String dia;
    private SimpleDateFormat fechaForma;

    public Fecha(String fecha) {
        this.fecha = fecha;
    }

    public Fecha() {
        this.fecha = fecha;
        this.dia = dia;
    }

    /**
     * @return the fecha
     */
    public String getFecha() {
        return fecha;
    }

    /**
     * @param fecha the fecha to set
     */
    public void setFecha(String fecha) {
        this.fecha = fecha;
        // depende el formato configurado de la máquina si hay error cambiarlo según las propiedades de lo configurado en la máquina Ej: dd-mm-yyyy 
        fechaForma = new SimpleDateFormat("dd/MM/yyyy"); 
        Date fechaActual = null;
        try {
            fechaActual = fechaForma.parse(fecha);
        } catch (ParseException e) {
            System.err.println("Error en el ingreso de la fecha o en su transformación ");
            e.printStackTrace();
        }
        GregorianCalendar fechaCalendario = new GregorianCalendar();
        fechaCalendario.setTime(fechaActual);
        int dia = fechaCalendario.get(Calendar.DAY_OF_WEEK);

        switch (dia) {
            case 1:
                setDia("Domingo");
                break;
            case 2:
                setDia("Lunes");
                break;
            case 3:
                setDia("Martes");
                break;
            case 4:
                setDia("Miércoles");
                break;
            case 5:
                setDia("Jueves");
                break;
            case 6:
                setDia("Viernes");
                break;
            case 7:
                setDia("Sábado");
                break;
            default:
                break;
        } 
    }

    /**
     * @return the dia
     */
    public String getDia() {
        return dia;
    }

    /**
     * @param dia the dia to set
     */
    public void setDia(String dia) {
        this.dia = dia;
    }
}
