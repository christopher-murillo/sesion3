package com.mitocode.ejercicio7.interfaces;


public class Programa {

	public static void main(String[] args) {

		CuentaAhorros cuenta = new CuentaAhorros("15", "Dany 6", 1000, 0.05);
		System.out.println(cuenta);

		System.out.println("Retiro: " + 50);
		cuenta.retiro(50);
		System.out.println(cuenta);

		System.out.println("Deposito: " + 150);
		cuenta.deposito(150);
		System.out.println(cuenta);

		System.out.println("Interes ganado: " + 0.05);
		cuenta.actualizarSaldo();
		System.out.println(cuenta);
		
		
		
	}
}
