package com.sca.seguranca_comunicacao.model;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Evento é o objeto recebido pelo módulo que informa o acontecimento de um problema em uma barragem que pode afetar
 * a segurança dos moradores próximos.
 * @author arthur
 *
 */
@Entity
@Table(schema="sca_seguranca_comunicacao")
public class IncidenteSeguranca {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private Long id;
	
	@Column(name="data_cadastro")
	private LocalDateTime dataCadastro;
	
	@Column(name="descricao")
	private String descricao;
	
	@Enumerated(EnumType.STRING)
	private TipoIncidente tipoIndicente;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public LocalDateTime getDataCadastro() {
		return dataCadastro;
	}

	public void setDataCadastro(LocalDateTime dataCadastro) {
		this.dataCadastro = dataCadastro;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public TipoIncidente getTipoIndicente() {
		return tipoIndicente;
	}

	public void setTipoIndicente(TipoIncidente tipoIndicente) {
		this.tipoIndicente = tipoIndicente;
	}
	
	

}
