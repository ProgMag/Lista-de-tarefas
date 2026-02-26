import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static java.lang.System.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int opcao = 0;

        List<String> tarefas = new ArrayList<>();

        while (opcao != 5) {

            out.format("""
                    1 - Adicionar tarefa
                    2 - Listar tarefas
                    3 - Remover tarefa
                    4 - Limpar lista de tarefas
                    5 - sair
                    """);

            opcao = sc.nextInt();

            switch (opcao) {
                case 1 -> {
                    sc.nextLine(); // limpar o buffer
                    out.println("Adicione uma tarefa");
                    String novaTarefa = sc.nextLine();

                    tarefas.add(novaTarefa);
                    out.println("Tarefa adicionada com sucesso!");

                }
                case 2 -> {
                    out.println("--- Lista de tarefas ---");
                    if (tarefas.isEmpty()) {
                        out.println("Nenhuma tarefa foi adicionada!");
                    } else {
                        for (int i = 0; i < tarefas.size(); i++) {
                            out.println("Tarefa " + (i + 1) + ": " + tarefas.get(i));
                        }
                    }
                }
                case 3 -> {
                    out.println("Digite o numero da tarefa que deseja remover: ");

                    int indiceRemover = sc.nextInt() - 1;

                    if (indiceRemover >= 0 && indiceRemover < tarefas.size()) {
                        String tarefaRemover = tarefas.remove(indiceRemover);
                        out.println("A tarefa '" + tarefaRemover + "' removida com sucesso!");
                    } else {
                        out.println("Numero invalido!");
                    }
                }
                case 4 -> {
                        tarefas.clear();
                        out.println("Lista limpada com sucesso!");
                }
                case 5 ->  out.println("Encerrando o programa...");

                default -> out.println("Opção inválida");
            }
        }
        sc.close();
    }
}
