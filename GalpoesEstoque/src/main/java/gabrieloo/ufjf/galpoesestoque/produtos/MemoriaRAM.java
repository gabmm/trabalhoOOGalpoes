/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gabrieloo.ufjf.galpoesestoque.produtos;

import gabrieloo.ufjf.galpoesestoque.AdministraDados;
import java.util.ArrayList;

/*Autores:
Caio César Lima de Azevedo;
Fernando Dellão Menini;
Gabriel Martins da Costa Medeiros;
Vinícius Barbosa Varoto;
Weyder Luiz Gomes Gante.
 */
public class MemoriaRAM extends Produto {

    private int quantidade = 0;
    private String capacidade;
    private int clock;

    public MemoriaRAM() {
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
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
