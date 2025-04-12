import java.io.*;

public class string_17 {

    public static void checkdate(String date){
        boolean flag =false;
        
        int dd=(date.charAt(0)-'0')*10+(date.charAt(1)-'0');
        int mm=(date.charAt(3)-'0')*10+(date.charAt(4)-'0');

        int yy1=(((date.charAt(6)-'0') *10+(date.charAt(7)-'0') )*10+(date.charAt(8)-'0') )*10+(date.charAt(9)-'0');
        
        if(dd>0 && dd<32 && mm>0 && mm<13){
            flag = true;
        }

        if (flag) {
            System.out.println("correct format"+dd+mm+yy1);
        }else System.out.println("incorrect format"+dd+mm+yy1);
        
    }

    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        
        String date = br.readLine();
        checkdate(date);
    }
    
}
