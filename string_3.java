public class string_3 {
    public static void main(String[] args) {
        String n = name_input.getname();
        boolean v =false;
        for(int i = 0 ; i<n.length();i++){
            char ch = n.charAt(i);
            if("aeiouAEIOU".indexOf(ch)!=-1 ){
                System.out.println("The string contains a vowel. Position: "+i);
               v=true;
            }
        }
        if (v==false) {
            System.out.println("The string does not contain a vowel");
            
        }
    }
    
}
