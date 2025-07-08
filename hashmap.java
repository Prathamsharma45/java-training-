import java.util.HashMap;

public class hashmap {
    public static void main(String[] args) {
        HashMap<String,Integer> map=new HashMap<>();
        map.put("pratham",146);
        map.put("rohit",45);
        map.put("ram",78);
        map.remove("ram",78);
        System.out.println(map);
        System.out.println(map.get(1));
        System.out.println(map.getOrDefault(7,0));

    }
}
