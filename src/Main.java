public class Main {
    public static void main(String[] args) {
        System.out.println("Atividade Java!");
        System.out.println(soma(5, 10)); // Deve imprimir 15
        System.out.println(ehPar(4)); // Deve imprimir true
        System.out.println(ehPar(7)); // Deve imprimir false
        
    }

    public static int soma(int a, int b) {
        return a + b;
    }
    public static boolean ehPar(int numero) {
        return numero % 2 == 0;
    }
}