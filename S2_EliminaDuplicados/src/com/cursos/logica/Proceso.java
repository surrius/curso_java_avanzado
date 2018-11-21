package com.cursos.logica;

import java.util.ArrayList;

public class Proceso {
	
	private Proceso() {}
	
	public static boolean getValores(String entradaTeclado, ArrayList<Integer> valores) {
		boolean duplicado = false;
		int dato = Integer.parseInt(entradaTeclado);
		
		for (int valor : valores) {
			if(valor == dato) {
				duplicado = true;
				break;
			}
		}
		
		return duplicado;
	}

}
