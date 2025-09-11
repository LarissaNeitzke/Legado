package src;

public class Tarefa {
    int id;
    String tarefa;
    String detalhes;
    boolean status;

    public Tarefa(int id, String tarefa, String datalhes) {
        this.id = id;
        this.tarefa = tarefa;
        this.detalhes = datalhes;
        status = false;
    }

    public Tarefa() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTarefa() {
        return tarefa;
    }

    public void setTarefa(String tarefa) {
        this.tarefa = tarefa;
    }

    public String getDetalhes() {
        return detalhes;
    }

    public void setDetalhes(String detalhes) {
        this.detalhes = detalhes;
    }

    public String getStatus() {
        if (this.status){
            return "Concluída";
        }
        return "Não Concluída";
    }

    public void setStatus(boolean status){
        this.status = status;
    }
}
