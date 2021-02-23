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
public class Gabinete extends Produto {

    private static int quantidadeTotalGabinetes = 0;
    private int quantidade = 0;
    private int nPortasUSB;
    private int nBaias;
    private int nFans;
    private ArrayList<String> placasSuportadas;
    private String tipos;

    static ArrayList<String> placasSuportadasList;
    static ArrayList<String> tiposList;
    static ArrayList<Integer> nPortasUSBList;
    static ArrayList<Integer> nFansList;
    static ArrayList<Integer> nBaiasList;

    public Gabinete() {

    }

    // <editor-fold defaultstate="collapsed" desc="Metodos de adicao a listas">
    
    public static void incializaListasGabinete() {
        placasSuportadasList = new ArrayList<>();
        tiposList = new ArrayList<>();
        nPortasUSBList = new ArrayList<>();
        nFansList = new ArrayList<>();
        nBaiasList = new ArrayList<>();

        adicionaPlacasSuportadas(placasSuportadasList);
        adicionaTipos(tiposList);
        adicionaNPortasUSB(nPortasUSBList);
        adicionaNFans(nFansList);
        adicionaNBaias(nBaiasList);
    }

    private static void adicionaPlacasSuportadas(ArrayList<String> placasSuportadasList) {
        placasSuportadasList.add("ATX");
        placasSuportadasList.add("mATX");
        placasSuportadasList.add("mini ITX");
        placasSuportadasList.add("eATX");
    }

    private static void adicionaTipos(ArrayList<String> tiposList) {
        tiposList.add("Mini Tower");
        tiposList.add("Mid Tower");
        tiposList.add("Full Tower");
    }

    private static void adicionaNPortasUSB(ArrayList<Integer> nPortasUSBList) {
        for (int i = 0; i < 7; i++) {
            nPortasUSBList.add(i);
        }
    }

    private static void adicionaNFans(ArrayList<Integer> nFansList) {
        for (int i = 0; i < 13; i++) {
            nFansList.add(i);
        }
    }

    private static void adicionaNBaias(ArrayList<Integer> nBaiasList) {
        for (int i = 0; i < 5; i++) {
            nBaiasList.add(i);
        }
    }

    // </editor-fold>
    
    // <editor-fold defaultstate="collapsed" desc="Setters e Getters">
    
    @Override
    public void adicionaQuantidade(int quantidade) {
        this.quantidade += quantidade;
        quantidadeTotalGabinetes += quantidade;
        quantidadeTotal += quantidade;
    }
    
    public static int getQuantidadeTotalGabinetes() {
        return quantidadeTotalGabinetes;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public int getnPortasUSB() {
        return nPortasUSB;
    }

    public void setnPortasUSB(int index) {
        this.nPortasUSB = nPortasUSBList.get(index);
    }

    public int getnBaias() {
        return nBaias;
    }

    public void setnBaias(int index) {
        this.nBaias = nBaiasList.get(index);
    }

    public int getnFans() {
        return nFans;
    }

    public void setnFans(int index) {
        this.nFans = nFansList.get(index);
    }

    public void getPlacasSuportadas() {
        for (int i = 0; i < placasSuportadas.size(); i++) {
            System.out.println(placasSuportadas.get(i));
        }
    }

    public void setPlacasSuportadas(int index) {
        placasSuportadas.add(placasSuportadasList.get(index));
    }

    public String getTipos() {
        return tipos;
    }

    public void setTipos(int index) {
        this.tipos = tiposList.get(index);
    }

    // </editor-fold>
    
}
