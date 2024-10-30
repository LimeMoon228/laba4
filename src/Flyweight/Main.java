package Flyweight;

/**
 * Головний клас Main демонструє використання патерну (Flyweight) для оптимізації створення іконок файлів у каталозі.
 */
public class Main {
    public static void main(String[] args) {
        Directory dir = new Directory();

        // Додає файли різних типів у каталог, використовуючи патерн
        dir.add("txt");
        dir.add("png");
        dir.add("txt");

        // Відображає всі файли в каталозі
        dir.display();
    }
}
