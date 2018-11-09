/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Postres_bien;

import Otros.Aderezo;
import java.util.ArrayList;

/**
 *
 * @author Administrador
 */
public class Pasteles extends Postres{
    
    public Pasteles(String sabor) {
        super(sabor);
    }

    @Override
    public double calcularPrecioFinal() {
        return super.calcularPrecioFinal(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setPrecioParcial(double precioParcial) {
        super.setPrecioParcial(precioParcial); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public double getPrecioParcial() {
        return super.getPrecioParcial(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setSabor(String sabor) {
        super.setSabor(sabor); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getSabor() {
        return super.getSabor(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<Aderezo> getAderezos() {
        return super.getAderezos(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String toString() {
        return "Pastel{" + "sabor=" + getSabor() + ", precioParcial=" + getPrecioParcial() + ", aderezos=" + getAderezos() + '}';
    }
    

}
