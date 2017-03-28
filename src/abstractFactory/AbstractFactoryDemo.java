package abstractFactory;

public class AbstractFactoryDemo {
	
	public static void main(String [] args) {
		AbstractFactoryProducer producer = new AbstractFactoryProducer();
		AbstractFactory factory = producer.getFactory("Shape");
		Shape shape = factory.getShape("triangle");
		shape.draw();
		AbstractFactory colorfactory = producer.getFactory("Color");
		Color color = colorfactory.getColor("red");
		color.fill();
	}
}
