package Singleton.example;

public class House {
  private   House(){}

  private static House house=new House();

  public static House getAccess(){
      return house;
  }



}
