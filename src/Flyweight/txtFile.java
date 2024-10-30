package Flyweight;

/**
 * Клас txtFile представляє тип файлу для текстових документів і реалізує метод для відображення іконки файлу.
 */
public class txtFile implements FileType {
    private String img;

    /**
     * Конструктор класу txtFile. Ініціалізує шлях до іконки файлу для текстових документів.
     */
    public txtFile() {
        this.img = "txtFile.png";
    }

    /**
     * Відображає іконку файлу в консолі. Виводить повідомлення про створення файлу з відповідною іконкою.
     */
    @Override
    public void draw() {
        System.out.println("Created file with icon: " + img);
    }
}
