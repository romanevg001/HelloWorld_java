package Treads;

import java.util.*;

public class Threadtest2 {
    static final int size = 10000000;
    static final int half = size / 2;
    
    public static void run() {

        Threadtest2 t = new Threadtest2();
        t.method1();
        t.method2();
    }

    public void method1() {
        float[] arr1 = new float[size];
        Arrays.fill(arr1, 1);
        long a = System.currentTimeMillis();
        
        arr1 = calc(arr1);
        
        System.out.println("method1: " + (System.currentTimeMillis() - a));
    }

    public void method2() {
        float[] arr2 = new float[size];
        float[] arRes = new float[size];
        float[] a1 = new float[half];
        float[] a2 = new float[half];

        Arrays.fill(arr2, 1);
        long b = System.currentTimeMillis();
        
        System.arraycopy(arr2, 0, a1, 0, half);
        System.arraycopy(arr2, half, a2, 0, half);


        Thread t1 = new Thread(() -> { 
            System.arraycopy(calc(a1), 0, arRes, definedIndex(arRes), half);
        });
        Thread t2 = new Thread(() -> { 
            System.arraycopy(calc(a2), 0, arRes, definedIndex(arRes), half);
        });
        t1.start();
        t2.start();
  
        System.out.println("method2: " + (System.currentTimeMillis() - b));
    }

    private int definedIndex(float[] arRes) {
        return arRes[0] > 0 ? half : 0;
    }

    public static float[] calc(float[] arr) {
        for(int i = 0; i < arr.length; i++) {
            arr[i] = (float)(arr[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2)); 
        }
        return arr;
    }
}
