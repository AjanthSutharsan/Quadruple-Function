import java.util.Scanner;

public class Quadruple
{
    
   
    
    public static int quadruple(int Number) {
        return Number*4;
    }

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        System.out.println("What is your name?");
        String Name = input.nextLine();

        String cont;

        do {
            
            System.out.println("Please enter the number you want to be quadrupled");
            int Number = input.nextInt();

            System.out.println("Your number, "+Number+", quadrupled is "+quadruple(Number));   
            
            System.out.println("Do you want to continue, Yes or No?");
            cont = input.nextLine();
            cont = input.nextLine();
       
        }while(cont.equals("Yes"));
    }
}
