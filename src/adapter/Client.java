package adapter;

public class Client {

	public static void main(String [] args) {
		Target t = new Adapter();
		t.sayHello();
	}
}
