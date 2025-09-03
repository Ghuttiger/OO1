package tp1.punto3;
import java.time.LocalDate;
import java.util.ArrayList;

public class Presupuesto {
	private LocalDate fecha;
	private String cliente;
	private ArrayList<Item> items;
	
	public Presupuesto(String cliente) {
		this.fecha= LocalDate.now();
		this.cliente=cliente;
		this.items= new ArrayList<>();
	}
	
	public void agregarItem(Item item) {
		this.items.add(item);
	}
	
	public LocalDate getFecha() {
		return this.fecha;
	}
	
	public String getCliente() {
		return this.cliente;
	}
	
	public double calcularTotal() {
		return this.items.stream().mapToDouble(Item::costo).sum();
	}
}
