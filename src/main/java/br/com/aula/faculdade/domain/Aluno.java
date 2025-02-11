package br.com.aula.faculdade.domain;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;

@Entity
public class Aluno {

    @Id
    @GeneratedValue
    private Integer id;
    private String nome;

    @OneToMany(mappedBy = "aluno")
    private List<Telefone> telefones;

    @ManyToOne
    private Curso curso;

    public Aluno() {
    }

    public Aluno(Integer id, String nome, List<Telefone> telefones, Curso curso) {
        this.id = id;
        this.nome = nome;
        this.telefones = telefones;
        this.curso = curso;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Telefone> getTelefones() {
        return telefones;
    }

    public void setTelefones(List<Telefone> telefones) {
        this.telefones = telefones;
    }

    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }

}
