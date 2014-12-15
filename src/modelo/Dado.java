package modelo;

import java.util.Random;

public class Dado {

	private int cara;
	private int testAleatorio[] = { 1, 2, 3, 4, 5, 6 };
	public Object lanzarDado;

	public Dado() {

	}

	public int getCara() {
		return cara;
	}

	public void setCara(int cara) {
		this.cara = cara;
	}

	public int lanzarDado() {
		Random random = new Random();
		cara = random.nextInt(6) + 2;
		return cara;
	}

	public Object getLanzarDado() {
		return lanzarDado;
	}

	public void setLanzarDado(Object lanzarDado) {
		this.lanzarDado = lanzarDado;
	}

	public int[] getTestAleatorio() {
		return testAleatorio;
	}

	public void setTestAleatorio(int testAleatorio[]) {
		this.testAleatorio = testAleatorio;
	}

}
