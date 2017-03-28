package Factory;

public class ShapeFactory {

	public Shape getInstance(String shape) {	
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
}
