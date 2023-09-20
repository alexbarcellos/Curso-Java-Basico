import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class FuncaoLambda_Streams {
    public static void main(String[] args) {

        List<Integer> minhaLista =  Arrays.asList(1,4,0,8,5,2,2,3,4,5,4,7,6,7,8,9); // 16 itens
        minhaLista.stream()
        .filter(e -> e%2 == 0) // SOMENTE OS PARES
        .limit(8) // LIMITA ATÉ 8 A QTDE DE NÚMEROS
        .skip(6) // pula os 6 num. da seq. de números
        .forEach(e ->  System.out.println(e));

        System.out.println();

        List<Integer> outraLista =  Arrays.asList(1,2,3,4,5,6,7,8,9,10); // 10 itens
        Long contador = outraLista.stream()
        .map(n -> n*10)
        .filter(n -> n > 60)
        .count();
        System.out.println(contador); // so mostra a qtd de num que multipl. por 10 são > 60

        System.out.println();

        Optional<Integer> minimo =  outraLista.stream() 
        .min(Comparator.naturalOrder());
        System.out.println(minimo.get());
        Optional<Integer> maximo =  outraLista.stream()
        .max(Comparator.naturalOrder());
        System.out.println(maximo.get());
        System.out.println();

        //toList
        List<Integer> novaLista = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        List<Integer> listPares = novaLista.stream()
        .filter(num -> num % 2 == 0)
        .collect(Collectors.toList());
        System.out.println(novaLista + "\t\t" + listPares);
        System.out.println();

        //groupingBy
        List<Integer> l = Arrays.asList(9,8,7,6,5,4,3,2,1,0);
        Map<Boolean, List<Integer>> mapa = l.stream() // agrupar por true e false uma lista de inteiros
        .map(num -> num * 3)
        .collect(Collectors.groupingBy(num -> num % 2 == 0));
        System.out.println(mapa);
        System.out.println();

        //groupingBy
        List<Integer> lst = Arrays.asList(0,1,2,3,4,5,6,7,8,9);
        Map<Integer, List<Integer>> mapa2 = lst.stream() // agrupar por inteiros uma lista de inteiros
        .collect(Collectors.groupingBy(n -> n % 2)); // resto '0' pares | resto '1' impares
        System.out.println(mapa2);
        System.out.println();

        //joining - trabalhar só com Strings
        List<Integer> ls = Arrays.asList(0,1,2,3,4,5,6,7,8,9);
        String coletar = ls.stream() 
        .map(e -> String.valueOf(e))
        .collect(Collectors.joining(";")); // pode agrupar com ou sem limitador
        System.out.println(coletar);
        System.out.println();

        // stream - loops IMPLICITOS | while, do...while, for - loops EXPLICITOS


    }
}
// https://rinaldo.dev/java-8-streams-pare-de-usar-for-e-simplifique-seu-codigo 