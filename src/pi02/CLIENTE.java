
package pi02;

public class CLIENTE 
{
    // VARIÁVEIS //
    int id;
    String nome;
    String CPF;

    public CLIENTE() 
    {
    }

    public CLIENTE(int id, String nome, String CPF) 
    {
        this.id = id;
        this.nome = nome;
        this.CPF = CPF;
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

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }
    
    
}
