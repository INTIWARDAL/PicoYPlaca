package pruebas;

import elementos.Fecha;

/**
 *
 * @author COOP
 */
public class FechaPrueba {
    
    Fecha objFecha;
    
    public void prueba(){        
        String fecha = "31/12/2018";
        objFecha = new Fecha(fecha);
        objFecha.setFecha(objFecha.getFecha());
        System.out.println(" Fecha " + objFecha.getFecha() + "\n Día: " + objFecha.getDia());
    }
}
