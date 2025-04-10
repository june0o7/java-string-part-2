public class string_5 {
    public static boolean checkPalindrome(String s ){
String ulto = "";
        for(int i=0;i<s.length();i++){
            ulto = s.charAt(i)+ulto;
        }
        if (s.equals(ulto)) {
            return true;
            
        }else return false;
    }

    public static void main(String[] args) {
        String n = name_input.getname();
        if (checkPalindrome(n)) {
            System.out.println("The string is a palindrome");
            
        }else System.out.println("The string is not a palindrome");

    }
    
}
