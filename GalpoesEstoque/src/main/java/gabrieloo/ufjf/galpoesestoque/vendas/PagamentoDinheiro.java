/*Autores:
  Caio César Lima de Azevedo;
  Fernando Dellão Menini;
  Gabriel Martins da Costa Medeiros;
  Vinícius Barbosa Varoto;
  Weyder Luiz Gomes Gante.
  */

package gabrieloo.ufjf.galpoesestoque.vendas;

import gabrieloo.ufjf.galpoesestoque.produtos.Produto;
import java.util.ArrayList;

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
