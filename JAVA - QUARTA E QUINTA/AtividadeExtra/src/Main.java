import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        // Criando uma LinkedList
        LinkedList<String> linkedList = new LinkedList<>();

        // Adicionando elementos
        linkedList.add("Maçã");
        linkedList.add("Laranja");
        linkedList.add("Banana");
        linkedList.add("Laranja");
        linkedList.add("Banana");

        // Acessando elementos
        System.out.println("Primeiro elemento: " + linkedList.getFirst());
        System.out.println("Último elemento: " + linkedList.getLast());

        // Removendo o primeiro e o último elemento
        linkedList.remove("Laranja");
        linkedList.remove(3);
        linkedList.removeLast();

        // Iterando sobre os elementos
        for (String fruit : linkedList) {
            System.out.println(fruit);
        }
    }
}
