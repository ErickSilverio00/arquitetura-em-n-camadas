package br.com.aula.faculdade.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.aula.faculdade.domain.Telefone;

@Repository
public interface TelefoneRepository extends JpaRepository<Telefone, Long> {

}
