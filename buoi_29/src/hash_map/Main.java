package hash_map;
import java.util.ArrayDeque;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.PriorityQueue;
import java.util.Map.Entry;

public class Main {

    public static void main(String[] args) {

        LinkedHashMap<String, Double> hm = new LinkedHashMap<>();
        hm.put("Thanh", 9.3 );
        hm.put("An", 7.5 );
        hm.put("Vu", 6.3 );
        hm.put("Thai", 8.6 );
        hm.put("Quang", 9.8 );
        hm.put("Thanh", 10.0);

        for (Entry<String, Double> entry : hm.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        // System.out.println(hm.get("Thanh"));

    }

}
