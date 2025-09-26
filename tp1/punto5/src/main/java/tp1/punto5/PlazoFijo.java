package tp1.punto5;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
public class PlazoFijo extends Inversion{
	private LocalDate fecha;
	private double monto;
	private double interes;
	
	public PlazoFijo(LocalDate fecha, double monto, double interes) {
		this.fecha=fecha;
		this.interes=interes;
		this.monto=monto;
	}
	
	public double getValorActual() {
		int dias= (int) ChronoUnit.DAYS.between(fecha, LocalDate.now());
		return this.monto*this.interes*dias;
	}
}
