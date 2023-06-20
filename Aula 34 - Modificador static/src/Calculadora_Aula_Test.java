public class Calculadora_Aula_Test {
    public static void main(String[] args) {

        Calculadora_Aula calc1 = new Calculadora_Aula();

        int lista[] = {5,5,10};

        System.out.println(calc1.soma(88,12));
        System.out.println(Calculadora_Aula.soma(88,12));

        System.out.println(calc1.soma(1, 6, 3));
        System.out.println(Calculadora_Aula.soma(1, 6, 3));

        System.out.println(calc1.soma(5.5, 5.4, 4.3));
        System.out.println(Calculadora_Aula.soma(5.5, 5.4, 4.3));

        System.out.println(calc1.soma(lista));
        System.out.println(Calculadora_Aula.soma(lista));
        
    }
}
