package com.example.examplestatemachine;

public interface State {

    void actionA();
    
    void actionB();
    
    boolean isAccept();
}
