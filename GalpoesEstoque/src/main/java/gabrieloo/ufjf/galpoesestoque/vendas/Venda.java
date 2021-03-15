/*Autores:
  Caio César Lima de Azevedo;
  Fernando Dellão Menini;
  Gabriel Martins da Costa Medeiros;
  Vinícius Barbosa Varoto;
  Weyder Luiz Gomes Gante.
  */

package gabrieloo.ufjf.galpoesestoque.vendas;

import gabrieloo.ufjf.galpoesestoque.pessoas.Cliente;
import gabrieloo.ufjf.galpoesestoque.pessoas.Funcionario;
import gabrieloo.ufjf.galpoesestoque.produtos.Produto;
import java.text.DecimalFormat;
import java.util.ArrayList;

public class Venda {

    private Cliente cliente;
    private Funcionario funcionario;
    private ArrayList<Produto> produtos;
    private double valorTotal = 0;
    private boolean ehCartao;

    public Venda() {
        this.produtos = new ArrayList<>();
        this.ehCartao = false;
    }

    public boolean isEhCartao() {
        return ehCartao;
    }

    public void setEhCartao(boolean ehCartao) {
        this.ehCartao = ehCartao;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Funcionario getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }

    public ArrayList getProdutos() {
        return produtos;
    }

    public double getValorTotal() {
        if (ehCartao) {
            PagamentoCartao cartao = new PagamentoCartao();
            return cartao.realizaPagamento(produtos);
        } else {
            PagamentoDinheiro dinheiro = new PagamentoDinheiro();
            return dinheiro.realizaPagamento(produtos);
        }
    }

    public void addProduto(ArrayList<Produto> produtos) {
        this.produtos = produtos;
    }

    @Override
    public String toString() {
        return this.getCliente().getNome() + ". Valor Total: R$" + String.format("%.2f", this.getValorTotal());
    }
}
