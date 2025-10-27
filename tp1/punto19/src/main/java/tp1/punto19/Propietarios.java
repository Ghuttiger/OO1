package tp1.punto19;
import java.util.List;
import java.util.ArrayList;
public class Propietarios extends Usuarios {
	private List <Inmueble> posee;
	
public Propietarios(String nombre, String direccion, int DNI) {
	super(nombre,direccion,DNI);
	this.posee=new ArrayList<Inmueble>();
}

public void agregarPropiedad(Inmueble propiedad) {
	this.posee.add(propiedad);
}
public double ingresos() {
	return this.posee.stream().mapToDouble(p->p.getPrecio()).sum()*0.75;
}
}
