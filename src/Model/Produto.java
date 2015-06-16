
package Model;


public class Produto {
    
    int ID_Produto,ID_Registro;
    String Nome_Produto,Tipo_Produto;

    public Produto(int ID_Produto, int ID_Registro, String Nome_Produto, String Tipo_Produto) {
        this.ID_Produto = ID_Produto;
        this.ID_Registro = ID_Registro;
        this.Nome_Produto = Nome_Produto;
        this.Tipo_Produto = Tipo_Produto;
    }

    public Produto(int ID_Registro, String Nome_Produto, String Tipo_Produto) {
        this.ID_Registro = ID_Registro;
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
