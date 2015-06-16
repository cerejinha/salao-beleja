/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;


public class Registro_Produto {
    
    
    int id_registro,quantidade,Id_fornecedor;
    String data_compra,data_venda;

    
    // consultar

    public Registro_Produto(int id_registro, int quantidade, int Id_fornecedor, String data_compra, String data_venda) {
        this.id_registro = id_registro;
        this.quantidade = quantidade;
        this.Id_fornecedor = Id_fornecedor;
        this.data_compra = data_compra;
        this.data_venda = data_venda;
    }
    
    //cadastrar

    public Registro_Produto(int quantidade, int Id_fornecedor, String data_compra, String data_venda) {
        this.quantidade = quantidade;
        this.Id_fornecedor = Id_fornecedor;
        this.data_compra = data_compra;
        this.data_venda = data_venda;
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
    
    
    
}
