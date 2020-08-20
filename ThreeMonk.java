import java.util.Scanner;

public class ThreeMonk {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Input the first monk's height:");
        int a = sc.nextInt();
        System.out.println("Input the second monk's height:");
        int b = sc.nextInt();
        System.out.println("Input the third monk's height:");
        int c = sc.nextInt();
        int max = (a > b ? a : b);
        max = (max > c ? max : c);
        System.out.println(max);
        sc.close();
    }
}