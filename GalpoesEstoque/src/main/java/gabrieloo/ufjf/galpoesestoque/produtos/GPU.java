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
public class GPU extends Produto {

    private int quantidade = 0;
    private String memoria;
    private String nome;

    public GPU() {
    }

    public int getQuantidade() {
        return quantidade;
    }

    public String getMemoria() {
        return memoria;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
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
        return this.getClass().getSimpleName() + " " + this.getMarca() + " " + this.getNome() + " " + this.getMemoria() + " - R$" + this.getPreco() + " (" + this.getQuantidade() + " un.)";
    }

}
