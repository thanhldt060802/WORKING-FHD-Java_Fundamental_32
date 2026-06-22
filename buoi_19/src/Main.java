public class Main {

    public static void main(String[] args) {

        sum(5);

    }

    public static int sum(int n) {
        if (n <= 0) {
            return 0;
        } else {
            return n + sum(n - 1);
        }
    }

}
