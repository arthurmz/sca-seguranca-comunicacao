package com.sca.seguranca_comunicacao.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sca.seguranca_comunicacao.model.IncidenteSeguranca;

@Repository
public interface IncidenteSegurancaRepository extends JpaRepository<IncidenteSeguranca, Long>{

}
