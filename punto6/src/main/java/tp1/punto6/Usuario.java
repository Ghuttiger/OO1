package tp1.punto6;
import java.util.List;
import java.util.ArrayList;
public class Usuario {
	private String nombre;
	private String domicilio;
	private List<Consumo>consumos;
public Usuario(String nombre, String domicilio) {
	this.domicilio=domicilio;
	this.nombre=nombre;
	this.consumos =new ArrayList<Consumo>();
}

public String getNombre() {
	return this.nombre;
}

public Consumo getConsumo() {
	return this.consumos.get(this.consumos.size()-1);
}

public void agregarConsumo(Consumo x) {
	this.consumos.add(x);
}


}
