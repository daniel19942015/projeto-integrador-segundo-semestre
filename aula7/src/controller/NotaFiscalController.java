/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import DAO.NotaFiscalDAO;
import model.NotaFiscal;

/**
 *
 * @author fernando.tfernandes
 */
public class NotaFiscalController {
    
    public static boolean salvarNotaFiscal(int pNumeroNota, double pValorNota){
    
            NotaFiscal objNotaFiscal = new NotaFiscal(pNumeroNota, pValorNota);
            
            boolean retorno = NotaFiscalDAO.SalvarNotaFiscal(objNotaFiscal);
            
            return retorno;
            
    }
    
}
