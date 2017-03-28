package Factory;

public class FactoryDemo {
	
	public static void main(String [] args) {
		ShapeFactory sf = new ShapeFactory();
		Shape sh = sf.getInstance("sqaure");
		sh.draw();
	}
}
