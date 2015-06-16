
package Model;


public class Detalhe_Venda {
    
    int Id_Detalhe, Quantidade, ID_Venda, ID_Cliente,ID_Produto;
    float Preco_Unitario, Preco_Total;
            
    String Forma_Pagamento;

    
    // Consultar
    public Detalhe_Venda(int Id_Detalhe, int Quantidade, int ID_Venda, int ID_Cliente, int ID_Produto, float Preco_Unitario, float Preco_Total, String Forma_Pagamento) {
        this.Id_Detalhe = Id_Detalhe;
        this.Quantidade = Quantidade;
        this.ID_Venda = ID_Venda;
        this.ID_Cliente = ID_Cliente;
        this.ID_Produto = ID_Produto;
        this.Preco_Unitario = Preco_Unitario;
        this.Preco_Total = Preco_Total;
        this.Forma_Pagamento = Forma_Pagamento;
    }

    
    // Cadastrar
    public Detalhe_Venda(int Quantidade, int ID_Venda, int ID_Cliente, int ID_Produto, float Preco_Unitario, float Preco_Total, String Forma_Pagamento) {
        this.Quantidade = Quantidade;
        this.ID_Venda = ID_Venda;
        this.ID_Cliente = ID_Cliente;
        this.ID_Produto = ID_Produto;
        this.Preco_Unitario = Preco_Unitario;
        this.Preco_Total = Preco_Total;
        this.Forma_Pagamento = Forma_Pagamento;
    }

    public int getId_Detalhe() {
        return Id_Detalhe;
    }

    public void setId_Detalhe(int Id_Detalhe) {
        this.Id_Detalhe = Id_Detalhe;
    }

    public int getQuantidade() {
        return Quantidade;
    }

    public void setQuantidade(int Quantidade) {
        this.Quantidade = Quantidade;
    }

    public int getID_Venda() {
        return ID_Venda;
    }

    public void setID_Venda(int ID_Venda) {
        this.ID_Venda = ID_Venda;
    }

    public int getID_Cliente() {
        return ID_Cliente;
    }

    public void setID_Cliente(int ID_Cliente) {
        this.ID_Cliente = ID_Cliente;
    }

    public int getID_Produto() {
        return ID_Produto;
    }

    public void setID_Produto(int ID_Produto) {
        this.ID_Produto = ID_Produto;
    }

    public float getPreco_Unitario() {
        return Preco_Unitario;
    }

    public void setPreco_Unitario(float Preco_Unitario) {
        this.Preco_Unitario = Preco_Unitario;
    }

    public float getPreco_Total() {
        return Preco_Total;
    }

    public void setPreco_Total(float Preco_Total) {
        this.Preco_Total = Preco_Total;
    }

    public String getForma_Pagamento() {
        return Forma_Pagamento;
    }

    public void setForma_Pagamento(String Forma_Pagamento) {
        this.Forma_Pagamento = Forma_Pagamento;
    }
    
    
    
}
