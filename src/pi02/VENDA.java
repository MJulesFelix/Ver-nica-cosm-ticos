
package pi02;



public class VENDA 
{
    // VARIÁVEIS //
    int id;
    PEDIDO ped;
    PAGAMENTO pag;
    FUNCIONARIO fun;

    public VENDA() 
    {
    }

    public VENDA(int id, PEDIDO ped, PAGAMENTO pag, FUNCIONARIO fun) 
    {
        this.id = id;
        this.ped = ped;
        this.pag = pag;
        this.fun = fun;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public PEDIDO getPed() {
        return ped;
    }

    public void setPed(PEDIDO ped) {
        this.ped = ped;
    }

    public PAGAMENTO getPag() {
        return pag;
    }

    public void setPag(PAGAMENTO pag) {
        this.pag = pag;
    }

    public FUNCIONARIO getFun() {
        return fun;
    }

    public void setFun(FUNCIONARIO fun) {
        this.fun = fun;
    }
    
    
    
    
}
