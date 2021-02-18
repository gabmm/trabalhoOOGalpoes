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
    private int power;
    private int quantidade = 0;
    
    private static int quantidadeTotalCPUs = 0;
    private static ArrayList<String> coreThreadList;
    private static ArrayList<String> soquetes;

    public CPU() {
        quantidadeTotalCPUs++;
        quantidade++;
    }
    
    public static void iniciaListasCPU()
    {
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
    
    
    
}
