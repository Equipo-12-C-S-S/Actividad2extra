package clases.ito.poo;

import java.time.LocalDate;
import java.util.ArrayList;

public class Consulta {
	public Consulta(LocalDate fecha, String sintomas, int temperatura, int peso, float estatura) {
		// TODO Auto-generated constructor stub
		this.fecha.add(LocalDate.now());
		this.Sintomas.add(sintomas);
		this.temperatura.add(temperatura);
		this.peso.add((float) peso);
		this.estatura.add(estatura);
	}
	private ArrayList<LocalDate> fecha=new ArrayList<LocalDate>();
	private ArrayList<String> Sintomas=new ArrayList<String>();
	private ArrayList<Integer> temperatura=new ArrayList<Integer>();
	private ArrayList<Float> peso=new ArrayList<Float>();
	private ArrayList<Float> estatura=new ArrayList<Float>();
	private LocalDate fechaConsulta;
	public ArrayList<LocalDate> getFecha() {
		return fecha;
	}
	public void setFecha(ArrayList<LocalDate> fecha) {
		this.fecha = fecha;
	}
	public ArrayList<String> getSintomas() {
		return Sintomas;
	}
	public void setSintomas(ArrayList<String> sintomas) {
		Sintomas = sintomas;
	}
	public ArrayList<Integer> getTemperatura() {
		return temperatura;
	}
	public void setTemperatura(ArrayList<Integer> temperatura) {
		this.temperatura = temperatura;
	}
	public ArrayList<Float> getPeso() {
		return peso;
	}
	public void setPeso(ArrayList<Float> peso) {
		this.peso = peso;
	}
	public ArrayList<Float> getEstatura() {
		return estatura;
	}
	public void setEstatura(ArrayList<Float> estatura) {
		this.estatura = estatura;
	}
	public LocalDate getFechaConsulta() {
		return fechaConsulta;
	}
	public void setFechaConsulta(LocalDate fechaConsulta) {
		this.fechaConsulta = fechaConsulta;
	}
	@Override
	public String toString() {
		return "Consulta [fecha=" + fecha + ", Sintomas=" + Sintomas + ", temperatura=" + temperatura + ", peso=" + peso
				+ ", estatura=" + estatura + ", fechaConsulta=" + fechaConsulta + "]";
	}
}
