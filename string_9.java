public class string_9 {

    public static void convert (String s){
        String reform ="";
        String[] parts=s.split(" ");
        for(int i=0;i<s.length();i++){
            System.out.println(i);
            if(parts[i].equals("A")){
                System.out.println(i+"here");
                reform+="AN";
                System.out.println(i+"there");
                
            }else
            System.out.println(i);
            reform+=parts[i];
            System.out.println(i);
        }
        
        System.out.println(reform);
    }

    public static void main(String[] args) {
        String n = name_input.getname();
        convert(n);

    }
    
}
