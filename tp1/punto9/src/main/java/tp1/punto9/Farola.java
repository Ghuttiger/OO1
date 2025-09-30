package tp1.punto9;
import java.util.List;
import java.util.ArrayList;
public class Farola {
private boolean estado;
private List <Farola> vecinas;

public Farola() {
	this.estado=false;
	this.vecinas=new ArrayList<Farola>();
}

public void pairWithNeighbor(Farola unaFarola) {
	this.vecinas.add(unaFarola);
	unaFarola.getNeighbors().add(this);
}
public List getNeighbors() {
	return this.vecinas;
}
public boolean isOn() {
	return this.estado;
}
public boolean isOff() {
	return !this.estado;
}
public void turnOn(){
	if (this.isOff()){
		this.estado=true;
		for (Farola vecina:vecinas) {
			vecina.turnOn();
		}
	}
}
public void turnOff() {
	if (this.isOn()) {
		this.estado=false;
		for (Farola vecina:vecinas) {
			vecina.turnOff();
		}
	}
}
}
