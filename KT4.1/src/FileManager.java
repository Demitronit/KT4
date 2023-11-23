import java.io.*;
import java.util.List;

public class FileManager {
    public void saveTasksToFile(List<Task> taskList, String fileName) {
        try (ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream(fileName))) {
            outputStream.writeObject(taskList);
            System.out.println("Список задач успешно сохранен в файл " + fileName);
        } catch (IOException e) {
            System.out.println("Ошибка при сохранении списка задач в файл " + fileName);
            e.printStackTrace();
        }
    }

    public List<Task> loadTasksFromFile(String fileName) {
        List<Task> taskList = null;
        try (ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream(fileName))) {
            taskList = (List<Task>) inputStream.readObject();
            System.out.println("Список задач успешно загружен из файла " + fileName);
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Ошибка при загрузке списка задач из файла " + fileName);
            e.printStackTrace();
        }
        return taskList;
    }
}