/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gabrieloo.ufjf.galpoesestoque;

/**
 *
 * @author gabriel
 */
public abstract class Produto {
	private int id, garantia;
	private float preco, margem, peso, volume;
	private String marca, modelo, estado, cor;

	protected int getId(){
		return id;
	}

	protected void setId(int id){
		this.id = id;
	}	
	
	protected int setGarantia(int garantia){
		this.garantia = garantia;
	}
	
	protected int getGarantia(){
		return garantia;
	}

	protected void setPreco(float preco){
		this.preco = preco;
	}
	
	protected float getPreco(){
		return preco;
	}
	
	protected void setMargem(float margem){
		this.margem = margem;
	}
	
	protected float getMargem(){
		return margem;
	}

	protected void setPeso(float peso){
		this.peso = peso;
	}
	
	protected float getPeso(){
		return peso;
	}

	protected void setVolume(float volume){
		this.volume = volume;
	}
	
	protected float getVolume(){
		return volume;
	}

    protected void setMarca(float marca){
		this.marca = marca;
	}
	
	protected float getMarca(){
		return marca;
	}

}
