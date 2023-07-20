package ejerc005;

import java.util.ArrayList;

public interface Lienzo {
	public ArrayList<Figura> aniadirFigura(Figura figura);
	public ArrayList<Figura> moverFigura(Figura figura, int posX, int posY);
	public ArrayList<Figura> modificarFigura(Figura figura);
}
