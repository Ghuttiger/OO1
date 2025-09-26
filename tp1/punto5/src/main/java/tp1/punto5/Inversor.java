package tp1.punto5;
import java.util.List;
import java.util.ArrayList;
public class Inversor {
	private List<Inversion>inverisones;
	
	public Inversor(){
		this.inverisones=new ArrayList<Inversion>();
	}
	
	public void addInverison(Inversion inver) {
		this.inverisones.add(inver);
	}
	
	public void removeInversion(Inversion inver) {
		this.inverisones.remove(inver);
	}
	
	public double inversionToltal() {
		return this.inverisones.stream().mapToDouble(Inversion::getValorActual).sum();
	}
}
