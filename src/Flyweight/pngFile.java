package Flyweight;

/**
 * Клас pngFile представляє тип файлу для PNG-зображень і реалізує метод для відображення іконки файлу.
 */
public class pngFile implements FileType {
    private String img;

    /**
     * Конструктор класу pngFile. Ініціалізує шлях до іконки файлу для PNG-зображень.
     */
    public pngFile() {
        this.img = "pngFile.png";
    }

    /**
     * Відображає іконку файлу в консолі. Виводить повідомлення про створення файлу з відповідною іконкою.
     */
    @Override
    public void draw() {
        System.out.println("Created file with icon: " + img);
    }
}
