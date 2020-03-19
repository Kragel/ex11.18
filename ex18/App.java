package t_11_holdingYourObjects.ex18;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class App {

    public static void main(String[] args)
    {
        Map<Integer, String> map = new HashMap<>();

        map.put(2, "A");
        map.put(3, "V");
        map.put(1, "J");
        map.put(4, "A");

        System.out.println(map);

        Object[] keys = map.keySet().toArray();

        Arrays.sort(keys);

        List<String> list = new LinkedList<String>() {
            {
                for (Object o : keys)
                {
                    add(map.get(o));
                }
            }
        };

        System.out.println(list);
    }

}
