/*Autores:
  Caio César Lima de Azevedo;
  Fernando Dellão Menini;
  Gabriel Martins da Costa Medeiros - matricula 201935032
  Vinícius Barbosa Varoto;
  Weyder Luiz Gomes Gante.
  */

package gabrieloo.ufjf.galpoesestoque.produtos;

import gabrieloo.ufjf.galpoesestoque.AdministraDados;

public class Fonte extends Produto {

    private int quantidade = 0;
    private int power;
    private String eficiencia;

    public Fonte() {
    }

    public int getPower() {
        return power;
    }

    public void setPower(int index) {
        this.power = AdministraDados.powerLista.get(index);
    }

    public String getEficiencia() {
        return eficiencia;
    }

    public void setEficiencia(int index) {
        this.eficiencia = AdministraDados.plus80Lista.get(index);
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + " " + this.getMarca() + " " + this.getPower() + "W " + this.getEficiencia()+ " - R$" + String.format("%.2f", this.getPreco()) + " (" + this.getQuantidade() + " un.)";
    }
}
