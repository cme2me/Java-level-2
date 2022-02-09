package Lesson3;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        String[] words= {"Hello", "Hello", "Kick", "Jump", "Fly", "Kick", "Run", "Depend", "Spend", "Love","Roll"};
        System.out.println(Arrays.toString(words));

        Map<String, Integer> hashMap = new HashMap<>();
        for (String n : words) {
            hashMap.put(n, hashMap.getOrDefault(n, 0)+1);
        }
        System.out.println(hashMap);
    }
}
