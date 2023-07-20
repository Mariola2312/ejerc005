package ejerc005;

import java.util.ArrayList;

public class LienzoImpl implements Lienzo{
	private final int ancho = 1000000;
	private final int alto = 1000000;
	private ArrayList<Figura> figuras = new ArrayList<Figura>();

	// Métodos
	@Override
	public ArrayList<Figura> aniadirFigura(Figura figura) {
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
			if(figura.getX()>1000000 || figura.getY()>1000000) {
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

	// Constructor
	public LienzoImpl() {
		super();
	}
	
	public LienzoImpl(ArrayList<Figura> figuras) {

		this.figuras = figuras;
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
