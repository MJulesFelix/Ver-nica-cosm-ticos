
package pi02;

public class ESTOQUE 
{
    // VARIÁVEIS //
    int id;
    PRODUTOS pro;
    int quantidade;
    String corredor;
    String prateleira;

    public ESTOQUE() 
    {
    }

    public ESTOQUE(int id, PRODUTOS pro, int quantidade, String corredor, String prateleira)
    {
        this.id = id;
        this.pro = pro;
        this.quantidade = quantidade;
        this.corredor = corredor;
        this.prateleira = prateleira;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public PRODUTOS getPro() {
        return pro;
    }

    public void setPro(PRODUTOS pro) {
        this.pro = pro;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public String getCorredor() {
        return corredor;
    }

    public void setCorredor(String corredor) {
        this.corredor = corredor;
    }

    public String getPrateleira() {
        return prateleira;
    }

    public void setPrateleira(String prateleira) {
        this.prateleira = prateleira;
    }
    
    
    
}
