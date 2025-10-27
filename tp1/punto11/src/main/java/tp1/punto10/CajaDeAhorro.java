package tp1.punto10;

public class CajaDeAhorro extends Cuenta{

public CajaDeAhorro() {
}
public void depositar(double x) {
	x=x-x*0.02;
	super.depositar(x);
}
public boolean extraer(double x) {
	x=x-x*0.02;
	return super.extraer(x);
}
public boolean transferir(double x, Cuenta cuenta) {
	x=x-x*0.02;
	return super.transferirACuenta(x, cuenta);
}
}
