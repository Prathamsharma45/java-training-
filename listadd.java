import java.util.HashMap;
import java.util.HashSet;
import java.util.TreeSet;

public class listadd {
    public static void main(String[] args) {
        HashSet<String>set=new HashSet<>();
        TreeSet<Integer>data=new TreeSet<>();

        set.add("hello");
        set.add("hello");
        set.add("rahul");
        set.remove("hello");
        data.add(15);
        data.add(4);
        data.add(56);
        data.add(17);
        data.add(78);
        data.add(98);

        data.remove(56);
        System.out.println(set);
        System.out.println(data);
    }
}