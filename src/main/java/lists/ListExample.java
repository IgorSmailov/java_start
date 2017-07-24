package lists;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by apple on 18.07.17.
 */
public class ListExample {

  public static void main(String[] args) {
    ArrayList<String> arrayList = new ArrayList<String>();
    arrayList.add("first value"); //0
    arrayList.add("second value"); // 1
    arrayList.add("third value"); // 2
    arrayList.add("fourth value"); // 3
    arrayList.add("five value"); // 4


    for (int i =0; i <arrayList.size(); i++){
      System.out.println(arrayList.get(i));
    }

    for (String arrayElement : arrayList){
      System.out.println(arrayElement);
    }
    //
  }

 public static class MapExample{
   public static void main(String[] args) {
     HashMap<String, String> hashMap = new HashMap<String, String>();
     hashMap.put("first key" , "first value");
     hashMap.put("second key" , "second value");
     hashMap.put("third key" , "third value");

     System.out.println(hashMap.get("first key"));


   }
 }
}
