package ar.edu.unq.po2.primerasClases;

import ar.edu.unq.po2.entes.Nombrable;

public class RecepcionistaClasico extends Recepcionista {

	@Override
	protected String armarSaludo(Nombrable nombrable) {
		// TODO Auto-generated method stub
		return "hola"+ nombrable.getNombre();
	}

}
