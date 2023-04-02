package tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class TestCoche {

	@Test
	void testAlCrearCocheSuVelocidadEsCero_AntonioaDavid() {
		Coche nuevoCoche = new Coche();
		Assertions.assertEquals(0, nuevoCoche.velocidad);
	}
	
	@Test
	void testAlacelerarUnCocheSuVelocidadAumenta_AntonioDavid() {
		Coche nuevoCoche = new Coche();
		nuevoCoche.acelerar_AntonioDavid(30);
		Assertions.assertEquals(30, nuevoCoche.velocidad);
	}
	
	@Test
	void testAlacelerarUnCocheSuVelocidadDisminuye_AntonioDavid() {
		Coche nuevoCoche = new Coche();
		nuevoCoche.velocidad=50;
		nuevoCoche.decelerar_AntonioDavid(20);
		Assertions.assertEquals(30, nuevoCoche.velocidad);
	}
	
	@Test
	void testAlacelerarUnCocheSuVelocidadPuedeSerMenorQueCero_AntonioDavid() {
		Coche nuevoCoche = new Coche();
		nuevoCoche.velocidad=50;
		nuevoCoche.decelerar_AntonioDavid(80);
		Assertions.assertEquals(0, nuevoCoche.velocidad);
	}
	
	

}
