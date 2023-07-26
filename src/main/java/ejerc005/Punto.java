package ejerc005;

import java.awt.Color;

public class Punto extends Figura{
	
	public Figura crearPunto(int id, int posX, int posY, Color color) {
		
		Figura punto = null;
		
		if(posX >1000000|| posY>1000000) {
			throw new InvalidPositionException();
		}else {
			punto = new Punto(id, posX, posY, color);
		}
		return punto;
	}

	
	//Constructores
	public Punto() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Punto(int id, int posX, int posY, Color color) {
		super(id, posX, posY, color);
		// TODO Auto-generated constructor stub
	}
}
