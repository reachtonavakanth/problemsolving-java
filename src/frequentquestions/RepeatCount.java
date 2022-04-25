package frequentquestions;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class RepeatCount {

    public static void main(String[] args) {
      String str = "NAVAKANTH";

      findRepeatedCount("NAVAKANTH");
    }

    /* NAVAKANTH
    * N: 2
    * A: 3
    * V: 1
    * K: 1
    * T: 1
    * H: 1
    * */
    public static  void findRepeatedCount(String str){
        HashMap<Integer, Character> hasmap= new HashMap< Integer,Character>();
        HashMap<Character, Integer> hasmap2= new HashMap<Character, Integer>();

        for(int i=0;i<str.length();i++){
            for (Map.Entry ref : hasmap2.entrySet()){
                int count =1;
                Character charr= (Character) ref.getKey();

                if(charr == str.charAt(i)){
                  Object obj =  ref.getValue();
                    hasmap2.put(str.charAt(i),1);
                }else
                {
                    hasmap2.put(str.charAt(i),1);
                }
            }
        }

        for(Map.Entry ref :hasmap2.entrySet()){
            System.out.println(ref.getKey() + "  ---> "+ref.getValue());
        }
    }
}
