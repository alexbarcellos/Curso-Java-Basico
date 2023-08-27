import java.util.Arrays;
import java.util.StringTokenizer;

public class App {
    public static void main(String[] args) throws Exception {
        String palavra = "alexsandro";
        char[] p = new char[10];

        palavra.getChars(0, 7, p, 0); // 'Alexsan'
        System.out.println(p);

        System.out.println(palavra.charAt(3)); // 'x'

        byte[] palavraBytes = new byte[10];
        palavra.getBytes(0, 10, palavraBytes, 0);
        System.out.println(Arrays.toString(palavraBytes));

        char[] palavraChars = new char[10];
        palavra.getChars(0, 10, palavraChars, 0);  // saída em chars 'A', 'l', 'e', 'x', ..., 'o'
        System.out.println(palavraChars);
            
        System.out.println(palavra.substring(4, 7));  // "san"
        System.out.println(palavra.substring(4));  // "sandro"

        System.out.println(palavra.replace('a', 'A')); // "AlexsAndro"
        System.out.println(palavra.replaceAll("a", "@" ));  // "@lexs@ndro"

        System.out.println("A L E X".replaceAll(" ", "" ));  // "ALEX"
        System.out.println("   tira espaços ".trim());

        System.out.println("Letras Maiúsculas".toLowerCase());
        System.out.println("Letras Maiúsculas".toUpperCase());
        System.out.println("Letras Maiúsculas".toLowerCase());

        String alfabeto = String.join("; ", "A","B","C","D","E");  // "A; B; C; D; E"
        System.out.println(alfabeto);
        String[] letras = alfabeto.split("; ");  // "ABCDE"
        for (String letra : letras) {
            System.out.println(letra);
        }

        String[] letrasAlfabeto = {"a","b","c","d","e"};
        //StringBuilder sb = new StringBuilder(); // StringBuffer é thread safe enquanto StringBuilder não é
        StringBuffer sb = new StringBuffer();  
        for (String letra : letrasAlfabeto) {
            sb.append(letra);
        }
        String alfabetoMinusculo = new String(sb);
        System.out.println(alfabetoMinusculo);
        System.out.println(sb.reverse());
       

        String arquivo = "alex;53;masculino";
        StringTokenizer st = new StringTokenizer(arquivo,";");
        while (st.hasMoreTokens()) {
            System.out.println(st.nextToken());
        }            
    }

        
}
