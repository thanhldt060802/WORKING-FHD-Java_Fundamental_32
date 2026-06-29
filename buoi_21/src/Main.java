import java.util.Comparator;
import java.util.function.Consumer;
import java.util.function.Function;

public class Main {

    public static void main(String[] args) throws Exception {

        // DataStorage storage;
        // int storageType = ManagementSystem.BINARY_TYPE;

        // switch (storageType) {
        //     case ManagementSystem.EXCEL_TYPE: {
        //         storage = new ExcelStorage();
        //         break;
        //     }
        //     case ManagementSystem.BINARY_TYPE: {
        //         storage = new BinaryStorage(); // Object -> DataStorage -> BinaryStorage
        //         break;
        //     }
        //     default: {
        //         throw new RuntimeException("Type storage is not supported!");
        //     }
        // }

        // ManagementSystem ms = new ManagementSystem();
        // ms.setStorage(storage);
        // ms.add();

        // Shape2D shape2d = new Cone("Simple cone 1", 4, 5);  // Polymorphic object (Object -> Shape2D -> Shape3D -> Cone)
		// System.out.println(shape2d);
		// System.out.println(shape2d.calculatePerimeter());
		// System.out.println(shape2d.calculateArea());
		// System.out.println(((Shape3D)shape2d).calculateVolume());
		
		System.out.println();
		
		// Shape3D shape3d = new Cone("Simple cone 2", 4, 5);  // Polymorphic object
		// System.out.println(shape3d);
		// System.out.println(shape3d.calculatePerimeter());
		// System.out.println(shape3d.calculateArea());
		// System.out.println(shape3d.calculateVolume());
		
		System.out.println();
		
		// Cone cone = new Cone("Simple cone 3", 5, 3);  // Original object
		// System.out.println(cone);
		// System.out.println(cone.calculatePerimeter());
		// System.out.println(cone.calculateArea());
		// System.out.println(cone.calculateVolume());

    }

}
