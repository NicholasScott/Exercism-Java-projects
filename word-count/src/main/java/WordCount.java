
import java.util.HashMap;
import java.util.Map;

public class WordCount{
    
    public Map<String, Integer> Phrase(String s){
        String[] splitWords;
        
        Map<String, Integer> phraseMap = new HashMap<>();
        splitWords = s.split(" ");
        
        for(String st: splitWords){
            int count =1;
            //replace all non words with an empty character
            st = st.replaceAll("\\W", "");
            st = st.toLowerCase();
         //if the hashmap already contains the word increase the count of the word
            if(phraseMap.containsKey(st)){
                count = phraseMap.get(st)+1;
            }
            //if the string isnt an empty character then set the value
            //where the key is the word (st) to the count of that word
            if(!st.equals("")){
            phraseMap.put(st, count);
        }
        }
        return phraseMap;
    }
   
}