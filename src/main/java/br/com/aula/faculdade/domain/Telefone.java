package br.com.aula.faculdade.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class Telefone {
    @Id
    private String numero;

    @ManyToOne
    private Aluno aluno;

    public Telefone() {
    }

    public Telefone(String numero, Aluno aluno) {
        this.numero = numero;
        this.aluno = aluno;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public Aluno getAluno() {
        return aluno;
    }

    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }
}
