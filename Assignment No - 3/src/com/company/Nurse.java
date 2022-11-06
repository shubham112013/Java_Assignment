package com.company;

public class Nurse extends HospitalEmployee {
    protected int numberOfPatient;

    public Nurse(String name, int number, int numberOfPatient) {
        super(name, number);
        this.numberOfPatient = numberOfPatient;
    }

    public int getNumberOfPatient() {
        return numberOfPatient;
    }

    public void setNumberOfPatient(int numberOfPatient) {
        this.numberOfPatient = numberOfPatient;
    }

    @Override
    public String toString() {
        return this.name + ' ' + this.number + " has " + this.numberOfPatient + " patient";
    }

    @Override
    public void work(){
        System.out.println(this.name + "works for the hospital. " + this.name + " is a nurse with " +this.numberOfPatient + " patients.");
    }

}
