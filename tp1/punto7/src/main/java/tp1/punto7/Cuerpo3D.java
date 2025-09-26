package tp1.punto7;

public class Cuerpo3D {
private Figura caraBasal;
private double altura;

public Cuerpo3D() {
	
}
public void setCaraBasal(Figura x) {
	this.caraBasal=x;
}
public void setAltura(double x) {
	this.altura=x;
}
public double getAltura() {
	return this.altura;
}
public double getSuperficieExterior() {
	return 2*this.caraBasal.getArea()+this.caraBasal.getPerimetro()*this.altura;
}
public double getVolumen() {
	return this.caraBasal.getArea()*this.altura;
}
}
