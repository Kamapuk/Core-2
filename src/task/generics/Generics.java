package task.generics;

import java.util.ArrayList;
import java.util.List;

public class Generics {

  public static <T> T getFirstElement(List<T> list) {
    if(list.isEmpty()||list==null){
      throw new IllegalArgumentException("Список пустой");
    }
    else{
      return list.get(0);
    }
  }

  public static <T> T getLastElement(List<T> list) {
    if(list.isEmpty()||list==null){
      throw new IllegalArgumentException("Список пустой");
    }
    else{
      return list.get(list.size()-1);
    }
  }

  public static <T> List<T> mergeLists(List<T> list1, List<T> list2) {
    List<T> list3 = new ArrayList<>();
    if (list2 == null||list1 == null||list2.isEmpty()||list1.isEmpty() ) {
      throw new IllegalArgumentException("Нарушено условие, минимум 1 список пустой");
    }
    else {
      for (T i : list1) {
        list3.add(i);
      }
      for(T i:list2){
        list3.add(i);
      }
      return list3;//столкнулся с UnsupportedOperationException
    }
  }

  public static <T> List<T> getUniqueElements(List<T> list) {
    List<T> list1 = new ArrayList<>();
    if (list == null||list.isEmpty()){
      throw new IllegalArgumentException("Ошибка");
    }
    else{
      for(T i:list){
        if(!list1.contains(i)){
          list1.add(i);
        }
      }
    }
    return list1;
  }
}
