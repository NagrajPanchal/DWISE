package map.hashmap;

import java.util.HashMap;
import java.util.Map;

public class HashMapModify
{
    public static void main(String[] args) {
        HashMap<String,Integer> emp =new HashMap<>();
        emp.put("Saikiran",2);
        emp.put("Rishi",7);
        emp.put("Abhi",1);
        emp.put("Akash",3);
        emp.put("Kailash",4);
        System.out.println("Modifying employee :");
        for (Map.Entry<String,Integer> entry : emp.entrySet())
        {
            entry.setValue(entry.getValue()*2);
        }
        System.out.println("Modify : "+emp);
    }
}
