import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Calendario {
    public static void main(String[] args) throws Exception {
        Date hoje = new Date();
        System.out.println(hoje);
        System.out.println("Milessegundos desde 1970: "  +  hoje.getTime());
        System.out.println(hoje.getDate());
        System.out.println(hoje.getYear());
        System.out.println();

        Calendar hj = Calendar.getInstance();  //  padrão "singleton"
        System.out.println(hj); // todas as informção instanciadas pelo prórpio java
        System.out.println();
        int dia = hj.get(Calendar.DAY_OF_MONTH);
        int mes = hj.get(Calendar.MONTH);
        int ano = hj.get(Calendar.YEAR);
        System.out.println(dia+"/"+mes+"/"+ano); // janeiro inicia como 0
        System.out.printf("%02d/%02d/%d %n", dia, mes+1, ano);

        hj.add(Calendar.DAY_OF_MONTH, -1); // diminui 1 dia (n dias)
        System.out.println(hj.get(Calendar.DAY_OF_MONTH));
        hj.add(Calendar.DAY_OF_MONTH, 1); // adiciona 1 dia
        System.out.println(hj.get(Calendar.DAY_OF_MONTH));

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MMMM/yyyy hh:mm:ss a z");
        System.out.println(sdf.format(hoje));

        Calendar data = new GregorianCalendar(1970, 3, 2, 14, 22);
        System.out.println(sdf.format(data.getTime()));

        SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");
        String dataTexto = "12/12/1979";

        try {
            Date aniv = sdf1.parse(dataTexto);
            System.out.println("Aniversario da Taty: " + sdf1.format(aniv));
        } catch (ParseException e) {
            System.out.println("Formato de data inválido, tente: \"dd/mm/aaaa\"");
            e.printStackTrace();
            
        }
            
    }
}
