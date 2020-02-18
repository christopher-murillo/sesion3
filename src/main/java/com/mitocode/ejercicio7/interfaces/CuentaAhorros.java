package com.mitocode.ejercicio7.interfaces;

public class CuentaAhorros implements ICuenta {

	
	private String numeroCuenta;
	private String titular;
	private double saldo;
	private double tasaInteres;
	
	public CuentaAhorros() {
		super();
		// TODO Auto-generated constructor stub
	}

	

	public CuentaAhorros(String numeroCuenta, String titular, double saldo, double tasaInteres) {
		super();
		this.numeroCuenta = numeroCuenta;
		this.titular = titular;
		this.saldo = saldo;
		this.tasaInteres = tasaInteres;
	}



	public double getTasaInteres() {
		return tasaInteres;
	}

	public void setTasaInteres(double tasaInteres) {
		this.tasaInteres = tasaInteres;
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


	public void actualizarSaldo()	{
		saldo += saldo * tasaInteres;
	}


	@Override
	public void retiro(double monto) {
		saldo = saldo - monto;
	}

	@Override
	public void deposito(double monto) {
		// TODO Auto-generated method stub
		saldo = saldo + monto;
	}

	@Override
	public String toString() {
		return "CuentaAhorros [numeroCuenta=" + numeroCuenta + ", titular=" + titular + ", saldo=" + saldo
				+ ", tasaInteres=" + tasaInteres + "]";
	}
	
	

}
