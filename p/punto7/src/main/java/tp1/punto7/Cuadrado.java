package tp1.punto7;
import java.math.*;

public class Cuadrado extends Figura {
private double lado;

public Cuadrado() {
}

public void setLado(double lado) {
	this.lado=lado;
}
public double getLado() {
	return this.lado;
}
public double getPerimetro() {
	return this.lado*4;
}
public double getArea() {
	return Math.pow(lado, 2);
}
}
