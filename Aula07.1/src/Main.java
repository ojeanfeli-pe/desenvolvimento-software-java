import java.io.*;
import java.util.Date;

public class Main {

    public static void main(String[] args) throws IOException {
        String path = "C:\\Users\\jeanf\\IdeaProjects\\Aula07.1";
        File arquivo = new File(path, "dados.txt");
        FileReader reader = new FileReader(arquivo);
        BufferedReader buffered = new BufferedReader(reader);

        String linha = "";
        while ((linha = buffered.readLine()) != null){
            String[] dados = linha.split(";");
            long matricula = Long.parseLong(dados[0]);
            Date dataAniversario = new Date(dados[2]);
            System.out.println(matricula);
            System.out.println(dataAniversario);
        }



    }
}