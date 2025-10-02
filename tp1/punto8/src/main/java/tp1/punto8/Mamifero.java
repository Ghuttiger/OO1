package tp1.punto8;
import java.time.LocalDate;

public class Mamifero {
private String identificador;
private String especie;
private LocalDate nacimiento;
private Mamifero padre;
private Mamifero madre;

public Mamifero(String nombre) {
	this.identificador=nombre;
}
public Mamifero() {
	
}
public String getIdentificador() {
	return this.identificador;
}
public void setIdentificador(String identificador) {
	this.identificador=identificador;
}
public String getEspecie() {
	return this.especie;
}
public void setEspecie(String especie) {
	this.especie=especie;
}
public LocalDate getFechaNacimiento() {
	return this.nacimiento;
}
public void setFechaNacimiento(LocalDate nacimiento) {
	this.nacimiento=nacimiento;
}
public Mamifero getPadre() {
	return this.padre;
}
public void setPadre(Mamifero padre) {
	this.padre=padre;
}
public Mamifero getMadre() {
	return this.madre;
}
public void setMadre(Mamifero madre) {
	this.madre=madre;
}
public Mamifero getAbueloPaterno() {
	if (this.padre==null) {
		return null;
	}
	return this.padre.getPadre();
}
public Mamifero getAbuelaPaterna() {
	if (this.padre==null) {
		return null;
	}
	return this.padre.getMadre();
}
public Mamifero getAbueloMaterno() {
	if (this.madre==null) {
		return null;
	}
	return this.madre.getPadre();
}
public Mamifero getAbuelaMaterna() {
	if (this.madre==null) {
		return null;
	}
	return this.madre.getMadre();
}
public boolean tieneComoAncestroA(Mamifero x) {
	if (x==null) {
		return false;
	}
	boolean madre=false;
	boolean padre=false;
	if ((this.getMadre()==x)||(this.padre==x)) {
		return true;
	}
	if(this.getMadre()!=null) {
		madre= this.getMadre().tieneComoAncestroA(x);
	}
	if (this.getPadre()!=null){
		padre= this.getPadre().tieneComoAncestroA(x);
	}
	return madre||padre;
}
}