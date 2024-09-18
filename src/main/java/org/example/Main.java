package org.example;

public class Main {
    public static void main(String[] args) {

        Rutsche rutsche = new Rutsche();

        Kind kind1 = new Kind("Kind 1", rutsche);
        Kind kind2 = new Kind("Kind 2", rutsche);
        Kind kind3 = new Kind("Kind 3", rutsche);

        kind1.start();
        kind2.start();
        kind3.start();
    }
}