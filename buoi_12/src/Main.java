public class Main {

    public static void main(String[] args) {

        // Rectangle rec = new Rectangle();
        // rec.width = 6;
        // rec.height = 5;
        // System.out.println(rec.width);
        // System.out.println(rec.height);
        // System.out.println(rec.perimeter());
        // System.out.println(rec.area());
        // System.out.println(rec.getInfo());

        // Student stu = new Student();
        // System.out.println(stu.getInfo());

        Student s1 = new Student("1", "Tan Thanh", 29);
        Student s2 = s1.copy();

        s2.id = "100";
        System.out.println(s1.getInfo());
        System.out.println(s2.getInfo());

    }

}
