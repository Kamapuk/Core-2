package task.generics;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Generics {

  public static <T> T getFirstElement(List<T> list) {
    if (list == null || list.isEmpty()) {
      throw new IllegalArgumentException("Список пустой");
    } else {
      return list.getFirst();
    }
  }

  public static <T> T getLastElement(List<T> list) {
    if (list == null || list.isEmpty()) {
      throw new IllegalArgumentException("Список пустой");
    } else {
      return list.get(list.size() - 1);
    }
  }

  public static <T> List<T> mergeLists(List<T> list1, List<T> list2) {
    List<T> list3 = new ArrayList<>();
    if (list2 == null || list1 == null || list2.isEmpty() || list1.isEmpty()) {
      throw new IllegalArgumentException("Нарушено условие, минимум 1 список пустой");
    } else {
      for (T i : list1) {
        list3.add(i);
      }
      for (T i : list2) {
        list3.add(i);
      }
      return list3;//столкнулся с UnsupportedOperationException
    }
  }

  public static <T> List<T> getUniqueElements(List<T> list) {
    Set<T> set1 = new HashSet<>(list);
    if (list == null || list.isEmpty()) {
      throw new IllegalArgumentException("Ошибка");
    }
    return new ArrayList<>(set1);

  }
}