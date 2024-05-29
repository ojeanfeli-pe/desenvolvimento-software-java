//Imprimindo a hora do Sistema.

import java.util.Date;

public class HoraDoSistema {
    public static void main(String[] args) {
        Date relogio = new Date();
        System.out.println("A hora do Sistema é de:");
        System.out.println(relogio.toString());
    }
}
