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
public class GPU extends Produto{

    private static int quantidadeTotalGPU = 0;
    private int quantidade = 0;
    private String memoria;
    private int clock;
    private int memoryClock;
    private boolean displayPort;
    private int power;
    private String conector;

    static ArrayList<String> memorias = new ArrayList<>();
    static ArrayList<String> conectores = new ArrayList<>();
    
    public GPU() {
    }
    
    // <editor-fold defaultstate="collapsed" desc="Metodos de adicao a listas">
    
    public static void incializaListasGPU() {
        memorias = new ArrayList<>();
        conectores = new ArrayList<>();
        
        adicionaMemorias(memorias);
        adicionaConectores(conectores);
    }

    private static void adicionaMemorias(ArrayList<String> memorias) {
        memorias.add("512 MB");
        memorias.add("1 GB");
        memorias.add("2 GB");
        memorias.add("3 GB");
        memorias.add("4 GB");
        memorias.add("6 GB");
        memorias.add("8 GB");
        memorias.add("9 GB");
        memorias.add("10 GB");
        memorias.add("11 GB");
        memorias.add("12 GB");
        memorias.add("16 GB");
    }
    
    private static void adicionaConectores(ArrayList<String> conectores) {
        conectores.add("Sem conector");
        conectores.add("8-pin + 6-pin");
        conectores.add("6-pin");
        conectores.add("8-pin");
        conectores.add("4-pin");
        conectores.add("4-pin + 4-pin");
    }
    
    // </editor-fold>
    
    // <editor-fold defaultstate="collapsed" desc="Getters e Setters">

    @Override
    public void adicionaQuantidade(int quantidade) {
        quantidadeTotalGPU += quantidade;
        quantidade++;
        quantidadeTotal += quantidade;
    }

    public String getMemoria() {
        return memoria;
    }

    public void setMemoria(int index) {
        this.memoria = memorias.get(index);
    }

    public int getClock() {
        return clock;
    }

    public void setClock(int clock) {
        this.clock = clock;
    }

    public int getMemoryClock() {
        return memoryClock;
    }

    public void setMemoryClock(int memoryClock) {
        this.memoryClock = memoryClock;
    }

    public boolean isDisplayPort() {
        return displayPort;
    }

    public void setDisplayPort(boolean displayPort) {
        this.displayPort = displayPort;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public String getConector() {
        return conector;
    }

    public void setConector(int index) {
        this.conector = conectores.get(index);
    }
    
    // </editor-fold>
    
}
