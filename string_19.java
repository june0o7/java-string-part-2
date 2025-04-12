public class string_19 {

    public static String convert(String word){
        char fv;
        int fi=0,li=0;
        char lv;
        for(int i=0;i<word.length();i++){
            char ch = word.charAt(i);
            if("aeiouAEIOU".indexOf(ch)!=-1){
                fv = ch;
                fi = i;
                System.out.println(fv);
                break;
                
            }
        }
        
        for(int j=word.length()-1;j>0;j--){
            char ch1 = word.charAt(j); 
            if("aeiouAEIOU".indexOf(ch1)!=-1){
                lv = ch1;
                li = j;
                System.out.println(lv);
                break;
                
            }
        }

        if(fi!=li){
            char[] cha = word.toCharArray();
            char temp = cha[fi];
            cha[fi] = cha[li];
            cha[li] = temp;
            return new String (cha);
        }
        return word;
    }
    

    public static void main(String[] args) {
        String word = name_input.getname();
        String reword = convert(word);
        System.out.println(reword);

    }
    
}
