/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gabrieloo.ufjf.galpoesestoque.pessoas;

import gabrieloo.ufjf.galpoesestoque.vendas.Vendas;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author gabriel
 */
public class Cliente extends Usuario {
    
    private String endereco;
    private String telefone;
    private String email;
    private Date dataNascimento;
    private ArrayList<Vendas> ordens;
    
    
}
