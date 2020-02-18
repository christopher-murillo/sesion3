package com.mitocode.ejercicio8.excepciones;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Programa1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Ingrese numerador: ");
		int numerador = sc.nextInt();

		System.out.println("Ingrese denominador: ");
		int denominador = sc.nextInt();

		//podria aplicar para conexion de base de datos
//		try {
//			int denominador = sc.nextInt();
//			int resultado = numerador / denominador;
//			System.out.println("Resultado :" + resultado);
//		} catch (ArithmeticException e) {
//			// TODO: handle exception
//			System.out.println("Cero es un denominado inválido.");
//		} catch (InputMismatchException e) {
//			// TODO: handle exception
//			System.out.println("Denominado incorrecto.");
//		}finally {
//			System.out.println("Finally siempre.");
//		}
			
//		Forma2		
//		int resultado = dividir(numerador, denominador);
//		System.out.println("Resultado :" + resultado);
		
//		usando throws
		try {
			int resultado = dividir2(numerador, denominador);
			System.out.println("Resultado :" + resultado);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Denominador incorrecto.");
		}
		
		
		sc.close();
	}
	
	public static int dividir (int numerador, int denominador) {
		try {
			return numerador / denominador;
		} catch (Exception e) {
			System.out.println("Cero es un denominado inválido.");
			return -1;
		}finally {
			System.out.println("Finally siempre.");
		}
	}
	
	public static int dividir2 (int numerador, int denominador) throws ArithmeticException{
				return numerador / denominador;
	}
	
}

