package mvc;

public class ConcreteModel extends Model {
	private int state;
	private String name;
	
	public ConcreteModel(int initialState, String name) {
		super();
		state = initialState;
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public int getState() {
		return state;
	}
	
	public void setState(int state) {
		this.state = state;
		notifyViews();
	}
}
