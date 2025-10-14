package tp.punto14;
import java.math.*;
public class Cilindro extends Pieza {
	private double radio;
	private double altura;
public Cilindro (double radio, double altura, String material, String color) {
	this.altura=altura;
	this.color=color;
	this.material=material;
	this.radio=radio;
}
public double getVolumen() {
	return Math.PI*Math.pow(radio, 2)*this.altura;
}
public double getSuperficie() {
	return 2*Math.PI*this.altura*this.radio+2*Math.PI*Math.pow(radio, 2);
}
}
