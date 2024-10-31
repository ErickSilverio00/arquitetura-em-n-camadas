package br.com.aula.faculdade.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.aula.faculdade.domain.Turma;

@Repository
public interface TurmaRepository extends JpaRepository<Turma, Long> {

}
