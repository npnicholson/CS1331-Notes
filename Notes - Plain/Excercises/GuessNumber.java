import java.util.Random;
import java.util.Scanner;

public class GuessNumber{
    public static void main(String[] args){
        Random rand = new Random();
        Scanner scan = new Scanner(System.in);
        int num = rand.nextInt(10) + 1;
        int guess = -1;
        System.out.println("Try to guess the number between 1 and 10!");
        do{
            System.out.println("Enter your guess! ");
            String in = scan.next();
            try{
                guess = Integer.parseInt(in);
            }catch(NumberFormatException e){
                if(in.equals("quit")){
                    System.out.println("Lame. It was " + num + ".");
                    break;
                }
                System.out.println("Please enter a number");
            }                
        }while(guess != num);
        if(guess == num)
            System.out.println("Yay! You guessed it. It was " + num + ".");
    }
}