package tp1.punto21;
import java.time.LocalDate;
public class Local extends Envio {
	private boolean rapido;
	
public Local (LocalDate fecha, String origen, String destino, int peso, boolean rapido) {
	this.setFecha(fecha);
	this.setOrigen(origen);
	this.setDestino(destino);
	this.setPeso(peso);
	this.rapido=rapido;
}
public double calcularMonto() {
	if (rapido) {
		return 1500;
	}
	return 1000;
}
}
