/*Autores:
  Caio César Lima de Azevedo;
  Fernando Dellão Menini;
  Gabriel Martins da Costa Medeiros;
  Vinícius Barbosa Varoto;
  Weyder Luiz Gomes Gante.
  */

package gabrieloo.ufjf.galpoesestoque.produtos;

import gabrieloo.ufjf.galpoesestoque.AdministraDados;

public class CPU extends Produto {

    private String nome;
    private String coreThreads;
    private int quantidade = 0;

    public CPU() {

    }

    public String getCoreThreads() {
        return coreThreads;
    }

    public void setCoreThreads(int index) {
        this.coreThreads = AdministraDados.coreThreadLista.get(index);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + " " + this.getMarca() + " " + this.getNome() + " " + this.getCoreThreads() + " - R$" + this.getPreco() + " (" + this.getQuantidade() + " un.)";
    }
}
