package tp1.punto10;

public abstract class Cuenta {
private double saldo;

public Cuenta() {
	this.saldo=0;
}
public double getSaldo() {
	return this.saldo;
}
public void depositar(double x) {
	this.saldo+=x;
}
public boolean transferirACuenta(double monto, Cuenta cuenta) {
	if (this.puedeExtraer(monto)) {
		this.saldo-=monto;
		cuenta.depositar(monto);
		return true;
	}
	return false;
}
protected boolean puedeExtraer(double monto) {
	if (this.saldo>=monto) {
		return true;
	}
	return false;
}
public boolean extraer(double monto) {
	if (this.puedeExtraer(monto)) {
		this.saldo-=monto;
		return true;
	}
	return false;
}
protected void extraerSinControl(double monto) {
	this.saldo-=monto;
}
}
