package tp1.punto21;
import java.time.LocalDate;
public abstract class Envio {
	private LocalDate fecha;
	private String origen;
	private String destino;
	private double peso;
	
public abstract double calcularMonto();

public LocalDate getFecha() {
	return fecha;
}

public void setFecha(LocalDate fecha) {
	this.fecha = fecha;
}

public String getOrigen() {
	return origen;
}

public void setOrigen(String origen) {
	this.origen = origen;
}

public String getDestino() {
	return destino;
}

public void setDestino(String destino) {
	this.destino = destino;
}

public double getPeso() {
	return peso;
}

public void setPeso(double peso) {
	this.peso = peso;
}
public boolean pertenece(LocalDate from, LocalDate to) {
	return (fecha.equals(from) || fecha.isAfter(from))&& (fecha.equals(to) || fecha.isBefore(to));
}
}
