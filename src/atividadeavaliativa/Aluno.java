/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atividadeavaliativa;

import java.util.Objects;

/**
 *
 * @author 20171148060029
 */
public class Aluno {

    String nome;

    @Override
    public String toString() {
        return "Aluno{" + "nome=" + nome + '}';
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Aluno(String nome) {
        this.nome = nome;
    }

    public Aluno() {
    }

    public int compareByNome(Aluno a) {
        return this.getNome().compareTo(a.getNome());
    }

}
