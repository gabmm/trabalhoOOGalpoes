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

public class PagamentoCartao implements Pagamento {

    public PagamentoCartao() {
    }

    @Override
    public double realizaPagamento(ArrayList<Produto> produtosComprados) {
        double total = 0;

        for (int i = 0; i < produtosComprados.size(); i++) {
            total += produtosComprados.get(i).getPreco();
        }

        return total;
    }

}
