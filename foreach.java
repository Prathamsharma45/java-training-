import javax.swing.*;
import java.util.ArrayList;

public class foreach {
    public static void main(String[] args) {

        ArrayList<Integer> arr=new ArrayList<>();
        arr.add(5);
        arr.add(7);
        arr.add(2);
        arr.add(4);
        arr.add(8);
        arr.remove(2);
        arr.add(2,11);
        arr.set(2,13);
        int even=0;
        int odd=0;
        for(int var:arr){
            if (var % 2 == 0) {
                even++;
            }
            else{
                odd++;
            }
            System.out.println(var);
        }

        System.out.println("the sum of the odd+even:"+even+odd);
        System.out.println("the even num="+even);
        System.out.println("the odd num="+odd);
    }
}
