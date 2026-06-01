import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        // ArrayList<String> list = new ArrayList<>();
        // System.out.println(list);
        // list.add("Java");  // 0
        // list.add("Python");  // 1
        // list.add("Javascript");  // 2
        // System.out.println(list);
        // list.add(3, "C#");
        // System.out.println(list);
        // System.out.println(list.get(3));
        // list.set(1, "C++");
        // System.out.println(list);
        // list.remove(1);
        // list.remove("Python");
        // System.out.println(list);
        // System.out.println(list.indexOf("Python"));
        // System.out.println(list.contains("Python"));
        // System.out.println(list.size());
        // System.out.println(list.isEmpty());
        // list.clear();
        // System.out.println(list);

        // int[] arr = new int[] {4, 2, 6, 3, 5, 7, 9};
		// System.out.println(Main.search(arr, 6));

        // Integer[] arr = new Integer[] {4, 2, 200, 3, 5, 7, 9};
		// System.out.println(Main.search(arr, 200));

        // Student[] arr = new Student[] {
		// 	new Student("S01", "A", 19),
		// 	new Student("S02", "B", 23),
		// 	new Student("S03", "C", 21),
		// 	new Student("S04", "D", 20)
		// };
        // System.out.println(search(arr, new Student("S02", "B", 23)));
        // System.out.println(Main.searchById(arr, "S02"));
		// System.out.println(Main.searchByName(arr, "D"));
		// System.out.println(Main.searchByAge(arr, 19));
        // int index = searchById(arr, "S02");
        // System.out.println(arr[index].getInfo());

        // int[] arr = new int[] {4, 2, 6, 3, 5, 7, 9};
		// System.out.println(Arrays.toString(arr));
		// Main.sort(arr);
		// System.out.println(Arrays.toString(arr));

        // String[] arr = new String[] {"Java", "C++", "Python", "C#", "Javascript", "Dart"};
		// System.out.println(Arrays.toString(arr));
		// // Main.sort(arr);
        // Arrays.sort(arr);
		// System.out.println(Arrays.toString(arr));

        Student[] arr = new Student[] {
			new Student("S01", "A", 26),
			new Student("S02", "E", 20),
			new Student("S03", "D", 24),
			new Student("S04", "B", 22)
		};
		for(Student s : arr) {
			System.out.println(s.getInfo());
		}
		
		// System.out.println();
		// Main.sortByName(arr);
		// for(Student s : arr) {
		// 	System.out.println(s.getInfo());
		// }

        System.out.println();
        Arrays.sort(arr, (a, b) -> a.name.compareTo(b.name));
		for(Student s : arr) {
			System.out.println(s.getInfo());
		}
		
		// System.out.println();
		// Main.sortByAge(arr);
		// for(Student s : arr) {
		// 	System.out.println(s.getInfo());
		// }
		
		// System.out.println();
		// Main.sortById(arr);
		// for(Student s : arr) {
		// 	System.out.println(s.getInfo());
		// }

    }

    // public static int search(int[] arr, int key) {
	// 	for(int i = 0; i < arr.length; i++) {
	// 		if(arr[i] == key) {
	// 			return i;
	// 		}
	// 	}
	// 	return -1;
	// }

    // public static int search(Integer[] arr, Integer key) {
	// 	for(int i = 0; i < arr.length; i++) {
	// 		if(arr[i].equals(key)) {
	// 			return i;
	// 		}
	// 	}
	// 	return -1;
	// }

    // public static int searchById(Student[] arr, String id) {
	// 	for(int i = 0; i < arr.length; i++) {
	// 		if(arr[i].id.equals(id)) {
	// 			return i;
	// 		}
	// 	}
	// 	return -1;
	// }
	
	// public static int searchByName(Student[] arr, String name) {
	// 	for(int i = 0; i < arr.length; i++) {
	// 		if(arr[i].name.equals(name)) {
	// 			return i;
	// 		}
	// 	}
	// 	return -1;
	// }
	
	// public static int searchByAge(Student[] arr, int age) {
	// 	for(int i = 0; i < arr.length; i++) {
	// 		if(arr[i].age == age) {
	// 			return i;
	// 		}
	// 	}
	// 	return -1;
	// }

    // public static int search(Student[] arr, Student key) {
	// 	for(int i = 0; i < arr.length; i++) {
	// 		if(arr[i].equals(key)) {
	// 			return i;
	// 		}
	// 	}
	// 	return -1;
	// }

    // public static void sort(int[] arr) {
	// 	for(int i = 0; i < arr.length - 1; i++) {
	// 		int min = i;
	// 		for(int j = i + 1; j < arr.length; j++) {
	// 			if(arr[min] > arr[j]) {
	// 				min = j;
	// 			}
	// 		}
	// 		int temp = arr[i];
	// 		arr[i] = arr[min];
	// 		arr[min] = temp;
	// 	}
	// }

    // public static void sort(String[] arr) {
	// 	for(int i = 0; i < arr.length - 1; i++) {
	// 		int min = i;
	// 		for(int j = i + 1; j < arr.length; j++) {
	// 			if(arr[min].compareTo(arr[j]) > 0) {
	// 				min = j;
	// 			}
	// 		}
	// 		String temp = arr[i];
	// 		arr[i] = arr[min];
	// 		arr[min] = temp;
	// 	}
	// }

    // public static void sortById(Student[] arr) {
	// 	for(int i = 0; i < arr.length - 1; i++) {
	// 		int min = i;
	// 		for(int j = i + 1; j < arr.length; j++) {
	// 			if(arr[min].id.compareTo(arr[j].id) > 0) {
	// 				min = j;
	// 			}
	// 		}
	// 		Student temp = arr[i];
	// 		arr[i] = arr[min];
	// 		arr[min] = temp;
	// 	}
	// }
	
	// public static void sortByName(Student[] arr) {
	// 	for(int i = 0; i < arr.length - 1; i++) {
	// 		int min = i;
	// 		for(int j = i + 1; j < arr.length; j++) {
	// 			if(arr[min].name.compareTo(arr[j].name) > 0) {
	// 				min = j;
	// 			}
	// 		}
	// 		Student temp = arr[i];
	// 		arr[i] = arr[min];
	// 		arr[min] = temp;
	// 	}
	// }
	
	// public static void sortByAge(Student[] arr) {
	// 	for(int i = 0; i < arr.length - 1; i++) {
	// 		int min = i;
	// 		for(int j = i + 1; j < arr.length; j++) {
	// 			if(arr[min].age > arr[j].age) {
	// 				min = j;
	// 			}
	// 		}
	// 		Student temp = arr[i];
	// 		arr[i] = arr[min];
	// 		arr[min] = temp;
	// 	}
	// }

    // public static void sort(Student[] arr) {
	// 	for(int i = 0; i < arr.length - 1; i++) {
	// 		int min = i;
	// 		for(int j = i + 1; j < arr.length; j++) {
	// 			if(arr[min].compareTo(arr[j])) {
	// 				min = j;
	// 			}
	// 		}
	// 		Student temp = arr[i];
	// 		arr[i] = arr[min];
	// 		arr[min] = temp;
	// 	}
	// }
    
}
