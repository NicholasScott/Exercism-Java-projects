
import java.util.*;

public class Etl {
    
    public Map<String, Integer> transform(Map<Integer, List<String>> old){
        
        Map<String, Integer> transformed = new HashMap<String, Integer>() {};
        
        for (Map.Entry<Integer, List<String>> entry : old.entrySet())
        {
            List<String> value = entry.getValue();
            Integer key = entry.getKey();
            //loop through list of strings, convert them to lowercase and 
            //add them with their key to the transformed map.
            for (String s : value) 
                {
                     transformed.put(s.toLowerCase(), key);
                }
        }
        return transformed;
    }

}