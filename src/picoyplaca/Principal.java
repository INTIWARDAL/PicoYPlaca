package picoyplaca;

import presenta.Consola;
import pruebas.FechaPrueba;
import pruebas.HoraPrueba;
import pruebas.PlacaPrueba;

/**
 *
 * @author COOP
 */
public class Principal {

    public static void main(String[] args) {
        System.out.println(" Información de pruebas \n * Stack Builders *" );
        System.out.println(" ====================== " );
        FechaPrueba testFecha = new FechaPrueba();
        HoraPrueba testHorario = new HoraPrueba();
        PlacaPrueba testPlaca = new PlacaPrueba();
        testFecha.prueba();
        testHorario.prueba();
        testPlaca.prueba();
        Consola programa = new Consola();
        programa.presentar();
        
    }
}
