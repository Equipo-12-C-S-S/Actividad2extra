package clases.ito.poo;
import java.time.LocalDate;

// End of user code

/**
 * Description of Clinica.
 * 
 * @author Guadalupe
 */
public class Clinica {
	public String Nombre = "";
	public String rfc = "";
	public LocalDate fechaNacimiento = null;
	
	public Clinica(String nombre, String rfc, LocalDate fechaNacimiento) {
		super();
		Nombre = nombre;
		this.rfc = rfc;
		this.fechaNacimiento = fechaNacimiento;
	}
	public Clinica() {
		// Start of user code constructor for Clinica)
		super();
		// End of user code
	}
	public String receta(String medicamentos, String recomendaciones) {
		String receta = "";
		if(medicamentos!=null  ||recomendaciones!=null){
			receta="Medicamentos: "+ medicamentos+" "+" Recomendaciones: "+ recomendaciones;
		}
		return receta;
	}
	public int obtenEdad(int anios) {
		// Start of user code for method obtenEdad
	int obtenEdad=0;
		if(anios>0) {
		obtenEdad=(LocalDate.now().getYear()-anios);
		}
		return obtenEdad;
		// End of user code
	}
	public String getNombre() {
		return this.Nombre;
	}
	public void setNombre(String newNombre) {
		this.Nombre = newNombre;
	}
	public String getRfc() {
		return this.rfc;
	}
	public void setRfc(String newRfc) {
		this.rfc = newRfc;
	}
	public java.time.LocalDate getFechaNacimiento() {
		return this.fechaNacimiento;
	}
	public void setFechaNacimiento(java.time.LocalDate newFechaNacimiento) {
		this.fechaNacimiento = newFechaNacimiento;
	}

	@Override
	public String toString() {
		return "Clinica [Nombre=" + Nombre +", rfc=" + rfc + ", fechaNacimiento="+fechaNacimiento+"]";
	}

}
