package state_example.entities;

import state_example.interfaces.State;

public class StateTurnedOn implements State {
	public void action() {
		System.out.println("Turned On, State");
	}
}
