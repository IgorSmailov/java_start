package Home_BaseScreen;

import java.util.HashMap;

/**
 * Created by apple on 24.07.17.
 */
public class FirstClass extends BaseScreen {
  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  private String firstName = setUsername("Igor"); // field

  public String getFirstName() {
    return firstName;
  }

  public static void main(String[] args) {
    HashMap<String, String > hashMap = new HashMap<String, String>();
    hashMap.put("Igor", "Hello");

    System.out.println(hashMap.get("Igor"));
  }


  @Override
  public void getTitle() {

  }
}
