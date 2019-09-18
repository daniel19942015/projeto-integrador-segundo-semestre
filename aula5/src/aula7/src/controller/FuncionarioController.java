/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import DAO.FuncionarioDAO;
import java.util.ArrayList;
import model.Funcionario;

/**
 *
 * @author fernando.fernandes
 */
public class FuncionarioController {
    
    public static boolean salvarFuncionario(String pNome, String pCPF){
    
            Funcionario objFuncionario = new Funcionario(pNome, pCPF);
            
            boolean retorno = FuncionarioDAO.SalvarFuncionario(objFuncionario);
            
            return retorno;
    }
    
    public static ArrayList<String[]> consultarFuncionarios(){
    
        ArrayList<Funcionario> listaFuncionarios = FuncionarioDAO.ConsultarFuncionarios();
        ArrayList<String[]> listaFuncionariosString = new ArrayList<String[]>();
        
        //Transformo a lista de objetos funcionarios em uma lista de vetores de Strings
        for (Funcionario itemLista : listaFuncionarios) {
            
            listaFuncionariosString.add(new String[]{String.valueOf(itemLista.getIdFuncionario())
                                                    ,itemLista.getNomeFuncionario()
                                                    ,itemLista.getCPF()});
            
        }
                
        return listaFuncionariosString;
    }
    
    public static boolean atualizarFuncionario(int pId, String pNome, String pCPF)
    {
        Funcionario objFuncionarioAlterar =  new Funcionario(pId,pNome,pCPF);
        
        return FuncionarioDAO.atualizarFuncionario(objFuncionarioAlterar);
        
    }
    
    public static boolean excluirFuncionario(int pID)
    {
        return FuncionarioDAO.excluirFuncionario(pID);
    }
}
