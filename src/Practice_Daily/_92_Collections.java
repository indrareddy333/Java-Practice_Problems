package Practice_Daily;

import java.util.ArrayList;

public class _92_Collections {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("hello");
        list.add("hello1");
        list.add("hello2");
        list.add("hello3");
        list.remove(1);
        if(list.contains("hello2")){
            System.out.println("yes");
        }
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        list.clear();
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
