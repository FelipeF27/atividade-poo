public class Main {
    public static void main(String[] args) {
        System.out.println("Atividade Java!");
        System.out.println(soma(5, 10)); // Deve imprimir 15
        System.out.println(ehPar(4)); // Deve imprimir true
        System.out.println(ehPar(7)); // Deve imprimir false
        System.out.println(fatorial(5)); // Deve imprimir 120
        System.out.println(inverterString("Java")); // Deve imprimir "avaJ"
        int[] numeros = {10, 20, 30};
        System.out.println(calcularMedia(numeros));
        System.out.println(contarVogais("Java"));
        
    }

    public static int soma(int a, int b) {
        return a + b;
    }
    public static boolean ehPar(int numero) {
        return numero % 2 == 0;
    }
    public static int fatorial(int numero) {
        if (numero == 0 || numero == 1) {
            return 1;
        }
        int resultado = 1;
        for (int i = 2; i <= numero; i++) {
            resultado *= i;
        }
        return resultado;
        }
        public static String inverterString(String texto) {
            return new StringBuilder(texto).reverse().toString();
    }
    public static double calcularMedia(int[] numeros) {
        int soma = 0;
        for (int numero : numeros) {
            soma += numero;
        }
        return (double) soma / numeros.length;
}
public static int contarVogais(String texto) {
    int count = 0;
    String vogais = "aeiouAEIOU";
    for (char c : texto.toCharArray()) {
        if (vogais.indexOf(c) != -1) {
            count++;
        }
    }
    return count;
}
}
