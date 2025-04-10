
import java.io.*;
public class string_12 {

    public static String convert(String word){

        String word1="";
        for(int i=0;i<word.length();i++){
            char ch = word.charAt(i);
            if(ch == 'y') word1+='a';
            if(ch=='z') word1+='b';
            if(ch>='a' && ch <= 'x'){
                char c = (char) ((char)ch+2);
                word1+=c;
            }

        }




        return word1; 
    }
    public static void main(String[] args)throws IOException {
        InputStreamReader ir = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(ir);
        System.out.println("enter the word: ");
        String word = br.readLine();
        String newword = convert(word);
        System.out.println(newword);
    }
    
}
