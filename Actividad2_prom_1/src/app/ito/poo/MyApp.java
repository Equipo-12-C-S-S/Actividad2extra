package app.ito.poo;
import java.time.LocalDate;
import clases.ito.poo.Musico;

public class MyApp {
	static void run() {
		Musico compo = new Musico ("Me vas a extrañar", 3.17f,"balada",LocalDate.of(2021, 04, 12),LocalDate.of(2021, 05,01));
		System.out.println(compo);
		System.out.println("Lista de interpretes");
		System.out.println(compo.solicitarInterprete("Carolina Rosas.."));	
		System.out.println(compo.solicitarInterprete("Pandora ..."));
		System.out.println(compo.solicitarInterprete("Daniela Calvario ..."));
		System.out.println();
		System.out.println(compo.musicoOri("Escritor:Jose Alberto Inzunza y Horancio Palencia"));

	}
	public static void main(String[] args) {
		run();
	} 
}
