package com.mitocode.ejercicio8.excepciones;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Programa2 {

	public static void main(String[] args) throws Exception, FileNotFoundException{
		// TODO Auto-generated method stub
		FileInputStream fis = new FileInputStream("src/main/resources/archivo.txt");
		int k;
		while ((k= fis.read()) != -1) {
			System.out.println((char)k);
		}
		fis.close();
	}

}
