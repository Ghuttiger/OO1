package tp.punto15;
import java.util.List;
import java.util.ArrayList;
public class ClienteDeCorreo {
	private Carpeta inbox;
	private List <Carpeta> carpetas;
	
public ClienteDeCorreo() {
	this.carpetas=new ArrayList<Carpeta>();
}
public void setInbox(Carpeta carpeta) {
	this.inbox=carpeta;
}
public void recibir(Email email) {
	this.inbox.agregarEmail(email);
}
public Email buscar(String texto) {
	for (Carpeta carpeta:carpetas ) {
		if (carpeta.comparar(texto)!=null) {
			return carpeta.comparar(texto);
			}
		}
	return null;
}
public int espacioOcupado() {
	return this.carpetas.stream().mapToInt(c->c.tamaño()).sum()+this.inbox.tamaño();
}
}
