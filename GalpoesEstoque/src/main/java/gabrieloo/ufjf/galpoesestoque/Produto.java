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

    protected void setMarca(String marca){
		this.marca = marca;
	}
	
	protected String getMarca(){
		return marca;
	}
	
    protected void setModelo(String modelo){
		this.modelo = modelo;
	}
	
	protected String getModelo(){
		return modelo;
	}
	
    protected void setEstado(String estado){
		this.estado = estado;
	}
	
	protected String getEstado(){
		return estado;
	}

    protected void setCor(String cor){
		this.cor = cor;
	}
	
	protected String getCor(){
		return cor;
	}
}
