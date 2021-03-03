/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gabrieloo.ufjf.galpoesestoque.pessoas;

import java.util.ArrayList;

/**
 *
 * @author gabriel
 */
public class Vendedor extends Funcionario {

    public final double COMISSAO_VENDEDOR = 0.05;

    public Vendedor() {
        this.vendasRealizadas = new ArrayList<>();
    }

    public double getCOMISSAO_VENDEDOR() {
        return COMISSAO_VENDEDOR;
    }

    @Override
    public double calculaSalario() {
        double comissao = 0;
        for (int i = 0; i < this.vendasRealizadas.size(); i++) {
            comissao += this.vendasRealizadas.get(i).getValorTotal() * COMISSAO_VENDEDOR;
        }

        return this.getSalarioBase() + comissao;
    }
}
