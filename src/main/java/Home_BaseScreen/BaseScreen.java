package Home_BaseScreen;

/**
 * Created by apple on 24.07.17.
 */
public abstract class BaseScreen {

  public final String APP = "BaseScreen"; // В родительском классе создать констатнту с названием вашего приложения


 public abstract void getTitle(); // абстрактный getTitle() 

  private String Username;
  public String getUsername() {
    return Username;
  }

  //setUsername() - этот метод должен устанавливать значение переменной username, которая принадлежит классу BaseScreen


  public String setUsername(String username) {
    Username = username;
    return username;
  }

  private String setUsername() {
    return Username;
  }

  public void goBack() {  // - goBack() - имплементация на ваш выбор , пока хз что с ним делать
      System.out.println("BACK");
    }
  }

