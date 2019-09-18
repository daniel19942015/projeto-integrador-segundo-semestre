/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author fernando.tfernandes
 */
public class NotaFiscal {
    
    private int numeroNota;
    private double valorNota;
    
    public NotaFiscal(){
        
    }
    
    public NotaFiscal(int pNumeroNota, double pValorNota){
        this.numeroNota = pNumeroNota;
        this.valorNota = pValorNota;
    }

    public int getNumeroNota() {
        return numeroNota;
    }

    public void setNumeroNota(int numeroNota) {
        this.numeroNota = numeroNota;
    }

    public double getValorNota() {
        return valorNota;
    }

    public void setValorNota(double valorNota) {
        this.valorNota = valorNota;
    }

    
    
}
