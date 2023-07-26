package ejerc005;

import java.awt.Color;
import java.util.Objects;

public abstract class Figura {
	
	private int id;
	private int posX, posY;
	private Color color;
	
	
	//Constructores
	public Figura() {
		
	}
	
	public Figura(int id, int posX, int posY, Color color) {
		this.id = id;
		this.posX = posX;
		this.posY = posY;
		this.color = color;
	}

	
	//Getters y Setters
	public int getX() {
		return posX;
	}

	public void setX(int x) {
		this.posX = x;
	}

	public int getY() {
		return posY;
	}

	public void setY(int y) {
		this.posY = y;
	}

	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	
	//Equal y Hascode
	@Override
	public int hashCode() {
		return Objects.hash(color, id, posX, posY);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Figura other = (Figura) obj;
		return Objects.equals(color, other.color) && id == other.id && posX == other.posX && posY == other.posY;
	}	
}
