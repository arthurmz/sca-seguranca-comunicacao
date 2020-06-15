package com.sca.seguranca_comunicacao.model;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(schema="sca_seguranca_comunicacao")
public class MensagemAlertaSMS {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private Long id;
	
	@Column(name="data_cadastro")
	private LocalDateTime dataCadastro;
	
	@Column(name="corpo")
	private String corpo;
	
	@ManyToOne
	@JoinColumn(name="id_template_mensagem_alerta_sms")
	private TemplateMensagemAlertaSms template;
	
	@ManyToOne
	@JoinColumn(name="id_contato")
	private Contato contato;
	
	@Column(name="data_hora_nevio")
	private LocalDateTime dataHoraEnvio;

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

	public TemplateMensagemAlertaSms getTemplate() {
		return template;
	}

	public void setTemplate(TemplateMensagemAlertaSms template) {
		this.template = template;
	}

	public Contato getContato() {
		return contato;
	}

	public void setContato(Contato contato) {
		this.contato = contato;
	}

	public LocalDateTime getDataHoraEnvio() {
		return dataHoraEnvio;
	}

	public void setDataHoraEnvio(LocalDateTime dataHoraEnvio) {
		this.dataHoraEnvio = dataHoraEnvio;
	}

}
