package gabrieloo.ufjf.galpoesestoque.produtos;

import java.util.ArrayList;

/**
 *
 * @author gabriel
 */
public abstract class Produto {

    private int id, margem;
    private static int quantidadeTotal = 0;
    private int garantia;
    private float preco, peso;
    private String cor, marca;

    private static ArrayList<String> cores;
    private static ArrayList<String> marcas;
    private static ArrayList<Integer> margens;
    private static ArrayList<Integer> garantias;

    public Produto() {
        quantidadeTotal++;
    }
    
    // <editor-fold defaultstate="collapsed" desc="Setters e Getters">

    public static int getQuantidadeTotal() {
        return quantidadeTotal;
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        if (id > 0) {
            this.id = id;
        }
    }

    public int getGarantia() {
        return garantia;
    }

    public void setGarantia(int index) {
        this.garantia = garantias.get(index);
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        if (preco > 0) {
            this.preco = preco;
        }
    }

    public float getMargem() {
        return margem;
    }

    public void setMargem(int index) {
        this.margem = margens.get(index);
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        if (peso > 0) {
            this.peso = peso;
        }
    }

    public String getCor() {
        return cor;
    }

    public void setCor(int index) {
        this.cor = cores.get(index);
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(int index) {
        this.marca = marcas.get(index);
    }
    
    // </editor-fold>
    
    // <editor-fold defaultstate="collapsed" desc="Inicializacao de listas">
    
    public static void inicializaListasProdutos()
    {
        cores = new ArrayList<>();
        marcas = new ArrayList<>();
        margens = new ArrayList<>();
        garantias = new ArrayList<>();
        adicionaGarantias(garantias);
        adicionaMargens(margens);
        adicionaCores(cores);
        adicionaMarcas(marcas);
    }

    private static void adicionaCores(ArrayList<String> cores) {
        cores.add("Vermelho");
        cores.add("Preto");
        cores.add("Azul");
        cores.add("Verde");
        cores.add("Rosa");
        cores.add("Branco");
        cores.add("Roxo");
        cores.add("Amarelo");
        cores.add("Laranja");
        cores.add("Cinza");
        cores.add("Marrom");
    }

    private static void adicionaMarcas(ArrayList<String> marcas) {
        marcas.add("EVGA");
        marcas.add("Asus");
        marcas.add("MSI");
        marcas.add("XFX");
        marcas.add("HyperX");
        marcas.add("Crucial");
        marcas.add("AMD");
        marcas.add("Adata");
        marcas.add("Intel");
        marcas.add("PowerColor");
    }

    private static void adicionaMargens(ArrayList<Integer> margens) {
        for (int i = 0; i < 51; i += 5) {
            margens.add(i);
        }
    }

    private static void adicionaGarantias(ArrayList<Integer> garantias) {
        for (int i = 6; i < 37; i += 3) {
            garantias.add(i);
        }
    }
    
    // </editor-fold>
    
    // <editor-fold defaultstate="collapsed" desc="Metodos de print de listas">
    
    public static void mostraMarcas(ArrayList<String> marcas)
    {
        for (String marca : marcas) {
            System.out.println(marca);
        }
    }
    
    public static void mostraCores(ArrayList<String> cores)
    {
        for (String cor : cores) {
            System.out.println(cor);
        }
    }
    
    public static void mostraGarantias(ArrayList<Integer> garantias)
    {
        for (Integer garantia : garantias) {
            System.out.println(garantia + " meses");
        }
    }
    
    public static void mostraMargens(ArrayList<Integer> margens)
    {
        for (Integer margem : margens) {
            System.out.println(margem + "%");
        }
    }
    
    // </editor-fold>
}
