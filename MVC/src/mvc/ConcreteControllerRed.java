package mvc;

public class ConcreteControllerRed implements Controller {
	private String name;
	private ConcreteModel model;

	public ConcreteControllerRed(ConcreteModel cm, String name) {
		model = cm;
		this.name = name;
	}
	
	public String getName() {
		return name;
	}

	@Override
	public void algorithmInterface() {
		System.out.println(name + " activated!");
		model.setState(2);
	}
}