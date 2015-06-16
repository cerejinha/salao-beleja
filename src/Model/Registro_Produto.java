/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;


public class Registro_Produto {
    
    
    int id_registro,quantidade,Id_fornecedor;
    String data_compra,data_venda;
     float Valor_Venda,Valor_compra;

    public Registro_Produto(int id_registro, int quantidade, int Id_fornecedor, String data_compra, String data_venda, float Valor_Venda, float Valor_compra) {
        this.id_registro = id_registro;
        this.quantidade = quantidade;
        this.Id_fornecedor = Id_fornecedor;
        this.data_compra = data_compra;
        this.data_venda = data_venda;
        this.Valor_Venda = Valor_Venda;
        this.Valor_compra = Valor_compra;
    }

    public Registro_Produto(int quantidade, int Id_fornecedor, String data_compra, String data_venda, float Valor_Venda, float Valor_compra) {
        this.quantidade = quantidade;
        this.Id_fornecedor = Id_fornecedor;
        this.data_compra = data_compra;
        this.data_venda = data_venda;
        this.Valor_Venda = Valor_Venda;
        this.Valor_compra = Valor_compra;
    }

    public int getId_registro() {
        return id_registro;
    }

    public void setId_registro(int id_registro) {
        this.id_registro = id_registro;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public int getId_fornecedor() {
        return Id_fornecedor;
    }

    public void setId_fornecedor(int Id_fornecedor) {
        this.Id_fornecedor = Id_fornecedor;
    }

    public String getData_compra() {
        return data_compra;
    }

    public void setData_compra(String data_compra) {
        this.data_compra = data_compra;
    }

    public String getData_venda() {
        return data_venda;
    }

    public void setData_venda(String data_venda) {
        this.data_venda = data_venda;
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
    
    
}