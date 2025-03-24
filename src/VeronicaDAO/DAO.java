
package VeronicaDAO;

import pi02.PRODUTOS;
import pi02.VENDA;
import conexao.Conexão;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.sql.SQLException;


public class DAO 
{
    private Conexão conexao;
    private Connection conn;
    
    
        public DAO() 
        {
            this.conexao = new Conexão();
            this.conn = this.conexao.getConexao();
        }
            ///INSERINDO//////////////////////////////////////////////////////////////////////////////
        
        public DAO(Connection conn) 
        {
            this.conn = conn;
        }

            public void inserirP(PRODUTOS pdt) 
            {
                String sql = "INSERT INTO produtos(Nome, Categoria, Preco) VALUES (?, ?, ?)";
                PreparedStatement stmt = null;

                try 
                {
                    stmt = this.conn.prepareStatement(sql);
                    stmt.setString(1, pdt.getNome());
                    stmt.setString(2, pdt.getCategoria());

                    // Certifique-se de que pdt.getPreco() retorna um double
                    double preco = pdt.getPreco(); // Se getPreco() for String, use Double.parseDouble()

                    stmt.setDouble(3, preco);
                    stmt.execute();
                    System.out.println("Produto inserido com sucesso!");
                    
                    stmt.close();
                    conn.close();

                } 
                catch (SQLException e) 
                {
                    System.out.println("Erro ao inserir Produto: " + e.getMessage());
                } 
                finally 
                {
                    // Garante que o PreparedStatement seja fechado corretamente
                    try 
                    {
                        if (stmt != null) stmt.close();
                    } 
                    catch (SQLException e) 
                    {
                        
                        System.out.println("Erro ao fechar statement: " + e.getMessage());
                    }
                }
            }
                
            ///PESQUISANDO//////////////////////////////////////////////////////////////////////////////    
                

            
            public List<PRODUTOS> pesquisarCat(String categoria) 
            {
                String sql = "SELECT * FROM consulta_produto WHERE categoria LIKE ?";
                List<PRODUTOS> listaProdutos = new ArrayList<>();

                try (PreparedStatement stmt = this.conn.prepareStatement(sql)) 
                {
                    stmt.setString(1, "%" + categoria + "%");
                    try (ResultSet rs = stmt.executeQuery()) 
                    {
                        while (rs.next()) 
                        { 
                            PRODUTOS pro = new PRODUTOS();
                            pro.setNome(rs.getString("Produto"));
                            pro.setCategoria(rs.getString("categoria"));   
                            pro.setPreco(rs.getDouble("preco"));
                            pro.setDisponivel(rs.getInt("Disponivel"));

                            listaProdutos.add(pro);
                        }
                    }
                } 
                catch (Exception e) 
                {
                    System.out.println("Erro ao pesquisar por categoria: " + e.getMessage());
                }

                return listaProdutos;
            }

            public List<PRODUTOS> pesquisarNome(String nome) 
            {
                String sql = "SELECT * FROM consulta_produto WHERE Produto LIKE ?";
                List<PRODUTOS> listaProdutos = new ArrayList<>();

                try (PreparedStatement stmt = this.conn.prepareStatement(sql)) 
                {
                    stmt.setString(1, "%" + nome + "%");
                    try (ResultSet rs = stmt.executeQuery()) 
                    {
                        while (rs.next()) 
                        { 
                            PRODUTOS pro = new PRODUTOS();
                            pro.setNome(rs.getString("Produto"));
                            pro.setCategoria(rs.getString("categoria"));   
                            pro.setPreco(rs.getDouble("preco"));
                            pro.setDisponivel(rs.getInt("Disponivel"));

                            listaProdutos.add(pro);
                        }
                    }
                } 
                catch (Exception e) 
                {
                    System.out.println("Erro ao pesquisar por nome: " + e.getMessage());
                }

                return listaProdutos;
            }        
                
                
                
}
