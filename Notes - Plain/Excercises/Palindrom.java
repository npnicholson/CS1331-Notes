import java.util.Scanner;

public class Palindrom{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Give me a word: ");
        String in = scan.nextLine().toLowerCase();
        for(int i = 0; i < in.length(); i++){
            if(i != in.length()-1 && in.charAt(i) == ' '){
                in = in.substring(0,i) + in.substring(i+1);
                i--;
            }
            if(in.charAt(i) != in.charAt(in.length()-(i+1))){
                System.out.println("Not the same");
                return;
            }
        }
        System.out.println("Same");
    }
}