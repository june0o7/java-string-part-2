import java.util.*;
public class string_16 {
    public static boolean emailcheck(String email){
        if (email==null||email.length()<5)return false;
        int dot = email.lastIndexOf(".");
        int at = email.indexOf("@");
        
        if(at<=0||dot<=at+1||dot==email.length()-1)return false;
        if(at!=email.lastIndexOf("@")) return false;
        if(email.contains(" ")) return false;

        return true;


        
    }


    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        String email = sc.nextLine();
        System.out.println(emailcheck(email));

    }
    
}
