
package Model;


public class Agenda {
    
    int id_agenda,id_cliente,id_funcionario;
    String nome_servico,data_marcada,hora_marcada;
    float valor_servico;

    
    //consultar
    public Agenda(int id_agenda, int id_cliente, int id_funcionario, String nome_servico, String data_marcada, String hora_marcada, float valor_servico) {
        this.id_agenda = id_agenda;
        this.id_cliente = id_cliente;
        this.id_funcionario = id_funcionario;
        this.nome_servico = nome_servico;
        this.data_marcada = data_marcada;
        this.hora_marcada = hora_marcada;
        this.valor_servico = valor_servico;
    }

    public Agenda(int id_cliente, int id_funcionario, String nome_servico, String data_marcada, String hora_marcada, float valor_servico) {
        this.id_cliente = id_cliente;
        this.id_funcionario = id_funcionario;
        this.nome_servico = nome_servico;
        this.data_marcada = data_marcada;
        this.hora_marcada = hora_marcada;
        this.valor_servico = valor_servico;
    }

    public int getId_agenda() {
        return id_agenda;
    }

    public void setId_agenda(int id_agenda) {
        this.id_agenda = id_agenda;
    }

    public int getId_cliente() {
        return id_cliente;
    }

    public void setId_cliente(int id_cliente) {
        this.id_cliente = id_cliente;
    }

    public int getId_funcionario() {
        return id_funcionario;
    }

    public void setId_funcionario(int id_funcionario) {
        this.id_funcionario = id_funcionario;
    }

    public String getNome_servico() {
        return nome_servico;
    }

    public void setNome_servico(String nome_servico) {
        this.nome_servico = nome_servico;
    }

    public String getData_marcada() {
        return data_marcada;
    }

    public void setData_marcada(String data_marcada) {
        this.data_marcada = data_marcada;
    }

    public String getHora_marcada() {
        return hora_marcada;
    }

    public void setHora_marcada(String hora_marcada) {
        this.hora_marcada = hora_marcada;
    }

    public float getValor_servico() {
        return valor_servico;
    }

    public void setValor_servico(float valor_servico) {
        this.valor_servico = valor_servico;
    }
    
    
    
}
