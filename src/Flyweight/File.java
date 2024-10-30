package Flyweight;

/**
 * Клас File представляє файл з певним типом іконки, що реалізується за допомогою інтерфейсу FileType.
 */
public class File {
    private FileType type;

    /**
     * Конструктор класу File. Ініціалізує файл із заданим типом іконки.
     *
     * @param type тип файлу, що відповідає за відображення іконки
     */
    public File(FileType type) {
        this.type = type;
    }

    /**
     * Викликає метод для відображення іконки файлу. Відповідає за виконання операції зображення іконки.
     */
    public void draw() {
        type.draw();
    }
}

