public class string_18 {

    public static String convert (String word){

    String rword=word.substring(1, word.length()-1);
    
    char l1 = word.charAt(0);
    char l2 = word.charAt(word.length()-1);

    
        return l2+rword+l1;
    }
    public static void main(String[] args) {
        
        
        System.out.println("enter the word: ");
        String word = name_input.getname();
        String revword = convert(word);
        System.out.println(revword);


    }
    
}
