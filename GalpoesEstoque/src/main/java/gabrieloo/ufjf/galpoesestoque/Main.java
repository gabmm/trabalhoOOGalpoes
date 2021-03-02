/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gabrieloo.ufjf.galpoesestoque;

import gabrieloo.ufjf.galpoesestoque.produtos.CPU;
import gabrieloo.ufjf.galpoesestoque.produtos.DispositivoArmazenamento;
import gabrieloo.ufjf.galpoesestoque.produtos.Fonte;
import gabrieloo.ufjf.galpoesestoque.produtos.GPU;
import gabrieloo.ufjf.galpoesestoque.produtos.MemoriaRAM;
import gabrieloo.ufjf.galpoesestoque.produtos.Motherboard;

/**
 *
 * @author gabriel
 */
public class Main {
    
    private static void rotinaInicializacao() {
        AdministraDados.inicializacaoListas();
        
        CPU cpu1 = new CPU();
        cpu1.setMarca(6);
        cpu1.setPreco(1300);
        cpu1.setNome("Ryzen 5 3500x");
        cpu1.setCoreThreads(0);
        AdministraDados.adicionaCPU(cpu1);
        
        DispositivoArmazenamento da1 = new DispositivoArmazenamento();
        da1.setMarca(7);
        da1.setPreco(250);
        da1.setTipo(0);
        da1.setCapacidade(4);
        AdministraDados.adicionaDA(da1);
        
        Fonte fonte1 = new Fonte();
        fonte1.setMarca(3);
        fonte1.setPreco(500);
        fonte1.setEficiencia(2);
        fonte1.setPower(6);
        AdministraDados.adicionaFonte(fonte1);
        
        GPU gpu1 = new GPU();
        gpu1.setMarca(0);
        gpu1.setPreco(2300);
        gpu1.setNome("RTX 2060");
        gpu1.setMemoria(6);
        AdministraDados.adicionaGPU(gpu1);
        
        MemoriaRAM ram1 = new MemoriaRAM();
        ram1.setMarca(4);
        ram1.setPreco(200);
        ram1.setCapacidade(4);
        ram1.setClock(2667);
        AdministraDados.adicionaRAM(ram1);
        
        Motherboard mb1 = new Motherboard();
        mb1.setMarca(1);
        mb1.setPreco(770);
        mb1.setChipset(8);
        mb1.setTamanho(0);
        AdministraDados.adicionaMotherboard(mb1);
    }
    
    
    public static void main(String[] args) {
        
        rotinaInicializacao();
        
        System.out.println(AdministraDados.listaCPU.get(0));
        System.out.println(AdministraDados.listaDA.get(0));
        System.out.println(AdministraDados.listaFonte.get(0));
        System.out.println(AdministraDados.listaGPU.get(0));
        System.out.println(AdministraDados.listaRAM.get(0));
        System.out.println(AdministraDados.listaMB.get(0));
        
    }
    
}
