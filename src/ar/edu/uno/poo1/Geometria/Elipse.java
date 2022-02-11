package ar.edu.uno.poo1.Geometria;

public class Elipse extends Figura{

	private double radio1;
	private double radio2;
	

	public Elipse(double radio1, double radio2, Punto punto) {
		super(punto);
		this.radio1 = radio1;
		this.radio2 = radio2;
	}
	
	public Elipse(double radio1, double radio2, double x, double y) {
		super(x,y);
		this.radio1 = radio1;
		this.radio2 = radio2;
	}

	public double getRadio1() {
		return radio1;
	}

	public void setRadio1(double radio1) {
		this.radio1 = radio1;
	}

	public double getRadio2() {
		return radio2;
	}

	public void setRadio2(double radio2) {
		this.radio2 = radio2;
	}
	
	@Override
	public double getArea() {
		return Math.PI*this.getRadio1()*this.getRadio2();
	}
	
	
}
