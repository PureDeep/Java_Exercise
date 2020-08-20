public class Narcissus {
    public static void main(String[] args){
        int a = 0;
        int b = 0;
        int c = 0;
        int num = 0;
        for(int i = 100; i <= 999; i++){
            a = i / 100;
            b = (i - a * 100) / 10;
            c = i % 10;
            if(Math.pow(a, 3) + Math.pow(b, 3) + Math.pow(c, 3) == i){
                System.out.println(i);
                num++;
            }
        }
        System.out.println(num);
    }
}