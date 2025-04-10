public class string_7 {

    public static void convertcap(String n){
        String r="";
        for(int i=0;i<n.length();i++){
            char ch = n.charAt(i);
            if (ch==' ') {
                r+=ch;
                
            }
            int a = (int)ch;
            int b = a-32;
            char c=(char)b;
            r+=c;

        }
        System.out.println(r);
    }
    public static void convertsmall(String n){
        String full = "";
        for (int i=0;i<n.length();i++){
            if (n.charAt(i)==' ') {
                full+=n.charAt(i);
                continue;
            }
            int a = n.charAt(i);
            // System.out.println(a);
            int b= a+32;
            char c = (char)b;
            full+=c;
        }
        System.out.println(full);
    }
    public static void main(String[] args) {
        String n = name_input.getname();
        convertsmall(n);
        
    }
    
}
