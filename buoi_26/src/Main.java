import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {

        // Box<String> box = new Box<String>(null);

        // Box<String> box = new Box<String>(null);

        // ArrayList<? extends Number> arr = new ArrayList<>();
        // arr.get(0);
        // arr.add(new Integer(10));

        // ArrayList<? super Integer> arr = new ArrayList<>();
        // arr.get(0);
        // arr.add(new Integer(10));
        // arr.add(new String());

        // ArrayList<Object> arr = new ArrayList<>();
        // arr.add("DSJVNASDIV");
        // arr.add(3.14);
        // test2(arr);

        ArrayList<Integer> source = new ArrayList<>();
		ArrayList<Object> destination = new ArrayList<>();
		square(destination, source);

        Collections.binarySearch(null, null, null);

    }

    public static void test1(ArrayList<? extends Number> arr) {}

    public static void test2(ArrayList<? super Integer> arr) {
        arr.get(0);
    }

    public static void square(List<? super Number> destination, List<? extends Number> source) {
		for (Number number : source) {
			destination.add(number.doubleValue() * number.doubleValue());
		}
	}

}
