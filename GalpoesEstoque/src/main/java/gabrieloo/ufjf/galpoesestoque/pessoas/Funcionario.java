/*Autores:
  Caio César Lima de Azevedo;
  Fernando Dellão Menini;
  Gabriel Martins da Costa Medeiros;
  Vinícius Barbosa Varoto;
  Weyder Luiz Gomes Gante.
  */

package gabrieloo.ufjf.galpoesestoque.pessoas;

import gabrieloo.ufjf.galpoesestoque.Caixa;
import gabrieloo.ufjf.galpoesestoque.produtos.Produto;
import gabrieloo.ufjf.galpoesestoque.vendas.Venda;
import java.util.ArrayList;

public abstract class Funcionario extends Usuario {

    private String login;
    private String senha;
    private double salarioBase;
    private int quantidadeVendasRealizadas;
    public ArrayList<Venda> vendasRealizadas;

    public abstract double calculaSalario();

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public ArrayList<Venda> getVendasRealizadas() {
        return vendasRealizadas;
    }

    public void addVenda(Venda Venda) {
        this.vendasRealizadas.add(Venda);
    }
    
    public int getQuantidadeVendasRealizadas(){
        return this.vendasRealizadas.size();
    }
    
    public double getValorVendasRealizadas(){
        double valorTotal = 0;
        for (Venda venda : vendasRealizadas) {
            valorTotal += venda.getValorTotal();
        }
        return valorTotal;
    }
    
}
