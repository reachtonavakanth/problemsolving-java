package frequentquestions;

public class ReverseStringWithNumchars {


    // Write a java program to reverse a string keeping numbers and special characters at same place
    //Example
    //Co22for@ge1
    //eg22rof@oc1
    public static void main(String[] args) {
        reverseWord("Co22for@ge1");

    }

    public static void reverseWord(String str){
        String strr[]= str.split("");
        String[] output = new String[strr.length];
           int count = 0;
            for(int j=1;j<=strr.length;j++){
                output[count]=strr[strr.length-j];
                count++;
            }

        for(int k=0;k<output.length;k++){
            System.out.print(output[k]);

        }
    }
}
