import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static java.lang.System.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int continuar = 0;

        List<String> tarefas = new ArrayList<>();

        out.format("""
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
                    out.println("Adicione uma tarefa");
                    String novaTarefa = sc.nextLine();

                    tarefas.add(novaTarefa);
                    out.println("Tarefa adicionada com sucesso");

                }
                case 2 -> {
                    out.println("--- Lista de tarefas ---");
                    for (int i = 0; i < tarefas.size(); i++) {
                        out.println(i + " - " + tarefas.get(i));
                    }
                }
                case 3 -> {

                }
                case 4 -> {
                    out.println("Encerrando o programa");
                }
                default -> out.println("Opção inválida");
            }
        }
    }
}
