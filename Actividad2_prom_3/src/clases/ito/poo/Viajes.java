package clases.ito.poo;
import java.time.LocalDate;

public class Viajes {
	public Viajes(String cdDedestino, String direccion, LocalDate fechaViaje, LocalDate fechaRegreso,
			String descriCarga, int montoViaje) {
		super();
		this.cdDedestino = cdDedestino;
		this.direccion = direccion;
		this.fechaViaje = fechaViaje;
		this.fechaRegreso = fechaRegreso;
		this.descriCarga = descriCarga;
		this.montoViaje = montoViaje;
	}
	private String cdDedestino = "";
	private String direccion = "";
	private LocalDate fechaViaje = null;
	private LocalDate fechaRegreso = null;
	private String descriCarga = "";
	private int montoViaje = 0;
	public String getCdDedestino() {
		return cdDedestino;
	}
	public void setCdDedestino(String cdDedestino) {
		this.cdDedestino = cdDedestino;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public LocalDate getFechaViaje() {
		return fechaViaje;
	}
	public void setFechaViaje(LocalDate fechaViaje) {
		this.fechaViaje = fechaViaje;
	}
	public LocalDate getFechaRegreso() {
		return fechaRegreso;
	}
	public void setFechaRegreso(LocalDate fechaRegreso) {
		this.fechaRegreso = fechaRegreso;
	}
	public String getDescriCarga() {
		return descriCarga;
	}
	public void setDescriCarga(String descriCarga) {
		this.descriCarga = descriCarga;
	}
	public int getMontoViaje() {
		return montoViaje;
	}
	public void setMontoViaje(int montoViaje) {
		this.montoViaje = montoViaje;
	}
	@Override
	public String toString() {
		return "Viajes [cdDedestino=" + cdDedestino + ", direccion=" + direccion + ", fechaViaje=" + fechaViaje
				+ ", fechaRegreso=" + fechaRegreso + ", descriCarga=" + descriCarga + ", montoViaje=" + montoViaje
				+ "]";
	}
	
}
