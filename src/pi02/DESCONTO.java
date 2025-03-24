
package pi02;


public class DESCONTO
{
    // VARIÁVEIS //
    int id;
    String descricao;

    public DESCONTO() 
    {
    }

    public DESCONTO(int id, String descricao) 
    {
        this.id = id;
        this.descricao = descricao;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    
    
}
