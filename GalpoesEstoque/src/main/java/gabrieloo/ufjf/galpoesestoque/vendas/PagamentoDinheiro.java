/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gabrieloo.ufjf.galpoesestoque.vendas;

import gabrieloo.ufjf.galpoesestoque.produtos.Produto;
import java.util.ArrayList;

/**
 *
 * @author gabriel
 */
public class PagamentoDinheiro implements Pagamento {

    private final double DESCONTO_DINHEIRO = 0.1;

    public PagamentoDinheiro() {
    }

    @Override
    public double realizaPagamento(ArrayList<Produto> produtosComprados) {
        double total = 0;

        for (int i = 0; i < produtosComprados.size(); i++) {
            total += produtosComprados.get(i).getPreco();
        }

        return total * (1 - DESCONTO_DINHEIRO);
    }

}
