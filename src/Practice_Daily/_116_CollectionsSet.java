package Practice_Daily;

import java.util.*;

public class _116_CollectionsSet {
    public static void main(String[] args) {
        Set<Integer> set = new TreeSet<>();
        set.add(90);
        set.add(90);
        set.add(56);
        set.add(9);
        set.add(0);
        set.add(9);
        set.add(909);

      //  Iterator<Integer> nums = set.iterator();

        //while (nums.hasNext())
           // System.out.println(nums.next());
        Map<String, Integer> maps = new HashMap<>();

        maps.put("Indra", 98494);
        maps.put("Hello", 4947155);
        maps.put("srinu", 98494);
        maps.put("reddy", 4947155);
        maps.put("deepika", 98494);
        maps.put("Amma", 4947155);
        System.out.println(maps.keySet());
        System.out.println(maps.values());
        

        System.out.println(maps);
    }
}
