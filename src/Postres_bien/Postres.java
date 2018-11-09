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
public class Postres implements CalcularPrecio{
    private String sabor;
    private double precioParcial;
    private ArrayList<Aderezo> aderezos;
    
    public Postres(String sabor){
        aderezos= new ArrayList<>();
        this.sabor=sabor;
    }

    public ArrayList<Aderezo> getAderezos() {
        return aderezos;
    }

    public Postres(String sabor, double precioParcial, ArrayList<Aderezo> aderezos) {
        this.sabor = sabor;
        this.precioParcial = precioParcial;
        this.aderezos = aderezos;
    }

    public String getSabor() {
        return sabor;
    }

    public void setSabor(String sabor) {
        this.sabor = sabor;
    }

    public double getPrecioParcial() {
        return precioParcial;
    }

    public void setPrecioParcial(double precioParcial) {
        this.precioParcial = precioParcial;
    }


    @Override
    public double calcularPrecioFinal() {
        double precioFinal;
        precioFinal=(precioParcial+(precioParcial*0.12))+(aderezos.size()*0.50);
        return precioFinal;
    }
   
}
