package br.com.aula.faculdade.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.aula.faculdade.domain.Curso;

@Repository
public interface CursoRepository extends JpaRepository<Curso, Long> {

}
