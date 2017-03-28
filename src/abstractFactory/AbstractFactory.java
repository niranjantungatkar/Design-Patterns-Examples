package abstractFactory;

public interface AbstractFactory {
	public Shape getShape(String shape);
	public Color getColor(String color);
}
