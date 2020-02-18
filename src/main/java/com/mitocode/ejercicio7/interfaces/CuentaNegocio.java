package com.mitocode.ejercicio7.interfaces;

public class CuentaNegocio implements ICuenta {

	private String numeroCuenta;
	private String titular;
	private double saldo;
	private double limitePrestamo;

	public CuentaNegocio() {
		super();
		// TODO Auto-generated constructor stub
	}

	public CuentaNegocio(String numeroCuenta, String titular, double saldo, double limitePrestamo) {
		super();
		this.numeroCuenta = numeroCuenta;
		this.titular = titular;
		this.saldo = saldo;
		this.limitePrestamo = limitePrestamo;
	}

	public String getNumeroCuenta() {
		return numeroCuenta;
	}


	public void setNumeroCuenta(String numeroCuenta) {
		this.numeroCuenta = numeroCuenta;
	}


	public String getTitular() {
		return titular;
	}


	public void setTitular(String titular) {
		this.titular = titular;
	}


	public double getSaldo() {
		return saldo;
	}


	public void setSaldo(double saldo) {
		this.saldo = saldo;
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

	@Override
	public void retiro(double monto) {
		// TODO Auto-generated method stub
		saldo -= monto + 5.0;
				
	}

	@Override
	public void deposito(double monto) {
		// TODO Auto-generated method stub
		saldo = saldo + monto;
	}



	
}
