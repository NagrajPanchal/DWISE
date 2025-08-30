package map.hashmap;
import java.util.HashMap;
import java.util.Map;

public class HashMapEntrySetIteration
{
    public static void main(String[] args) {
        HashMap<String, Integer> studentScores = new HashMap<>();
        studentScores.put("Panchal",92);
        studentScores.put("Nagraj",91);
        studentScores.put("Jyoti",98);
        studentScores.put("Meghana",99);
        studentScores.put("Shashank",94);
        studentScores.put("Sidharth",89);
        System.out.println("Iterating Through Entries :");
        for (Map.Entry<String,Integer> entry : studentScores.entrySet())
        {
            String studentName = entry.getKey();
            Integer score = entry.getValue();
            System.out.println(studentName+"'s score: "+score);
        }
    }
}
