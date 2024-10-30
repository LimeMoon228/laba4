package Flyweight;

import java.util.Map;
import java.util.HashMap;

/**
 * Клас FileIconFactory відповідає за створення та управління об'єктами типів файлів, використовуючи патерн (Flyweight).
 * Дозволяє уникати дублювання об'єктів, створюючи їх лише один раз і повторно використовуючи.
 */
public class FileIconFactory {
    private static Map<String, FileType> fileTypeMap = new HashMap<>();

    /**
     * Повертає об'єкт FileType для заданого типу файлу.
     * Якщо об'єкт для конкретного типу ще не створено, він буде створений і збережений для подальшого використання.
     *
     * @param file тип файлу, для якого необхідно отримати іконку
     * @return об'єкт FileType, що представляє іконку файлу
     */
    public static FileType getFileType(String file) {
        FileType type = fileTypeMap.get(file);
        if (type == null) {
            if (file.equals("txt")) {
                type = new txtFile();
                fileTypeMap.put(file, type);
            } else if (file.equals("png")) {
                type = new pngFile();
                fileTypeMap.put(file, type);
            }
        }
        return type;
    }
}
