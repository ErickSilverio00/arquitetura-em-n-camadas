package br.com.aula.faculdade.domain;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;

@Entity
public class HorarioAula {
    @Id
    private String horaInicio;
    private String horaFim;

    @ManyToMany(mappedBy = "horarios")
    private List<Professor> professores;

    @ManyToMany(mappedBy = "horarios")
    private List<Turma> turmas;

    public HorarioAula() {
    }

    public HorarioAula(String horaInicio, String horaFim, List<Professor> professores, List<Turma> turmas) {
        this.horaInicio = horaInicio;
        this.horaFim = horaFim;
        this.professores = professores;
        this.turmas = turmas;
    }

    public String getHoraInicio() {
        return horaInicio;
    }

    public void setHoraInicio(String horaInicio) {
        this.horaInicio = horaInicio;
    }

    public String getHoraFim() {
        return horaFim;
    }

    public void setHoraFim(String horaFim) {
        this.horaFim = horaFim;
    }

    public List<Professor> getProfessores() {
        return professores;
    }

    public void setProfessores(List<Professor> professores) {
        this.professores = professores;
    }

    public List<Turma> getTurmas() {
        return turmas;
    }

    public void setTurmas(List<Turma> turmas) {
        this.turmas = turmas;
    }

}
