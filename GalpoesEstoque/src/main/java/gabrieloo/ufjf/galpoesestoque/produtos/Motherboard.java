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
public class Motherboard extends Produto{
    
    private static int quantidadeTotalMotherboard = 0;
    private int quantidade = 0;
    private String tamanho;
    private String soquete;
    private String chipset;
    private boolean usbTipoC;

    static ArrayList<String> tamanhos;
    static ArrayList<String> soquetes;
    static ArrayList<String> chipsets;

    public Motherboard() {
    }

    // <editor-fold defaultstate="collapsed" desc="Getters e Setters">
    
    @Override
    public void adicionaQuantidade(int quantidade) {
        this.quantidade += quantidade;
        quantidadeTotalMotherboard += quantidade;
        quantidadeTotal += quantidade;
    }
    
    public static int getQuantidadeTotalMotherboard() {
        return quantidadeTotalMotherboard;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public String getTamanho() {
        return tamanho;
    }

    public void setTamanho(int index) {
        this.tamanho = tamanhos.get(index);
    }

    public String getSoquete() {
        return soquete;
    }

    public void setSoquete(int index) {
        this.soquete = soquetes.get(index);
    }

    public String getChipset() {
        return chipset;
    }

    public void setChipset(int index) {
        this.chipset = soquetes.get(index);
    }

    public boolean isUsbTipoC() {
        return usbTipoC;
    }

    public void setUsbTipoC(boolean usbTipoC) {
        this.usbTipoC = usbTipoC;
    }
    
    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="Metodos de adicao a listas">
    public static void incializaListasMotherboard() {
        tamanhos = new ArrayList<>();
        soquetes = new ArrayList<>();
        chipsets = new ArrayList<>();

        adicionaSoquetes(soquetes);
        adicionaTamanhos(tamanhos);
        adicionaChipsets(chipsets);
    }

    private static void adicionaTamanhos(ArrayList<String> tamanhos) {
        tamanhos.add("eATX");
        tamanhos.add("ATX");
        tamanhos.add("mATX");
        tamanhos.add("mini ITX");
    }

    private static void adicionaSoquetes(ArrayList<String> soquetes) {
        soquetes.add("AM2");
        soquetes.add("AM2+");
        soquetes.add("AM3+");
        soquetes.add("AM4");
        soquetes.add("FM1");
        soquetes.add("FM2");
        soquetes.add("LGA775");
        soquetes.add("LGA1156");
        soquetes.add("LGA2011");
        soquetes.add("LGA1151");
        soquetes.add("LGA1155");
        soquetes.add("LGA1366");
        soquetes.add("LGA1150");
    }

    private static void adicionaChipsets(ArrayList<String> chipsets) {
        chipsets.add("A320");
        chipsets.add("A520");
        chipsets.add("B350");
        chipsets.add("B450");
        chipsets.add("B550");
        chipsets.add("X370");
        chipsets.add("X470");
        chipsets.add("X399");
        chipsets.add("X570");
        chipsets.add("760G");
        chipsets.add("970");
        chipsets.add("A68H");
        chipsets.add("Q470");
        chipsets.add("W480");
        chipsets.add("B460");
        chipsets.add("H410");
        chipsets.add("Z490");
        chipsets.add("B365");
        chipsets.add("H310");
        chipsets.add("H370");
        chipsets.add("Q370");
        chipsets.add("B360");
        chipsets.add("Z370");
    }

    // </editor-fold>
    
}
