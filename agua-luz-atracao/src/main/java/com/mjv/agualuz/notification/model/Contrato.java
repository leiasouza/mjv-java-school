package com.mjv.agualuz.notification.model;

import java.time.LocalDateTime;

public class Contrato {
	private Long numeroProtocolo;
	private Servico servico;
	private Double valor;
	private LocalDateTime dataHora;
	private Cadastro cliente;
	public Long getNumeroProtocolo() {
		return numeroProtocolo;
	}
	public void setNumeroProtocolo(Long numeroProtocolo) {
		this.numeroProtocolo = numeroProtocolo;
	}
	public Servico getServico() {
		return servico;
	}
	public void setServico(Servico servico) {
		this.servico = servico;
		this.valor = servico.getValor();
	}
	public Double getValor() {
		return valor;
	}
	
	public LocalDateTime getDataHora() {
		return dataHora;
	}
	public void setDataHora(LocalDateTime dataHora) {
		this.dataHora = dataHora;
	}
	public Cadastro getCliente() {
		return cliente;
	}
	public void setCliente(Cadastro cliente) {
		this.cliente = cliente;
	}
	
}