package tp1.punto19;
import java.time.LocalDate;
public class Fecha {
	private LocalDate from;
	private LocalDate to;
	
public Fecha (LocalDate from, LocalDate to) {
	this.from=from;
	this.to=to;
}
public LocalDate getFecha() {
	return this.from;
}
public boolean esta(LocalDate unaFecha) {
	return (unaFecha.isAfter(from)&&unaFecha.isBefore(to));
}
}
