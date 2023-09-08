import java.text.DateFormat;
import java.text.NumberFormat;
import java.util.Date;
import java.util.Locale;

import javax.swing.text.NumberFormatter;

public class Local {
    public static void main(String[] args) {
        Locale locale = Locale.getDefault();
        System.out.println("\nLocal padrão " + locale);

        Locale[] locais = Locale.getAvailableLocales(); // todos os locais disponíveis na api/:
        /*
         * for (Locale locs : locais) {
         * System.out.println("Nome: " + locs.getDisplayName());
         * System.out.println("Pais: " + locs.getDisplayCountry());
         * System.out.println("Cod Lingua: " + locs.getLanguage());
         * System.out.println("Lingua: " + locs.getDisplayLanguage());
         * System.out.println("*******************");
         * }
         */
        Locale localUs = new Locale("en", "USA"); // forçar local em outro país
        Locale.setDefault(localUs); // seta o local atual para US
        System.out.println("Padrão atual: " + localUs.getDefault());
        System.out.println("Cod Lingua: " + localUs.getLanguage());
        System.out.println("Nome: " + localUs.getDisplayName());
        System.out.println("Pais: " + localUs.getDisplayCountry());
        System.out.println("Lingua: " + localUs.getDisplayLanguage());

        Locale.setDefault(locale); // seta o local atual para Br novamente

        NumberFormat nf = NumberFormat.getCurrencyInstance(); // Brasil por padrão
        System.out.println(nf.format(5000000d));

        NumberFormat nf2 = NumberFormat.getCurrencyInstance(Locale.UK); // Reino Unido
        System.out.println(nf2.format(5000000d));

        // Locale.setDefault(new Locale("en", "US")); // assumir padrão de um país
        // específico
        Date hoje = new Date();
        System.out.println("Padrão data: " + hoje);

        String hojeFormatado = DateFormat.getInstance().format(hoje);
        System.out.println("Data e hora Formatadas: " + hojeFormatado);

        hojeFormatado = DateFormat.getDateInstance().format(hoje);
        System.out.println("Data Formatada: " + hojeFormatado);

        String horaFormatada = DateFormat.getTimeInstance().format(hoje);
        System.out.println("Hora Formatada: " + horaFormatada);

        // Padrão mais FORMAL, para documentos
        hojeFormatado = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.SHORT).format(hoje); 
        System.out.println("Data e hora mais Formal: " + hojeFormatado);

    }
}