package tp1.punto19;
import java.util.List;
import java.util.ArrayList;
import java.time.LocalDate;
public class Inmueble {
	private String nombre;
	private String direccion;
	private double precio;
	private List <Fecha> fechas;
	
public Inmueble(String nombre, String direccion, double precio) {
	this.nombre=nombre;
	this.direccion=direccion;
	this.precio=precio;
	this.fechas=new ArrayList<Fecha>();
}

public boolean disponible(LocalDate from, LocalDate to) {
	for (Fecha fechas:fechas) {
		if (fechas.esta(from)&&fechas.esta(to)) {
			return false;
		}
	}
	return true;
}

public String getNombre() {
	return this.nombre;
}
public double getPrecio() {
	return this.precio;
}

public void agregarReserva(LocalDate from, LocalDate to) {
	this.fechas.add(new Fecha(from,to));
}

public double precio(int dias) {
	return this.precio*dias;
}
public boolean cancelar(LocalDate from) {
		return this.fechas.removeIf(f->f.getFecha().equals(from));
}
}