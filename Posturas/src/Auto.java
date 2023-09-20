import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Auto {
    public static void main(String[] args) throws IOException {

        Path path = Paths.get("Arquivos/RL708.txt");
        try (BufferedReader br = new BufferedReader(new FileReader(path.toString()))) {
            String line = br.readLine();
            while (line != null) {
                line = br.readLine().replace(';', ' ');
                String[] chave = line.split("=");
                System.out.print(chave[0]);
                System.out.print(" - ");
                System.out.println(chave[1]);

            }    
        } catch (IOException e) {
                System.out.println("erro ao ler o arquivo 'RL708' " + e.getMessage());
        }
    }
}
