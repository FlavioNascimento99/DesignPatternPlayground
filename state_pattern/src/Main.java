interface State {
    void action();
}

class StateOn implements State {
    public void action() {
        System.out.println("Light's on!");
    }
}

class StateOff implements State {
    public void action() {
        System.out.println("Light's off...");
    }
}

class Light {
    private State currentState;

    public void setCurrentState(State currentState) {
        this.currentState = currentState;
    }

    public void execute() {
        currentState.action();
    }
}

public class Main {
    public static void main(String[] args) {
        Light light = new Light();

        light.setCurrentState(new StateOn());
        light.execute(); // Light's On!

        light.setCurrentState(new StateOff());
        light.execute(); // Light's off...
    }
}