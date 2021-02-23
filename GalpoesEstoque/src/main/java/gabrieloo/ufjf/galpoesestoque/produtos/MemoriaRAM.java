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
public class MemoriaRAM extends Produto {

    private static int quantidadeTotalMemoriasRAM = 0;
    private int quantidade = 0;
    private String tamanho;
    private String clock;
    private String clockOC;
    private String tipo;
    private boolean dissipador;

    static ArrayList<String> tamanhos;
    static ArrayList<String> clocks;
    static ArrayList<String> tipos;

    public MemoriaRAM() {
    }

    // <editor-fold defaultstate="collapsed" desc="Metodos de adicao a listas">
    public static void incializaListasMemoriaRAM() {
        tamanhos = new ArrayList<>();
        clocks = new ArrayList<>();
        tipos = new ArrayList<>();

        adicionaTipos(tipos);
        adicionaTamanho(tamanhos);
        adicionaClocks(clocks);
    }

    private static void adicionaTipos(ArrayList<String> tipos) {
        tipos.add("DDR3");
        tipos.add("DDR4");
    }

    private static void adicionaClocks(ArrayList<String> clocks) {
        clocks.add("1000 MHz");
        clocks.add("1333 MHz");
        clocks.add("1667 MHz");
        clocks.add("1800 MHz");
        clocks.add("2133 MHz");
        clocks.add("2400 MHz");
        clocks.add("2667 MHz");
        clocks.add("3000 MHz");
        clocks.add("3200 MHz");
        clocks.add("3667 MHz");
        clocks.add("4000 MHz");
        clocks.add("4200 MHz");
    }

    private static void adicionaTamanho(ArrayList<String> tamanhos) {
        tamanhos.add("2 GB");
        tamanhos.add("4 GB");
        tamanhos.add("8 GB");
        tamanhos.add("16 GB");
        tamanhos.add("32 GB");
        tamanhos.add("64 GB");

    }

    // </editor-fold>
    
    // <editor-fold defaultstate="collapsed" desc="Getters e Setters">
    
    @Override
    public void adicionaQuantidade(int quantidade) {
        this.quantidade += quantidade;
        quantidadeTotalMemoriasRAM += quantidade;
        quantidadeTotal += quantidade;
    }
    
    public static int getQuantidadeTotalMemoriasRAM() {
        return quantidadeTotalMemoriasRAM;
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

    public String getClock() {
        return clock;
    }

    public void setClock(int index) {
        this.clock = clocks.get(index);
    }

    public String getClockOC() {
        return clockOC;
    }

    public void setClockOC(int index) {
        this.clockOC = clocks.get(index);
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(int index) {
        this.tipo = tipos.get(index);
    }

    public boolean isDissipador() {
        return dissipador;
    }

    public void setDissipador(boolean dissipador) {
        this.dissipador = dissipador;
    }

    // </editor-fold>
}
