package com.example;

public class App {

    public static void main(String[] args) {
        System.out.println("SonarQube Jenkins Demo");

        App app = new App();
        app.printMessage(null);
    }

    public void printMessage(String message) {

        // Code smell: null check issue
        if (message == null) {
            System.out.println("Message is null");
        }

        // Code smell: unused variable
        int unused = 10;

        // Code smell: duplicated logic
        for (int i = 0; i < 3; i++) {
            System.out.println("Loop running");
        }

        for (int i = 0; i < 3; i++) {
            System.out.println("Loop running");
        }
    }
}
