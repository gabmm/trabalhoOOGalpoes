/*Autores:
  Caio César Lima de Azevedo;
  Fernando Dellão Menini;
  Gabriel Martins da Costa Medeiros;
  Vinícius Barbosa Varoto;
  Weyder Luiz Gomes Gante.
  */
package gabrieloo.ufjf.galpoesestoque.pessoas;

import java.util.ArrayList;

public class Gerente extends Funcionario{

    private final double COMISSAO_GERENTE = 0.1;

    public double getCOMISSAO_GERENTE() {
        return COMISSAO_GERENTE;
    }

    public Gerente() {
        this.vendasRealizadas = new ArrayList<>();
    }

    @Override
    public double calculaSalario() {
        double comissao = 0;
        for (int i = 0; i < this.vendasRealizadas.size(); i++) {
            comissao += this.vendasRealizadas.get(i).getValorTotal() * COMISSAO_GERENTE;
        }

        return this.getSalarioBase() + comissao;
    }
}
