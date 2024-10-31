package br.com.aula.faculdade.domain;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;

@Entity
public class Professor {
    @Id
    @GeneratedValue
    private Integer id;
    private String nome;

    @ManyToMany
    private List<Turma> turmas;

    @ManyToMany
    private List<HorarioAula> horarios;

    @OneToMany(mappedBy = "professor")
    private List<Disponibilidade> disponibilidades;

    public Professor() {
    }

    public Professor(Integer id, String nome, List<Turma> turmas, List<HorarioAula> horarios,
            List<Disponibilidade> disponibilidades) {
        this.id = id;
        this.nome = nome;
        this.turmas = turmas;
        this.horarios = horarios;
        this.disponibilidades = disponibilidades;
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

    public List<Turma> getTurmas() {
        return turmas;
    }

    public void setTurmas(List<Turma> turmas) {
        this.turmas = turmas;
    }

    public List<HorarioAula> getHorarios() {
        return horarios;
    }

    public void setHorarios(List<HorarioAula> horarios) {
        this.horarios = horarios;
    }

    public List<Disponibilidade> getDisponibilidades() {
        return disponibilidades;
    }

    public void setDisponibilidades(List<Disponibilidade> disponibilidades) {
        this.disponibilidades = disponibilidades;
    }

}
