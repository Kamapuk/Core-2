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
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Task task = (Task) o;
    return id == task.id &&
            isCompleted == task.isCompleted &&
            Objects.equals(title, task.title);
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

  public int getId() { return id; }
  public String getTitle() { return title; }
  public boolean getIsCompleted() { return isCompleted; }
}