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
            System.out.println("2. Listar Tarefas;");
            System.out.println("3. Detalhar Tarefas;");
            System.out.println("5. Sair.");
            System.out.print("Escolha uma opção: ");
            entrada = scanner.nextInt();

            switch (entrada){
                case 2:
                    gerenciadorTarefas.listarTarefas(tarefas);
                    break;
                case 3:
                    gerenciadorTarefas.detalharTarefa(tarefas);
                    break;
                case 5:
                    System.out.println("Fechando Sistema...");
                    loop = false;
                    break;
                default:
                    System.out.println("Opção Inválida!");
                    break;
            }
        }
    }

    public void detalharTarefa(List<Tarefa> tarefas){
        System.out.println("\n---------------   Detalhando Tarefas   ---------------\n");
        for(Tarefa tarefa : tarefas){
            System.out.println(tarefa.getId() + " - "+ tarefa.getTarefa() + " / "+ tarefa.getDatalhes() + " / "+ tarefa.getStatus());
        }
    }

    public void listarTarefas(List<Tarefa> tarefas){
        System.out.println("\n---------------   Listando Tarefas   ---------------\n");
        for(Tarefa tarefa : tarefas){
            System.out.println(tarefa.getId() +" - "+ tarefa.getTarefa());
        }
    }
}