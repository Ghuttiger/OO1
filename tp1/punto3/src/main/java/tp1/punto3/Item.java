package tp1.punto3;

public class Item {
	private String detalle;
	private int cantidad;
	private double costoUnitario;
	
	public Item (String detalle, int cantidad, double costo) {
		this.detalle=detalle;
		this.cantidad=cantidad;
		this.costoUnitario=costo;
	}
	
	public void setDetalle(String detalle) {
		this.detalle=detalle;
	}
	
	public void setCosto(double costo) {
		this.costoUnitario=costo;
	}
	public void setCantidad(int cantidad) {
		this.cantidad=cantidad;
	}
	
	public String getDetalle() {
		return this.detalle;
	}
	public int getCantidad() {
		return this.cantidad;
	}
	public double getCostoUnitario() {
		return this.costoUnitario;
	}
	
	public double costo() {
		return this.costoUnitario*this.cantidad;
	}
}
