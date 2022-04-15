package ar.edu.unq.po2.tp3;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.List;

public class CounterTestCase {
	private Counter counter;
	/**
	 * Crea un escenario de test básico, que consiste en un contador
	 * con 10 enteros
	 *
	 * @throws Exception
	 */
	@BeforeEach
	public void setUp() throws Exception {
		//Se crea el contador
		counter = new Counter();
		//Se agregan los numeros. Un solo par y nueve impares
		counter.addNumber(1);
		counter.addNumber(3);
		counter.addNumber(5);
		counter.addNumber(7);
		counter.addNumber(9);
		counter.addNumber(1);
		counter.addNumber(1);
		counter.addNumber(1);
		counter.addNumber(1);
		counter.addNumber(4);
	}
	/**
 	* Verifica la cantidad de pares
	*/
	@Test
	public void testNumerosPares() {
		int amount = counter.contarPares();
		assertEquals(amount, 1);
	}
	
	@Test
	public void testNumerosImpares() {
		int amount = counter.contarImpares();
		assertEquals(amount, 9);
	}
	
	@Test
	public void testMultiplos() {
		int amount = counter.contarMultiplos(2);
		assertEquals(amount, 1);
	}
	
	@Test
	public void testMayorParesEnArreglo() {
		List<Integer> arreglo = new ArrayList<Integer>();
		arreglo.add(12);
		arreglo.add(23);
		arreglo.add(8765);
		arreglo.add(2254);
		arreglo.add(9731);
		int amount = counter.mayorCantPares(arreglo);
		assertEquals(amount, 2254);
	}
}
