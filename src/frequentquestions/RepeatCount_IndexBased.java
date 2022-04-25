package frequentquestions;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class RepeatCount_IndexBased {

    public static void main(String[] args) {
      String str = "NAVAKANTH";
      String[] strArr = str.split("");
        findRepeatedChars(strArr);
    }
    public static void findRepeatedChars(String[] strArr){
        ArrayList<String> input_list = new ArrayList<String>();
        for (int i = 0; i < strArr.length; i++) {
            input_list.add(strArr[i]);
        }
        HashMap<Integer, String> input_map = new HashMap<Integer, String>();
        HashMap<Integer, String> output_map = new HashMap<Integer, String>();
        output_map.putAll(input_map);

        // logic

        for (int i = 0; i < input_list.size(); i++) {
            input_map.put(i, input_list.get(i));
        }
        HashSet<String> set1 = new HashSet<>(input_map.values()); // get all the Values in set
        for (String value : set1) {
            int m = 0;
            for (Map.Entry<Integer, String> entry : input_map.entrySet()) { // iterate over the input array to get
                // corresponding key value
                if (entry.getValue().equals(value)) {
                    if (m > 0) { // filtering 0 for output format
                        output_map.put(entry.getKey(), value + m); // update in output map
                    } else {
                        output_map.put(entry.getKey(), value);
                    }
                    m = m + 1;
                }
            }
            m = 0;
        }
        // output_list.add(input_list.get(i));

        System.out.println("**** Input *****");

        for (Map.Entry<Integer, String> entry : input_map.entrySet()) {
            System.out.println("Key = " + entry.getKey() + ", Value = " + entry.getValue());
        }
        System.out.println("**** Output *****");

        for (Map.Entry<Integer, String> entry : output_map.entrySet()) {
            System.out.println("Key = " + entry.getKey() + ", Value = " + entry.getValue());
        }

        System.out.println(output_map.values());
    }
}
