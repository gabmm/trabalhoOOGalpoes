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
public class Fonte extends Produto {

    int power;
    boolean PFCAtivo, bivolt, modular;
    String eficiencia;

    ArrayList<String> plus80;

    public Fonte() {
        this.plus80 = new ArrayList<>();
        adicionaEficiente(plus80);
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        if (power < 0) {
            System.out.println("Potência inválida");
        } else {
            this.power = power;
        }
    }

    public boolean isPFCAtivo() {
        return PFCAtivo;
    }

    public void setPFCAtivo(boolean PFCAtivo) {
        this.PFCAtivo = PFCAtivo;
    }

    public boolean isBivolt() {
        return bivolt;
    }

    public void setBivolt(boolean bivolt) {
        this.bivolt = bivolt;
    }

    public boolean isModular() {
        return modular;
    }

    public void setModular(boolean modular) {
        this.modular = modular;
    }

    public String getEficiencia() {
        return eficiencia;
    }

    public void setEficiencia(int index) {
        this.eficiencia = plus80.get(index);
    }

    @Override
    public String getCor() {
        return cor;
    }

    @Override
    public void setCor(int index) {
        this.cor = cores.get(index);
    }

    @Override
    public String getMarca() {
        return marca;
    }

    @Override
    public void setMarca(int index) {
        this.marca = marcas.get(index);
    }

    private void adicionaEficiente(ArrayList plus80) {
        plus80.add("Standard");
        plus80.add("Bronze");
        plus80.add("Silver");
        plus80.add("Gold");
        plus80.add("Platinium");
        plus80.add("Titanium");
    }

    @Override
    protected int getId() {
        return this.id;
    }

    @Override
    protected void setId(int id) {
        if (id < 0) {
            System.out.println("ID inválida");
        } else {
            this.id = id;
        }
    }

    @Override
    protected void setGarantia(int garantia) {
        if (garantia < 0) {
            System.out.println("Garantia inválida");
        } else {
            this.garantia = garantia;
        }
    }

    @Override
    protected int getGarantia() {
        return this.garantia;
    }

    @Override
    protected void setPreco(float preco) {
        if (preco < 0) {
            System.out.println("Preço inválido");
        } else {
            this.preco = preco;
        }
    }

    @Override
    protected float getPreco() {
        return preco;
    }

    @Override
    protected void setMargem(float margem) {
        if (margem < 0 || margem > 1) {
            System.out.println("Margem inválida");
        } else {
            this.margem = margem;
        }

    }

    @Override
    protected float getMargem() {
        return margem;
    }

    @Override
    protected void setPeso(float peso) {
        this.peso = peso;
    }

    @Override
    protected float getPeso() {
        return peso;
    }

}
