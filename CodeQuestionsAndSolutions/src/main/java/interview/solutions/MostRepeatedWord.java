package interview.solutions;

import java.util.*;
import java.util.Map.Entry;

public class MostRepeatedWord {

    static Entry<String, Integer> mostRepeatedWord(String str) {
        String[] array = str.toLowerCase().split(" ");
        Map<String, Integer> map = new HashMap<>();
        for (String anArray : array) {
            if (map.containsKey(anArray)) {
                map.put(anArray, map.get(anArray) + 1);
            } else {
                map.put(anArray, 1);
            }
        }

        //sort by keys
//        TreeMap<String, Integer> sorted = new TreeMap<>(map);
//        return sorted.firstKey();

        //sort by values
        // from http://www.java67.com/2015/01/how-to-sort-hashmap-in-java-based-on.html
        Set<Entry<String, Integer>> set = map.entrySet();
        List<Entry<String, Integer>> list = new ArrayList<>(set);
        list.sort((o1, o2) -> {
            int result = (o2.getValue()).compareTo(o1.getValue());
            if (result != 0) {
                return result;
            } else {
                return o1.getKey().compareTo(o2.getKey());
            }
        });

        return list.get(0);

    }

}
