package com.TA26_EJ3.dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="venta")
public class Venta {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@ManyToOne
	@JoinColumn(name = "cajero")
	private Cajero cajero;
	
	@ManyToOne
	@JoinColumn(name = "maquinar")
	private Maquinar maquinar;
	
	@ManyToOne
	@JoinColumn(name = "producto")
	private Producto producto;

	/**
	 * 
	 */
	public Venta() {
		super();
	}

	/**
	 * @param id
	 * @param cajero
	 * @param maquinar
	 * @param producto
	 */
	public Venta(int id, Cajero cajero, Maquinar maquinar, Producto producto) {
		super();
		this.id = id;
		this.cajero = cajero;
		this.maquinar = maquinar;
		this.producto = producto;
	}

	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * @return the cajero
	 */
	public Cajero getCajero() {
		return cajero;
	}

	/**
	 * @param cajero the cajero to set
	 */
	public void setCajero(Cajero cajero) {
		this.cajero = cajero;
	}

	/**
	 * @return the maquinar
	 */
	public Maquinar getMaquinar() {
		return maquinar;
	}

	/**
	 * @param maquinar the maquinar to set
	 */
	public void setMaquinar(Maquinar maquinar) {
		this.maquinar = maquinar;
	}

	/**
	 * @return the producto
	 */
	public Producto getProducto() {
		return producto;
	}

	/**
	 * @param producto the producto to set
	 */
	public void setProducto(Producto producto) {
		this.producto = producto;
	}

	@Override
	public String toString() {
		return "Venta [id=" + id + ", cajero=" + cajero + ", maquinar=" + maquinar + ", producto=" + producto + "]";
	}
	
	
	
}
