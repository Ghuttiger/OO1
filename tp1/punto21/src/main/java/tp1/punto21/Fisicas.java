package tp1.punto21;
import java.util.ArrayList;
import java.util.List;
import java.time.LocalDate;
public class Fisicas extends Clientes {
	private int DNI;
	
public Fisicas(String nombre, String direccion, int DNI) {
	this.setNombre(nombre);
	this.setDireccion(direccion);
	this.setPiden();
	this.DNI=DNI;
}

public double montoPagar(LocalDate from, LocalDate to) {
	List <Envio> filtro=this.getPiden().stream().filter(p->p.pertenece(from, to)).toList();
	return filtro.stream().mapToDouble(f->f.calcularMonto()).count();
}
}
