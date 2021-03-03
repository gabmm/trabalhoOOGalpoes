/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gabrieloo.ufjf.galpoesestoque.vendas;

import gabrieloo.ufjf.galpoesestoque.pessoas.Cliente;
import gabrieloo.ufjf.galpoesestoque.pessoas.Funcionario;
import gabrieloo.ufjf.galpoesestoque.pessoas.Gerente;
import gabrieloo.ufjf.galpoesestoque.pessoas.Vendedor;
import gabrieloo.ufjf.galpoesestoque.produtos.Produto;
import java.util.ArrayList;

/**
 *
 * @author gabriel
 */
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

    public void addProduto(Produto produtos[]) {
        for (int i = 0; i < produtos.length; i++) {
            this.produtos.add(produtos[i]);
        }
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + " para: " + this.getCliente().getNome() + ". Funcionario: "
                + this.getFuncionario().getNome() + ". Valor Total: R$" + this.getValorTotal();
    }
}
