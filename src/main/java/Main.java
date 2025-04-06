public class Main {
    public static int contarVogais(String str) {
        int count = 0;
        for (char c : str.toLowerCase().toCharArray()) {
            if ("aeiou".indexOf(c) != -1) {
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        System.out.println(contarVogais("hello world")); // 3
    }
}