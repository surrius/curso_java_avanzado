package com.cursos.main;

import java.util.ArrayList;
import java.util.Scanner;

import com.cursos.logica.Proceso;

public class Main {

	public static void main(String[] args) {
		System.out.println ("Empezamos el programa de Eliminacion de Duplicados");
        String entradaTeclado = "";
        Scanner entradaEscaner = new Scanner (System.in);
        ArrayList<Integer> acumulado = new ArrayList<>();

        while(!entradaTeclado.equals("F")) {
	        System.out.println ("Introduzca una valor numerico o 'F' para finalizar proceso:");
	        entradaTeclado = entradaEscaner.nextLine (); 
	        System.out.println ("Entrada recibida por teclado es: \"" + entradaTeclado +"\"");
	        if (!entradaTeclado.equals("F")) {
	        	if(!Proceso.getValores(entradaTeclado, acumulado)) {
	        		acumulado.add(Integer.parseInt(entradaTeclado));
	        	}
	        	System.out.println("Valores introducidos: " + acumulado.toString());
	        }
        }
        System.out.println("Programa finalizado");
        
        entradaEscaner.close();
	}

}
