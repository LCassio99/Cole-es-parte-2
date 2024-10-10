import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SeparaPorGenero {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> masculino = new ArrayList<>();
        List<String> feminino = new ArrayList<>();

        System.out.println("Digite os nomes e sexos no formato 'nome-sexo' (ex: Ana-F ou João-M). Digite 'sair' para finalizar:");

        while (true) {
            System.out.print("Entrada: ");
            String input = scanner.nextLine();

            if (input.equalsIgnoreCase("sair")) {
                break;
            }

            String[] pessoa = input.split("-");
            if (pessoa.length == 2) {
                String nome = pessoa[0];
                String sexo = pessoa[1].toUpperCase();

                if (sexo.equals("M")) {
                    masculino.add(nome);
                } else if (sexo.equals("F")) {
                    feminino.add(nome);
                } else {
                    System.out.println("Sexo inválido. Use 'M' para masculino ou 'F' para feminino.");
                }
            } else {
                System.out.println("Formato inválido. Use 'nome-sexo'.");
            }
        }

        // Exibir os grupos
        System.out.println("\nPessoas do grupo Masculino: " + masculino);
        System.out.println("Pessoas do grupo Feminino: " + feminino);
    }
}
