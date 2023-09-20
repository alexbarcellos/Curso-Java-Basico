import java.util.Arrays;
import java.util.StringTokenizer;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex_Paterns {
    public static void main(String[] args) throws Exception {

        // REGEX

        String palavra = "alexsandro";
        char[] p = new char[palavra.length()];

        palavra.getChars(0, 7, p, 0); // 'Alexsan'
        System.out.println(p);

        System.out.println(palavra.charAt(3)); // 'x'

        byte[] palavraBytes = new byte[10];
        palavra.getBytes(0, 10, palavraBytes, 0);
        System.out.println(Arrays.toString(palavraBytes)); // [97, 108, 101, 120, 115, 97, 110, 100, 114, 111]

        char[] palavraChars = new char[10];
        palavra.getChars(0, 10, palavraChars, 0);  // saída em chars 'a', 'l', 'e', 'x', ..., 'o'
        System.out.println(palavraChars);
            
        System.out.println(palavra.substring(4, 7));  // "san"
        System.out.println(palavra.substring(4));  // "sandro"

        System.out.println(palavra.replace('a', 'A')); // "AlexsAndro"
        System.out.println(palavra.replaceAll("a", "@" ));  // "@lexs@ndro"

        System.out.println("A L E X".replaceAll(" ", "" ));  // "ALEX"
        System.out.println("   tira espaços ".trim());

        System.out.println("Letras Minúsculas".toLowerCase());  // 'letras maiúsculas'
        System.out.println("Letras Maiúsculas".toUpperCase());  // 'LETRAS MAIÚSCULAS'
        System.out.println("Cadeia de array".toCharArray());    // 'Cadeia de array'

        String alfabeto = String.join("~ ", "A","B","C","D","E");  
        System.out.println(alfabeto); // "A~ B~ C~ D~ E" 

        String[] letras = alfabeto.split("~ ");  
        for (String letra : letras) {
            System.out.print(letra); // // "ABCDE" tirou '~ '
        }
        System.out.println();
        String[] letrasAlfabeto = {"a","b","c","d","e"};
        //StringBuilder sb = new StringBuilder(); // StringBuffer é thread safe enquanto StringBuilder não é
        StringBuffer sb = new StringBuffer();  
        for (String letra : letrasAlfabeto) {
            sb.append(letra);
        }

        String alfabetoMinusculo = new String(sb);
        System.out.println(alfabetoMinusculo);
        System.out.println(sb.reverse());
       
        System.out.println();
        String arquivo = "alex;53;masculino";
        StringTokenizer st = new StringTokenizer(arquivo,";");
        while (st.hasMoreTokens()) {
            System.out.println(st.nextToken());
        }            

        // PADRÕES Regex

        Pattern pattern = Pattern.compile("^[CPF]{3}:? [0-9]{3}[.][0-9]{3}[.][0-9]{3}-[0-9]{2}$"); // ':?' opcional
        Matcher matcher = pattern.matcher("CPF 131.133.301-27"); // CPF
        System.out.println(matcher.find());

        pattern = Pattern.compile("^[M,m,F,f]{1}$"); // Sexo
        matcher = pattern.matcher("f");
        System.out.println(matcher.find());

        // PATTERNS - CONVERSÕES
        System.out.println(converter("002.7"));
        System.out.println(converter(1));
        System.out.println(converter(null)); // retorna -1.2345, se for objeto 'null'
        System.out.println(converter("4")); // retorna 4.0 se obj for String
        System.out.println(converter(5.333f)); // vai retornar 0, pois não tem um case para esse float.
        //System.out.println(converter("x")); // erro, pois epera um número
    }

    // função que converte um objeto qualquer em um Double [PATTERNS - CONVERSÕES]
    private static Double converter(Object obj){ 
        return switch(obj) {
             //case Integer i && i > 10 -> i.doubleValue(); //converte para Double somente se i for maior que 10
             case Integer i -> 5.666d; //converte Integer para Double 1 para 1.0d
             case null -> -1.2345d;
             case String s -> Double.parseDouble(s); // converte String para Double "4" para 4.0
             default -> 0d; // devolve 0 para casos não especificados
        };
    }

}
