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
public class MensagemAlertaEmail {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private Long id;
	
	@Column(name="data_cadastro")
	private LocalDateTime dataCadastro;
	
	@Column(name="assunto")
	private String assunto;
	
	@Column(name="corpo")
	private String corpo;
	
	@ManyToOne
	@JoinColumn(name="id_template_mensagem_alerta_email")
	private TemplateMensagemAlertaEmail template;
	
	@ManyToOne
	@JoinColumn(name="id_contato")
	private Contato contato;
	
	@Column(name="data_hora_envio")
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

	public String getAssunto() {
		return assunto;
	}

	public void setAssunto(String assunto) {
		this.assunto = assunto;
	}

	public String getCorpo() {
		return corpo;
	}

	public void setCorpo(String corpo) {
		this.corpo = corpo;
	}

	public TemplateMensagemAlertaEmail getTemplate() {
		return template;
	}

	public void setTemplate(TemplateMensagemAlertaEmail template) {
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
