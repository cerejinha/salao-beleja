
package Model;




public class Venda {
    
    int ID_Venda, ID_Item,ID_Cliente,ID_Funcionario;
    String Data_Venda;

    public Venda(int ID_Venda, int ID_Item, int ID_Cliente, int ID_Funcionario, String Data_Venda) {
        this.ID_Venda = ID_Venda;
        this.ID_Item = ID_Item;
        this.ID_Cliente = ID_Cliente;
        this.ID_Funcionario = ID_Funcionario;
        this.Data_Venda = Data_Venda;
    }

    public Venda(int ID_Item, int ID_Cliente, int ID_Funcionario, String Data_Venda) {
        this.ID_Item = ID_Item;
        this.ID_Cliente = ID_Cliente;
        this.ID_Funcionario = ID_Funcionario;
        this.Data_Venda = Data_Venda;
    }

    public int getID_Venda() {
        return ID_Venda;
    }

    public void setID_Venda(int ID_Venda) {
        this.ID_Venda = ID_Venda;
    }

    public int getID_Item() {
        return ID_Item;
    }

    public void setID_Item(int ID_Item) {
        this.ID_Item = ID_Item;
    }

    public int getID_Cliente() {
        return ID_Cliente;
    }

    public void setID_Cliente(int ID_Cliente) {
        this.ID_Cliente = ID_Cliente;
    }

    public int getID_Funcionario() {
        return ID_Funcionario;
    }

    public void setID_Funcionario(int ID_Funcionario) {
        this.ID_Funcionario = ID_Funcionario;
    }

    public String getData_Venda() {
        return Data_Venda;
    }

    public void setData_Venda(String Data_Venda) {
        this.Data_Venda = Data_Venda;
    }

   
    
    
    
}
