package tp1.punto6;
import java.time.LocalDate;
import java.math.*;

public class Factura {
private Usuario cliente;

public Factura(Usuario cliente) {
	this.cliente=cliente;
}
public String getCliente() {
	return this.cliente.getNombre();
}
public LocalDate getFecha() {
	return this.cliente.getConsumo().getFecha();
}
private double getFactorPotencia() {
	double energiaActiva=this.cliente.getConsumo().getEnergiaActiva();
	double energiaReactiva=this.cliente.getConsumo().getEnergiaReactiva();
    return Math.pow(energiaActiva, 2)/Math.sqrt(Math.pow(energiaActiva, 2)+Math.pow(energiaReactiva, 2));
}
public boolean getBeneficio() {
	if (this.getFactorPotencia()<0.8) {
		return false;
	}
	return true;
}
public double getTotal(CuadroTarifario precio) {
	double energiaActiva=this.cliente.getConsumo().getEnergiaActiva();
	if (this.getBeneficio()) {
		double descuento= energiaActiva*precio.getPrecio()*0.1;
		return energiaActiva*precio.getPrecio()-descuento;
	}
	return energiaActiva*precio.getPrecio();
}
}
