package interview.cracking_the_code_interview;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class JavaTest {
    public static void main (String[] args){
        List<String> list = Arrays.asList(args);
        System.out.println(list);
        Collections.sort(list);
        System.out.print(list);
    }
}
