package task.collection;
import java.util.Objects;
public class Task {
  int id;
  String title;
  boolean isCompleted;

  public Task(int id, String title, boolean isCompleted) {
    this.id=id;
    this.title=title;
    this.isCompleted=isCompleted;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true; // Если сравниваем с самим собой
    if (o == null || getClass() != o.getClass()) return false; // Проверка типа
    Task task = (Task) o; // Приведение типов
    return id == task.id &&
            isCompleted == task.isCompleted &&
            Objects.equals(title, task.title); // Сравнение полей
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, title, isCompleted);
  }

  @Override
  public String toString() {
    return "Task{" +
            "id=" + id +
            ", title='" + title + '\'' +
            ", isCompleted=" + isCompleted +
            '}';
  }
}