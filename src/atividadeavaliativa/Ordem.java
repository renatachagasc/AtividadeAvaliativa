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
public class Ordem {
     public static void bubblesort(ArrayList<Aluno> alunos) {
        int n = alunos.size();
        for (int i = 0; i <= n - 2; i++) {
            for (int j = 0; j <= n - 2 - i; j++) {
                if (alunos.get(j).compareByNome(alunos.get(j + 1)) > 0) {
                    Aluno aux = alunos.get(j);
                    alunos.set(j, alunos.get(j + 1));
                    alunos.set(j + 1, aux);
                }
            }
        }
    }

}
