/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author fernando.fernandes
 */
public class Funcionario {
    
    //Variável criada para autoincrementar id do funcionário 
    private static int qtdFuncionariosCriados;
    
    private int idFuncionario;
    private String nomeFuncionario;
    private String CPF;

    public Funcionario() {
        
        qtdFuncionariosCriados++;
        this.idFuncionario = qtdFuncionariosCriados;
        
    }

    public Funcionario(String nomeFuncionario, String CPF) {
        
        //Ao conectar-se ao banco de dados, não é necessário controlar o id do funcionário.
        qtdFuncionariosCriados++;
        this.idFuncionario = qtdFuncionariosCriados;
        
        this.nomeFuncionario = nomeFuncionario;
        this.CPF = CPF;
    }

    public Funcionario(int idFuncionario, String nomeFuncionario, String CPF) {
        this.idFuncionario = idFuncionario;
        this.nomeFuncionario = nomeFuncionario;
        this.CPF = CPF;
    }
    
    

    public int getIdFuncionario() {
        return idFuncionario;
    }

    public void setIdFuncionario(int idFuncionario) {
        this.idFuncionario = idFuncionario;
    }

    public String getNomeFuncionario() {
        return nomeFuncionario;
    }

    public void setNomeFuncionario(String nomeFuncionario) {
        this.nomeFuncionario = nomeFuncionario;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }
    
    
    
    
}
