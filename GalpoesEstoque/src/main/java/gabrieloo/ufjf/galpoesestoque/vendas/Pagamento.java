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
public interface Pagamento {
    
    public double realizaPagamento(ArrayList<Produto> produtosComprados);
    
}
