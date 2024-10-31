package br.com.aula.faculdade.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.aula.faculdade.domain.Aluno;

@Repository
public interface AlunoRepository extends JpaRepository<Aluno, Long> {

}
