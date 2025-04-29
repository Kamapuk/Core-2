package task.collection;

public class AttendanceStudent {
  String name;
  String attendance;

  public AttendanceStudent(String name, String attendance) {
    this.name = name;
    this.attendance = attendance;

  }

  public String getName() {
    return name;
  }

  public String getAttendance() {
    return attendance;
  }
}