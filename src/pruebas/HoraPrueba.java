/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebas;


import elementos.Hora;

/**
 *
 * @author COOP
 */
public class HoraPrueba {
       Hora objHorario;
    
    public void prueba(){
        
        String hora = "15:20";
        objHorario = new Hora(hora);
        System.out.println(" Hora " + objHorario.getHora());
    }
}
