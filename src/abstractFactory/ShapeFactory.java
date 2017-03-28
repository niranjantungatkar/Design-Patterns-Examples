package abstractFactory;


public class ShapeFactory implements AbstractFactory {
	
	@Override
	public Shape getShape(String shape) {
		if(shape.equals("triangle")) {
			return new Triangle();
		} else if (shape.equals("sqaure")) {
			return new Square();
		} else if (shape.equals("rect")) {
			return new Rectangle();
		} else {
			return null;
		}	
	}
	
	@Override
	public Color getColor(String color) {
		//do nothing
		return null;
	}
}
