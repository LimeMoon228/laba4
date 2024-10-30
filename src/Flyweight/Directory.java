package Flyweight;

import java.util.ArrayList;
import java.util.List;

/**
 * Клас Directory представляє каталог файлів, де кожен файл має свою іконку, створену за допомогою патерну (Flyweight).
 */
public class Directory {
    private List<File> files = new ArrayList<File>();

    /**
     * Додає новий файл у каталог, створюючи іконку файлу через фабрику FileIconFactory, щоб уникнути дублювання іконок.
     *
     * @param file тип файлу, для якого додається іконка
     */
    public void add(String file) {
        FileType type = FileIconFactory.getFileType(file);
        File fileName = new File(type);
        files.add(fileName);
    }

    /**
     * Відображає всі файли в каталозі, викликаючи метод для відображення іконки кожного файлу.
     */
    public void display() {
        for (File fileName : files) {
            fileName.draw();
        }
    }
}
