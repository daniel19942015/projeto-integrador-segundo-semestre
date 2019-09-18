/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import model.NotaFiscal;

/**
 *
 * @author fernando.tfernandes
 */
public class NotaFiscalDAO {
    
    public static boolean SalvarNotaFiscal(NotaFiscal pNotaFiscal){
    
        //INSERT INTO NotaFiscal () VALUES()
        boolean retorno = SimulaBancoDados.getInstance().SalvarNota(pNotaFiscal);
        return retorno;
    
    }
    
}
