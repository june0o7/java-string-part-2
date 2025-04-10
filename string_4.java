import java.util.Arrays;
import java.util.List;

public class string_4 {
    
    public static int getDigitsNum(String n){
        int count = 0;
        for(int i=0;i<n.length();i++){
            char ch = n.charAt(i);
            if ("1234567890".indexOf(ch)!=-1) {
                
                count++;
                System.out.println("present");
            }
        }
        return count;
    }
    public static void getsmallnum(String n){
        int scount = 0;
        int space =0;
        int ccount=0;
        for(int i = 0 ; i<n.length(); i++){
            char ch = n.charAt(i);
            if(ch >='a' && ch<='z'){
                scount++;
                // System.out.println(ch);
            }
            if (ch>='A' && ch<='Z') {
                ccount++;
                
            }
            if (ch == ' ') {
                space++;
                
            }
        }
        // int ccount = n.length()-scount;

        System.out.println("the total number of letter is: "+n.length());
        System.out.println("the number of small letter is: "+scount);
        System.out.println("the number of Capital letter is: "+ccount);
        System.out.println("the number of special char is: "+(ccount+scount-n.length())*(-1));
        System.out.println("the number of words in this sentence is: "+(space+1));
       

    }
   
    
    public static void main(String[] args) {
        String n = name_input.getname();
        int x = getDigitsNum(n);
        System.out.println("number of digits in the string: " + x);
       getsmallnum(n);
        

    }
    
}
