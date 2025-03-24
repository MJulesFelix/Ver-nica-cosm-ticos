
package pi02;


public class FUNCIONARIO 
{

    // VARIÁVEIS //
    int id;
    String nome;
    String cracha;
    String cargo;
    String contato;
    
    public FUNCIONARIO() 
    {
    }

    public FUNCIONARIO(int id, String nome, String cracha, String cargo, String contato) 
    {
        this.id = id;
        this.nome = nome;
        this.cracha = cracha;
        this.cargo = cargo;
        this.contato = contato;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCracha() {
        return cracha;
    }

    public void setCracha(String cracha) {
        this.cracha = cracha;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getContato() {
        return contato;
    }

    public void setContato(String contato) {
        this.contato = contato;
    }
    
    
    
    
    
}
