package n3exercici1.handlers;

import java.util.ArrayList;
import java.util.List;

import n3exercici1.beans.Vehicle;
import n3exercici1.command.Accelerate;
import n3exercici1.command.ActionManager;
import n3exercici1.command.Brake;
import n3exercici1.command.Start;
import n3exercici1.command.VehicheActions;

public class ParkingHandler {
	
	
	private VehicheActions vehicleActions = new VehicheActions();
	private List<Vehicle> vehicles = new ArrayList<>();

	private VehicheActions addActions() {
		
		vehicleActions.addTarea(new Accelerate());
		vehicleActions.addTarea(new Brake());
		vehicleActions.addTarea(new Start());
		return vehicleActions;
	}
	
	private List<Vehicle> createAndAddVehicles() {
		
		Vehicle vehicle1 = new Vehicle("car");
		vehicles.add(vehicle1);
		Vehicle vehicle2 = new Vehicle("plane");
		vehicles.add(vehicle2);
		Vehicle vehicle3 = new Vehicle("ship");
		vehicles.add(vehicle3);
		Vehicle vehicle4 = new Vehicle("bicycle");
		vehicles.add(vehicle4);
		
		return vehicles;
	}
	
	public void executeActions() {
		
		vehicles = createAndAddVehicles();
		vehicleActions = addActions();
		
		ActionManager actionManager = new ActionManager();
		
		for(int i = 0; i < vehicles.size(); i++) {
			for (int j = 0; j < vehicleActions.getActions().size(); j++) {
				
				actionManager.execute( vehicleActions.getActions().get(j), vehicles.get(i));
				System.out.println();
			}
		}	
	}
}
