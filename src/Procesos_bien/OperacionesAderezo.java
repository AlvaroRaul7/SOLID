/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Procesos_bien;

import Otros_bien.Aderezo;
import Postres_bien.Postres;

/**
 *
 * @author Lindthon Iparreño
 */
public class OperacionesAderezo {
    
    public static void anadirAderezo(Postres postre,Aderezo aderezo){
        postre.getAderezos().add(aderezo);
    }
    
    public static void quitarAderezo(Postres postre,Aderezo aderezo){
        postre.getAderezos().remove(aderezo);
    }
    
}
