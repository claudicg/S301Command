package n3exercici1.command;

import java.util.ArrayList;
import java.util.List;

import n3exercici1.beans.Vehicle;
import n3exercici1.intenfaces.IActions;

public class VehicheActions implements IActions{

	private List<IActions> actions; 
	
	public VehicheActions() {
		super();
		this.actions = new ArrayList<>(); 	
	}
	
	
	public List<IActions> getActions() {
		return actions;
	}
	
	public void setActions(List<IActions> actions) {
		this.actions = actions;
	}


	public void addTarea(IActions action) {
        actions.add(action);
    }
	
	@Override
	public void execute(Vehicle vehicle) {
		
		actions.forEach(t -> t.execute(vehicle));	
	}

	@Override
	public String toString() {
		return "VehicheActions [actions=" + actions + "]";
	}
}
