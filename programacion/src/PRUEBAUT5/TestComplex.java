package PRUEBAUT5;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

public class TestComplex {

	@Test
	void testSumar() {
		Complex num1 = new Complex(60, 300);
		Complex num2 = new Complex(300, 500);

		Complex resultado = num1.sumar(num2);
		Complex resultadoesperado = new Complex(360, 800);
		assertEquals(resultado, resultadoesperado);
	}

	@Test
	void testRestar() {
		Complex num1 = new Complex(1000, 400);
		Complex num2 = new Complex(200, 150);
		Complex resultado = num1.restar(num2);
		Complex resultadoesperado = new Complex(800, 250);
		assertEquals(resultado, resultadoesperado);
	}

	@Test
	void testMultiplicarComplex() {
		Complex num1 = new Complex(100, 200);
		Complex num2 = new Complex(400, 400);
		Complex resultado = num1.multiplicar(num2);
		Complex resultadoesperado = new Complex(-40000, 120000);
		assertEquals(resultado, resultadoesperado);
	}

	@Test
	void testMultiplicarDouble() {
		Complex numero1 = new Complex(2, 1);
		double nu = 2;
		Complex resultado = new Complex(4, 2);
		Complex resultado_esperado = numero1.multiplicar(nu);
		assertEquals(resultado, resultado_esperado);
	}

	@Test
	void testDividir() {
		Complex num1 = new Complex(300, 300);
		Complex num2 = new Complex(20, 10);
		Complex resultado = num1.dividir(num2);
		Complex resultadoesperado = new Complex(18, 6);
		assertEquals(resultado, resultadoesperado);
	}

	@Test
	void testToString() {
		Complex prueba11 = new Complex(6, 5);
		Complex resultadoesperado = new Complex(6, 5);
		String rasultadoobtenido = prueba11.toString();
	}

	@Test
	void testEqualsObject() {
		Complex num1 = new Complex(5, 8);
		Complex num2 = new Complex(5, 8);
		Complex num3 = new Complex(3.5, 6.7);
	}

	// RESTA Y DIVISIÓN
	@Test
	void testDividir1() {
		Complex num1 = new Complex(3.12, 2.14);
		Complex num2 = new Complex(1.1, 1.3);
		Complex resultado = num1.dividir(num2);
		Complex resultadoesperado = new Complex(2.142758620689655, -0.5868965517241377);
		assertEquals(resultado, resultadoesperado);

	}

	@Test
	void testRestar1() {
		Complex num1 = new Complex(0, 0);
		Complex num2 = new Complex(2, 1);
		Complex resultado = num1.restar(num2);
		Complex resultadoesperado = new Complex(0, -0);
		assertEquals(resultado, resultadoesperado);
	}

}
