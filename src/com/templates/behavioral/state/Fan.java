package com.templates.behavioral.state;

public class Fan {
    State state;
    State fanOffState;
    State fanLowState;
    State fanMedState;
    State fanHighState;

    public Fan() {
        fanOffState = new FanOffState(this);
        fanLowState = new FanLowState(this);
        fanMedState = new FanMedState(this);
        fanHighState = new FanHighState(this);

        state = fanOffState;
    }

    public void pullChain() {
        state.handleRequest();
    }

    public void setState(State state) {
        this.state = state;
    }

    public State getFanOffState() {
        return fanOffState;
    }

    public State getFanLowState() {
        return fanLowState;
    }

    public State getFanMedState() {
        return fanMedState;
    }

    public State getFanHighState() {
        return fanHighState;
    }

    @Override
    public String toString() {
        return state.toString();
    }
}
