
package Model;


public class Produto {
    
    int ID_Produto,ID_Registro,Quantidade;
    float Valor_Venda,Valor_compra;
    String Nome_Produto,Tipo_Produto;

    public Produto(int ID_Produto, int ID_Registro, int Quantidade, float Valor_Venda, float Valor_compra, String Nome_Produto, String Tipo_Produto) {
        this.ID_Produto = ID_Produto;
        this.ID_Registro = ID_Registro;
        this.Quantidade = Quantidade;
        this.Valor_Venda = Valor_Venda;
        this.Valor_compra = Valor_compra;
        this.Nome_Produto = Nome_Produto;
        this.Tipo_Produto = Tipo_Produto;
    }

    public Produto(int ID_Registro, int Quantidade, float Valor_Venda, float Valor_compra, String Nome_Produto, String Tipo_Produto) {
        this.ID_Registro = ID_Registro;
        this.Quantidade = Quantidade;
        this.Valor_Venda = Valor_Venda;
        this.Valor_compra = Valor_compra;
        this.Nome_Produto = Nome_Produto;
        this.Tipo_Produto = Tipo_Produto;
    }

    public int getID_Produto() {
        return ID_Produto;
    }

    public void setID_Produto(int ID_Produto) {
        this.ID_Produto = ID_Produto;
    }

    public int getID_Registro() {
        return ID_Registro;
    }

    public void setID_Registro(int ID_Registro) {
        this.ID_Registro = ID_Registro;
    }

    public int getQuantidade() {
        return Quantidade;
    }

    public void setQuantidade(int Quantidade) {
        this.Quantidade = Quantidade;
    }

    public float getValor_Venda() {
        return Valor_Venda;
    }

    public void setValor_Venda(float Valor_Venda) {
        this.Valor_Venda = Valor_Venda;
    }

    public float getValor_compra() {
        return Valor_compra;
    }

    public void setValor_compra(float Valor_compra) {
        this.Valor_compra = Valor_compra;
    }

    public String getNome_Produto() {
        return Nome_Produto;
    }

    public void setNome_Produto(String Nome_Produto) {
        this.Nome_Produto = Nome_Produto;
    }

    public String getTipo_Produto() {
        return Tipo_Produto;
    }

    public void setTipo_Produto(String Tipo_Produto) {
        this.Tipo_Produto = Tipo_Produto;
    }

    
    
   
}
