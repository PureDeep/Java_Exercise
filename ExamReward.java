import java.util.Scanner;
public class ExamReward {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int score = sc.nextInt();
        if(score >= 95 && score <= 100){
            System.out.println("Red!");
        }else if(score >= 90 && score <= 94){
            System.out.println("Transformer!");
        }else if(score >= 80 && score <= 89){
            System.out.println("Blue!");
        }else{
            System.out.println("Purple!");
        }
        sc.close();
    }
}