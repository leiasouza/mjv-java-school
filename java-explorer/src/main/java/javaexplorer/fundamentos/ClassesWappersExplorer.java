package javaexplorer.fundamentos;

public class ClassesWappersExplorer {
	
	public static void main(String[] args) {
		ClassesWappersExplorer.converterStringEmNumeros();
	}
	static void converterStringEmNumeros() {
		//convertendo uma string em Integer;
		Integer numero = Integer.valueOf("123");
		
		//convertendo uma string em Double;
		Double numeroDuplo = Double.valueOf("123.45");
		
		System.out.println(numero);
		System.out.println(numeroDuplo);
	}
}
