package mvc;

import java.lang.Exception;

public abstract class ConcreteView extends View {
	protected String name;
	protected ConcreteModel model;
	protected int viewState;

	public ConcreteView(ConcreteModel model) {
		this.model = model;
		model.attach(this);
		viewState = model.getState();
	}
	
	public abstract void display();
	
	public int getViewState() {
		return viewState;
	}

	public void update() {
		viewState = model.getState();
	}

	public void addChild(ConcreteView cv) throws Exception {
		throw new Exception("addChild method used in a leaf!");
	}

	public void removeChild(ConcreteView cv) throws Exception {
		throw new Exception("removeChild method used in a leaf!");
	}

	public ConcreteView getChild(int i) throws Exception {
		throw new Exception("getChild method used in a leaf!");
	}
}
