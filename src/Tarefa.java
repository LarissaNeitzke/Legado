package src;

public class Tarefa {
    int id;
    String tarefa;
    String datalhes;
    boolean status;

    public Tarefa(int id, String tarefa, String datalhes) {
        this.id = id;
        this.tarefa = tarefa;
        this.datalhes = datalhes;
        status = false;
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

    public String getDatalhes() {
        return datalhes;
    }

    public void setDatalhes(String datalhes) {
        this.datalhes = datalhes;
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
