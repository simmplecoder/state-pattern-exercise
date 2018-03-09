package com.example.examplestatemachine;

public class ABState implements State{
    private StateContext.ConcreteState state;
    private StateContext sc;
    private boolean accept = false;

    public ABState(StateContext sc)
    {
        this.sc = sc;
        state = StateContext.ConcreteState.None;
    }

    @Override
    public void actionA()
    {
        state = StateContext.ConcreteState.A;
        if (sc.startState == StateContext.ConcreteState.None)
        {
            sc.startState = state;
        }
        accept = (sc.startState == state);
    }

    @Override
    public void actionB()
    {
        state = StateContext.ConcreteState.B;
        if (sc.startState == StateContext.ConcreteState.None)
        {
            sc.startState = state;
        }
        accept = (sc.startState == state);
    }

    @Override
    public boolean isAccept()
    {
        return accept;
    }
}
