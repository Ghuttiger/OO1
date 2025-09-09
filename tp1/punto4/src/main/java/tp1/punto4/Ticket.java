package tp1.punto4;
import java.time.LocalDate;
public class Ticket {
	private LocalDate fecha;
	private int cantProductos;
	private double pesoTotal;
	private double PrecioTotal;
	
	public Ticket(int productos, double peso, double precio){
		this.fecha=LocalDate.now();
		this.cantProductos=productos;
		this.pesoTotal=peso;
		this.PrecioTotal=precio;
	}
	
	public double impuesto() {
		return this.PrecioTotal*1.21;
	}
	
	public LocalDate getFecha() {
		return this.fecha;
	}
	
	public int getCantidadDeProductos() {
		return this.cantProductos;
	}
	
	public double getPesoTotal() {
		return this.pesoTotal;
	}
	
	public double getPrecioTotal() {
		return this.PrecioTotal;
	}
}
