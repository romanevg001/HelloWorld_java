package Treads;

import java.util.*;

public class Threadtest2 {
    static final int size = 10000000;
    static final int half = size / 2;
    
    public static void run() {

        Threadtest2 t = new Threadtest2();
        t.method1();
    }

    public void method1() {
        float[] arr1 = new float[size];
        Arrays.fill(arr1, 1);
        long a = System.currentTimeMillis();
        for(int i = 0; i < arr1.length; i++) {
            arr1[i] = calc(arr1[i], i);
        }
        System.out.println(System.currentTimeMillis() - a);
    }


    private float calc(float arrEl, int i) {
        return (float)(arrEl * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
    }
}
