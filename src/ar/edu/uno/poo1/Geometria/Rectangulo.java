package ar.edu.uno.poo1.Geometria;

public class Rectangulo extends Figura{
	
	private Punto puntoDerecho;
	
	public Rectangulo(Punto puntoInicial, Punto puntoDerecho) {
		super(puntoInicial);
		this.puntoDerecho = puntoDerecho;
	}
	
	public Rectangulo(double xInicial, double yInicial, double xDerecho, double yDerecho) {
		super(xInicial, yInicial);
		this.puntoDerecho = new Punto(xDerecho, yDerecho);
	}
	
	public Punto getPuntoDerecho(){
		return this.puntoDerecho;
	}

	@Override
	public void desplazar(double x, double y) {
		this.getPuntoInicial().desplazar(x, y);
		this.getPuntoDerecho().desplazar(x, y);
	}
	
	@Override
	public double getArea() {
		double base = this.getPuntoDerecho().getX() - this.getPuntoInicial().getX();
		double altura = this.getPuntoDerecho().getY() - this.getPuntoInicial().getY();
		return base*altura;
	}

}
