//Imprimindo a Resolução da tela.
import java.awt.*;

public class ResolucaoTela {
    public static void main(String[] args) {
    //Obtém o conjunto de Ferramentas Padrão
        Toolkit ferramentas = Toolkit.getDefaultToolkit();
    //Obtém a dimensão da Tela
        Dimension dimensao = ferramentas.getScreenSize();

    //Imprime na tela o valor pedido
        System.out.println("A resolução da tela é: " + dimensao.width + " x " + dimensao.height);
    }
}
