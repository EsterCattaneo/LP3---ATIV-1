package Exercicio1B;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class main {
	public static void main(String[] args) {

		Calculadora calculadora = new Calculadora();
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
	
		try {
			System.out.print("N1: ");
			calculadora.setN1(Double.parseDouble(reader.readLine()));
			System.out.print("N2: ");
			calculadora.setN2(Double.parseDouble(reader.readLine()));
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		System.out.println("Soma: " + calculadora.somar());
		System.out.println("Subtração: " + calculadora.subtrair());
		System.out.println("Divisão: " + calculadora.dividir());
		System.out.println("Multiplicação: " + calculadora.multiplicar());
	}
}
