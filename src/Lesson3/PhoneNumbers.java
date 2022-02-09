package Lesson3;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class PhoneNumbers {
    private Map<String, Set<String>> phoneList = new HashMap<>();

    public void add(String name, String number){
        Set<String> tell = phoneList.getOrDefault(name, new HashSet<>());
        tell.add(number);
        phoneList.put(name, tell);
    }
    public Set<String> get(String name){
        return phoneList.get(name);
    }
}
