package tp.punto14;
import java.math.*;
public class PrismaRectangular extends Pieza{
	private double ladoMayor;
	private double ladoMenor;
	private double altura;
	
public PrismaRectangular(double ladoMayor, double ladoMenor, double altura, String material, String color) {
	this.altura=altura;
	this.ladoMayor=ladoMayor;
	this.ladoMenor=ladoMenor;
	this.material=material;
	this.color=color;
}
public double getVolumen() {
	return this.altura*this.ladoMayor*this.ladoMenor;
}
public double getSuperficie() {
	return 2*(this.ladoMayor*this.ladoMenor+this.ladoMayor*this.altura+this.ladoMenor*this.altura);
}
}
