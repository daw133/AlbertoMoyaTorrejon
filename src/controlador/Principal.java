package controlador;

import modelo.*;

public class Principal {

	public Principal() {
	}

	public static void main(String[] args) {
		
		Dado jugador1dado1=new Dado();
		Dado jugador1dado2=new Dado();
		Dado jugador2dado1=new Dado();
		Dado jugador2dado2=new Dado();
		
		jugador1dado1.getLanzarDado();
		jugador1dado2.getLanzarDado();
		jugador2dado1.getLanzarDado();
		jugador2dado2.getLanzarDado();
		
		System.out.println("Tirada jugador1: " +jugador1dado1.getCara()+","+jugador1dado2.getCara());
		System.out.println("Tirada jugador2: "+jugador2dado1.getCara()+","+jugador2dado2.getCara());
		
		int sumadadosjugador1=jugador1dado1.getCara()+jugador1dado2.getCara();
		int sumadadosjugador2=jugador2dado2.getCara()+jugador2dado2.getCara();
		
		if(sumadadosjugador1>sumadadosjugador2)
			System.out.println("Gana jugador 1");
		else if(sumadadosjugador2>sumadadosjugador1)
			System.out.println("Gana jugador 2");
		else
			System.out.println("Empates");	

	}

}
