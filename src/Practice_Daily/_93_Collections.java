package Practice_Daily;

import java.util.LinkedList;

public class _93_Collections {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(34);
        list.add(74);
        list.add(84);
        list.add(24);
        list.add(94);
        list.add(1,45);
        list.remove(2);
        System.out.println( list.offer(45));

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

    }
}
