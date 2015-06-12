
package Model;

import java.util.Date;


public class Venda {
    
    int ID_Venda, ID_Item;
    Date Data_Venda;

    public Venda(int ID_Venda, int ID_Item, Date Data_Venda) {
        this.ID_Venda = ID_Venda;
        this.ID_Item = ID_Item;
        this.Data_Venda = Data_Venda;
    }

    public Venda(int ID_Item, Date Data_Venda) {
        this.ID_Item = ID_Item;
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

    public Date getData_Venda() {
        return Data_Venda;
    }

    public void setData_Venda(Date Data_Venda) {
        this.Data_Venda = Data_Venda;
    }
            
    
    
    
    
}
