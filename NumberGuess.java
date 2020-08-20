import java.util.Random;
import java.util.Scanner;
public class NumberGuess {
    public static void main(String[] args){
        Random r = new Random();
        Scanner sc = new Scanner(System.in);
        int num = r.nextInt(10) + 1;
        int guess = sc.nextInt();
        while(guess != num){
            if(guess < num){
                System.out.println("Your answer is small! Try again!");
            }else{
                System.out.println("Your answer is big! Try again!");
            }
            guess = sc.nextInt();
        }
        System.out.println("You are right!");
        sc.close();
    }
}