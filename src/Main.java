import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static java.lang.System.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int continuar = 0;

        List<String> tarefas = new ArrayList<>();

        System.out.format("""
                    1 - Adicionar tarefa
                    2 - Listar tarefas
                    3 - Remover tarefa
                    4 - sair
                    """);

        while (continuar != 4) {

            int opcao = sc.nextInt();
            switch (opcao) {
                case 1 -> {
                    sc.nextLine(); // limpar o buffer
                    System.out.println("Adicione uma tarefa");
                    String novaTarefa = sc.nextLine();

                    tarefas.add(novaTarefa);
                    System.out.println("Tarefa adicionada com sucesso");

                }
                case 2 -> {
                    for (String bloco : tarefas) {
                        System.out.println(bloco);
                    }
                }
                case 3 -> {

                }
                case 4 -> {
                    System.out.println("Encerrando o programa");
                }
                default -> System.out.println("Opção inválida");
            }
        }
    }
}
