package edu.org.unq.tp1;
import java.util.*;
public class Filter {
	
	
	
	
	public static void main(String[] args) {
		List<Producto> resultado = new ArrayList<Producto>();
		resultado.add(new Producto ("Milanesa", 800));
		resultado.add(new Producto ("Pure", 100));
		resultado.add(new Producto ("Agua", 50));
		resultado.add(new Producto ("Fideo", 97));
		
		double res = resultado.stream().filter(s-> s.precioMasiva()>100)
		.mapToDouble(s-> s.precioMasiva()).sum();
		
		System.out.println(res);
		
	

	}

}
