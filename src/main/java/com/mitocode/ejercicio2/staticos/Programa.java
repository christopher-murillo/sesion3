package com.mitocode.ejercicio2.staticos;

import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("�Cu�l es el precio del d�lar?");
		double precioDolar = sc.nextDouble();
		
		System.out.println("�Cu�ntos dolares se comprar�n?");
		double monto = sc.nextDouble();
		
//		ConvertidorMoneda convertidor = new ConvertidorMoneda();
		
		double resultado = ConvertidorMoneda.dolarToNuevoSol(monto, precioDolar);
		System.out.println("Monto a pagar en soles: " + resultado);
		
		sc.close();
		
	}
}
