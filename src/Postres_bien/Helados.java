/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Postres_bien;

import Otros_bien.Aderezo;
import java.util.ArrayList;

/**
 *
 * @author Administrador
 */
public class Helados extends Postres{
    
    public Helados(String sabor) {
        super(sabor);
    }

    public Helados(String sabor, double precioParcial, ArrayList<Aderezo> aderezos) {
        super(sabor, precioParcial, aderezos);
    }

    @Override
    public double calcularPrecioFinal() {
        return super.calcularPrecioFinal(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String toString() {
        return "Helado{" + "sabor=" + getSabor() + ", precioParcial=" + getPrecioParcial() + ", aderezos=" + getAderezos() + '}';
    }

    @Override
    public ArrayList<Aderezo> getAderezos() {
        return super.getAderezos(); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
    
}
