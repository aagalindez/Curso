package tema3;

public class sumavariables {
    public static void main(String[] args) {
        int resultado = 0;

        resultado = suma(15, 20, 10);

        System.out.println(resultado);
    }
    public static int suma(int a, int b, int c) {
        return  a + b + c;
    }
}
