import java.lang.reflect.Field;

/**
 * Created by apple on 18.07.17.
 */
public class Runner {
  private static MyFirstClass myFirstClass;

  public final String USER = "igor@gmail.com";
          
  public static void main(String[] args) {
    myFirstClass = new MyFirstClass();
    MyFirstClass myFirstClass1 = new MyFirstClass();


    myFirstClass.setFirstField("Different firts field");

    System.out.println(myFirstClass.getFirstField());
    System.out.println(myFirstClass1.getFirstField());

// interitance
    new MyFirstClass().someCommonMethod();;
    new MySecondClass().someCommonMethod();

    new MyFirstClass().makeSound();
    new MySecondClass().makeSound();
  }


  public static void anotherMethod() {
    MyFirstClass.staticField = "Re-assigned";

  }

}
