package br.com.aula.faculdade.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.aula.faculdade.domain.Professor;

@Repository
public interface ProfessorRepository extends JpaRepository<Professor, Long> {

}
