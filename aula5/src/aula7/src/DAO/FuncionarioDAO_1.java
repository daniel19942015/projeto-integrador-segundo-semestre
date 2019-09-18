/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.util.ArrayList;
import model.Funcionario;

/**
 *
 * @author fernando.fernandes
 */
public class FuncionarioDAO {
    
    public static boolean SalvarFuncionario(Funcionario pFuncionario){
    
        //Simulo uma inserção no banco de dados (INSERT INTO Funcionario () VALUES())
        boolean retorno = SimulaBancoDados.getInstance().SalvarFuncionario(pFuncionario);
        return retorno;
    
    }
    
    public static ArrayList<Funcionario> ConsultarFuncionarios(){
    
        return SimulaBancoDados.getInstance().ConsultarFuncionario();
    }
    
    public static boolean atualizarFuncionario(Funcionario p)
    {
        //Simulo um  UPDATE no banco de dados (UPDATE TabelaXYZ SET...)
        return SimulaBancoDados.getInstance().AtualizarFuncionario(p);
    }
    
    public static boolean excluirFuncionario(int pID)
    {
        //Simulo uma exclusão no banco de dados (DELETE FROM TabelaXYZ WHERE...)
        return SimulaBancoDados.getInstance().ExcluirFuncionario(pID);
    }
    
}
