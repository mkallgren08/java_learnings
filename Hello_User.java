import java.util.Scanner;
import utility.*;


class Hello_User {
  static void myPause(long delay){
    try {
      Thread.sleep(delay);
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
  public static void main(String[] args){
    Scanner readObj = new Scanner(System.in); // Creates a Scanner object
    printWithDelays Delayer = new printWithDelays();
    Pause Pauser = new Pause();
    try {
      Hello_User_Options UserOptions = new Hello_User_Options();
      System.out.println(UserOptions.greet);
      Pauser.myPause(750);
      System.out.println(UserOptions.askname);
      String UserName = readObj.nextLine();
      myPause(750);
      Delayer.DelayedPrint("....\n", 200);
      System.out.println("Hello " + UserName);
    } finally {
      readObj.close();
    }

  }
}