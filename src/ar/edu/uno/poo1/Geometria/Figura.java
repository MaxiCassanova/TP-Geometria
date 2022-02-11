package ar.edu.uno.poo1.Geometria;

public abstract class Figura implements Comparable<Figura>, Desplazable{
	private Punto puntoInicial;
	
	public Figura(Punto punto) {
		this.puntoInicial = punto;
	}
	
	public Figura(double x, double y) {
		this.puntoInicial = new Punto(x,y);
	}

	public Punto getPuntoInicial() {
		return puntoInicial;
	}
	
	public abstract double getArea(); 

	
	public void desplazar(double x, double y) {
		this.puntoInicial.desplazar(x,y);
	}
	
	
	public int compareTo(Figura figura) {
		if(this.getArea()< figura.getArea()) return -1;
		if(this.getArea()> figura.getArea()) return 1;
		return 0;
		
	}
}
