package br.com.aula.faculdade.domain;

public class Aluno {
    private Integer id;
    private String nome;

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

    public Aluno(Integer id, String nome) {
        this.id = id;
        this.nome = nome;
    }
}
