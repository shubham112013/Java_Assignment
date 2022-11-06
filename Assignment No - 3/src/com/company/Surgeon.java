package com.company;

public class Surgeon extends Doctor {
    protected boolean operating;

    public Surgeon(String name, int number, String specialty, boolean operating) {
        super(name, number, specialty);
        this.operating = operating;
    }

    @Override
    public String toString() {
        return this.name + ' ' + this.number + ' ' + this.specialty + ':' + this.operating;
    }

    @Override
    public void work(){
        if(operating){
            System.out.println(this.name + " works for the hospital." + this.name + " is operating now.");
        }else{
            System.out.println(this.name + " works for the hospital." + this.name + " is not operating now.");
        }
    }
}
