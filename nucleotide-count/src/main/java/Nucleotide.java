
import java.util.HashMap;
import java.util.Map;

public class Nucleotide{
    
}
class DNA{
    char[] Nucleotides;
    public DNA(String s){
        Nucleotides = s.toCharArray();
    }
    
    public int count(char c) throws IllegalArgumentException{
        int count =0;
        if(c != 'A' && c!= 'C' && c!='G' && c!= 'T'){
            throw new IllegalArgumentException(c + "is not a valid Nucleotide");
        }
        for(int i=0; i<Nucleotides.length; i++){
            if(Nucleotides[i]== c){
                count++;
            }
        }
        return count;
    }
    public Map<Character, Integer> nucleotideCounts(){
        Map<Character, Integer> nucleotideCountMap = new HashMap<Character, Integer>(){};
        nucleotideCountMap.put('A', count('A'));
        nucleotideCountMap.put('C', count('C'));
        nucleotideCountMap.put('G', count('G'));
        nucleotideCountMap.put('T', count('T'));
        return nucleotideCountMap;
    }
}