package com.TA26_EJ3.dto;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;


@Entity
@Table(name="cajero")
public class Cajero {

	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column
	private String nomapels;
	
	@OneToMany
    @JoinColumn(name="cajero")
    private List<Venta> venta;

	
	/**
	 * 
	 */
	public Cajero() {
		super();
	}

	/**
	 * @param id
	 * @param nomapels
	 * @param suministra
	 */
	public Cajero(int id, String nomapels, List<Venta> venta) {
		super();
		this.id = id;
		this.nomapels = nomapels;
		this.venta = venta;
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
	 * @return the nomapels
	 */
	public String getNomapels() {
		return nomapels;
	}

	/**
	 * @param nomapels the nomapels to set
	 */
	public void setNomapels(String nomapels) {
		this.nomapels = nomapels;
	}

	/**
	 * @return the suministra
	 */
	@JsonIgnore
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "cajero")
	public List<Venta> getVenta() {
		return venta;
	}

	/**
	 * @param suministra the suministra to set
	 */
	public void setVenta(List<Venta> venta) {
		this.venta = venta;
	}

	@Override
	public String toString() {
		return "Cajero [id=" + id + ", nomapels=" + nomapels + ", venta=" + venta + "]";
	}
	
	
	
	
}
