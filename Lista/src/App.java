import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class App {
    public static void main(String[] args) throws Exception {
        List<String> list = new ArrayList<>(); // Criar uma lista de strings vazia usando a implementação ArrayList
        list.add("Maria"); // Adicionar "Maria" à lista
        list.add("Alex"); // Adicionar "Alex" à lista
        list.add("Bob"); // Adicionar "Bob" à lista
        list.add("Anna"); // Adicionar "Anna" à lista
        list.add(2, "Marco"); // Inserir "Marco" na posição 2 da lista
        System.out.println(list.size()); // Mostrar o tamanho da lista
        for (String x : list) { // Iterar através da lista usando um loop for-each
            System.out.println(x); // Mostrar cada elemento da lista
        }
        System.out.println("---------------------");
        list.removeIf(x -> x.charAt(0) == 'M'); // Remover os elementos da lista que começam com 'M'
        for (String x : list) { // Iterar através da lista novamente após a remoção
            System.out.println(x); // Mostrar os elementos restantes da lista
        }
        System.out.println("---------------------");
        System.out.println("Index of Bob: " + list.indexOf("Bob")); // Mostrar o índice de "Bob" na lista
        System.out.println("Index of Marco: " + list.indexOf("Marco")); // Mostrar o índice de "Marco" na lista
        System.out.println("---------------------");
        List<String> result = list.stream().filter(x -> x.charAt(0) == 'A').collect(Collectors.toList()); // Filtrar os elementos da lista que começam com 'A' usando a API de Streams do Java 8
        for (String x : result) { // Iterar através da lista resultante
            System.out.println(x); // Mostrar os elementos filtrados
        }
        System.out.println("---------------------");
        String name = list.stream().filter(x -> x.charAt(0) == 'J').findFirst().orElse(null); // Encontrar o primeiro elemento da lista que começa com 'J' ou retornar null se não for encontrado, usando a API de Streams do Java 8
        System.out.println(name); // Mostrar o resultado da busca
    }
}
