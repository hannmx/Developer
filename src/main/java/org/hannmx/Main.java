package org.hannmx;

// Основной класс
public class Main {
    public static void main(String[] args) {
        // Создание объекта типа FullstackDeveloper и последовательный вызов его методов
        FullstackDeveloper dev = new FullstackDeveloper();
        dev.developGUI();
        dev.developServer();

        // Создание объекта типа FrontendDeveloper через интерфейс Developer и вызов метода developGUI()
        Developer dev2 = new FrontendDeveloper();
        if (dev2 instanceof Frontender) {
            ((Frontender) dev2).developGUI();
        }
    }
}

// Пример класса FrontendDeveloper, реализующего интерфейс Frontender
class FrontendDeveloper implements Frontender {
    @Override
    public void developGUI() {
        System.out.println("Frontend GUI done");
    }
}
