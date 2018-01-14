package mvc;

public class Button extends ConcreteView {
	private int type; // Useful to distinguish between button types

	public Button(ConcreteModel cm, String name, int type) {
		super(cm);
		this.name = name;
		this.type = type;
	}

	public String getName() {
		return name;
	}
	
	@Override
	public void contextInterface() {
		if(viewState == 0)
			System.out.println("Action not allowed! " + name + " is OFF!");
		else
			controller.algorithmInterface();
	}

	@Override
	public void display() {
		String state; // Maps viewState to a String type (1,2 == ON | 0 == OFF)
		
		if (type == 1) {
			if (model.getState() == 0)
				viewState = 1;
			else
				viewState = 0;
		}
		if(viewState > 0)
			state = "ON";
		else
			state = "OFF";
		
		System.out.println("Visualize " + name + ". Is in state " + state);
	}
}
