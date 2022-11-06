package com.company;

public class Doctor extends HospitalEmployee {
    protected String specialty;

    public Doctor(String name, int number, String specialty) {
        super(name, number);
        this.specialty = specialty;
    }

    public String getSpecialty() {
        return specialty;
    }

    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }

    @Override
    public String toString() {
        return this.name + ' ' + this.number + ' ' + this.specialty;
    }

    @Override
    public void work(){
        System.out.println(this.name + " works for the hospital." + this.name + " is a " +this.specialty + " doctor.");
    }
}
