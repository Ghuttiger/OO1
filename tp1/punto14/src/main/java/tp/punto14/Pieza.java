package tp.punto14;

public abstract class Pieza {
	protected String material;
	protected String color;
public String getMaterial() {
	return this.material.toLowerCase();
}
public String getColor() {
	return this.color.toLowerCase();
}
public abstract double getVolumen();
public abstract double getSuperficie();
}

