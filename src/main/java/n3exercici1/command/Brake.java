package n3exercici1.command;

import n3exercici1.beans.Vehicle;
import n3exercici1.intenfaces.IActions;

public class Brake implements IActions{

	@Override
	public void execute(Vehicle vehicle) {
		
		System.out.print("The " + vehicle + " has braked.");
	}
}
