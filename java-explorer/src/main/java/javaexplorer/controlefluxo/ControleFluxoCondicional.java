package javaexplorer.controlefluxo;

public class ControleFluxoCondicional {
	public static void main(String[] args) {
		ControleFluxoCondicional.simuladorCaixaEletronicoFluxoSimples(15.0,13.0);
		ControleFluxoCondicional.simuladorCaixaEletronicoFluxoSimples(7.0,9.0);
	}

	static void simuladorCaixaEletronicoFluxoSimples(double saldo,double valorSolicitado) {
		
		//foco do exemplo	
		if(valorSolicitado < saldo) {
			saldo = saldo - valorSolicitado;
		}
			System.out.println(saldo);
			System.out.println("fim");
	}
	static void simuladorNotaEscolarFluxoComposto(double nota) {
		
		//foco do exemplo	
		if(nota >= 7) {
			System.out.println("Aprovado");
		}else {
			System.out.println("Reprovado");
		}
			System.out.println("saldo");
			System.out.println("fim");
	}
}
