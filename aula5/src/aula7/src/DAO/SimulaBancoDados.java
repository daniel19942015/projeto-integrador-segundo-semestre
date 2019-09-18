/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.util.ArrayList;
import model.Funcionario;
import model.NotaFiscal;


/**
 *
 * @author fernando.tfernandes
 */
public class SimulaBancoDados {
    
    private static SimulaBancoDados objBancoSimulado;
    
    public ArrayList<NotaFiscal> linhasTabelaNotaFiscal;
    public ArrayList<Funcionario> linhasTabelaFuncionario;
    
    public SimulaBancoDados(){
    
        linhasTabelaNotaFiscal = new ArrayList<>();
        linhasTabelaFuncionario = new ArrayList<Funcionario>();
    }
    
    //Garanto apenas um banco de dados na memória
    //Padrão: Singleton
    public static synchronized SimulaBancoDados getInstance(){
        
        if(objBancoSimulado ==null)
            objBancoSimulado = new SimulaBancoDados();
                
        return objBancoSimulado;
    }
    
    public boolean SalvarNota(NotaFiscal pNotaFiscal)
    {
        linhasTabelaNotaFiscal.add(pNotaFiscal);
        return true;
    }
   
    public boolean SalvarFuncionario(Funcionario pFuncionario)
    {
        linhasTabelaFuncionario.add(pFuncionario);
        return true;
    }
    
    public ArrayList<Funcionario> ConsultarFuncionario(){
    
        return this.linhasTabelaFuncionario;
    }

     public boolean AtualizarFuncionario(Funcionario p)
    {
        for(Funcionario item: linhasTabelaFuncionario)
        {
            if(item.getIdFuncionario()== p.getIdFuncionario())
            {
                item.setNomeFuncionario(p.getNomeFuncionario());
                item.setCPF(p.getCPF());
            }
        }
            
        return true;
    }
    
    public boolean ExcluirFuncionario(int idExcluir)
    {
        Funcionario funcionarioExcluir = null;
        
        boolean existeNaLista = false;
        for (Funcionario f : linhasTabelaFuncionario) {
        
            if(f.getIdFuncionario()== idExcluir ){
                funcionarioExcluir = f;
                existeNaLista = true;
            }
        }
        
        if(existeNaLista)
            linhasTabelaFuncionario.remove(funcionarioExcluir);
        
        return true;
    }
    
}
