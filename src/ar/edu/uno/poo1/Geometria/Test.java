package ar.edu.uno.poo1.Geometria;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;

class Test {

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@org.junit.jupiter.api.Test
	void testPunto() {
		Punto punto = new Punto (5.00, 4.00);
		assertEquals(punto.getX(), 5.00);
		assertEquals(punto.getY(), 4.00);
		punto.desplazar(2.00, 2.00);
		assertEquals(punto.getX(), 7.00);
		assertEquals(punto.getY(), 6.00);
	}
	
	@org.junit.jupiter.api.Test
	void testElipse() {
		Elipse elipse = new Elipse (5.0,4.0,6.0,3.0);
		assertEquals(elipse.getRadio1(), 5.0);
		assertEquals(elipse.getRadio2(), 4.0);
		assertEquals(elipse.getPuntoInicial().getX(), 6.0);
		assertEquals(elipse.getPuntoInicial().getY(), 3.0);
		elipse.desplazar(-1.0, -2.0);
		assertEquals(elipse.getPuntoInicial().getX(), 5.0);
		assertEquals(elipse.getPuntoInicial().getY(), 1.0);
		assertEquals(elipse.getArea(), 62.83185307179586);
		Elipse elipse2 = new Elipse(2.0,2.0,3.0,1.0);
		assertEquals(elipse.compareTo(elipse2), 1);
	}
	
	@org.junit.jupiter.api.Test
	void testCirculo() {
		Circulo circulo = new Circulo(5.0,4.0,6.0);
		assertEquals(circulo.getRadio1(), 5.0);
		assertEquals(circulo.getRadio2(), 5.0);
		assertEquals(circulo.getPuntoInicial().getX(), 4.0);
		assertEquals(circulo.getPuntoInicial().getY(), 6.0);
		circulo.desplazar(2.0, 2.0);
		assertEquals(circulo.getPuntoInicial().getX(), 6.0);
		assertEquals(circulo.getPuntoInicial().getY(), 8.0);
		Circulo circulo2 = new Circulo(3.0, 2.0, 6.0);
		assertEquals(circulo.compareTo(circulo2), 1);
		assertEquals(circulo.getArea(), 78.53981633974483);
	}
	
	@org.junit.jupiter.api.Test
	void testTriangulo() {
		Triangulo triangulo = new Triangulo(5.0,4.0,6.0,4.0,3.0,5.0);
		assertEquals(triangulo.getPuntoDerecho().getX(), 6.0);
		assertEquals(triangulo.getPuntoDerecho().getY(), 4.0);
		assertEquals(triangulo.getPuntoInicial().getX(), 5.0);
		assertEquals(triangulo.getPuntoInicial().getY(), 4.0);
		assertEquals(triangulo.getPuntoRestante().getX(), 3.0);
		assertEquals(triangulo.getPuntoRestante().getY(), 5.0);
		assertEquals(triangulo.esParaleloAX(), true);
		assertEquals(triangulo.esParaleloAY(), false);
		assertEquals(triangulo.getArea(), 0.5);
		Triangulo triangulo2 = new Triangulo(1.0,2.0,3.0,4.0,5.0,9.0);
		assertEquals(triangulo.compareTo(triangulo2), -1);
	}
	
	@org.junit.jupiter.api.Test
	void testRectangulo() {
		Rectangulo rectangulo = new Rectangulo(new Punto(7.0,3.0), new Punto(5.0,2.0));
		assertEquals(rectangulo.getPuntoInicial().getX(), 7.0);
		assertEquals(rectangulo.getPuntoInicial().getY(), 3.0);
		assertEquals(rectangulo.getPuntoDerecho().getX(), 5.0);
		assertEquals(rectangulo.getPuntoDerecho().getY(), 2.0);
		rectangulo.desplazar(1, 1);
		assertEquals(rectangulo.getPuntoInicial().getX(), 8.0);
		assertEquals(rectangulo.getPuntoInicial().getY(), 4.0);
		assertEquals(rectangulo.getPuntoDerecho().getX(), 6.0);
		assertEquals(rectangulo.getPuntoDerecho().getY(), 3.0);
		assertEquals(rectangulo.getArea(), 2.0);
		Rectangulo rectangulo2 = new Rectangulo(1.0,1.0,5.0,5.0);
		assertEquals(rectangulo.compareTo(rectangulo2), -1);
	}
	
	@org.junit.jupiter.api.Test
	void testCuadrado() {
		Cuadrado cuadrado = new Cuadrado(4.0,7.0,7.0);
		assertEquals(cuadrado.getPuntoInicial().getX(), 7.0);
		assertEquals(cuadrado.getPuntoInicial().getY(), 7.0);
		assertEquals(cuadrado.getLado(), 4.0);
		assertEquals(cuadrado.getPuntoDerecho().getX(), 11.0);
		assertEquals(cuadrado.getPuntoDerecho().getY(), 11.0);
		assertEquals(cuadrado.getArea(), 16.0);
		cuadrado.desplazar(2, 2);
		assertEquals(cuadrado.getPuntoInicial().getX(), 9.0);
		assertEquals(cuadrado.getPuntoInicial().getY(), 9.0);
		assertEquals(cuadrado.getLado(), 4.0);
		assertEquals(cuadrado.getPuntoDerecho().getX(), 13.0);
		assertEquals(cuadrado.getPuntoDerecho().getY(), 13.0);
		Cuadrado cuadrado2 = new Cuadrado(5.0,2.0,2.0);
		assertEquals(cuadrado.compareTo(cuadrado2), -1);
	}
	
	@org.junit.jupiter.api.Test
	void testSegmento() {
		Segmento segmento = new Segmento(1.0,1.0,2.0,2.0);
		assertEquals(segmento.getPuntoSecundario().getX(), 2.0);
		assertEquals(segmento.getPuntoSecundario().getY(), 2.0);
		assertEquals(segmento.getPuntoInicial().getX(), 1.0);
		assertEquals(segmento.getPuntoInicial().getY(), 1.0);
		assertEquals(segmento.esParaleloAX(), false);
		assertEquals(segmento.esParaleloAY(), false);
		Segmento segmento2 = new Segmento(3.0,3.0,4.0,4.0);
		assertEquals(segmento.esParaleloASeg(segmento2), true);
		assertEquals(segmento.compareTo(segmento2), 0);
	}

}
