/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gabrieloo.ufjf.galpoesestoque.produtos;

import gabrieloo.ufjf.galpoesestoque.AdministraDados;
import java.util.ArrayList;

/**
 *
 * @author gabriel
 */
public class Motherboard extends Produto {

    private int quantidade = 0;
    private String tamanho;
    private String chipset;

    public Motherboard() {
    }

    public int getQuantidade() {
        return quantidade;
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
