package map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MapIterator
{
    public static void main(String[] args) {
        Map<String, Integer> veg = new HashMap<>();
        veg.put("Tomato",1);
        veg.put("Fenugreek Leaves",2);
        veg.put("Malbar Spinch",4);
        veg.put("IV Gourd",5);
        Iterator<Map.Entry<String,Integer>> iterator = veg.entrySet().iterator();
        while (iterator.hasNext())
        {
            Map.Entry<String, Integer> keyValue = iterator.next();
            System.out.println(keyValue.getKey()+" == "+keyValue.getValue());
        }
    }
}
