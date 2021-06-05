package clases.ito.poo;

import java.time.LocalDate;

public class Transportes {
	
	public Transportes(String marca, int modelo, int cantidadmaximacarga, LocalDate fechadeadquisicion) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.cantidadmaximacarga = cantidadmaximacarga;
		this.fechadeadquisicion = fechadeadquisicion;
	}
	private String marca = "";
	private int modelo = 0;
	private int cantidadmaximacarga = 0;
	private LocalDate fechadeadquisicion = null;
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public int getModelo() {
		return modelo;
	}
	public void setModelo(int modelo) {
		this.modelo = modelo;
	}
	public int getCantidadmaximacarga() {
		return cantidadmaximacarga;
	}
	public void setCantidadmaximacarga(int cantidadmaximacarga) {
		this.cantidadmaximacarga = cantidadmaximacarga;
	}
	public LocalDate getFechadeadquisicion() {
		return fechadeadquisicion;
	}
	public void setFechadeadquisicion(LocalDate fechadeadquisicion) {
		this.fechadeadquisicion = fechadeadquisicion;
	}
	@Override
	public String toString() {
		return "Transportes [marca=" + marca + ", modelo=" + modelo + ", cantidadmaximacarga=" + cantidadmaximacarga
				+ ", fechadeadquisicion=" + fechadeadquisicion + "]";
	}
	

}
