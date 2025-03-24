
package pi02;

public class PAGAMENTO 
{
    // VARIÁVEIS //
    int id;
    PEDIDO ped;
    DESCONTO des;
    float valorFinal;

    public PAGAMENTO() 
    {
    }

    public PAGAMENTO(int id, PEDIDO ped, DESCONTO des, float valorFinal) 
    {
        this.id = id;
        this.ped = ped;
        this.des = des;
        this.valorFinal = valorFinal;
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

    public DESCONTO getDes() {
        return des;
    }

    public void setDes(DESCONTO des) {
        this.des = des;
    }

    public float getValorFinal() {
        return valorFinal;
    }

    public void setValorFinal(float valorFinal) {
        this.valorFinal = valorFinal;
    }
    
    
}
