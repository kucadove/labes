/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.controller;

import com.mycompany.model.Experimento;
import com.mycompany.persistences.ExperimentoPersist;
import java.util.List;

/**
 *
 * @author Rogerio
 */
public class ControllerExperimento {
    
    public static boolean createExperimento(String nome, String descricao) {
        /*Atributos atuais de um experimento: Nome, Descricao, Concluido, Replicado*/
        //Usuario usuarioLogado = ControllerUsuario.usuario; Se for usar o usuario no construtor
        Experimento novoExperimento = new Experimento(nome, descricao, false, false); // Ver questão do usuario
        return novoExperimento.saveOnDatabase();
    }
    
    public static List<Experimento> listarExperimentos(){
        return ExperimentoPersist.listarExperimentos(); 
    }
    
}
