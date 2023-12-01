package org.hannmx;

// Класс реализующий функциональность фуллстек разработчика
public class FullstackDeveloper implements Fullstack {
    @Override
    public void developServer() {
        System.out.println("Server done");
    }

    @Override
    public void developGUI() {
        System.out.println("GUI done");
    }
}
