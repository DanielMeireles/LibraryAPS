package br.cesjf.library.model;

import java.util.ArrayList;
import java.util.List;

public class CareTaker {
    
    private List<Memento> states;
    
    public CareTaker() {
        states = new ArrayList<>();
    }
    
    public void addMemento(Memento state) {
        states.add(state);
    }
    
    public Memento getMemento() {
        Memento state = null;
        if(states.size() > 0) {
            state = states.get(states.size()-1);
        }
        if(states.size() > 1) {
            states.remove(states.size()-1);
        }
        return state;
    }
    
}
