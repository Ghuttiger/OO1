package tp1.punto10;

public class CuentaCorriente extends Cuenta{
public double descubierto;

public CuentaCorriente () {
	this.descubierto=0;
}
public double getDescubierto() {
	return this.descubierto;
}
public void setDescubierto(double x) {
	this.descubierto=x;
}
public boolean extraer(double x) {
	if (this.getSaldo()+this.descubierto>=x) {
		this.extraerSinControl(x);
		return true;
	}
	return false;
}
}
