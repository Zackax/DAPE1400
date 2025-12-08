package Repitisjon2025.Opggave1;
import java.util.Scanner;
public class Kalkulator {
  public static void summ(){
      Scanner scanner = new Scanner(System.in);
      double tall1;
      double tall2;
        try{
          System.out.println("Enter first nr: ");
          tall1  = scanner.nextDouble();
          System.out.println("Enter second nr: ");
          tall2  = scanner.nextDouble();
        }catch(Exception e){
          System.out.println("Tallet er ikke gydligt! ");
          tall1 = 0;
          tall2 = 0;
        }
        

      
      System.out.println(tall1+tall2);
  }
  public static void main(String[] args){
    Kalkulator.summ();
  }
  
}
