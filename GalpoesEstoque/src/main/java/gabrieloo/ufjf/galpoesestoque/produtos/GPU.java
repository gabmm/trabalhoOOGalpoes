/*Autores:
  Caio César Lima de Azevedo;
  Fernando Dellão Menini;
  Gabriel Martins da Costa Medeiros;
  Vinícius Barbosa Varoto;
  Weyder Luiz Gomes Gante.
  */

package gabrieloo.ufjf.galpoesestoque.produtos;

import gabrieloo.ufjf.galpoesestoque.AdministraDados;

public class GPU extends Produto {

    private int quantidade = 0;
    private String memoria;
    private String nome;

    public GPU() {
    }

    public String getMemoria() {
        return memoria;
    }


    public void setMemoria(int index) {
        this.memoria = AdministraDados.memoriaCapacidadeLista.get(index);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + " " + this.getMarca() + " " + this.getNome() + " " + this.getMemoria() + " - R$" + String.format("%.2f", this.getPreco()) + " (" + this.getQuantidade() + " un.)";
    }

}
