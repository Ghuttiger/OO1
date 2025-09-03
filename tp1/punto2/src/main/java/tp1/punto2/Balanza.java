package tp1.punto2;

public class Balanza {
	private int cantidadDeProductos;
	private double precioTotal;
	private double pesoTotal;
	
	public Balanza () {
		this.cantidadDeProductos=0;
		this.pesoTotal=0;
		this.precioTotal=0;
	}
	
	public void ponerEnCero() {
		this.cantidadDeProductos=0;
		this.pesoTotal=0;
		this.precioTotal=0;
	}
	
	public void agregarProducto(Producto producto) {
		this.cantidadDeProductos++;
		this.pesoTotal+= producto.getPeso();
		this.precioTotal+= producto.getPeso()*producto.getPrecio();
	}

	public Ticket emitirTicket(){
		return new Ticket(this.cantidadDeProductos,this.pesoTotal,this.precioTotal);
	}
	
	public double getPesoTotal() {
		return this.pesoTotal;
	}
	
	public int getCantidadDeProductos() {
		return this.cantidadDeProductos;
	}
	
	public double getPrecioTotal() {
		return this.precioTotal;
	}
}
