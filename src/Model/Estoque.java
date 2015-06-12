
package Model;


public class Estoque {
    
    int ID_Produto_Estoque,ID_Registro_Produto,Quantidade_Estoque;
    String Tipo_Produto, Nome_Produto;

    
    
    //Consultar
    public Estoque(int ID_Produto_Estoque, int ID_Registro_Produto, int Quantidade_Estoque, String Tipo_Produto, String Nome_Produto) {
        this.ID_Produto_Estoque = ID_Produto_Estoque;
        this.ID_Registro_Produto = ID_Registro_Produto;
        this.Quantidade_Estoque = Quantidade_Estoque;
        this.Tipo_Produto = Tipo_Produto;
        this.Nome_Produto = Nome_Produto;
    }

    
    
    // Cadastrar
    public Estoque(int Quantidade_Estoque, String Tipo_Produto, String Nome_Produto) {
        this.Quantidade_Estoque = Quantidade_Estoque;
        this.Tipo_Produto = Tipo_Produto;
        this.Nome_Produto = Nome_Produto;
    }

    public int getID_Produto_Estoque() {
        return ID_Produto_Estoque;
    }

    public void setID_Produto_Estoque(int ID_Produto_Estoque) {
        this.ID_Produto_Estoque = ID_Produto_Estoque;
    }

    public int getID_Registro_Produto() {
        return ID_Registro_Produto;
    }

    public void setID_Registro_Produto(int ID_Registro_Produto) {
        this.ID_Registro_Produto = ID_Registro_Produto;
    }

    public int getQuantidade_Estoque() {
        return Quantidade_Estoque;
    }

    public void setQuantidade_Estoque(int Quantidade_Estoque) {
        this.Quantidade_Estoque = Quantidade_Estoque;
    }

    public String getTipo_Produto() {
        return Tipo_Produto;
    }

    public void setTipo_Produto(String Tipo_Produto) {
        this.Tipo_Produto = Tipo_Produto;
    }

    public String getNome_Produto() {
        return Nome_Produto;
    }

    public void setNome_Produto(String Nome_Produto) {
        this.Nome_Produto = Nome_Produto;
    }
    
    
    
    
}
