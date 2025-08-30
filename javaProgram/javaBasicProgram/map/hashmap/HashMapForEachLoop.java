package map.hashmap;

import java.util.HashMap;
import java.util.Map;
public class HashMapForEachLoop
{
    public static void main(String[] args) {
        Map<String,String> names = new HashMap<>();
        names.put("Jyoti","Nagraj");
        names.put("Mummy","Papa");
        names.put("Shakuntala","Subhash");
        names.put("Anith","Shivakumar");
        for (Map.Entry<String, String> entry : names.entrySet())
        {
            String name = entry.getKey();
            String surname = entry.getValue();
            System.out.println(name+" "+surname);
        }

    }
}
