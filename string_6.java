public class string_6 {
    public static void sname(String n){
        char f = n.charAt(0);
        int index = n.indexOf(' ');
        String full = f+". "+n.substring(index+1,n.length());
        System.out.println(full);

    }
    public static void smname(String n){
        char f = n.charAt(0);
        int index = n.indexOf(' ');
        int index2 = n.indexOf(' ',index+1);
       char m = n.charAt(index+1);
        String middle = n.substring(index+1, index2);
        String full = f+"."+ m+"."+n.substring(index2);
        System.out.println(full);
    }
    public static void main(String[] args) {
        String n = name_input.getname();
        // sname(n);
        smname(n);
    }
    
}
