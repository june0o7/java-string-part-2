
import java.util.*;
import java .io.*;

public class string_13 {
    public static boolean checkname(String name){
        boolean flag=true;
        for(int i = 0;i<name.length();i++){
            char ch = name.charAt(i);
            int num =  ch;
            System.out.println(num);
            if(num%2==0){
                flag=false;
            }
        
        }
        return flag;
    }

    public static void main(String[] args)throws IOException {
        InputStreamReader ir = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(ir);
        String word = br.readLine();
        if(checkname(word))
        System.out.println("name is odd");
        else System.out.println("name is not odd");

        
    }
    
}
