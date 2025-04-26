package task.collection;
import java.util.Objects;
public class Student {
  int age;
  String name;


  public Student(String name, int age) {
    this.name = name;
    this.age = age;

  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true; // если сравниваем с самим собой
    if (o == null || getClass() != o.getClass()) return false; // проверка типа
    Student student = (Student) o; // приведение типа
    return age == student.age &&
            Objects.equals(name, student.name); // сравнение полей
  }

  @Override
  public int hashCode() {
    return Objects.hash(age, name);
  }

  @Override
  public String toString() {
    return "Student{" +
            "name='" + name + '\'' +
            ", age=" + age +
            '}';
  }
}