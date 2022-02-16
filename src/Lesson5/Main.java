package Lesson5;

import java.util.Arrays;

public class Main {
    static final int size = 10000000;
    static final int h = size / 2;

    public static float[] init(float[] arr){
        for (int i = 0; i < arr.length; i++)
            arr[i] = (float) (arr[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + arr[i] / 5) * Math.cos(0.4f + arr[i] / 2));
        return arr;
    }

    public static float[] initSec(float[] array){
        for (int i = 0; i < array.length; i++) {
            array[i] = (float) (array[i] * Math.sin(0.2f + (i + h) / 5) * Math.cos(0.2f + (i+h) / 5) * Math.cos(0.4f + (i + h) / 2));
        }
        return array;
    }

    private static void firstThread() {
        float[] arr = new float[size];
        Arrays.fill(arr, 1.0f);
        long a = System.currentTimeMillis();
        init(arr);
        System.out.println("Первый поток " + (System.currentTimeMillis() - a));
    }

    public static void bothTreads() {
        float[] arr = new float[size];
        float[] arr1 = new float[h];
        float[] arr2 = new float[h];
        Arrays.fill(arr, 1.0f);

        long a = System.currentTimeMillis();
        System.arraycopy(arr, 0, arr1, 0, h);
        System.arraycopy(arr, h, arr2, 0, h);

        Thread t1 = new Thread(() -> {
            float[] a1 = new float[h];
            System.arraycopy(a1, 0, arr1, 0, a1.length);
        });

        Thread t2 = new Thread(() -> {
            float[] a2 = initSec(arr2);
            System.arraycopy(a2, 0, arr2, 0, a2.length);
        });

        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.arraycopy(arr1, 0, arr, 0, h);
        System.arraycopy(arr2, 0, arr, h, h);
        System.out.println("Второй " + (System.currentTimeMillis() - a));
    }
    public static void main(String[] args) {
        firstThread();
        bothTreads();
    }
}
