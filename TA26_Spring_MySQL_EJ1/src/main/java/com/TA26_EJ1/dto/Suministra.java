package com.TA26_EJ1.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;



@Entity
@Table(name="suministra")
public class Suministra {

	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
 	@Column
    private int precio;
	 
	@ManyToOne
    @JoinColumn(name = "pieza")
    Pieza pieza;
	
	@ManyToOne
    @JoinColumn(name = "proveedor")
    Proveedor proveedor;
	
   
   
    

	public Suministra() {
	}

	
	
	public Suministra(int id, Proveedor proveedor, Pieza pieza, int precio) {
		this.id = id;
		this.proveedor = proveedor;
		this.pieza = pieza;
		this.precio=precio;
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
	 * @return the proveedor
	 */
	public Proveedor getProveedor() {
		return proveedor;
	}

	/**
	 * @param proveedor the proveedor to set
	 */
	public void setProveedor(Proveedor proveedor) {
		this.proveedor = proveedor;
	}

	/**
	 * @return the pieza
	 */
	public Pieza getPieza() {
		return pieza;
	}

	/**
	 * @param pieza the pieza to set
	 */
	public void setPieza(Pieza pieza) {
		this.pieza = pieza;
	}

	/**
	 * @return the precio
	 */
	public int getPrecio() {
		return precio;
	}

	/**
	 * @param precio the precio to set
	 */
	public void setPrecio(int precio) {
		this.precio = precio;
	}

	@Override
	public String toString() {
		return "Suministra [id=" + id + ", proveedor_id=" + proveedor + ", pieza_id=" + pieza + ", precio=" + precio + "]";
	}
}
