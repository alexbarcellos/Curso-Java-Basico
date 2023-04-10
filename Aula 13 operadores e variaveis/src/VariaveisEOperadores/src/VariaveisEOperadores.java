public class VariaveisEOperadores {
    public static void main(String[] args) {
       // operadores aritméticos e variaveis primitivas
        int a = 11;
        float b = 3f;
        double c = a/b;
        char carac = 120; // Hexa 120 > x
        boolean decide = true;


        System.out.println("a: " + a);
        System.out.println("b: " + b);
        System.out.println("c: " + c);
        System.out.println("carac: " + carac);
        System.out.println("decide: " + decide);
        System.out.println("Resto a%b: " + a%b);

        // incrementos / decrementos
        b++;
        System.out.println("b++: " + b);
        
        System.out.println("a--: " + a--); // não altera na impressão só depois dela.
        System.out.println("a: " + a); // agora o a veio com -1
        
        // operadores relacionais
        System.out.println("a == b   " + (a==b));
        System.out.println("a >= b   " + (a>=b));
        System.out.println("a <= b   " + (a<=b));
        System.out.println("a != b   " + (a!=b));

    }
}
