
package Model;


public class Produto {
    
    int ID_Produto,Plataforma, ID_Registro,CNPJ, Tipo_Produto;
    float Valor_Venda,Valor_compra;
    String Nome_Produto, Qtd_min;

    public Produto(int ID_Produto, int Plataforma, int ID_Registro, int CNPJ, int Tipo_Produto, float Valor_Venda, float Valor_compra, String Nome_Produto, String Qtd_min) {
        this.ID_Produto = ID_Produto;
        this.Plataforma = Plataforma;
        this.ID_Registro = ID_Registro;
        this.CNPJ = CNPJ;
        this.Tipo_Produto = Tipo_Produto;
        this.Valor_Venda = Valor_Venda;
        this.Valor_compra = Valor_compra;
        this.Nome_Produto = Nome_Produto;
        this.Qtd_min = Qtd_min;
    }

    public Produto(int Plataforma, int CNPJ, int Tipo_Produto, float Valor_Venda, String Nome_Produto, String Qtd_min) {
        this.Plataforma = Plataforma;
        this.CNPJ = CNPJ;
        this.Tipo_Produto = Tipo_Produto;
        this.Valor_Venda = Valor_Venda;
        this.Nome_Produto = Nome_Produto;
        this.Qtd_min = Qtd_min;
    }

    public int getID_Produto() {
        return ID_Produto;
    }

    public void setID_Produto(int ID_Produto) {
        this.ID_Produto = ID_Produto;
    }

    public int getPlataforma() {
        return Plataforma;
    }

    public void setPlataforma(int Plataforma) {
        this.Plataforma = Plataforma;
    }

    public int getID_Registro() {
        return ID_Registro;
    }

    public void setID_Registro(int ID_Registro) {
        this.ID_Registro = ID_Registro;
    }

    public int getCNPJ() {
        return CNPJ;
    }

    public void setCNPJ(int CNPJ) {
        this.CNPJ = CNPJ;
    }

    public int getTipo_Produto() {
        return Tipo_Produto;
    }

    public void setTipo_Produto(int Tipo_Produto) {
        this.Tipo_Produto = Tipo_Produto;
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

    public String getQtd_min() {
        return Qtd_min;
    }

    public void setQtd_min(String Qtd_min) {
        this.Qtd_min = Qtd_min;
    }
 
    
}
