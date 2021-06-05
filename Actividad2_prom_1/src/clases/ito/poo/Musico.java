package clases.ito.poo;
import java.time.LocalDate;
import java.util.ArrayList;

public class Musico {
	private String titulo;
	private Float duracionmusic;
    private static java.util.List<String> interpretes= new ArrayList<String>();
    private static java.util.List<String> musico= new ArrayList<String>();
	private String generoMusical;
	private java.time.LocalDate fechaDeRegistro = null;
	private java.time.LocalDate fechaDeEstreno = null;

	
	public Musico(String titulo, Float duracionmusic, String generoMusical,LocalDate fechaDeRegistro, LocalDate fechaDeEstreno) {
		super();
		this.titulo = titulo;
		this.duracionmusic= duracionmusic;
		this.interpretes = interpretes;
		this.musico = musico;
		this.generoMusical = generoMusical;
		this.fechaDeRegistro =fechaDeRegistro ;
		this.fechaDeEstreno = fechaDeEstreno;
	}
	public  String solicitarInterprete(String nuevoInterprete) {
		interpretes.add(nuevoInterprete);
	    return nuevoInterprete;
	}
	public  String musicoOri(String nuevomusico) {
		musico.add(nuevomusico);
	    return nuevomusico ;
	}

	public String getTitulo() {
		return titulo;
	}


	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}


	public Float getDuracionmusic() {
		return duracionmusic;
	}


	public void setDuracionmusic(Float duracionmusic) {
		this.duracionmusic = duracionmusic;
	}


	public static java.util.List<String> getInterpretes() {
		return interpretes;
	}


	public static void setInterpretes(java.util.List<String> interpretes) {
		Musico.interpretes = interpretes;
	}


	public String getGeneroMusical() {
		return generoMusical;
	}


	public void setGeneroMusical(String generoMusical) {
		this.generoMusical = generoMusical;
	}


	public java.time.LocalDate getFechaDeRegistro() {
		return fechaDeRegistro;
	}


	public void setFechaDeRegistro(java.time.LocalDate fechaDeRegistro) {
		this.fechaDeRegistro = fechaDeRegistro;
	}


	public java.time.LocalDate getFechaDeEstreno() {
		return fechaDeEstreno;
	}


	public void setFechaDeEstreno(java.time.LocalDate fechaDeEstreno) {
		this.fechaDeEstreno = fechaDeEstreno;
	}


	@Override
	public String toString() {
		return "Composicion [titulo=" + titulo + ", duracionmusic=" + duracionmusic + ", generoMusical=" + generoMusical
				+ ", fechaDeRegistro=" + fechaDeRegistro + ", fechaDeEstreno=" + fechaDeEstreno + "]";
	}
}
