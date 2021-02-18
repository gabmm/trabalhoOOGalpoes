package gabrieloo.ufjf.galpoesestoque.produtos;

import java.util.ArrayList;

/**
 *
 * @author gabriel
 */
public abstract class Produto {

    protected int id, margem;
    protected int garantia;
    protected float preco, peso;
    String cor, marca;

    ArrayList<String> cores;
    ArrayList<String> marcas;
    ArrayList<Integer> margens;
    ArrayList<Integer> garantias;

    public Produto() {
        cores = new ArrayList<>();
        marcas = new ArrayList<>();
        margens = new ArrayList<>();
        garantias = new ArrayList<>();
        adicionaGarantias(garantias);
        adicionaMargens(margens);
        adicionaCores(cores);
        adicionaMarcas(marcas);
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

    private void adicionaCores(ArrayList<String> cores) {
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

    private void adicionaMarcas(ArrayList<String> marcas) {
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

    private void adicionaMargens(ArrayList<Integer> margens) {
        for (int i = 0; i < 51; i += 5) {
            margens.add(i);
        }
    }

    private void adicionaGarantias(ArrayList<Integer> garantias) {
        for (int i = 6; i < 37; i += 3) {
            garantias.add(i);
        }
    }
}
