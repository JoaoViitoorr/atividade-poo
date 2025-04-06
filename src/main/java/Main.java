public class Main {
    public static String inverterString(String str) {
        return new StringBuilder(str).reverse().toString();
    }

    public static void main(String[] args) {
        System.out.println(inverterString("hello")); // "olleh"
    }
}
