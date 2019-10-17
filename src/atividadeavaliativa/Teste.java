/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atividadeavaliativa;

import java.util.ArrayList;

/**
 *
 * @author 20171148060029
 */
public class Teste {

    public static void main(String[] args) {
        ArrayList<Aluno> alunos = new ArrayList<>();

        alunos.add(new Aluno("Zeus"));
        alunos.add(new Aluno("Abul"));
        alunos.add(new Aluno("Hades"));
    
        Ordem.bubblesort(alunos);
        listar(alunos);
    }
    public static void listar(ArrayList<Aluno> alunos) {
        for (Aluno aluno : alunos) {
            System.out.println(aluno);
        }
        System.out.println();
    }
}
