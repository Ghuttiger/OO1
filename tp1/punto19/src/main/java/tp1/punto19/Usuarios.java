package tp1.punto19;
import java.util.List;
import java.util.ArrayList;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
public class Usuarios {
	private String nombre;
	private String direccion;
	private int DNI;
	private List <Inmueble> alquileres;
public Usuarios(String nombre, String direccion, int DNI) {
	this.nombre=nombre;
	this.direccion=direccion;
	this.DNI=DNI;
	this.alquileres=new ArrayList<Inmueble>();
}

public boolean crearReserva(Inmueble alquiler, LocalDate from, LocalDate to) {
	if (alquiler.disponible(from, to)) {
		this.alquileres.add(alquiler);
		return true;
	}
	return false;
}
public double calcularPrecio(Inmueble alquiler, LocalDate from, LocalDate to) {
	return alquiler.precio((int)ChronoUnit.DAYS.between(from, to));
}

public boolean cancelar (Inmueble alquiler, LocalDate from) {
	return this.alquileres.removeIf(a->a.getNombre()==alquiler.getNombre()&&a.cancelar(from));
}
}
