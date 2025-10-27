package tp1.punto21;
import java.time.LocalDate;
public class Interurbanos extends Envio{
	private double distancia;
	
public Interurbanos(LocalDate fecha, String origen, String destino, int peso, double distancia) {
	this.setFecha(fecha);
	this.setOrigen(origen);
	this.setDestino(destino);
	this.setPeso(peso);
	this.distancia=distancia;
}

public double calcularMonto() {
	if (this.distancia<100) {
		return this.getPeso()*20;
	}
	else if (this.distancia<500) {
		return this.getPeso()*25;
	}
	return this.getPeso()*30;
}
}
