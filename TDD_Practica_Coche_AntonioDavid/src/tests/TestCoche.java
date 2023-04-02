package tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class TestCoche {

	@Test
	void testAlCrearCocheSuVelocidadEsCero() {
		Coche nuevoCoche = new Coche();
		Assertions.assertEquals(0, nuevoCoche.velocidad);
	}
	
	@Test
	void testAlacelerarUnCocheSuVelocidadAumenta() {
		Coche nuevoCoche = new Coche();
		nuevoCoche.acelerar(30);
		Assertions.assertEquals(30, nuevoCoche.velocidad);
	}
	
	@Test
	void testAlacelerarUnCocheSuVelocidadDisminuye() {
		Coche nuevoCoche = new Coche();
		nuevoCoche.velocidad=50;
		nuevoCoche.decelerar(20);
		Assertions.assertEquals(30, nuevoCoche.velocidad);
	}
	
	@Test
	void testAlacelerarUnCocheSuVelocidadPuedeSerMenorQueCero() {
		Coche nuevoCoche = new Coche();
		nuevoCoche.velocidad=50;
		nuevoCoche.decelerar(80);
		Assertions.assertEquals(0, nuevoCoche.velocidad);
	}
	
	

}
