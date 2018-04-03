package presenta;

//import javax.swing.JOptionPane;
import elementos.Carro;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


/** 
 * 
 * @author César Orlando Oleas Portalanza
 */

public class Consola {

    public void presentar() {
        String fecha = null, placa=null, hora=null  ;
        
        try { 
                BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));   
                System.out.println("\n Información a averiguar \n * Stack Builders *" );
                System.out.println(" ======================= " );
                System.out.print("Ingresar la fecha para averiguar el Pico y Placa "
                + "\nATENCIÓN: solo con el siguiente formato (dd/MM/yyyy): ");
                fecha = entrada.readLine();
                System.out.print("\nIngresar la placa del carro: ");
                placa = entrada.readLine();
                System.out.print("\nIngresar la hora de movilización "
                + "\nATENCIÓN: solo con el siguiente formato (HH:mm): ");
                hora = entrada.readLine();
                
        }catch (IOException e) {
          System.out.println( "Error de ingreso de información " );
        } 
    
        Carro identificarPyP = new Carro(placa, fecha, hora);
        identificarPyP.salida();

    }
}
