/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gabrieloo.ufjf.galpoesestoque.pessoas;

import gabrieloo.ufjf.galpoesestoque.vendas.Venda;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author gabriel
 */
public class Cliente extends Usuario {

    private String endereco;
    private String telefone;
    private Date dataNascimento;
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

    public Date getDataNascimento() {
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

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }
}
