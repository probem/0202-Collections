package exemplosCollections;

import java.util.*;

public class exercicioCollections {
    public static void main(String[] args) {
        List<Integer> numeros = new ArrayList<>();
        Random rd = new Random();

        int contador = 1;
        while(contador <= 20){
            numeros.add(rd.nextInt(99));
            contador++;
            System.out.println(numeros);
        }


        Map<String, String> paises = new HashMap<>();
        paises.put("Brasil", "Brasilia");
        paises.put("Mali", "Bamako");
        paises.put("Alemanha", "Berlim");
        paises.put("Haiti", "Porto Principe");
        paises.put("Jamaica", "Kingstom");

        if(paises.containsKey("Brasil")){
            System.out.println("Olá Brasil!!!!!");
        }
        System.out.println(paises);

    }
}
