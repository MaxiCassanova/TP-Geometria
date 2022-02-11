package ar.edu.uno.poo1.Geometria;

public class Cuadrado extends Rectangulo{
	private double lado;


	public Cuadrado(double lado, Punto puntoInicial) {
		super(puntoInicial, new Punto(puntoInicial.getX()+lado, puntoInicial.getY()+lado));
		this.lado = lado;
	}
	

	public Cuadrado(double lado, double xInicial, double yInicial) {
		super(xInicial, yInicial, xInicial+lado, yInicial+lado);
		this.lado = lado;
	}
	
	public double getLado() {
		return this.lado;
	}
	
	@Override
	public double getArea() {
		return this.lado*this.lado;
	}


	@Override
	public String toString() {
		return "Cuadrado [lado=" + lado + ", getArea()=" + getArea() + "]";
	}
	
}
