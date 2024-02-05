public class Main {
    public static void main(String[] args) {
        String str = "hello, world! 12345?";
        String[] parts = str.split(", "); // Разделение строки по запятой и пробелу

        for (String part : parts) {
            System.out.println(part);
        }
    }
}