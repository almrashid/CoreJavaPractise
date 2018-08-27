package Singleton.example;

public class Hospital {
  private static Hospital ourInstance = new Hospital();

  public static Hospital getInstance() {
       return ourInstance;
 }
  private Hospital() {
   }

}
