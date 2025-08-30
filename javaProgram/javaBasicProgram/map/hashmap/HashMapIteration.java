package map.hashmap;

import java.util.HashMap;
import java.util.Map;

public class HashMapIteration
{
    public static void main(String[] args) {
        HashMap<String,String> name = new HashMap<>();
        name.put("Nagraj","Panchal");
        name.put("Saikiran","Katage");
        name.put("Akash","Cholakar");
        name.put("Kailash","Thakur");
        name.put("Abhijeet","Kulkarni");
        for (Map.Entry<String, String> entry : name.entrySet())
        {
            System.out.println("Name ="+entry.getKey()+" Surname ="+entry.getValue());
        }
    }
}
