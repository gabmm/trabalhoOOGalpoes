/*Autores:
  Caio César Lima de Azevedo;
  Fernando Dellão Menini;
  Gabriel Martins da Costa Medeiros;
  Vinícius Barbosa Varoto;
  Weyder Luiz Gomes Gante.
  */

package gabrieloo.ufjf.galpoesestoque.produtos;

import gabrieloo.ufjf.galpoesestoque.AdministraDados;

public class Motherboard extends Produto {

    private int quantidade = 0;
    private String tamanho;
    private String chipset;

    public Motherboard() {
    }

    public String getTamanho() {
        return tamanho;
    }

    public void setTamanho(int index) {
        this.tamanho = AdministraDados.tamanhoMBLista.get(index);
    }

    public String getChipset() {
        return chipset;
    }

    public void setChipset(int index) {
        this.chipset = AdministraDados.chipsetLista.get(index);
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + " " + this.getMarca() + " " + this.getChipset() + " " + this.getTamanho() + " - R$" + this.getPreco() + " (" + this.getQuantidade() + " un.)";
    }
}
