package br.cesjf.library.model;

public class Memento {
    
    private Object state;
    
    public void setState(Object state) {
        this.state = state;
    }
    
    public Object getState() {
        return state;
    }
    
}
