import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws MyException {

        String filePath = "E:\\WORKING\\FHD\\Repository\\Java_Fundamental_32\\buoi_24\\src\\data.dat";

		// ArrayList<Student> list = new ArrayList<>();
		// list.add(new Student("S01", "A", 29));
		// list.add(new Student("S02", "B", 23));
		// list.add(new Student("S03", "C", 21));

		// File file = new File("data.dat");
		// try (
		// 	FileOutputStream fos = new FileOutputStream(file);
		// 	ObjectOutputStream oos = new ObjectOutputStream(fos);
		// ) {
		// 	for (Student stu : list) {
		// 		oos.writeObject(stu);
		// 	}
		// } catch(IOException e) {
		// 	e.printStackTrace();
		// }

		ArrayList<Student> list = new ArrayList<>();

		File file = new File("data.dat");
		try (
			FileInputStream fis = new FileInputStream(file);
			ObjectInputStream ois = new ObjectInputStream(fis);
		) {
			while(true) {
				Object obj = ois.readObject();
				if (obj instanceof Student) {
					list.add((Student)obj);
				}
			}
		} catch (EOFException e) {
			// Done!
		} catch(IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		for (Student stu : list) {
			System.out.println(stu);
		}

    }

}
