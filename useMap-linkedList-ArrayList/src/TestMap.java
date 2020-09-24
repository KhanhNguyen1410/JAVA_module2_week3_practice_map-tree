import java.util.*;

public class TestMap {
    public static void main(String[] args) {
        Map<String, Integer> hashMap= new HashMap<>();
        hashMap.put("tuan", 19);
        hashMap.put("huynh", 17);
        hashMap.put("wgien", 29);
        hashMap.put("tung", 32);
        System.out.println("display entries in hashMap");
        System.out.println(hashMap + "\n");
        Set<String> keyMap = hashMap.keySet();
        for (String i: keyMap){
            System.out.println(i + "  " + hashMap.get(i));
        }

        Map<String, Integer> newMap = new HashMap<>();
        newMap.put("hello", 12);

        hashMap.putAll(newMap);

        Map<String , Integer> treeMap = new TreeMap<>(hashMap);
        System.out.println("Display entries in ascending order of key");
        System.out.println(treeMap);


        Map<String, Integer> linkedHashMap= new LinkedHashMap<>(16,0.75f,true);
        linkedHashMap.put("smith", 30);
        linkedHashMap.put("tuan", 32);
        linkedHashMap.put("tien", 50);
        linkedHashMap.put("tung", 40);
        linkedHashMap.put("hoa", 20);
        System.out.println(linkedHashMap.get("tung"));
    }
}
