package main;

import state_example.entities.Light;
import state_example.entities.StateTurnedOff;
import state_example.entities.StateTurnedOn;

public class Main {

	public static void main(String[] args) {
		Light light = new Light();
		
		light.setState(new StateTurnedOn());
		light.execute();
		
		light.setState(new StateTurnedOff());
		light.execute();
	}

}
