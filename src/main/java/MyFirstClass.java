/**
 * Created by apple on 18.07.17.
 */
public class MyFirstClass extends BaseClass{
  private String firstField ="This is my first field"; // field
public static String staticField = "This is my static field";

// Constructor
  public MyFirstClass(String firstField) {
    this.firstField = firstField;
  }

  public MyFirstClass(){
    //default constructor
  }

  //method getter
  public String getFirstField() {
    return firstField;
  }

  // method setter
  public void setFirstField(String firstField) {
    this.firstField = firstField;
  }

  void makeSound() {
    System.out.println("Yoo");
  }

  //override
  void makeSound(String parameter){
    System.out.println();
  }

  @Override
  public void someCommonMethod() {
    // some implementation;

  }
}
