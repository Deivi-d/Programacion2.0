package PRUEBAUT5;


import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

public class TestComplex {

	@Test
	void testSumar() {
		Complex numero1= new Complex(60,300);
		Complex numero2= new Complex(200,500);
		
		Complex resultado=numero1.sumar(numero2);
		Complex resultado_esperado= new Complex(260,800);
		assertEquals(resultado,resultado_esperado);
	}

	@Test
	void testRestar() {
		Complex numero1= new Complex(1000,400);
		Complex numero2= new Complex(200,150);
		Complex resultado=numero1.restar(numero2);
		Complex resultado_esperado= new Complex(800,250);
		assertEquals(resultado,resultado_esperado);
	}

	@Test
	void testMultiplicarComplex() {
		Complex numero1= new Complex(100,200);
		Complex numero2= new Complex(400,400);
		Complex resultado=numero1.multiplicar(numero2);
		Complex resultado_esperado=new Complex(-40000,120000);
		assertEquals(resultado,resultado_esperado);
		}

	@Test
	void testMultiplicarDouble() {
		Complex numero1=new Complex(2,3);
		double n=3D;
		Complex resultado= new Complex(6D,9D);
		Complex resultado_esperado= numero1.multiplicar(n);
		assertEquals(resultado,resultado_esperado);
	}

	@Test
	void testDividir() {
		Complex numero1=new Complex(300,300);
		Complex numero2= new Complex(20,10);
		Complex resultado=numero1.dividir(numero2);
		Complex resultado_esperado=new Complex(18,6);
		assertEquals(resultado,resultado_esperado);
	}

	@Test
	void testToString() {
		Complex prueba11=new Complex(6,5);
		Complex resultadoesperado5= new Complex(6,5);
		String obtenido=prueba11.toString();
	}

	@Test
	void testEqualsObject() {
		Complex num1= new Complex(5,8);
		Complex num2= new Complex(5,8);
		Complex num3= new Complex(3.5,6.7);
	}
	// RESTA Y DIVISIÓN
	@Test
	void testDividir1() {
		Complex num1=new Complex(3.12,2.14);
		Complex num2=new Complex(1.1,1.3);
		Complex resultado= num1.dividir(num2);
		Complex resultadoesperado=new Complex(2.142758620689655, -0.5868965517241377);
		assertEquals(resultado,resultadoesperado);
		
	}
	@Test
	void testDividir2() {
		Complex num1=new Complex(-2.1,1.5);
		Complex num2=new Complex(1.32,-1.98);
		Complex resultado= num1.dividir(num2);
		Complex resultadoesperado= new Complex(-1.013986013986014, -0.3846153846153847);
		assertEquals(resultado,resultadoesperado);
	}
	@Test
	void testRestar1() {
		Complex num1= new Complex(-2,1);
		Complex num2= new Complex(-2,1.2);
		Complex resultado=num1.restar(num2);
		Complex resultadoesperado= new Complex(0, -0.19999999999999996);
		assertEquals(resultado,resultadoesperado);
	}
	@Test
	void testRestar2() {
		Complex num1= new Complex(3,-10);
		Complex num2= new Complex(20,-50);
		Complex resultado=num1.restar(num2);
		Complex resultadoesperado= new Complex(-17,40);
		assertEquals(resultado,resultadoesperado);
	}

}

