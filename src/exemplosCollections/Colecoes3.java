package exemplosCollections;

import java.util.*;

public class Colecoes3 {
    public static void main(String[] args) {
        List<Integer> lista = new LinkedList<>();
        lista.add(2);//indice 0
        lista.add(33);// 1
        lista.add(22);//2

        //Atribui um novo valor
        lista.set(1, 88);
        //Ordenar
        Collections.sort(lista);

        //Imprimir índice 1
        System.out.println(lista.get(0));


        System.out.println("LISTA 1: ");
        System.out.println(lista);

        Set<Integer> lista2 = new HashSet<>();
        lista2.add(2);
        lista2.add(33);
        lista2.add(22);

        System.out.println("LISTA 2: ");
        System.out.println(lista2);

        Set<String> melhoresTimesFutebol = new HashSet<>();
        melhoresTimesFutebol.add("Liverpool");
        melhoresTimesFutebol.add("Juventus");
        melhoresTimesFutebol.add("Arsenal");
        melhoresTimesFutebol.add("XV de Piracicaba");

        System.out.println("Clubes: " + melhoresTimesFutebol);
        System.out.println(melhoresTimesFutebol);

        Map<String, String> mapaFuncionarios = new HashMap<>();
        mapaFuncionarios.put("Wagner", "Administração");
        mapaFuncionarios.put("Jerfferson", "Desenvolvimento");
        mapaFuncionarios.put("Allaye", "Tradução");
        System.out.println(mapaFuncionarios);

        for (Map.Entry<String, String> item : mapaFuncionarios.entrySet()) {
            System.out.println(item.getKey() + " - " + item.getValue());
        }
    }
}
