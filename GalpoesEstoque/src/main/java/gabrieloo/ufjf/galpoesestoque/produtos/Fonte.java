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
public class Fonte extends Produto {

    private int quantidade = 0;
    private int power;
    private String eficiencia;

    public Fonte() {
    }

    public int getQuantidade() {
        return quantidade;
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
        return "Fonte " + this.getMarca() + " " + this.getPower() + "W " + this.getEficiencia()+ " - R$" + this.getPreco() + " (" + this.getQuantidade() + " un.)";
    }
}
