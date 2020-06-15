package com.sca.seguranca_comunicacao.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.sca.seguranca_comunicacao.model.IncidenteSeguranca;
import com.sca.seguranca_comunicacao.repository.IncidenteSegurancaRepository;

@Service
public class IncidenteSegurancaService {
	
	@Autowired
	private IncidenteSegurancaRepository incidenteSegurancaRepository;
	
	@Transactional
	public IncidenteSeguranca saveIncidenteSeguranca(IncidenteSeguranca incidenteSeguranca) throws Exception {
		 IncidenteSeguranca b = incidenteSegurancaRepository.save(incidenteSeguranca);
		 return b;
	}
	
	public List<IncidenteSeguranca> findAll() {
		return incidenteSegurancaRepository.findAll();
	}

}
