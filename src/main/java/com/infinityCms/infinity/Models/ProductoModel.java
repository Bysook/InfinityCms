package com.infinityCms.infinity.Models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "producto")
public class ProductoModel {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(unique = true, nullable = false)
	private Long id;
	
	@Column(nullable = false)
	private String nombreProducto;
	
	@Column(nullable = false)
	private String marca;
	
	@Column(nullable = false)
	private String precio;
	
	@Column(nullable = false)
	private String categoria;
	
	private String descripcion;
	
	private String urlImagenPrincipal;
	
	private String urlImagenUno;
	
	private String urlImagenDos;
	
	private String urlImagenTres;
	
	private String urlImagenCuatro;
	
	private String urlImagenCinco;
	
	private String urlImagenSeis;
	
	private Integer tallaUno;
	
	private Integer tallaDos;
	
	private Integer tallaTres;
	
	private String colorUno;
	
	private String colorDos;
	

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNombreProducto() {
		return nombreProducto;
	}

	public void setNombreProducto(String nombreProducto) {
		this.nombreProducto = nombreProducto;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getPrecio() {
		return precio;
	}

	public void setPrecio(String precio) {
		this.precio = precio;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getUrlImagenPrincipal() {
		return urlImagenPrincipal;
	}

	public void setUrlImagenPrincipal(String urlImagenPrincipal) {
		this.urlImagenPrincipal = urlImagenPrincipal;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public String getUrlImagenUno() {
		return urlImagenUno;
	}

	public void setUrlImagenUno(String urlImagenUno) {
		this.urlImagenUno = urlImagenUno;
	}

	public String getUrlImagenDos() {
		return urlImagenDos;
	}

	public void setUrlImagenDos(String urlImagenDos) {
		this.urlImagenDos = urlImagenDos;
	}

	public String getUrlImagenTres() {
		return urlImagenTres;
	}

	public void setUrlImagenTres(String urlImagenTres) {
		this.urlImagenTres = urlImagenTres;
	}

	public String getUrlImagenCuatro() {
		return urlImagenCuatro;
	}

	public void setUrlImagenCuatro(String urlImagenCuatro) {
		this.urlImagenCuatro = urlImagenCuatro;
	}

	public String getUrlImagenCinco() {
		return urlImagenCinco;
	}

	public void setUrlImagenCinco(String urlImagenCinco) {
		this.urlImagenCinco = urlImagenCinco;
	}

	public String getUrlImagenSeis() {
		return urlImagenSeis;
	}

	public void setUrlImagenSeis(String urlImagenSeis) {
		this.urlImagenSeis = urlImagenSeis;
	}

	public Integer getTallaUno() {
		return tallaUno;
	}

	public void setTallaUno(Integer tallaUno) {
		this.tallaUno = tallaUno;
	}

	public Integer getTallaDos() {
		return tallaDos;
	}

	public void setTallaDos(Integer tallaDos) {
		this.tallaDos = tallaDos;
	}

	public Integer getTallaTres() {
		return tallaTres;
	}

	public void setTallaTres(Integer tallaTres) {
		this.tallaTres = tallaTres;
	}

	public String getColorUno() {
		return colorUno;
	}

	public void setColorUno(String colorUno) {
		this.colorUno = colorUno;
	}

	public String getColorDos() {
		return colorDos;
	}

	public void setColorDos(String colorDos) {
		this.colorDos = colorDos;
	}
	
}
