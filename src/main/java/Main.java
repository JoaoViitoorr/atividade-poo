public class Main {
    public static double media(int[] numeros) {
        int soma = 0;
        for (int num : numeros) {
            soma += num;
        }
        return (double) soma / numeros.length;
    }

    public static void main(String[] args) {
        System.out.println(media(new int[]{1, 2, 3, 4, 5})); // 3.0
    }
}