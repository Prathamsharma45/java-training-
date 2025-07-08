import java.util.ArrayList;

public class list {
    public static void main(String[] args) {

        ArrayList<Integer>arr=new ArrayList<>();
        arr.add(5);
        arr.add(7);
        arr.add(2,11);
        arr.set(2,13);

        for (int i = 0; i < arr.size(); i++) {

            System.out.println(arr.get(i));

        }
    }
}
