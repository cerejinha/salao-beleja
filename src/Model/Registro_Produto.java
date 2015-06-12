/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;


public class Registro_Produto {
    
    
    int id_registro,quantidade;

    
    // consultar
    public Registro_Produto(int id_registro, int quantidade) {
        this.id_registro = id_registro;
        this.quantidade = quantidade;
    }

    //alterar
    public Registro_Produto(int quantidade) {
        this.quantidade = quantidade;
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
    
 
}
