package src;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GerenciadorTarefas {

    public static void main(String[] args) {
        GerenciadorTarefas gerenciadorTarefas = new GerenciadorTarefas();
        ArrayList<Tarefa> tarefas = new ArrayList<>();
        System.out.println("Bem-vindo ao sistema de gerenciamento de tarefas LEGADO!");
        System.out.println("Este código não usa classes e métodos para simular um projeto antigo.");
        Scanner scanner = new Scanner(System.in);
        boolean loop = true;
        int entrada;
        
        while (loop) {
            System.out.println("\n--- Menu Principal ---");
            System.out.println("4. Detalhar Tarefas;");
            System.out.println("6. Sair.");
            System.out.print("Escolha uma opção: ");
            entrada = scanner.nextInt();

            switch (entrada){
                case 4:
                    gerenciadorTarefas.detalharTarefa(tarefas);
                    break;
                case 6:
                    loop = false;
                    break;
                default:
                    System.out.println("Opção Inválida!");
                    break;
            }

//            if (entrada.equals("1")) {
//                System.out.println("\n--- Lista de Tarefas ---");
//                if (tarefas.isEmpty()) {
//                    System.out.println("Nenhuma tarefa cadastrada.");
//                } else {
//                    for (int i = 0; i < tarefas.size(); i++) {
//                        System.out.println((i + 1) + ". " + tarefas.get(i));
//                    }
//                }
//            } else if (entrada.equals("2")) {
//                System.out.println("Saindo do programa. Até mais!");
//                break;
//            } else {
//                System.out.println("Opção inválida. Tente novamente.");
//            }
        }
    }

    public void detalharTarefa(List<Tarefa> tarefas){
        tarefas.add(new Tarefa(1, "Teste", "Testando aqui"));
        for(Tarefa tarefa : tarefas){
            System.out.println(tarefa.getDatalhes());
        }
    }


}