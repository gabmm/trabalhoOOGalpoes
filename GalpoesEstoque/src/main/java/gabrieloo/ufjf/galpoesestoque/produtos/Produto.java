package gabrieloo.ufjf.galpoesestoque.produtos;

import java.util.ArrayList;

/**
 *
 * @author gabriel
 */
public abstract class Produto {

    protected int id;
    protected int garantia;
    protected float preco, margem, peso;
    String cor, marca;

    ArrayList<String> cores;
    ArrayList<String> marcas;

    public Produto() {
        cores = new ArrayList<>();
        marcas = new ArrayList<>();
        adicionaCores(cores);
        adicionaMarcas(marcas);
    }

    protected abstract int getId();

    protected abstract void setId(int id);

    protected abstract void setGarantia(int garantia);

    protected abstract int getGarantia();

    protected abstract void setPreco(float preco);

    protected abstract float getPreco();

    protected abstract void setMargem(float margem);

    protected abstract float getMargem();

    protected abstract void setPeso(float peso);

    protected abstract float getPeso();

    protected abstract void setMarca(int index);

    protected abstract String getMarca();

    protected abstract void setCor(int index);

    protected abstract String getCor();
    
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
}
