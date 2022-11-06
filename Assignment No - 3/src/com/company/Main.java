package com.company;

public class Main {

    public static void main(String[] args) {

        HospitalEmployee h = new HospitalEmployee("Vito", 123);


        var s = h.toString();
        System.out.println(s);

        Doctor michael = new Doctor("Micheal", 234, "Heart");
        var mich = michael.toString();
        System.out.println(mich);

        Surgeon vincent = new Surgeon("Vincent", 645, "BrainOperating", true);
        var vinc = vincent.toString();
        System.out.println(vinc);

        Nurse Sonny = new Nurse("Sonny", 789, 6);
        var Sonn = Sonny.toString();
        System.out.println(Sonn);
        h.work();
        michael.work();
        vincent.work();
        Sonny.work();
    }
}
