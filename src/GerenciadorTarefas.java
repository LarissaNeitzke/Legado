package src;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GerenciadorTarefas {


    public static void main(String[] args) {
        GerenciadorTarefas gerenciador = new GerenciadorTarefas();
        ArrayList<Tarefa> tarefas = new ArrayList<>();
        System.out.println("Bem-vindo ao sistema de gerenciamento de tarefas LEGADO!");
        System.out.println("Este código não usa classes e métodos para simular um projeto antigo.");
        Scanner scanner = new Scanner(System.in);
        int entrada;
        boolean loop = true;

        while (loop) {
            System.out.println("\n--- Menu Principal ---");
            System.out.println("1. Cadastrar Tarefas");
            System.out.println("2. Listar Tarefas");
            System.out.println("3. Detalhar Tarefa");
            System.out.println("4. Excluir Tarefa");
            System.out.println("5. Sair");
            System.out.print("Escolha uma opção: ");
            entrada = scanner.nextInt();

            switch (entrada) {
                case 1:
                    gerenciador.cadastrarTarefa(tarefas); // Metodo para adicionar tarefas a lista de tarefas
                    break;
                case 2:
                    gerenciador.listarTarefas(tarefas)// Listar Tarefas
                    break;
                case 3:
                    // Detalhar Tarefa
                    break;
                case 4:
                    gerenciador.excluirTarefas(tarefas)// Excluir Tarefa
                    break;
                case 5:
                    return; // Sair do sistema
                default:
                    System.out.println("Por favor escolha uma opção válida."); // Mensagem padrão em caso de escolha invalida
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

    public void cadastrarTarefa(List<Tarefa> tarefas) {

        Tarefa tarefa = new Tarefa();
        Scanner sc = new Scanner(System.in);
        boolean loopCadastro = true;

        while (loopCadastro) {
            System.out.println("--- Cadastrar Tarefa ---");
            System.out.print("Tarefa: ");
            tarefa.setTarefa(sc.nextLine());
            System.out.println("Descrição: ");
            tarefa.setDetalhes(sc.nextLine());

            if (tarefa.getTarefa().isEmpty()) {
                System.out.println("\nFormato de tarefa inválido! Voltando ao Menu Inicial...");
            }
            tarefas.add(tarefa);
            loopCadastro = false;
        }
    }

    public void listarTarefas(List<Tarefa> tarefas){
        for(Tarefa tarefa : tarefas){
            System.out.println(tarefa.getId() + " - "+ tarefa.getTarefa());
        }
    }
}