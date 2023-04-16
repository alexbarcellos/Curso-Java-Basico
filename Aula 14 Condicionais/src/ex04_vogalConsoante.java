import java.util.Scanner;

public class ex04_vogalConsoante {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("\nDigite uma letra: ");
        String letra = scan.next();

         if (letra.equalsIgnoreCase("a") 
         || letra.equalsIgnoreCase("E") 
         || letra.equalsIgnoreCase("I") 
         || letra.equalsIgnoreCase("o") 
         || letra.equalsIgnoreCase("u")) {
            System.out.println("A letra " + letra + " é uma VOGAL");
        } else {
            System.out.println("A letra " + letra + " é uma CONSOANTE");
}       
        if (letra.length() > 1) { // aqui testamos se tem apenas 1 caracter
            System.out.println("A sequencia " + letra + " Não é apenas uma letra !");
        } else { 
            switch(letra) {
            case "a" :
            case "e" :
            case "i" :
            case "o" :
            case "u" :
            case "A" :
            case "E" :
            case "I" :
            case "O" :
            case "U" : System.out.println("A letra " + letra + " é uma VOGAL"); break;
            default:   System.out.println("A letra " + letra + " é uma CONSOANTE");
            }
        }
        scan.close();
    }
}