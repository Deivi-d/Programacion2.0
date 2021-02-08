package EJEMPLO1_EXPLICACION;

public class EstadisticaTest {
	void testMedia() {
		float prueba[]= {1,2,3,4,5,6,7,8,9,10 };
		float resultado = Estadistica.media(prueba);
		assertEquals(resultado,5.5);
	}
}
