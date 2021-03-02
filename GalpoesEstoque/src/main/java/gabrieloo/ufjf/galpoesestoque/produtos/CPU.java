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

    @Override
    public String toString() {
        return "CPU " + this.getMarca() + " " + this.getNome() + " " + this.getCoreThreads() + " - R$" + this.getPreco() + " (" + this.getQuantidade() + " un.)";
    }
}
