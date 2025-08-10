package state_example.entities;

import state_example.interfaces.State;

public class StateTurnedOff implements State {
	public void action() {
		System.out.println("Turned off, State");
	}
}
