package mvc;

public class Client {
	
	public static void main(String[] args) throws Exception {
		
		/* Objects creation */
		ConcreteModel m = new ConcreteModel(0, "Model");
		ConcreteView pb = new Button(m, "Print Button", 1);
		ConcreteView cb = new Button(m, "Clear Button", 0);
		ConcreteView t = new Text(m, "Text");
		ConcreteView w = new Window(m, "Window");
		Controller cc1 = new ConcreteControllerOne(m, "ControllerOne");
		Controller cc0 = new ConcreteControllerZero(m, "ControllerZero");
		Controller ccr = new ConcreteControllerRed(m, "ControllerRed");
		
		/* Add ConcreteControllers to ConcreteViews */
		pb.setController(cc1);
		cb.setController(cc0);
		t.setController(cc1);
		w.setController(cc1);
		
		/* Add children to the composite Window */
		w.addChild(pb);
		w.addChild(cb);
		w.addChild(t);
		
		/* Display initial view */
		w.display();
		System.out.println("");
		
		/* Press "Print Button" */
		pb.contextInterface();
		w.display();
		System.out.println("");
		
		/* Press "Clear Button" */
		cb.contextInterface();
		w.display();
		System.out.println("");
		
		/* Change ConcreteController and press "Print Button" */
		pb.setController(ccr);
		pb.contextInterface();
		w.display();	
		System.out.println("");
		
		/* Try to push an OFF button */
		pb.contextInterface();
		
	}
	
}
