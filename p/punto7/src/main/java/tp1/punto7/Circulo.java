package tp1.punto7;
import java.math.*;

public class Circulo extends Figura{
	private double radio;

	public Circulo () {
	}
	
	public void setRadio(double radio) {
		this.radio=radio;
	}
	
	public double getRadio() {
		return this.radio;
	}
	public double getDiametro() {
		return this.radio*2;
	}
	public double getPerimetro() {
		return Math.PI*this.getDiametro();
	}
	public double getArea() {
		return Math.PI*Math.pow(radio, 2);
	}
}
