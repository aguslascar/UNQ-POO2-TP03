package ar.edu.unq.po2.tp3;

import java.util.ArrayList;
import java.util.List;

public class Multioperador {
	List<Integer> numeros = new ArrayList<Integer>();
	
	public List<Integer> getNumeros() {
		return numeros;
	}

	public void setNumeros(List<Integer> numeros) {
		this.numeros = numeros;
	}

	public int suma(List<Integer> numeros) {
		int total = 0;
		for(int i=0; i<numeros.size(); i++) {
			total += numeros.get(i);
		}
		return total;
	}
	
	public int multiplicar(List<Integer> numeros) {
		int total = 1;
		for(int i=0;i<numeros.size(); i++) {
			total = total * numeros.get(i);
		}
		return total;
	}
}
