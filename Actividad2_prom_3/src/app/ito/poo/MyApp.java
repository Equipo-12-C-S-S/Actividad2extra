package app.ito.poo;
import clases.ito.poo.Transportes;
import clases.ito.poo.Viajes;
import java.time.LocalDate;



public class MyApp {
	
	static void run() {
		Transportes ve=(new Transportes("Ford",2002,800,LocalDate.of(2020, 10, 22)));
		System.out.println (ve);
		Viajes vj=(new Viajes("Puebla","Av principal #21",LocalDate.of(2021, 03, 22),LocalDate.of(2021, 03, 28),"Juguetes",100));
		System.out.println (vj);
		ve=(new Transportes("toyota",2017,1500,LocalDate.of(2020, 10, 22)));
		System.out.println (ve);
		vj=(new Viajes("oxaca","Norte #21",LocalDate.of(2021, 02, 21),LocalDate.of(2021, 03, 28),"cocacola",1000));
		System.out.println (vj);
	}

	public static void main(String[] args) {
		run();

	}
}