package mvc;

public abstract class View {
	protected Controller controller;

	public abstract void update();

	protected View() {
	}

	protected View(Controller controller) {
		this.controller = controller;
	}
	
	public void setController(Controller c) {
		controller = c;
	}

	public void contextInterface() {
		controller.algorithmInterface();
	}
}
