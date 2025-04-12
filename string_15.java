import java.io.*;

public class string_15 {
    public static void convert(String s){//reformat the string from big to samll word

        String[] word = s.split(" ");
        String reform = "";
        for(int i=0;i<word.length-1;i++){
            
            for(int j = i+1 ; j<word.length;j++){
                if(word[i].length() < word[j].length()){
                    String temp = word[i];
                    word[i] = word[j];
                    word[j] = temp;
                    }

            }
           

        }
        for (String wordString : word) {
            reform += wordString + " ";
            
        }
    System.out.println(reform);
    
    }



    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        convert(s);


    }
    
}
