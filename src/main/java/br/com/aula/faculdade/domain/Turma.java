package br.com.aula.faculdade.domain;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;

@Entity
public class Turma {
    @Id
    @GeneratedValue
    private Integer id;
    private String codigo;

    @ManyToOne
    private Disciplina disciplina;

    @ManyToMany
    private List<Professor> professores;

    @ManyToMany
    private List<HorarioAula> horarios;

    public Turma() {
    }

    public Turma(Integer id, String codigo, Disciplina disciplina, List<Professor> professores,
            List<HorarioAula> horarios) {
        this.id = id;
        this.codigo = codigo;
        this.disciplina = disciplina;
        this.professores = professores;
        this.horarios = horarios;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public Disciplina getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(Disciplina disciplina) {
        this.disciplina = disciplina;
    }

    public List<Professor> getProfessores() {
        return professores;
    }

    public void setProfessores(List<Professor> professores) {
        this.professores = professores;
    }

    public List<HorarioAula> getHorarios() {
        return horarios;
    }

    public void setHorarios(List<HorarioAula> horarios) {
        this.horarios = horarios;
    }

}
