package utility;

import java.util.concurrent.TimeUnit;

public class printWithDelays{
  public void DelayedPrint(String data, long delay){
    try{
      for (char ch:data.toCharArray()) {
        System.out.print(ch);
        TimeUnit.MILLISECONDS.sleep(delay);
      }
    } catch (Exception e){
      e.printStackTrace();
    }
  }
}
