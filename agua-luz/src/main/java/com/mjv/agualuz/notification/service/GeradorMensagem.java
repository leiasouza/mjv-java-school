package com.mjv.agualuz.notification.service;

import com.mjv.agualuz.notification.model.Cadastro;
import com.mjv.agualuz.notification.model.Contrato;
import com.mjv.agualuz.notification.util.FormatadorUtil;

public class GeradorMensagem {
	public void gerar(Contrato contrato) {
		StringBuilder sb = new StringBuilder();
		Cadastro cliente = contrato.getCliente();
		String cpfFormatado = FormatadorUtil.formatarCpf(cliente.getCpf());
		
		//sb.append("Senhor(a) " + cliente.getNome() +  " cpf de n�mero " + cpfFormatado );
		sb.append(String.format("Senhor(a) %s cpf de n�mero %s, ",cliente.getNome(), cpfFormatado ));
		sb.append(String.format("Informamos que conforme contrato com protocolo de n�mero %d", contrato.getNumeroProtocolo()));
		sb.append(String.format(" est� agendado para a data\\hora", contrato.getDataHora()));
		System.out.println(sb.toString());
		
			
	}

}
