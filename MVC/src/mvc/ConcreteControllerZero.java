package mvc;

public class ConcreteControllerZero implements Controller {
	private String name;
	private ConcreteModel model;

	public ConcreteControllerZero(ConcreteModel cm, String name) {
		model = cm;
		this.name = name;
	}
	
	public String getName() {
		return name;
	}

	@Override
	public void algorithmInterface() {
		System.out.println(name + " activated!");
		model.setState(0);
	}
}