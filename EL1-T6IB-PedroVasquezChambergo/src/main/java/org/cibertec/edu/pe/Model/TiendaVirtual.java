package org.cibertec.edu.pe.Model;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Id;


@Entity
@Table(name="Tiendavirtual")
public class TiendaVirtual {
	@Id
	private String Item;
	private String Articulo;
	private String Descripcion;
	private int Precio;
	private int Cantidad;
	private int Total;
	private int Acciones;
	
	public TiendaVirtual() {
	}

	public TiendaVirtual(String item, String articulo, String descripcion, int precio, int cantidad, int total,
			int acciones) {
		Item = item;
		Articulo = articulo;
		Descripcion = descripcion;
		Precio = precio;
		Cantidad = cantidad;
		Total = total;
		Acciones = acciones;
	}

	public String getItem() {
		return Item;
	}

	public void setItem(String item) {
		Item = item;
	}

	public String getArticulo() {
		return Articulo;
	}

	public void setArticulo(String articulo) {
		Articulo = articulo;
	}

	public String getDescripcion() {
		return Descripcion;
	}

	public void setDescripcion(String descripcion) {
		Descripcion = descripcion;
	}

	public int getPrecio() {
		return Precio;
	}

	public void setPrecio(int precio) {
		Precio = precio;
	}

	public int getCantidad() {
		return Cantidad;
	}

	public void setCantidad(int cantidad) {
		Cantidad = cantidad;
	}

	public int getTotal() {
		return Total;
	}

	public void setTotal(int total) {
		Total = total;
	}

	public int getAcciones() {
		return Acciones;
	}

	public void setAcciones(int acciones) {
		Acciones = acciones;
	}
	
	
}
