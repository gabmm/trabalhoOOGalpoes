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
public class AdministraProduto {

    private static ArrayList<CPU> listaCPU;
    private static ArrayList<Fonte> listaFonte;
    private static ArrayList<GPU> listaGPU;
    private static ArrayList<Gabinete> listaGabinete;
    private static ArrayList<HDD> listaHDD;
    private static ArrayList<MemoriaRAM> listaRAM;
    private static ArrayList<Motherboard> listaMB;
    private static ArrayList<SSD> listaSSD;

    private static ArrayList<String> categoria;

    public static void iniciaListas() {
        listaCPU = new ArrayList<>();
        listaFonte = new ArrayList<>();
        listaGPU = new ArrayList<>();
        listaGabinete = new ArrayList<>();
        listaHDD = new ArrayList<>();
        listaRAM = new ArrayList<>();
        listaMB = new ArrayList<>();
        listaSSD = new ArrayList<>();

        categoria = new ArrayList<>();
        categoria.add("Processadores");
        categoria.add("Fontes");
        categoria.add("Placas de vídeo");
        categoria.add("Gabinetes");
        categoria.add("Hard Disk Drives (HDD)");
        categoria.add("Memórias RAM");
        categoria.add("Placas-mãe");
        categoria.add("Solid State Drives (SSD)");
    }

    public static void cadastraProduto() {
        int opcao = 0;
        switch (opcao) {
            case 0:
                adicionaCPU(cadastraCPU());
                break;
            case 1:
                adicionaFonte(cadastraFonte());
                break;
            case 2:
                adicionaGPU(cadastraGPU());
                break;
            case 3:
                adicionaGabinete(cadastraGabinete());
                break;
            case 4:
                adicionaHDD(cadastraHDD());
                break;
            case 5:
                adicionaRAM(cadastraRAM());
                break;
            case 6:
                adicionaMotherboard(cadastraMotherboard());
                break;
            case 7:
                adicionaSSD(cadastraSSD());
                break;
            default:

        }
    }
    
    // <editor-fold defaultstate="collapsed" desc="Metodos de adicao a listas">

    public static void adicionaCPU(CPU cpu) {
        listaCPU.add(cpu);
    }

    public static void adicionaFonte(Fonte fonte) {
        listaFonte.add(fonte);
    }

    public static void adicionaGPU(GPU gpu) {
        listaGPU.add(gpu);
    }

    public static void adicionaGabinete(Gabinete gabinete) {
        listaGabinete.add(gabinete);
    }

    public static void adicionaHDD(HDD hdd) {
        listaHDD.add(hdd);
    }

    public static void adicionaRAM(MemoriaRAM ram) {
        listaRAM.add(ram);
    }

    public static void adicionaMotherboard(Motherboard mb) {
        listaMB.add(mb);
    }

    public static void adicionaSSD(SSD ssd) {
        listaSSD.add(ssd);
    }
    
    // </editor-fold>
    
    // <editor-fold defaultstate="collapsed" desc="Metodos de Sets de produtos">

    public static CPU cadastraCPU() {
        CPU cpu = new CPU();

        //atributos de produto
        cpu.setPreco(0);
        cpu.setPeso(0);
        cpu.setId(0);
        cpu.setCor(0);
        cpu.setGarantia(0);
        cpu.setMarca(0);
        cpu.setMargem(0);

        //atributos de fonte


        return cpu;
    }

    public static Fonte cadastraFonte() {
        Fonte fonte = new Fonte();

        //atributos de produto
        fonte.setPreco(0);
        fonte.setPeso(0);
        fonte.setId(0);
        fonte.setCor(0);
        fonte.setGarantia(0);
        fonte.setMarca(0);
        fonte.setMargem(0);

        //atributos de fonte
        fonte.setBivolt(true);
        fonte.setEficiencia(0);
        fonte.setPower(0);
        fonte.setPFCAtivo(true);
        fonte.setModular(true);

        return fonte;
    }

    public static GPU cadastraGPU() {
        GPU gpu = new GPU();

        //atributos de produto
        gpu.setPreco(0);
        gpu.setPeso(0);
        gpu.setId(0);
        gpu.setCor(0);
        gpu.setGarantia(0);
        gpu.setMarca(0);
        gpu.setMargem(0);

        //atributos de fonte


        return gpu;
    }

    public static HDD cadastraHDD() {
        HDD hdd = new HDD();

        //atributos de produto
        hdd.setPreco(0);
        hdd.setPeso(0);
        hdd.setId(0);
        hdd.setCor(0);
        hdd.setGarantia(0);
        hdd.setMarca(0);
        hdd.setMargem(0);

        //atributos de fonte


        return hdd;
    }

    public static MemoriaRAM cadastraRAM() {
        MemoriaRAM ram = new MemoriaRAM();

        //atributos de produto
        ram.setPreco(0);
        ram.setPeso(0);
        ram.setId(0);
        ram.setCor(0);
        ram.setGarantia(0);
        ram.setMarca(0);
        ram.setMargem(0);

        //atributos de fonte


        return ram;
    }

    public static Gabinete cadastraGabinete() {
        Gabinete gabinete = new Gabinete();

        //atributos de produto
        gabinete.setPreco(0);
        gabinete.setPeso(0);
        gabinete.setId(0);
        gabinete.setCor(0);
        gabinete.setGarantia(0);
        gabinete.setMarca(0);
        gabinete.setMargem(0);

        //atributos de fonte


        return gabinete;
    }

    public static Motherboard cadastraMotherboard() {
        Motherboard mb = new Motherboard();

        //atributos de produto
        mb.setPreco(0);
        mb.setPeso(0);
        mb.setId(0);
        mb.setCor(0);
        mb.setGarantia(0);
        mb.setMarca(0);
        mb.setMargem(0);

        //atributos de fonte


        return mb;
    }

    public static SSD cadastraSSD() {
        SSD ssd = new SSD();

        //atributos de produto
        ssd.setPreco(0);
        ssd.setPeso(0);
        ssd.setId(0);
        ssd.setCor(0);
        ssd.setGarantia(0);
        ssd.setMarca(0);
        ssd.setMargem(0);

        //atributos de fonte


        return ssd;
    }
    
    // </editor-fold>

}
