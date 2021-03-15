/*Autores:
  Caio César Lima de Azevedo;
  Fernando Dellão Menini;
  Gabriel Martins da Costa Medeiros - matricula 201935032
  Vinícius Barbosa Varoto;
  Weyder Luiz Gomes Gante.
  */

package gabrieloo.ufjf.galpoesestoque.pessoas;

import java.util.ArrayList;

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
