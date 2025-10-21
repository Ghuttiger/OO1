package tp.punto15;
import java.util.List;
import java.util.ArrayList;
public class Carpeta {
	private String nombre;
	private List <Email> emails;
	
public Carpeta(String nombre) {
	this.nombre=nombre;
	this.emails=new ArrayList<Email>();
}

public void agregarEmail(Email email) {
	this.emails.add(email);
}
public void mover (Email email, Carpeta carpetaDestino) {
	carpetaDestino.agregarEmail(email);
	this.emails.remove(email);
}
public List getEmails() {
	return this.emails;
}

public int tamaño() {
	return this.nombre.length()+this.emails.stream().mapToInt(e->e.tamaño()).sum();
}
public Email comparar(String texto) {
	return this.emails.stream().filter(e->e.comparar(texto)).findFirst().orElse(null);
}
}
