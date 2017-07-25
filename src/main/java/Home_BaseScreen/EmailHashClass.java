package Home_BaseScreen;

import java.util.HashSet;


/**
 * Created by apple on 24.07.17.
 */
public abstract class EmailHashClass extends BaseScreen {

  public static void main(String[] args) {
    HashSet<String> hashSet = new HashSet<String>();
    hashSet.add("Email1@gmail.com");
    hashSet.add("Email2@gmail.com");
    hashSet.add("Email3@gmail.com");
    hashSet.add("Email4@gmail.com");
    hashSet.add("Email5@gmail.com");
    hashSet.add("Email6@gmail.com");

    System.out.println(hashSet);;
  }

  @Override
  public void getTitle() {

  }
}
