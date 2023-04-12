package ar.edu.unq.po2.primerasClases;
import ar.edu.unq.po2.entes.*;
import java.util.ArrayList;
import java.util.Collection;

public class Test {
	
	public static void main (String[] args) {
		Collection <Nombrable> nombrables= getNombrables();
		Recepcionista recepcionista = makeRecepcionista();
		for (Nombrable nombrable : nombrables) {
			recepcionista.saludar(nombrable);
		}
		
	}
	private static Recepcionista makeRecepcionista() {
		return new RecepcionistaFormal();
	}
	private static Collection<Nombrable> getNombrables(){
		Collection<Nombrable> nombrables= new ArrayList<Nombrable>();
		nombrables.add(new Mundo());
		nombrables.add(new Persona("Jose"));
		nombrables.add(new Persona("Juan"));
		return nombrables;
	}
}
