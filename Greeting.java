
import java.util.Scanner;
public class Greeting
{
    public static void greeting(String name, String place) {
        System.out.println("Hello "+name+" from "+place);
    }
    
    public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      
      System.out.println("What is your name?");
      String name = input.nextLine();
      
      System.out.println("Which country are you from?");
      String place = input.nextLine();
      
      greeting(name,place);
    }


}
