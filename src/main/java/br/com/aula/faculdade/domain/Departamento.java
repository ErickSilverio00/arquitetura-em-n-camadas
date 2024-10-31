package br.com.aula.faculdade.domain;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;

@Entity
public class Departamento {
    @Id
    @GeneratedValue
    private Integer id;
    private String nome;

    @OneToMany(mappedBy = "departamento")
    private List<Curso> curso;

    @OneToOne
    private Coordenador coordenador;

    public Departamento() {

    }

    public Departamento(Integer id, String nome, List<Curso> curso, Coordenador coordenador) {
        this.id = id;
        this.nome = nome;
        this.curso = curso;
        this.coordenador = coordenador;
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

    public List<Curso> getCurso() {
        return curso;
    }

    public void setCurso(List<Curso> curso) {
        this.curso = curso;
    }

    public Coordenador getCoordenador() {
        return coordenador;
    }

    public void setCoordenador(Coordenador coordenador) {
        this.coordenador = coordenador;
    }

}
