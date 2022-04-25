package frequentquestions;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class ReverseString {

    /*.Reverse each word in the string
    Input : my name is khan
    Output : ym eman si nahk */

    public static void main(String[] args) {
    reverseWordInaString("my name is khan");
    }
    public static void reverseWordInaString(String input){
        String[] strArr =  input.split(" ");
        for(int i = 0;i<strArr.length;i++){
           String word =  strArr[i];
           for(int j=word.length();j>0;j--){
               System.out.print(word.charAt(j-1));
           }
            System.out.print(" ");
        }
    }
}
