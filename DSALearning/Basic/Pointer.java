package DSALearning.Basic;

import java.util.HashMap;

public class Pointer {
    private int num1 = 11;
    private int num2 = num1;

    private HashMap<String, Integer> map1 = new HashMap<>();
    private HashMap<String, Integer> map2 = new HashMap<>();

    public void getNumPrint() {
        num1 = 22;
        System.out.println(num1);
        System.err.println(num2);
    }

    public void getMapPrint(){
        map1.put("value", 11);
        map2 = map1;

        map2.put("value", 22);

        System.out.println(map1);
        System.out.println(map2);
    }
}
