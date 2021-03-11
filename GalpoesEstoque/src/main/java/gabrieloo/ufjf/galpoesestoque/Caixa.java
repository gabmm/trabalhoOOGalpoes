/*Autores:
  Caio César Lima de Azevedo;
  Fernando Dellão Menini;
  Gabriel Martins da Costa Medeiros;
  Vinícius Barbosa Varoto;
  Weyder Luiz Gomes Gante.
  */

package gabrieloo.ufjf.galpoesestoque;

public class Caixa {

    private static double caixa = 0;

    public static void addCaixa(double valor) {
        caixa += valor;
    }

    public static double getCaixa() {
        return caixa;
    }

    public static double getSaldo() {
        return (caixa - calculaPagamentoSalarios());
    }

    public static double calculaPagamentoSalarios() {
        double totalSalarios = 0;

        for (int i = 0; i < AdministraDados.funcionarioLista.size(); i++) {
            totalSalarios += AdministraDados.funcionarioLista.get(i).calculaSalario();
        }

        return totalSalarios;
    }

}
