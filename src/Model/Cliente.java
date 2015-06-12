
package Model;


public class Cliente {
   int id_cliente, Telefone_Cliente, RG_Cliente, CPF_cliente;
   String Nome_Cliente,Endereco_Cliente,Email_Cliente;

   
   // Consultar
    public Cliente(int id_cliente, int Telefone_Cliente, int RG_Cliente, int CPF_cliente, String Nome_Cliente, String Endereco_Cliente, String Email_Cliente) {
        this.id_cliente = id_cliente;
        this.Telefone_Cliente = Telefone_Cliente;
        this.RG_Cliente = RG_Cliente;
        this.CPF_cliente = CPF_cliente;
        this.Nome_Cliente = Nome_Cliente;
        this.Endereco_Cliente = Endereco_Cliente;
        this.Email_Cliente = Email_Cliente;
    }
   
    // Cadastrar
    public Cliente(int Telefone_Cliente, int RG_Cliente, int CPF_cliente, String Nome_Cliente, String Endereco_Cliente, String Email_Cliente) {
        this.Telefone_Cliente = Telefone_Cliente;
        this.RG_Cliente = RG_Cliente;
        this.CPF_cliente = CPF_cliente;
        this.Nome_Cliente = Nome_Cliente;
        this.Endereco_Cliente = Endereco_Cliente;
        this.Email_Cliente = Email_Cliente;
    }

    public int getId_cliente() {
        return id_cliente;
    }

    public void setId_cliente(int id_cliente) {
        this.id_cliente = id_cliente;
    }

    public int getTelefone_Cliente() {
        return Telefone_Cliente;
    }

    public void setTelefone_Cliente(int Telefone_Cliente) {
        this.Telefone_Cliente = Telefone_Cliente;
    }

    public int getRG_Cliente() {
        return RG_Cliente;
    }

    public void setRG_Cliente(int RG_Cliente) {
        this.RG_Cliente = RG_Cliente;
    }

    public int getCPF_cliente() {
        return CPF_cliente;
    }

    public void setCPF_cliente(int CPF_cliente) {
        this.CPF_cliente = CPF_cliente;
    }

    public String getNome_Cliente() {
        return Nome_Cliente;
    }

    public void setNome_Cliente(String Nome_Cliente) {
        this.Nome_Cliente = Nome_Cliente;
    }

    public String getEndereco_Cliente() {
        return Endereco_Cliente;
    }

    public void setEndereco_Cliente(String Endereco_Cliente) {
        this.Endereco_Cliente = Endereco_Cliente;
    }

    public String getEmail_Cliente() {
        return Email_Cliente;
    }

    public void setEmail_Cliente(String Email_Cliente) {
        this.Email_Cliente = Email_Cliente;
    }
   
   
    
}
