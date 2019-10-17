/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atividadeavaliativa;

import java.util.Comparator;

/**
 *
 * @author 20171148060029
 */
public class SortByName implements Comparator<Aluno>{
 @Override
    public int compare(Aluno a1, Aluno a2) {
        return a1.compareByNome(a2);
    }   
}
