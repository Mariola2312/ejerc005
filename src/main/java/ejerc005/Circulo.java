package ejerc005;

import java.awt.Color;

public class Circulo extends Figura{
	
	private double radio;

public Figura crearCirculo(int posX, int posY, Color color, double radio) {
		
		Figura circulo = null;
		
		if(posX >1000000|| posY>1000000) {
			throw new InvalidPositionException();
		}else {
			circulo = new Circulo(posX, posY, color, radio);
		}
		return circulo;
	}
	
	//Constructores
	public Circulo() {
		
	}

	public Circulo(int posX, int posY, Color color, Double radio) {
		super(posX, posY, color);
		this.radio = radio;		
	}
	
	//Getters y Setters
	public double getRadio() {
		return radio;
	}

	public void setRadio(double radio) {
		this.radio = radio;
	}

}
