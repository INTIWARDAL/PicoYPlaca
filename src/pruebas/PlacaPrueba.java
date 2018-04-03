/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebas;

import elementos.Placa;
/**
 *
 * @author COOP
 */
public class PlacaPrueba {
       Placa objPlaca;
    
    public void prueba(){
        
        String placa = "KZFL9743";
        objPlaca = new Placa();
        objPlaca.setPlaca(placa);
        System.out.println(" Placa Ingresada: " + objPlaca.getPlaca() + "\n Ultimo número de placa: " + objPlaca.getDigito());
    }
}
