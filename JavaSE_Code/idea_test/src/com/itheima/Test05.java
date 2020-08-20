package com.itheima;

public class Test05 {
    public static void main(String[] args) {
        for (int x = 0; x <= 100; x++) {
            for (int y = 0; y <= 100; y++) {
                for (int z = 0; z <= 100; z++) {
                    if ((5 * x + 3 * y + z / 3 == 100) & (x + y + z == 100) & (z % 3 == 0)) {
                        System.out.println("x, y, z:" + x + ", " + y + ", " + z);
                    }
                }
            }
        }
    }
}
