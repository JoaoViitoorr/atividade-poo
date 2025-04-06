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

   public static int contarVogais(String str) {
        int count = 0;
        for (char c : str.toLowerCase().toCharArray()) {
            if ("aeiou".indexOf(c) != -1) {
                count++;
            }
        }
        return count;
    }
   public static boolean ePar(int num) {
        return num % 2 == 0;
    }
    public static void main(String[] args) {
        System.out.println(contarVogais("hello world")); 
      System.out.println(ePar(4));// 3
    }
}

}