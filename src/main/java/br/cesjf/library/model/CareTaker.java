package br.cesjf.library.model;

import java.util.ArrayList;
import java.util.List;

public class CareTaker {
    
    private List<Object> savedStates;
    
    public CareTaker() {
        savedStates = new ArrayList<>();
    }
    
    public void addMemento(Object state) {
        savedStates.add(state);
    }
    
    public Object getMemento() {
        Object state = null;
        try {
            state = savedStates.get(savedStates.size()-1);
            savedStates.remove(savedStates.size()-1);
        } finally {
            return state;
        }
    }
    
}
