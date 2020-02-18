package com.mitocode.ejercicio6.enums.avanzado;

public class CuentaNegocio extends Cuenta {

	private double limitePrestamo;

	public CuentaNegocio() {
		super();
		// TODO Auto-generated constructor stub
	}

	public CuentaNegocio(String numeroCuenta, String titular, double saldo, double limitePrestamo) {
		super(numeroCuenta, titular, saldo);
		// TODO Auto-generated constructor stub
		this.limitePrestamo = limitePrestamo;
	}

	public double getLimitePrestamo() {
		return limitePrestamo;
	}

	public void setLimitePrestamo(double limitePrestamo) {
		this.limitePrestamo = limitePrestamo;
	}
	
	public void prestamo(double monto) {
		if (monto <= limitePrestamo) {
			saldo = saldo - monto - 10.0;
//			Tambien es valida la siguiente forma
//			saldo -= monto - 10.0;
		}
	}
	

	@Override
	public String toString() {
		return "CuentaNegocio [limitePrestamo=" + limitePrestamo + ", NumeroCuenta=" + getNumeroCuenta()
				+ ", Titular=" + getTitular() + ", Saldo=" + getSaldo() + "]";
	}



	
}
