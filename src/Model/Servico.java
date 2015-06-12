
package Model;

import java.util.Date;

public class Servico {
    
    int ID_Servico, ID_Cliente, ID_Funcionario;
    float Valor_Servico;
    Date data_Servico;
    String Hora;
    String Nome_Servico, Descricao_Servico;

    public Servico(int ID_Servico, int ID_Cliente, int ID_Funcionario, float Valor_Servico, Date data_Servico, String Hora, String Nome_Servico, String Descricao_Servico) {
        this.ID_Servico = ID_Servico;
        this.ID_Cliente = ID_Cliente;
        this.ID_Funcionario = ID_Funcionario;
        this.Valor_Servico = Valor_Servico;
        this.data_Servico = data_Servico;
        this.Hora = Hora;
        this.Nome_Servico = Nome_Servico;
        this.Descricao_Servico = Descricao_Servico;
    }

    public Servico(float Valor_Servico, Date data_Servico, String Hora, String Nome_Servico, String Descricao_Servico) {
        this.Valor_Servico = Valor_Servico;
        this.data_Servico = data_Servico;
        this.Hora = Hora;
        this.Nome_Servico = Nome_Servico;
        this.Descricao_Servico = Descricao_Servico;
    }

    public int getID_Servico() {
        return ID_Servico;
    }

    public void setID_Servico(int ID_Servico) {
        this.ID_Servico = ID_Servico;
    }

    public int getID_Cliente() {
        return ID_Cliente;
    }

    public void setID_Cliente(int ID_Cliente) {
        this.ID_Cliente = ID_Cliente;
    }

    public int getID_Funcionario() {
        return ID_Funcionario;
    }

    public void setID_Funcionario(int ID_Funcionario) {
        this.ID_Funcionario = ID_Funcionario;
    }

    public float getValor_Servico() {
        return Valor_Servico;
    }

    public void setValor_Servico(float Valor_Servico) {
        this.Valor_Servico = Valor_Servico;
    }

    public Date getData_Servico() {
        return data_Servico;
    }

    public void setData_Servico(Date data_Servico) {
        this.data_Servico = data_Servico;
    }

    public String getHora() {
        return Hora;
    }

    public void setHora(String Hora) {
        this.Hora = Hora;
    }

    public String getNome_Servico() {
        return Nome_Servico;
    }

    public void setNome_Servico(String Nome_Servico) {
        this.Nome_Servico = Nome_Servico;
    }

    public String getDescricao_Servico() {
        return Descricao_Servico;
    }

    public void setDescricao_Servico(String Descricao_Servico) {
        this.Descricao_Servico = Descricao_Servico;
    }
    
    
}
