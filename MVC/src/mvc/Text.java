package mvc;

public class Text extends ConcreteView {
	
	public Text(ConcreteModel cm, String name) {
		super(cm);
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	@Override
	public void contextInterface() {
		System.out.println("Do nothing...");
	}
	
	@Override
	public void display() {
		if(viewState == 0)
			System.out.println("*No text displayed!* (Model state = 0)");
		else if(viewState == 1)
			System.out.println("Hello World! (Model state = 1)");	
		else
			System.out.println("RED Hello World! (Model state = 2)");
	}
}
