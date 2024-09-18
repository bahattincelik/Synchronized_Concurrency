package org.example;

public class Rutsche {

    public synchronized void rutsche(String name) {
        System.out.println(name + " rutschet...");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(name + " rutscht beendet.");
    }
}
