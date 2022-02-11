package ar.edu.uno.poo1.Geometria;

public class Triangulo extends Figura{
	private Punto puntoDerecho;
	private Punto puntoRestante;
	
	public Triangulo(Punto puntoInicial, Punto puntoDerecho, Punto puntoRestante) {
		super(puntoInicial);
		this.puntoDerecho = puntoDerecho;
		this.puntoRestante = puntoRestante;
	}
	
	public Triangulo(double xInicial, double yInicial, double xDerecho, double yDerecho, double xRestante, double yRestante) {
		super(xInicial, yInicial);
		this.puntoDerecho = new Punto (xDerecho, yDerecho);
		this.puntoRestante = new Punto (xRestante, yRestante);
	}
	
	public Punto getPuntoDerecho() {
		return this.puntoDerecho;
	}
	
	public Punto getPuntoRestante() {
		return this.puntoRestante;
	}
	

	@Override
	public void desplazar(double x, double y) {
		this.getPuntoInicial().desplazar(x, y);
		this.getPuntoDerecho().desplazar(x, y);
		this.getPuntoRestante().desplazar(x, y);
	}
	
	public boolean esParaleloAX() {
		if(this.getPuntoInicial().getY() == this.getPuntoDerecho().getY())
			return true;
		if(this.getPuntoInicial().getY() == this.getPuntoRestante().getY())
			return true;
		if(this.getPuntoDerecho().getY()== this.getPuntoRestante().getY())
			return true;
		return false;
	}
	
	public boolean esParaleloAY() {
		if(this.getPuntoInicial().getX() == this.getPuntoDerecho().getX())
			return true;
		if(this.getPuntoInicial().getX() == this.getPuntoRestante().getX())
			return true;
		if(this.getPuntoDerecho().getX()== this.getPuntoRestante().getX())
			return true;
		return false;
	}
	
	@Override
	public double getArea() {
		double base = this.getPuntoDerecho().getX()-this.getPuntoInicial().getX();
		double yMayor = Math.max(this.getPuntoInicial().getY(), Math.max(this.getPuntoDerecho().getY(), this.getPuntoRestante().getY()));
		double yMenor = Math.min(this.getPuntoInicial().getY(), Math.min(this.getPuntoDerecho().getY(), this.getPuntoRestante().getY()));
		double altura = yMayor-yMenor;
		return (base*altura)/2;
	}

}
