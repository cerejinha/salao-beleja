
package Model;

public class Fornecedor {
    
    int CNPJ,telefone;
    String Nome_Fornecedor, email_Fornecedor,Endereco_Fornecedor;

    public Fornecedor(int CNPJ, int telefone, String Nome_Fornecedor, String email_Fornecedor, String Endereco_Fornecedor) {
        this.CNPJ = CNPJ;
        this.telefone = telefone;
        this.Nome_Fornecedor = Nome_Fornecedor;
        this.email_Fornecedor = email_Fornecedor;
        this.Endereco_Fornecedor = Endereco_Fornecedor;
    }

    public int getCNPJ() {
        return CNPJ;
    }

    public void setCNPJ(int CNPJ) {
        this.CNPJ = CNPJ;
    }

    public int getTelefone() {
        return telefone;
    }

    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }

    public String getNome_Fornecedor() {
        return Nome_Fornecedor;
    }

    public void setNome_Fornecedor(String Nome_Fornecedor) {
        this.Nome_Fornecedor = Nome_Fornecedor;
    }

    public String getEmail_Fornecedor() {
        return email_Fornecedor;
    }

    public void setEmail_Fornecedor(String email_Fornecedor) {
        this.email_Fornecedor = email_Fornecedor;
    }

    public String getEndereco_Fornecedor() {
        return Endereco_Fornecedor;
    }

    public void setEndereco_Fornecedor(String Endereco_Fornecedor) {
        this.Endereco_Fornecedor = Endereco_Fornecedor;
    }
   
}
