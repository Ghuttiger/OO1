package tp.punto14;
import java.math.*;
public class Esfera extends Pieza{
	private double radio;

public Esfera (double radio, String material, String color) {
	this.color=color;
	this.material=material;
	this.radio=radio;
}
public double getVolumen () {
	return 4/3*Math.PI*Math.pow(radio, 3);
}
public double getSuperficie() {
	return 4*Math.PI*Math.pow(radio, 2);
}
}
