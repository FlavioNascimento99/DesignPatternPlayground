package state_example.entities;

import state_example.interfaces.State;

public class Light {
	private State state;

	public void setState(State state) {
		this.state = state;
	}
	
	public void execute() {
		state.action();
	}
	
}
