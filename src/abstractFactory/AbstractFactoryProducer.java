package abstractFactory;

public class AbstractFactoryProducer {

	public AbstractFactory getFactory(String factory) {
		if(factory.equals("Shape")) {
			return new ShapeFactory();
		} else if (factory.equals("Color")) {
			return new ColorFactory();
		}
		return null;
	}
}
