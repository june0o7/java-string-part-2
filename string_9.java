public class string_9 {

    public static void convert (String s){
        
        String[] parts=s.split(" ");
        StringBuilder e = new StringBuilder();
        for(String i : parts){
            if(i.equals("A")){
                e.append("An ");
            }
            else if (i.equals("a")) {
                e.append("an ");
            }
            else{
                e.append(i+" ");
            }


        } 
        
       System.out.println(e);
    }

    public static void main(String[] args) {
        String n = name_input.getname();
        convert(n);

    }
    
}
