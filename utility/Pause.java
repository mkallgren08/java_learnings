package utility; // I think this has to match the reverse filepath to the rootdirectory for the project

public class Pause {
  public void myPause(long delay){
    try {
      Thread.sleep(delay);
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}