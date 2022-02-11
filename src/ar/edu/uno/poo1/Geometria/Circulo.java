package ar.edu.uno.poo1.Geometria;

public class Circulo extends Elipse{
	
	public Circulo(double radio,Punto punto) {
		super(radio, radio, punto);	
	}
	
	public Circulo(double radio, double x, double y) {
		super(radio, radio, x, y);
	}
	
	@Override
	public double getArea() {
		return Math.PI*Math.pow(this.getRadio1(), 2);
	}

}
