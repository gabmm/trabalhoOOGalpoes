/*Autores:
  Caio César Lima de Azevedo;
  Fernando Dellão Menini;
  Gabriel Martins da Costa Medeiros;
  Vinícius Barbosa Varoto;
  Weyder Luiz Gomes Gante.
  */

package gabrieloo.ufjf.galpoesestoque.produtos;

import gabrieloo.ufjf.galpoesestoque.AdministraDados;

public class MemoriaRAM extends Produto {

    private int quantidade = 0;
    private String capacidade;
    private int clock;

    public MemoriaRAM() {
    }

    public String getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(int index) {
        this.capacidade = AdministraDados.memoriaCapacidadeLista.get(index);
    }

    public int getClock() {
        return clock;
    }

    public void setClock(int clock) {
        this.clock = clock;
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + " " + this.getMarca() + " " + this.getCapacidade() + " " + this.getClock() + "MHz - R$" + this.getPreco() + " (" + this.getQuantidade() + " un.)";
    }
}
