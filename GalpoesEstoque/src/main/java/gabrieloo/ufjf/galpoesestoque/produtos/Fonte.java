/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gabrieloo.ufjf.galpoesestoque.produtos;

import java.util.ArrayList;

/**
 *
 * @author gabriel
 */
public class Fonte extends Produto {
    
    int power;
    boolean PFCAtivo, bivolt, modular;
    String eficiencia;
    
    ArrayList<String> plus80;
    ArrayList<Integer> powers;
    
    public Fonte() {
        this.plus80 = new ArrayList<>();
        this.powers = new ArrayList<>();
        adicionaPotencia(powers);
        adicionaEficiente(plus80);
    }
    
    public int getPower() {
        return power;
    }
    
    public void setPower(int index) {
        this.power = powers.get(index);
    }
    
    public boolean isPFCAtivo() {
        return PFCAtivo;
    }
    
    public void setPFCAtivo(boolean PFCAtivo) {
        this.PFCAtivo = PFCAtivo;
    }
    
    public boolean isBivolt() {
        return bivolt;
    }
    
    public void setBivolt(boolean bivolt) {
        this.bivolt = bivolt;
    }
    
    public boolean isModular() {
        return modular;
    }
    
    public void setModular(boolean modular) {
        this.modular = modular;
    }
    
    public String getEficiencia() {
        return eficiencia;
    }
    
    public void setEficiencia(int index) {
        this.eficiencia = plus80.get(index);
    }
    
    private void adicionaEficiente(ArrayList plus80) {
        plus80.add("Standard");
        plus80.add("Bronze");
        plus80.add("Silver");
        plus80.add("Gold");
        plus80.add("Platinium");
        plus80.add("Titanium");
    }
    
    private void adicionaPotencia(ArrayList<Integer> powers) {
        for (int i = 300; i < 1001; i += 50) {
            powers.add(i);
        }
    }
}
