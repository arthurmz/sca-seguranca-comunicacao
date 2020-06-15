package com.sca.seguranca_comunicacao.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sca.seguranca_comunicacao.model.IncidenteSeguranca;
import com.sca.seguranca_comunicacao.repository.IncidenteSegurancaRepository;
import com.sca.seguranca_comunicacao.service.IncidenteSegurancaService;

@RestController
@RequestMapping("/incidentesSeguranca")
public class IncidenteSegurancaController {
	
	@Autowired
	private IncidenteSegurancaService incidenteSegurancaService;
	
	@Autowired
	private IncidenteSegurancaRepository incidenteSegurancaRepository;
	
	@GetMapping
	public List<IncidenteSeguranca> getAllIncidenteSegurancas(){
		return incidenteSegurancaService.findAll();
	}
	
	@GetMapping("{id}")
	public IncidenteSeguranca getIncidenteSeguranca(@PathVariable Long id) {
		return incidenteSegurancaRepository.getOne(id);
	}
	
	@PostMapping()
	public IncidenteSeguranca saveIncidenteSeguranca(@RequestBody IncidenteSeguranca incidenteSeguranca) throws Exception {
		return incidenteSegurancaService.saveIncidenteSeguranca(incidenteSeguranca);
	}

}
