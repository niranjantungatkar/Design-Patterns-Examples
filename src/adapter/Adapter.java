package adapter;

public class Adapter extends Adaptee implements Target {

	public void sayHello() {
		super.printMessage();
	}
}
