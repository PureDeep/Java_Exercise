package com.itheima02;

public class StringBuilderDemo02 {
    public static void main(String[] args) {
        int[] arr = {1,2,3};
        String result = spliceS(arr);
        System.out.println(result);
    }

    public static String spliceS(int[] arr){
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for(int i = 0; i < arr.length; i++){
            sb.append(arr[i]);
            if(i != arr.length -1){
                sb.append(",");
            }
        }
        sb.append("]");
        String s = sb.toString();
        return s;
    }
}
