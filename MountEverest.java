public class MountEverest {
    public static void main(String[] args){
        int height = 8844430;
        double h = 0.1;
        int i = 0;
        while(h < height){
            h *= 2;
            i++;
        }
        System.out.println(i);
    }
}