package exemplosCollections;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Colecoes2 {
    public static void main(String[] args) {
        //instaciar a lista
        List<Integer> numeroTelesena = new ArrayList<>();
        //instanciar a classe Random para números aleatórios
        Random aleatorio = new Random();

        // adicionar 5 números aleatórios na lista
        for(int contador = 1; contador<=5; contador++){
            numeroTelesena.add(aleatorio.nextInt(99));
        }

        //imprimir números
        System.out.println("Números Telesena: " + numeroTelesena);
    }
}
