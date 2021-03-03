package gabrieloo.ufjf.galpoesestoque.produtos;

import gabrieloo.ufjf.galpoesestoque.AdministraDados;
import java.util.ArrayList;

/**
 *
 * @author gabriel
 */
public abstract class Produto {

    protected static int quantidadeTotal = 0;
    private double preco;
    private String marca;

    public Produto() {
    }

    public static int getQuantidadeTotal() {
        return quantidadeTotal;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        if (preco > 0) {
            this.preco = preco;
        }
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(int index) {
        this.marca = AdministraDados.marcaLista.get(index);
    }
}
