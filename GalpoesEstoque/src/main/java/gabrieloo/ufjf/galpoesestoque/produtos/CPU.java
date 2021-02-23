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
public class CPU extends Produto {

    private String coreThreads, soquete;
    private int clock;
    private boolean turbo;
    private int quantidade = 0;

    private static int quantidadeTotalCPUs = 0;
    static ArrayList<String> coreThreadList;
    static ArrayList<String> soquetes;

    public CPU() {

    }

    // <editor-fold defaultstate="collapsed" desc="Getters e Setters">

    @Override
    public void adicionaQuantidade(int quantidade) {
        this.quantidade += quantidade;
        quantidadeTotalCPUs += quantidade;
        quantidadeTotal += quantidade;
    }
    
    public String getCoreThreads() {
        return coreThreads;
    }

    public void setCoreThreads(int index) {
        this.coreThreads = coreThreadList.get(index);
    }

    public String getSoquete() {
        return soquete;
    }

    public void setSoquete(int index) {
        this.soquete = soquetes.get(index);
    }

    public int getClock() {
        return clock;
    }

    public void setClock(int clock) {
        this.clock = clock;
    }

    public boolean isTurbo() {
        return turbo;
    }

    public void setTurbo(boolean turbo) {
        this.turbo = turbo;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public static int getQuantidadeTotalCPUs() {
        return quantidadeTotalCPUs;
    }

    // </editor-fold>
    // <editor-fold defaultstate="collapsed" desc="Metodos de adicao a listas">
    
    public static void iniciaListasCPU() {
        coreThreadList = new ArrayList<>();
        soquetes = new ArrayList<>();
        adicionaCoreThread(coreThreadList);
        adicionaSoquetes(soquetes);
    }

    private static void adicionaCoreThread(ArrayList<String> coreThreadList) {
        coreThreadList.add("2/2");
        coreThreadList.add("2/4");
        coreThreadList.add("3/3");
        coreThreadList.add("3/6");
        coreThreadList.add("4/4");
        coreThreadList.add("4/8");
        coreThreadList.add("6/6");
        coreThreadList.add("6/12");
        coreThreadList.add("8/8");
        coreThreadList.add("8/16");
        coreThreadList.add("16/16");
        coreThreadList.add("16/32");
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

    // </editor-fold>
}
