package src;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GerenciadorTarefas {


    public static void main(String[] args) {
        GerenciadorTarefas gerenciadorTarefas = new GerenciadorTarefas();
        System.out.println("Bem-vindo ao sistema de gerenciamento de tarefas LEGADO!");
        ArrayList<Tarefa> tarefas = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int entrada;
        boolean loop = true;
        
        while (loop) {
            System.out.println("\n--- Menu Principal ---");
            System.out.println("1. Listar Tarefas");
            System.out.println("5. Excluir Tarefas");
            System.out.println("6. Sair");
            System.out.print("Escolha uma opção: ");
            entrada = scanner.nextInt();

            switch (entrada){
                case 5:
                    gerenciadorTarefas.excluirTarefas(tarefas);
                    break;
                case 6:
                    loop = false;
                    break;
                default:
                    System.out.println("Opção Invalida");
                    break;
            }
        }
    }

    public void excluirTarefas(List<Tarefa> tarefas) {
        Scanner sc = new Scanner(System.in);
        listarTarefas(tarefas);
        boolean verificar = false;
        System.out.println("Escolha uma tarefa para remover:\n");
        while (!verificar){
            int remover;
            remover = sc.nextInt();
            if (remover > tarefas.size()){
                System.out.println("Não há uma tarefa "+ remover);
            } else {
                tarefas.remove(remover);
                System.out.println("Tarefa "+ remover + " removida com sucesso!\n");
                verificar = true;
            }
        }

    }

    public void listarTarefas(List<Tarefa> tarefas){
        for(Tarefa tarefa : tarefas){
            System.out.println(tarefa.getId() + " - "+ tarefa.getTarefa());
        }
    }

}