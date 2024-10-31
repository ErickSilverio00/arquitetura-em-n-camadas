package br.com.aula.faculdade.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class Disponibilidade {
    @Id
    private String dia;
    private String horaInicio;
    private String horaFim;

    @ManyToOne
    private Professor professor;

    public Disponibilidade() {

    }

    public Disponibilidade(String dia, String horaInicio, String horaFim, Professor professor) {
        this.dia = dia;
        this.horaInicio = horaInicio;
        this.horaFim = horaFim;
        this.professor = professor;
    }

    public String getDia() {
        return dia;
    }

    public void setDia(String dia) {
        this.dia = dia;
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

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

}
