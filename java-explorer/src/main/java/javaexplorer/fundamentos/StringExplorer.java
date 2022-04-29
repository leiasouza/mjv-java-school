package javaexplorer.fundamentos;

public class StringExplorer {
	public static void main(String[] args) {
		StringExplorer.explorandoMetodoSplit();
	
	}
	//o split separa as palavras de uma String;
	static void explorandoMetodoSplit() {
		String nomeCompleto = "Vanderleia Rodrigues de Souza";
		String [] palavras = nomeCompleto.split(" ");
		
		//como percorrer um array em Java;
		for (String palavra : palavras) {
			System.out.println(palavra);
		}
		/*
		 * simulando a utilização do split no contexo 
		 * de um ticket de passagem aerea
		 */
		String lastname = palavras[3];
		String firstname = palavras[0];
		System.out.println(lastname.concat(" ").concat(firstname));
	}
	
	
}
