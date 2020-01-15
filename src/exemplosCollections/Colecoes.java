package exemplosCollections;
import java.util.List;
import java.util.ArrayList;

public class Colecoes {
    public static void main(String[] args) {
        List<String> funcionarios = new ArrayList<>();
        funcionarios.add("Bruno");
        funcionarios.add("Jerfferson");
        funcionarios.remove("Bruno");
        System.out.println(funcionarios);
    }
}
