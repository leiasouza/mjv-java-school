package com.mjv.agualuz;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class ConfirmacaoContrato {

	public static void main(String[] args) {
		Cliente nome = new Cliente("Gleyson Sampaio " , "234.765.987-27");
		
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		
		Cadastro contrato = new Cadastro();
		contrato.setLogradouro("Rua das Marias,243");
		contrato.setComplemento("Ap 207, Bloco C");
		contrato.setBairro("Santo Antonio");
		contrato.setCidade("São Paulo/SP");
		contrato.setCep("27.310-657");
		contrato.setValorTaxa(127.33);
		contrato.setData(LocalDate.of(2022,02,21));
		
		
		Protocolo protocolo = new Protocolo();
		System.out.println("Senhor(a) "+ nome.getNome() + "cpf de numero " + nome.getCpf() + 
				", informamos que \nconforme contrato com protocolo de numero " + protocolo.gerarProtocolo() +
				"\nestá agendado para a data/hora " + contrato.getData().format(formatter)+
				" 16:00h a intalação do serviço de Água \ncom taxa de valor R$ " + contrato.getValorTaxa() +
				" em sua residência localizada no endereço abaixo:");
		System.out.println();
		System.out.println("Logradouro: "+ contrato.getLogradouro());
		System.out.println("Complemento: "+ contrato.getComplemento());
		System.out.println("Bairro: "+ contrato.getBairro());
		System.out.println("Cidade: "+ contrato.getCidade());
		System.out.println("Cep: "+ contrato.getCep());
		 
	}

}
