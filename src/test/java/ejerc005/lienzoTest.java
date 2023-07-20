package ejerc005;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertThrows;
import static org.junit.jupiter.api.Assertions.*;

import java.awt.Color;
import java.util.ArrayList;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class lienzoTest {
	private static LienzoImpl lienzo;
	private static Punto punto;

	@BeforeAll
	static void setUp() throws Exception {
		lienzo = new LienzoImpl();
		punto = new Punto();	
	}

	
	@Test
	void crearPuntoTest() {
		assertNotNull(punto.crearPunto(1234, 4567, Color.red));
	}
	
	@Test
	void crearPuntoTestError() {
		assertThrows(InvalidPositionException.class, () -> punto.crearPunto(2000000, 100000, Color.GREEN));
	}
	
	@Test
	void aniadirFiguraTest() {
		assertEquals(lienzo.getFiguras(),lienzo.aniadirFigura(punto.crearPunto(1234, 4567, Color.red)));
		
	}
	
	@Test
	void aniadirFiguraTestError() {
		assertThrows(InvalidPositionException.class, () -> lienzo.aniadirFigura(punto.crearPunto(123400000, 4567, Color.red)));
	}
	
	@Test
	void moverTest() {
		lienzo.moverFigura(punto.crearPunto(1234, 4567, Color.red), 222, 333);
		assertEquals(0, lienzo.getFiguras().indexOf(punto.crearPunto(222, 333, Color.red)));
	}
	
	@Test
	void moverTestError() {
		lienzo.getFiguras().clear();
		assertThrows(EmptyArrayException.class, () -> lienzo.moverFigura(punto.crearPunto(222, 333, Color.red), 1,1));
	}
}
