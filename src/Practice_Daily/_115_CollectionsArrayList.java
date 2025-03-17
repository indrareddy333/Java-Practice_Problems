package Practice_Daily;

import java.util.ArrayList;

public class _115_CollectionsArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(34);
        list.add(5);
        list.add(9);
        list.add(3);
        list.add(343);
        list.add(341);

        list.remove(4);
        boolean bool = list.contains(9);
        System.out.println(bool);
        System.out.println(list);
        System.out.println(list.indexOf(341));
    }
}
