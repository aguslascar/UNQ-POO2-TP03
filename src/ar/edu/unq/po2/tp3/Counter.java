package ar.edu.unq.po2.tp3;

import java.util.ArrayList;
import java.util.List;

public class Counter {
	private List<Integer> numeros = new ArrayList<Integer>();
	
	private List<Integer> getNumeros() {
		return numeros;
	}
	
	public void addNumber(Integer numero) {
		numeros.add(numero);
	}
	
	public int contarPares() {
		int cantidad = 0;
		for(Integer number:this.getNumeros()) {
			if(number % 2 == 0) 
				cantidad++;
		}
		return cantidad;
	}
	public int contarImpares() {
		int cantidad = 0;
		for(Integer number:this.getNumeros()) {
			if(number % 2 != 0) 
				cantidad++;
		}
		return cantidad;
	}
	
	public int contarMultiplos(Integer numero) {
		int cantidad = 0;
		for(Integer number:this.getNumeros()) {
			if (number % numero == 0) 
				cantidad++;
		}
		return cantidad;
	}
	
}
