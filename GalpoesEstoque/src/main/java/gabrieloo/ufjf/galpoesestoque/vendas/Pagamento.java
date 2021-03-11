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

public interface Pagamento {

    public double realizaPagamento(ArrayList<Produto> produtosComprados);

}
