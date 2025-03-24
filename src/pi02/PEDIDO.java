
package pi02;


public class PEDIDO 
{
    // VARIÁVEIS //
    int id;
    PRODUTOS pro;
    CLIENTE cli;
    ESTOQUE est;
    int quantidade;
    float valorInicial;

    public PEDIDO() 
    {
    }

    public PEDIDO(int id, PRODUTOS pro, CLIENTE cli, ESTOQUE est, int quantidade, float valorInicial) 
    {
        this.id = id;
        this.pro = pro;
        this.cli = cli;
        this.est = est;
        this.quantidade = quantidade;
        this.valorInicial = valorInicial;
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

    public CLIENTE getCli() {
        return cli;
    }

    public void setCli(CLIENTE cli) {
        this.cli = cli;
    }

    public ESTOQUE getEst() {
        return est;
    }

    public void setEst(ESTOQUE est) {
        this.est = est;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public float getValorInicial() {
        return valorInicial;
    }

    public void setValorInicial(float valorInicial) {
        this.valorInicial = valorInicial;
    }
    
        
    
}
