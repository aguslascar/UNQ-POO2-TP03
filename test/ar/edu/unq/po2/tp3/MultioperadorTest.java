package ar.edu.unq.po2.tp3;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.List;

class MultioperadorTest {
	Multioperador operador;
	List<Integer> arreglo;
	
	@BeforeEach
	public void setUp() {
		arreglo = new ArrayList<Integer>();
		arreglo.add(47);
		arreglo.add(37);
		arreglo.add(87);
		arreglo.add(27);
		operador = new Multioperador();
		operador.setNumeros(arreglo);
		
	}
	@Test
	void testSuma() {
		int amount = operador.suma(arreglo);
		assertEquals(amount, 198);
	}
	
	@Test
	void testMultiplicacion() {
		int amount = operador.multiplicar(arreglo);
		assertEquals(4084911, amount);
	}
}
