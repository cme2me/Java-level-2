package Lesson5;

public class Main {
    static final int size = 10000000;
    static final int h = size / 2;

    public float[] init(float[] arr){
        for (int i = 0; i < arr.length; i++)
            arr[i] = (float) (arr[i] * Math.sin(0.2f + arr[i] / 5) * Math.cos(0.2f + arr[i] / 5) * Math.cos(0.4f + arr[i] / 2));
        return arr;

    }

    public void firstThread() {
        float[] arr = new float[size];
        for (int i = 0; i < arr.length; i++) arr[i] = 1.0f;
        long a = System.currentTimeMillis();
        init(arr);
        System.out.println("Первый поток " + (System.currentTimeMillis() - a));
    }

    public static void main(String[] args) {
        Main main = new Main();
        main.firstThread();
    }
}
