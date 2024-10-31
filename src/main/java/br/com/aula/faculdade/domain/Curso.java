package br.com.aula.faculdade.domain;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;

@Entity
public class Curso {
    @Id
    @GeneratedValue
    private Integer id;
    private String nome;

    @OneToMany(mappedBy = "curso")
    private List<Aluno> alunos;

    @OneToMany(mappedBy = "curso")
    private List<Disciplina> disciplinas;

    @ManyToOne
    private Departamento departamento;

    public Curso() {
    }

    public Curso(Integer id, String nome, List<Aluno> alunos, List<Disciplina> disciplinas, Departamento departamento) {
        this.id = id;
        this.nome = nome;
        this.alunos = alunos;
        this.disciplinas = disciplinas;
        this.departamento = departamento;
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

    public List<Aluno> getAlunos() {
        return alunos;
    }

    public void setAlunos(List<Aluno> alunos) {
        this.alunos = alunos;
    }

    public List<Disciplina> getDisciplinas() {
        return disciplinas;
    }

    public void setDisciplinas(List<Disciplina> disciplinas) {
        this.disciplinas = disciplinas;
    }

    public Departamento getDepartamento() {
        return departamento;
    }

    public void setDepartamento(Departamento departamento) {
        this.departamento = departamento;
    }

}
