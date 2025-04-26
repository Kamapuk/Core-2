package task.collection;

import java.util.*;

public class Collection {

  public int findMaxElement(List<Integer> list) {
    int max=0;
    for(Integer i: list){
      if(i>max){
        max=i;
      }
    }
    return max;
  }

  public List<Integer> removeDuplicates(List<Integer> list) {
    List<Integer> result = new ArrayList<>();
    for(Integer i: list){
      if(! result.contains(i)){
        result.add(i);
      }
    }
    return result;
  }

  public List<Integer> sortDescending(List<Integer> list) {
    List<Integer> result = new ArrayList<>();
    Collections.sort(list, Comparator.reverseOrder());
    return list;
  }

  public boolean containsElement(Set<Integer> set, int element) {
    return set.contains(element);
  }

  public Set<Integer> findIntersection(Set<Integer> set1, Set<Integer> set2) {
    Set<Integer> set3 = new HashSet<>();
    for(Integer i: set1){
      if(set2.contains(i)){
        set3.add(i);
      }
    }
    return set3;
  }

  public Set<Integer> removeCommonElements(Set<Integer> set1, Set<Integer> set2) {
    for(Integer i: set2){
      if(set2.contains(i)){
        set1.remove(i);
      }
    }
    return set1;
  }

  public boolean containsKey(Map<String, Integer> map, String key) {
    return map.containsKey(key);
  }

  public List<Integer> getValuesByKey(Map<String, List<Integer>> map, String key) {
    return new ArrayList<>(map.get(key));
  }

  public void removeEntriesByValue(Map<String, Integer> map, int value) {
    Set<String> keysToRemove =new HashSet<>();
    for (Map.Entry<String, Integer> entry : map.entrySet()) {
      if(entry.getValue().equals(value)){
        keysToRemove.add(entry.getKey());
      }
    }
    keysToRemove.forEach(map :: remove);
  }

  public void addToQueue(Queue<Integer> queue, int element) {
    queue.add(element);
  }

  public Integer pollFromQueue(Queue<Integer> queue) {
    return queue.poll();
  }

  public boolean isQueueEmpty(Queue<Integer> queue) {
    return queue.isEmpty();
  }

  public void printOrdersWithMaxAmount(List<Order> orders) {
    int maxAmount = 0;
    for(Order order: orders){
      if(order.totalAmount>maxAmount){
        maxAmount=order.totalAmount;
      }
    }
    for(Order order: orders){
      if(order.totalAmount==maxAmount){
        System.out.println("Order ID: "+order.id+" Customer: "+order.customer+" Total Amount: "+order.totalAmount);
      }
    }

  }

  public int getTotalAmountOfOrders(List<Order> orders) {
    int sumAmount = 0;
    for(Order order: orders){
      sumAmount+=order.totalAmount;
    }

    return sumAmount;
  }

  public void printIncompleteTasks(List<Task> tasks) {
    for(Task task: tasks){
      if(task.isCompleted==false){
        System.out.println("ID: "+task.id+" Title: "+task.title+" IsCompleted: "+task.isCompleted);
      }
    }
  }

  public List<Task> getTasksByTitle(List<Task> tasks, String title) {
    List<Task> result = new ArrayList<>();
    for(Task task: tasks){
      if(task.title==title){
        result.add(task);
      }
    }
    return result;
  }

  public void printStudents(List<Student> students) {
    for(Student student:students){
      System.out.println("Name: "+student.name+" Age: "+student.age);
    }
  }

  public List<Student> getStudentsOlderThan(List<Student> students, int age) {
    List<Student> result = new ArrayList<>();
    for(Student student:students){
      if(student.age>age){
        result.add(student);
      }
    }
    return result;
  }

  public void printProductsWithZeroQuantity(List<Product> products) {
    for(Product product: products){
      if(product.quantity==0){
        System.out.println("ID: "+product.id+" Name: "+product.name+" Quantity: "+product.quantity);
      }
    }
  }

  public int getTotalQuantityOfProducts(List<Product> products) {
    int sumQuantity=0;
    for(Product product:products){
      sumQuantity+=product.quantity;
    }
    return sumQuantity;
  }

  public void printStudentsWithWorstAttendance(List<AttendanceStudent> students) {
    List<Integer> badAttendance = new ArrayList<>();
    int worstAttendance = 0;
    for(AttendanceStudent attendanceStudent: students){
      int studentAttendance = Integer.parseInt(attendanceStudent.attendance);
      badAttendance.add(studentAttendance);
      for(Integer i: badAttendance){
        if(i>studentAttendance){
          worstAttendance=studentAttendance;
        }
      }

    }
    for(AttendanceStudent attendanceStudent: students){
      int as = Integer.parseInt(attendanceStudent.attendance);
      if(as==worstAttendance){
        System.out.println("Name: "+attendanceStudent.name +" Attendance: "+attendanceStudent.attendance);
      }

    }
  }

  public double getAverageAttendance(List<AttendanceStudent> students) {
    int counter = 0;
    int sumAttendance = 0;
    for(AttendanceStudent attendanceStudent: students){
      sumAttendance+=Integer.parseInt(attendanceStudent.attendance);
      counter+=1;
    }
    return sumAttendance/counter;
  }
}