package ejerc005;

import java.util.ArrayList;

public class LienzoImpl implements Lienzo{
	
	private static final int ancho = 1000000;
	private static final int alto = 1000000;
	
	private ArrayList<Figura> figuras;

	// Constructor
	public LienzoImpl() {
		this.figuras = new ArrayList<Figura>();
	}
	
	//Metodos
	@Override
	public ArrayList<Figura> pintarFigura(Figura figura) {
		this.figuras.add(figura);
		return figuras;
	}

	@Override
	public ArrayList<Figura> moverFigura(Figura figura, int posX, int posY) {
		if(figuras.isEmpty()) {
			throw new EmptyArrayException();
		}else {
			int posicion = figuras.indexOf(figura);
			figura.setX(posX);
			figura.setY(posY);
			if(figura.getX()>ancho || figura.getY()>alto) {
				throw new InvalidPositionException();
			}else {
				figuras.set(posicion, figura);
			}
		}
		return figuras;
	}

	@Override
	public ArrayList<Figura> modificarFigura(Figura figura) {
		// TODO Auto-generated method stub
		return null;
	}

	// Getters y Setters
	public ArrayList<Figura> getFiguras() {
		return figuras;
	}


	public void setFiguras(ArrayList<Figura> figuras) {
		this.figuras = figuras;
	}

	public int getAncho() {
		return ancho;
	}

	public int getAlto() {
		return alto;
	}
}
