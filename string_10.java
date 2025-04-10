
import java.util.*;

public class string_10 {
    
    public static String Encrypt(String word){
        String Eword="";
        String Lword="";
        boolean flag=false;
        for(int i=0;i<word.length();i++){
            char ch = word.charAt(i);

          

              if("aeiouAEIOU".indexOf(ch)!= -1){
                  Eword+=ch;
                  flag=true;

                  
                }
                else if("aeiouAEIOU".indexOf(ch)== -1 && flag == false){
                    Lword+=ch;
                }
                else if (flag==true){
                    Eword+=ch;
                }else
                System.out.println("error");
                
           


        }


        return Eword+Lword+"ay";
    }
    
    
    
    public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
          System.out.println("enter the word for piglatin conversion");
          String word = sc.nextLine();
          String piglatin = Encrypt(word);
          System.out.println(piglatin);
    }
    
}
