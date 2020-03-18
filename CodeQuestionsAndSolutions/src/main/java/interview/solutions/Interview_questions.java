package interview.solutions;

//1. reverse string “Hello World” => “dlroW olleH” (without using ruby revert method)
public class Interview_questions {
    public static void main (String [] args){
        String string = "Hello World";
        StringBuilder sb = new StringBuilder();
        for(int i=string.length()-1; i>=0; i--){
            sb.append(string.charAt(i));
        }
        System.out.println(sb.toString());
    }
}
