/*Autores:
  Caio César Lima de Azevedo;
  Fernando Dellão Menini;
  Gabriel Martins da Costa Medeiros;
  Vinícius Barbosa Varoto;
  Weyder Luiz Gomes Gante.
  */

package gabrieloo.ufjf.galpoesestoque.produtos;

import gabrieloo.ufjf.galpoesestoque.AdministraDados;

public class DispositivoArmazenamento extends Produto {

    private String capacidade;
    private String tipo;
    private int quantidade = 0;

    public DispositivoArmazenamento() {
    }

    public String getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(int index) {
        this.capacidade = AdministraDados.capacidadeArmazenamentoLista.get(index);
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(int index) {
        this.tipo = AdministraDados.tipoArmazenamentoLista.get(index);
    }

    @Override
    public String toString() {
        return this.getTipo() + " " + this.getMarca() + " " + this.getCapacidade() + " - R$" + this.getPreco() + " (" + this.getQuantidade() + " un.)";
    }

}
