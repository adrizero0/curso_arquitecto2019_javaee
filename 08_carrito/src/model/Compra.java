package model;

public class Compra {
	private String producto;
	private int unidades;
	private double precio;
	
	public Compra(String producto, int unidades, double precio) {
		super();
		this.producto = producto;
		this.unidades = unidades;
		this.precio = precio;
	}
	public String getProducto() {
		return producto;
	}
	public void setProducto(String producto) {
		this.producto = producto;
	}
	public int getUnidades() {
		return unidades;
	}
	public void setUnidades(int unidades) {
		this.unidades = unidades;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
}
