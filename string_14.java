import java.io.*;

public class string_14 {

    public static String convert(String word){
        String[] allword = word.split(" ");
        String reverse = "";
        for(int i=allword.length-1;i>=0;i--){
            reverse += allword[i] + " ";

        }
        return reverse;

    }

    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String S = br.readLine();
        String w = convert(S);
        System.out.println(w);
        
    }
    
}
