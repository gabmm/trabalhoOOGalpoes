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
    
    private static int quantidadeTotalFontes = 0;
    private int quantidade = 0;
    private int power;
    private boolean PFCAtivo, bivolt, modular;
    private String eficiencia;
    
    static ArrayList<String> plus80;
    static ArrayList<Integer> powers;
    
    public Fonte() {
    }

    // <editor-fold defaultstate="collapsed" desc="Getters e Setters">
    
    @Override
    public void adicionaQuantidade(int quantidade) {
        this.quantidade += quantidade;
        quantidadeTotalFontes += quantidade;
        quantidadeTotal += quantidade;
    }
    
    public static int getQuantidadeTotalFontes() {
        return quantidadeTotalFontes;
    }

    public int getQuantidade() {
        return quantidade;
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
    
    // </editor-fold>
    
    // <editor-fold defaultstate="collapsed" desc="Metodos de adicao a listas">
    
     public static void incializaListasFonte()
   {
        plus80 = new ArrayList<>();
        powers = new ArrayList<>();
        adicionaPotencia(powers);
        adicionaEficiencia(plus80);
    }
    
    private static void adicionaEficiencia(ArrayList plus80) {
        plus80.add("Standard");
        plus80.add("Bronze");
        plus80.add("Silver");
        plus80.add("Gold");
        plus80.add("Platinium");
        plus80.add("Titanium");
    }
    
    private static void adicionaPotencia(ArrayList<Integer> powers) {
        for (int i = 300; i < 1001; i += 50) {
            powers.add(i);
        }
    }
    
    // </editor-fold>
}
