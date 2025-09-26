package tp1.punto5;

public class Acciones extends Inversion {
	private String nombre;
	private double valorUnitario;
	private int cantidad;
	
	public Acciones (String nombre, double valorUnitario, int cantidad) {
		this.nombre=nombre;
		this.valorUnitario=valorUnitario;
		this.cantidad=cantidad;
	}

	public double getValorActual() {
		return this.valorUnitario*this.cantidad;
	}
}
