package abstractFactory;

public class testDriver {

	public static void main(String[] args) {
		Application app1 = new Application(new MacFactory());
		app1.render();

	}

}
