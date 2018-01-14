package mvc;

import java.util.ArrayList;

public class Window extends ConcreteView {
	private ArrayList<ConcreteView> children;

	public Window(ConcreteModel cm, String name) {
		super(cm);
		this.name = name;
		children = new ArrayList<ConcreteView>();
	}

	public String getName() {
		return name;
	}

	@Override
	public void addChild(ConcreteView cv) {
		children.add(cv);
	}

	@Override
	public void removeChild(ConcreteView cv) {
		children.remove(cv);
	}

	@Override
	public ConcreteView getChild(int i) {
		return children.get(i);
	}

	@Override
	public void display() {
		System.out.println("Visualize " + name);
		for(int i = 0; i < children.size(); i++)
			children.get(i).display();
	}

}
