/*Autores:
  Caio César Lima de Azevedo;
  Fernando Dellão Menini;
  Gabriel Martins da Costa Medeiros;
  Vinícius Barbosa Varoto;
  Weyder Luiz Gomes Gante.
  */
package gabrieloo.ufjf.galpoesestoque.pessoas;

import gabrieloo.ufjf.galpoesestoque.vendas.Venda;
import java.util.ArrayList;

public class Cliente extends Usuario {

    private String endereco;
    private String telefone;
    private String dataNascimento;
    public ArrayList<Venda> ordens;

    public Cliente() {
        this.ordens = new ArrayList<>();
    }

    public void addOrdem(Venda ordem) {
        this.ordens.add(ordem);
    }

    public String getEndereco() {
        return endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public ArrayList<Venda> getOrdens() {
        return ordens;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }
}
