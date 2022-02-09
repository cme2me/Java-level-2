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

        PhoneNumbers phNum = new PhoneNumbers();
        phNum.add("Насонов", "89554442021");
        phNum.add("Семченко", "8955331233");
        phNum.add("Насонов", "89551212312");
        phNum.add("Топлутов", "890235943");
        phNum.add("Сварщиков", "854664323");
        phNum.add("Водоёмов", "89685465432");
        phNum.add("Уткина", "89998886655");
        phNum.add("Человекина", "89654923920");

        System.out.println("Телефон: " + phNum.get("Насонов"));
        System.out.println("Телефон: " + phNum.get("Водоёмов"));
        System.out.println("Телефон: " + phNum.get("Уткина"));
        System.out.println("Телефон: " + phNum.get("Топлутов"));
        System.out.println("Телефон: " + phNum.get("Семченко"));
        System.out.println("Телефон: " + phNum.get("Сварщиков"));
        System.out.println("Телефон: " + phNum.get("Человекина"));
    }
}
