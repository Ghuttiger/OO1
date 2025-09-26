package tp1.punto4;
import java.time.LocalDate;
import java.util.List;
import java.util.ArrayList;
public class Ticket {
	private LocalDate fecha;
	private List<Producto> productos;
	
	public Ticket(List<Producto>productos){
		this.fecha=LocalDate.now();
		this.productos=productos;
	}
	
	public double impuesto() {
		return this.getPrecioTotal()*0.21;
	}
	
	public LocalDate getFecha() {
		return this.fecha;
	}
	
	public int getCantidadDeProductos() {
		return this.productos.size();
	}
	
	public double getPesoTotal() {
		return this.productos.stream().mapToDouble(Producto::getPeso).sum();
	}
	
	public double getPrecioTotal() {
		return this.productos.stream().mapToDouble(Producto::getPrecio).sum();
	}
}
