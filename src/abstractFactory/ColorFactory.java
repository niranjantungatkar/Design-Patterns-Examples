package abstractFactory;

public class ColorFactory implements AbstractFactory {

	@Override
	public Shape getShape(String shape) {
			return null;
	}
	
	@Override
	public Color getColor(String color) {
		if(color.equals("red")) {
			return new Red();
		} else if (color.equals("yellow")) {
			return new Yellow();
		} else if (color.equals("blue")) {
			return new Blue();
		} else {
			return null;
		}
	}
}
