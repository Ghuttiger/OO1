package tp.punto15;
import java.util.List;
import java.util.ArrayList;
public class Email {
	private String titulo;
	private String cuerpo;
	private List <Archivo> archivos;
	
public Email(String titulo, String cuerpo) {
	this.cuerpo=cuerpo;
	this.titulo=titulo;
	this.archivos=new ArrayList<Archivo>();
}
public void agregarArchivo (Archivo archivo) {
	this.archivos.add(archivo);
}
public String getTitulo() {
	return this.titulo;
}
public String getCuerpo() {
	return this.cuerpo;
}
public int tamaño() {
	return this.archivos.stream().mapToInt(a->a.tamaño()).sum()+this.cuerpo.length()+this.cuerpo.length();
}
public boolean comparar(String texto) {
	return this.cuerpo.equals(texto)||  this.titulo.equals(texto);
}
}
