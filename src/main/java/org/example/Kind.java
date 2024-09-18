package org.example;

public class Kind extends Thread{
    private String name;
    private Rutsche rutsche;

    public Kind(String name, Rutsche rutsche) {
        this.name = name;
        this.rutsche = rutsche;
    }

    @Override
    public void run() {
        System.out.println(name + " hängt Rutsche an.");
        rutsche.rutsche(name);
    }

}
