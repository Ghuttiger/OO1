package tp1.punto6;
import java.time.LocalDate;
public class Consumo {
	private double energiaActiva;
	private double energiaReactiva;
	private LocalDate fecha;
	
public Consumo(double energiaActiva, double energiaReactiva, LocalDate fecha) {
	this.energiaActiva=energiaActiva;
	this.energiaReactiva=energiaReactiva;
	this.fecha=fecha;
}

public double getEnergiaActiva() {
	return this.energiaActiva;
}

public double getEnergiaReactiva() {
	return this.energiaReactiva;
}

public LocalDate getFecha() {
	return this.fecha;
}

}
