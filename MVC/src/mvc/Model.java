package mvc;

import java.util.ArrayList;

public abstract class Model {
	
public ArrayList<View> views;
	
	public Model() {
		views = new ArrayList<View>();
	}
	
	public void notifyViews() {
		for(int i=0;i<views.size();i++) {
			views.get(i).update();
		}
	}
	
	public void attach(View v) {
		views.add(v);
	}
	
	public void detach(View v) {
		views.remove(v);
	}

}
