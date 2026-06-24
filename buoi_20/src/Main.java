public class Main {

    public static void main(String[] args) {

        // Shape2D shape2d = new Shape2D();
        // System.out.println(shape2d.calculateArea());
        // System.out.println(shape2d.calculatePerimeter());

        // Shape2D shape2d;

        // shape2d = new Rectangle(4, 5);
        // System.out.println(shape2d.calculateArea());
        // System.out.println(shape2d.calculatePerimeter());

        // shape2d = new Triangle(3, 4, 5);
        // System.out.println(shape2d.calculateArea());
        // System.out.println(shape2d.calculatePerimeter());

        FileHandler fileHandler = new CSVFileHandler();

        ManagementSystem ms = new ManagementSystem(fileHandler);
        ms.loadData();
        ms.saveData();

    }

}
