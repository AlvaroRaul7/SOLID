/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Principal_bien;

import Postres_bien.*;
import Procesos_bien.*;
import Otros_bien.*;
/**
 *
 * @author djurado
 */
public class Sistema {
    public static void main(String [ ] args){
        // Producir un helado de vainilla y una torta de chocolate, 
        // a ambos agregarles CREMA y FRUTILLAS
        
        // Producir Helado
        Helados helado_vainilla = new Helados("Vainilla");
        OperacionesAderezo.anadirAderezo(helado_vainilla, new Crema());
        OperacionesAderezo.anadirAderezo(helado_vainilla, new Frutilla());
        System.out.println(helado_vainilla);
        
        // Producir Pastel
        Pasteles pastel_chocolate = new Pasteles("Chocolate");
        OperacionesAderezo.quitarAderezo(pastel_chocolate, new Crema());
        OperacionesAderezo.anadirAderezo(pastel_chocolate, new Frutilla());
        System.out.println(pastel_chocolate);
        
        
    }
}
