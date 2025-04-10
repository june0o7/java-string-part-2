import java.util.*;
public class string_11 {
 

    public static int findNumOfWord(String s ,String w){ 
     int count =0;
   
     String[] b = s.split(" ");
     for (String string : b) {
        if (string.equals(w)) { 
            count++;
            
        }
        
     }


        return count;
    }

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("enter the sentence: ");
        String Sentence = sc.nextLine();
        System.out.print("enter the word: ");
        String word = sc.nextLine();
        int count = findNumOfWord(Sentence, word);
        System.out.println(count);

        
    }
    
}
