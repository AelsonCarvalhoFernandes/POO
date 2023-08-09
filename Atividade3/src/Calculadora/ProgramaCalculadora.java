package Calculadora;

import java.util.Scanner;

public class ProgramaCalculadora {

	public static void main(String[] args) {
		
		
		boolean ligado = true;
		
		Calculo calc = new Calculo();
		
		Scanner scan = new Scanner(System.in);
		
		while(ligado) {
			System.out.println("Digite o primeiro valor: ");
			float n1 = scan.nextFloat();
			
			System.out.println("Qual operacao deseja fazer: ");
			String operacao = scan.next();
			
			System.out.println("Digite o segundo valor: ");
			float n2 = scan.nextFloat();
			
			if(operacao.equals("+")) {
				System.out.println(calc.somar(n1, n2));
			}else if(operacao.equals("-")) {
				System.out.println(calc.subtrair(n1, n2));
			}else if(operacao.equals("*")) {
				System.out.println(calc.multiplicar(n1, n2));
			}else if(operacao.equals("/")) {
				System.out.println(calc.dividir(n1, n2));
			}else {
				System.out.println("Operação matematica invalida");
			}
			
			System.out.println("Deseja continuar: S/N");
			
			String cont = scan.next();
			
			if(cont.equals("N") || cont.equals("n")) {
				ligado = false;
			}
			
		}
		
		scan.close();
		
	}
}
