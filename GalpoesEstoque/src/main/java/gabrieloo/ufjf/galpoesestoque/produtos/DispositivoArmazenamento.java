/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gabrieloo.ufjf.galpoesestoque.produtos;

import gabrieloo.ufjf.galpoesestoque.AdministraDados;

/**
 *
 * @author gabriel
 */
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

    public int getQuantidade() {
        return quantidade;
    }
    
    @Override
    public String toString() {
        return this.getTipo() + " " + this.getMarca() + " " + this.getCapacidade() + " - R$" + this.getPreco() + " (" + this.getQuantidade() + " un.)";
    }

}
