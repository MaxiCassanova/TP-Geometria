package ar.edu.uno.poo1.Geometria;

public class Segmento implements Comparable<Segmento>, Desplazable{
	
	private Punto puntoInicial;
	private Punto puntoSecundario;
	
	public Segmento(Punto puntoInicial, Punto puntoSecundario) {
		this.puntoInicial = puntoInicial;
		this.puntoSecundario = puntoSecundario;
	}
	public Segmento(double xInicial, double yInicial, double xSecundario, double ySecundario) {
		this.puntoInicial = new Punto(xInicial, yInicial);
		this.puntoSecundario = new Punto(xSecundario, ySecundario);
	}
	
	public Punto getPuntoInicial() {
		return puntoInicial;
	}
	public void setPuntoInicial(Punto puntoInicial) {
		this.puntoInicial = puntoInicial;
	}
	public Punto getPuntoSecundario() {
		return puntoSecundario;
	}
	public void setPuntoSecundario(Punto puntoSecundario) {
		this.puntoSecundario = puntoSecundario;
	}
	
	public double calcularLongitud () {
		return Math.sqrt((Math.pow((this.getPuntoSecundario().getX()-this.getPuntoInicial().getX()), 2)+Math.pow((this.getPuntoSecundario().getY()-this.getPuntoInicial().getY()), 2)));
	}
	
	public boolean esParaleloAX() {
		if(this.getPuntoInicial().getY() == this.getPuntoSecundario().getY())
			return true;
		return false;
	}
	
	public boolean esParaleloAY() {
		if(this.getPuntoInicial().getX() == this.getPuntoSecundario().getX())
			return true;
		return false;
	}
	
	public boolean esParaleloASeg(Segmento segmento) {
		if(this.esParaleloAX()) {
			if(segmento.esParaleloAX())
				return true;
			else
				return false;
		}
		if(this.esParaleloAY()) {
			if(segmento.esParaleloAY())
				return true;
			else
				return false;
		}
		double m1 = (this.getPuntoSecundario().getY() - this.getPuntoInicial().getY())/(this.getPuntoSecundario().getX() - this.getPuntoInicial().getX());
		double m2 = (segmento.getPuntoSecundario().getY() - segmento.getPuntoInicial().getY())/(segmento.getPuntoSecundario().getX() - segmento.getPuntoInicial().getX());
		if(m1 == m2) return true;
		else return false;
	}

	public void desplazar(double x, double y) {
		this.getPuntoInicial().desplazar(x, y);
		this.getPuntoSecundario().desplazar(x, y);
	}
	
	public int compareTo(Segmento segmento) {
				if(this.calcularLongitud() < segmento.calcularLongitud()) return -1;
				if(this.calcularLongitud()> segmento.calcularLongitud()) return 1;
				return 0;
	}
	
	

}
