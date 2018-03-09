package com.example.examplestatemachine;

public class StateContext {
    enum ConcreteState {
        A,
        B,
        None
    }

    ConcreteState startState;
    private State currentState;

    public StateContext()
    {
        currentState = new ABState(this);
        startState = ConcreteState.None;
    }

    public void actionA()
    {
        currentState.actionA();
    }

    public void actionB()
    {
        currentState.actionB();
    }

    public boolean isAccept()
    {
        return currentState.isAccept();
    }
}
