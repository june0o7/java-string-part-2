
public class string_1 {
    public static void main(String[] args) {
    String name = name_input.getname();
    String reverse = "";
    String reverse2 = "";
    for(int i = 0 ; i < name.length() ; i++){
           reverse = name.charAt(i)+reverse;

    }
    System.out.println("Reversed Name: " + reverse);
    //another way to reverse a string
    for(int i = name.length() ; i> 0 ; --i){
        reverse2+=name.charAt(i-1);

    }
    System.out.println("Reversed2 Name: " + reverse2);
}
}
