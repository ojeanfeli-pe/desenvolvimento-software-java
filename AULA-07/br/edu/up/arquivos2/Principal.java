import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Formatter;

public class Principal {

    public static void main(String[] args) throws IOException {

        Formatter formatter = new Formatter("C:\\Users\\jeanf\\OneDrive\\Documentos\\JAVA - QUARTA E QUINTA\\AULA-07\\Teste\\text.txt");

        for(int i = 0; i <= 10; i++){
            System.out.println("Gravando o número: " + i);
            System.out.println("Gravando o número: " + i + "\n");
        }
        formatter.close();



        File diretorio = new File("C:\\Users\\jeanf\\OneDrive\\Documentos\\JAVA - QUARTA E QUINTA\\AULA-07");
        File arquivo = new File(diretorio, "banco.txt");

        if(!diretorio.exists())
            diretorio.mkdir();

        if(!arquivo.exists())
            arquivo.createNewFile();

        FileWriter file =  new FileWriter(arquivo, true);
        PrintWriter writer = new PrintWriter(file);

        for(int i = 0; i <= 10; i++){
            System.out.println("Gravando o número: " + i);
            writer.println("Gravando o número: " + i);
        }

        writer.flush();
        writer.close();
        
    }
}
