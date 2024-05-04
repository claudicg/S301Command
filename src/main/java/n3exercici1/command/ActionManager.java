package n3exercici1.command;

import n3exercici1.beans.Vehicle;
import n3exercici1.intenfaces.IActions;

public class ActionManager {

	public void execute(IActions action, Vehicle vehicle) {
		
        action.execute(vehicle);
    }
}
