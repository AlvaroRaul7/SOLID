/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Procesos_bien;

import leche_bien.UsoLeche;




/**
 *
 * @author Lindthon Iparreño
 */
public class CambioLeche {
    
    private UsoLeche _leche;
    
    public CambioLeche(UsoLeche leche){
        _leche=leche;
    }    
    
    public void cambiarTipoLeche(){        
        _leche.usar();
    }
    
}
