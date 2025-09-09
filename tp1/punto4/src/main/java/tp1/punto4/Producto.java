package tp1.punto4;

public class Producto {
	private double peso;
	private double precioXKilo;
	private String descripcion;
	
	public Producto (String descripcion, double peso, double precio) {
		this.peso=peso;
		this.precioXKilo=precio;
		this.descripcion=descripcion;
	}
	
	public void setPrecioPorKilo(double precio) {
		this.precioXKilo=precio;
	}
	
	public double getPrecioPorKilo(){
		return this.precioXKilo;
	}
	
	public double getPeso() {
		return this.peso;
	}
	
	public String getDescripcion() {
		return this.descripcion;
	}
	
	public double getPrecio() {
		return this.peso*this.precioXKilo;
	}
	
}
