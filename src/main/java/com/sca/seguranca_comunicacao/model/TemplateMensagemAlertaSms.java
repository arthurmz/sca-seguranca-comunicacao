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

@Entity
@Table(schema="sca_seguranca_comunicacao")
public class TemplateMensagemAlertaSms {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private Long id;
	
	@Column(name="data_cadastro")
	private LocalDateTime dataCadastro;
	
	@Column(name="corpo")
	private String corpo;
	
	@Enumerated(EnumType.STRING)
	private TipoIncidente tipoIncidente;

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

	public String getCorpo() {
		return corpo;
	}

	public void setCorpo(String corpo) {
		this.corpo = corpo;
	}

	public TipoIncidente getTipoIncidente() {
		return tipoIncidente;
	}

	public void setTipoIncidente(TipoIncidente tipoIncidente) {
		this.tipoIncidente = tipoIncidente;
	}

}
