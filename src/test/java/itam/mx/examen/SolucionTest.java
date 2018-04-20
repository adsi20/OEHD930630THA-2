package itam.mx.examen;

import static org.junit.Assert.*;

public class SolucionTest {



	@org.junit.Test
	public void solucion() {
		Solucion mySolucion = new Solucion();
		assertEquals(mySolucion.solucion("ababababababababababkabababababababababab"),false);
		assertEquals(mySolucion.solucion("abababababababababababababababababab"),false);
		assertEquals(mySolucion.solucion("1230789761329014"),false);
	

	}
}
	