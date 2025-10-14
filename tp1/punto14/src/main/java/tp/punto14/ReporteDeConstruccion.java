package tp.punto14;
import java.util.List;
import java.util.ArrayList;
public class ReporteDeConstruccion {
	private List <Pieza> piezas;
	
public ReporteDeConstruccion() {
	piezas=new ArrayList<>();
}
public void agregarPieza(Pieza pieza) {
	this.piezas.add(pieza);
}

public double volumenDeMateril(String material) {
	return this.piezas.stream().filter(p->p.getMaterial().equals(material.toLowerCase())).mapToDouble(p->p.getVolumen()).sum();
}
public double  superficeDeColor(String color) {
	return this.piezas.stream().filter(p-> p.getMaterial().equals(color.toLowerCase())).mapToDouble(p->p.getSuperficie()).sum();
}
}

