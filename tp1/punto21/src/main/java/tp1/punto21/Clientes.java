package tp1.punto21;
import java.util.List;
import java.util.ArrayList;
import java.time.LocalDate;
public abstract class Clientes {
	private String nombre;
	private String direccion;
	private List <Envio>piden;

public void setNombre(String nombre) {
	this.nombre=nombre;
}

public void setDireccion(String direccion) {
	this.direccion=direccion;
}

public void setPiden() {
	this.piden=new ArrayList<Envio>();
}
	
public void agregarEnvio(Envio pedido) {
	this.piden.add(pedido);
}
public abstract double montoPagar(LocalDate from, LocalDate to);

public List<Envio> getPiden(){
	return this.piden;
}
}
