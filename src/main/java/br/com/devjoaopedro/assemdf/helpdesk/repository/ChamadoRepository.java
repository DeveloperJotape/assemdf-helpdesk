package br.com.devjoaopedro.assemdf.helpdesk.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.devjoaopedro.assemdf.helpdesk.domain.entity.Chamado;

@Repository
public interface ChamadoRepository extends JpaRepository<Chamado, Long>{
    
}
