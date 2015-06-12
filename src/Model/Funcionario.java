
package Model;


 
public class Funcionario {
    
    int id_funcionario,RG_Funcionario, CPF_Funcionario,Login_Funcionario, Senha_Funcionario, Tipo_Acesso;
            
    String Nome_Funcionario, Endereco_Funcionario, Telefone_Funcionario, Email_Funcionario,CTPS;

  
    // consultar
    public Funcionario(int id_funcionario, int RG_Funcionario, int CPF_Funcionario, int Login_Funcionario, int Senha_Funcionario, int Tipo_Acesso, String Nome_Funcionario, String Endereco_Funcionario, String Telefone_Funcionario, String Email_Funcionario, String CTPS) {
        this.id_funcionario = id_funcionario;
        this.RG_Funcionario = RG_Funcionario;
        this.CPF_Funcionario = CPF_Funcionario;
        this.Login_Funcionario = Login_Funcionario;
        this.Senha_Funcionario = Senha_Funcionario;
        this.Tipo_Acesso = Tipo_Acesso;
        this.Nome_Funcionario = Nome_Funcionario;
        this.Endereco_Funcionario = Endereco_Funcionario;
        this.Telefone_Funcionario = Telefone_Funcionario;
        this.Email_Funcionario = Email_Funcionario;
        this.CTPS = CTPS;
    }

    // Cadastrar
    public Funcionario(int RG_Funcionario, int CPF_Funcionario, int Login_Funcionario, int Senha_Funcionario, int Tipo_Acesso, String Nome_Funcionario, String Endereco_Funcionario, String Telefone_Funcionario, String Email_Funcionario, String CTPS) {
        this.RG_Funcionario = RG_Funcionario;
        this.CPF_Funcionario = CPF_Funcionario;
        this.Login_Funcionario = Login_Funcionario;
        this.Senha_Funcionario = Senha_Funcionario;
        this.Tipo_Acesso = Tipo_Acesso;
        this.Nome_Funcionario = Nome_Funcionario;
        this.Endereco_Funcionario = Endereco_Funcionario;
        this.Telefone_Funcionario = Telefone_Funcionario;
        this.Email_Funcionario = Email_Funcionario;
        this.CTPS = CTPS;
    }

    public int getId_funcionario() {
        return id_funcionario;
    }

    public void setId_funcionario(int id_funcionario) {
        this.id_funcionario = id_funcionario;
    }

    public int getRG_Funcionario() {
        return RG_Funcionario;
    }

    public void setRG_Funcionario(int RG_Funcionario) {
        this.RG_Funcionario = RG_Funcionario;
    }

    public int getCPF_Funcionario() {
        return CPF_Funcionario;
    }

    public void setCPF_Funcionario(int CPF_Funcionario) {
        this.CPF_Funcionario = CPF_Funcionario;
    }

    public int getLogin_Funcionario() {
        return Login_Funcionario;
    }

    public void setLogin_Funcionario(int Login_Funcionario) {
        this.Login_Funcionario = Login_Funcionario;
    }

    public int getSenha_Funcionario() {
        return Senha_Funcionario;
    }

    public void setSenha_Funcionario(int Senha_Funcionario) {
        this.Senha_Funcionario = Senha_Funcionario;
    }

    public int getTipo_Acesso() {
        return Tipo_Acesso;
    }

    public void setTipo_Acesso(int Tipo_Acesso) {
        this.Tipo_Acesso = Tipo_Acesso;
    }

    public String getNome_Funcionario() {
        return Nome_Funcionario;
    }

    public void setNome_Funcionario(String Nome_Funcionario) {
        this.Nome_Funcionario = Nome_Funcionario;
    }

    public String getEndereco_Funcionario() {
        return Endereco_Funcionario;
    }

    public void setEndereco_Funcionario(String Endereco_Funcionario) {
        this.Endereco_Funcionario = Endereco_Funcionario;
    }

    public String getTelefone_Funcionario() {
        return Telefone_Funcionario;
    }

    public void setTelefone_Funcionario(String Telefone_Funcionario) {
        this.Telefone_Funcionario = Telefone_Funcionario;
    }

    public String getEmail_Funcionario() {
        return Email_Funcionario;
    }

    public void setEmail_Funcionario(String Email_Funcionario) {
        this.Email_Funcionario = Email_Funcionario;
    }

    public String getCTPS() {
        return CTPS;
    }

    public void setCTPS(String CTPS) {
        this.CTPS = CTPS;
    }
    
    
}
