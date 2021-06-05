package app.ito.poo;
import clases.ito.poo.Clinica;
import clases.ito.poo.Consulta;
import java.time.LocalDate;
public class MyApp {
	static void run() {
		Clinica c= new Clinica("Santos Cid Diana", "DI04GL12",LocalDate.of(2002, 06, 30));
		Consulta consu= new Consulta(LocalDate.of(2021,03,03), "Dolor de cabeza", 34, 72, 1.70f);
		System.out.println(c);
		System.out.println(consu);		
		System.out.println(c.receta("Paracetamol", "Mantener reposo, tomar pastilla cada 8 horas"));
		System.out.println("Tu edad es de: "+c.obtenEdad(2002));
	}
	

	
	public static void main(String []args) {
		run();
	}

}