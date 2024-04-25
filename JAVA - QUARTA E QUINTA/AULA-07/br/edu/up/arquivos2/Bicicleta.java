import java.io.FileNotFoundException;
import java.util.Formatter;

public class Bicicleta {
    public static void main(String[] args) throws FileNotFoundException{
        Formatter formatter = new Formatter("C:\\Users\\jeanf\\OneDrive\\Documentos\\JAVA - QUARTA E QUINTA\\AULA-07\\Teste\\text.txt");

        for(int i = 0; i <= 10; i++){
            System.out.println("Gravando o número: " + i);
            formatter.format("Gravando o número: " + i + "\n");
        }
        formatter.close();
    }
}
