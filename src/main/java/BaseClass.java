/**
 * Created by apple on 18.07.17.
 */
public abstract class BaseClass {

  public void someCommonMethod() {
    System.out.println("String in the end");
    privateMethod();
  }
  abstract void makeSound();


  private void privateMethod() {
    //много кода
    //много кода
    // много кода
    //много кода
  }

}
