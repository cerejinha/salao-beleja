
package Model;



public class Servico {
    
    int ID_Servico;
    float Valor_Servico;
    String Nome_Servico, Descricao_Servico;
    
    
    //consultar
    public Servico(int ID_Servico, float Valor_Servico, String Nome_Servico, String Descricao_Servico) {
        this.ID_Servico = ID_Servico;
        this.Valor_Servico = Valor_Servico;
        this.Nome_Servico = Nome_Servico;
        this.Descricao_Servico = Descricao_Servico;
    }

    //cadastrar

    public Servico(float Valor_Servico, String Nome_Servico, String Descricao_Servico) {
        this.Valor_Servico = Valor_Servico;
        this.Nome_Servico = Nome_Servico;
        this.Descricao_Servico = Descricao_Servico;
    }

    public int getID_Servico() {
        return ID_Servico;
    }

    public void setID_Servico(int ID_Servico) {
        this.ID_Servico = ID_Servico;
    }

    public float getValor_Servico() {
        return Valor_Servico;
    }

    public void setValor_Servico(float Valor_Servico) {
        this.Valor_Servico = Valor_Servico;
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
