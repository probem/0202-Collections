package exemplosCollections;

import java.util.*;

public class exercicioRetrospectiva {
    public static void main(String[] args) {
        List<String> funcionarios = new ArrayList<>();
        funcionarios.add("José");
        funcionarios.add("Josefa");
        funcionarios.add("Jerfferson");
        funcionarios.add("Jroger");

        int contador = 1;
        for(String funcionario : funcionarios){
            System.out.println(contador + " - " + funcionario);
            contador++;
        }

        Scanner in = new Scanner(System.in);
        System.out.print("Digite o nome do usuário que você deseja remover: ");
        String nomeFuncionario = in.nextLine();

        if(funcionarios.contains(nomeFuncionario)){
            funcionarios.remove(nomeFuncionario);
            System.out.println(funcionarios);
        }
        else{
            System.out.println("Não encontramos este funcionário");
        }
    }
}
