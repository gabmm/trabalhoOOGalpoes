/*Autores:
  Caio César Lima de Azevedo;
  Fernando Dellão Menini;
  Gabriel Martins da Costa Medeiros;
  Vinícius Barbosa Varoto;
  Weyder Luiz Gomes Gante.
 */
package gabrieloo.ufjf.galpoesestoque;

import static java.awt.Frame.MAXIMIZED_BOTH;
import javax.swing.JFrame;

public class Main {

    private static void rotinaInicializacao() {
        AdministraDados.inicializacaoListas();

        AdministraDados.cadastraCPU();
        AdministraDados.listaCPU.get(0).setMarca(6);
        AdministraDados.listaCPU.get(0).setPreco(1300);
        AdministraDados.listaCPU.get(0).setNome("Ryzen 5 3500x");
        AdministraDados.listaCPU.get(0).setCoreThreads(0);

        AdministraDados.cadastraDA();
        AdministraDados.listaDA.get(0).setMarca(7);
        AdministraDados.listaDA.get(0).setPreco(250);
        AdministraDados.listaDA.get(0).setTipo(0);
        AdministraDados.listaDA.get(0).setCapacidade(4);

        AdministraDados.cadastraFonte();
        AdministraDados.listaFonte.get(0).setMarca(3);
        AdministraDados.listaFonte.get(0).setPreco(500);
        AdministraDados.listaFonte.get(0).setEficiencia(2);
        AdministraDados.listaFonte.get(0).setPower(6);

        AdministraDados.cadastraGPU();
        AdministraDados.listaGPU.get(0).setMarca(0);
        AdministraDados.listaGPU.get(0).setPreco(2300);
        AdministraDados.listaGPU.get(0).setNome("RTX 2060");
        AdministraDados.listaGPU.get(0).setMemoria(6);

        AdministraDados.cadastraRAM();
        AdministraDados.listaRAM.get(0).setMarca(4);
        AdministraDados.listaRAM.get(0).setPreco(200);
        AdministraDados.listaRAM.get(0).setCapacidade(4);
        AdministraDados.listaRAM.get(0).setClock(2667);

        AdministraDados.cadastraRAM();
        AdministraDados.listaRAM.get(1).setMarca(3);
        AdministraDados.listaRAM.get(1).setPreco(120);
        AdministraDados.listaRAM.get(1).setCapacidade(2);
        AdministraDados.listaRAM.get(1).setClock(1334);

        AdministraDados.cadastraMotherboard();
        AdministraDados.listaMB.get(0).setMarca(1);
        AdministraDados.listaMB.get(0).setPreco(770);
        AdministraDados.listaMB.get(0).setChipset(8);
        AdministraDados.listaMB.get(0).setTamanho(0);

        AdministraDados.cadastraGerente();
        AdministraDados.funcionarioLista.get(0).setNome("Jober Arauto");
        AdministraDados.funcionarioLista.get(0).setEmail("joarauto@galpoes.com");
        AdministraDados.funcionarioLista.get(0).setSalarioBase(4800);
        Autenticacao.grava("joarauto", "galpao123");

        AdministraDados.cadastraCliente();
        AdministraDados.clienteLista.get(0).setNome("Julia Trista");
        AdministraDados.clienteLista.get(0).setEmail("jujuzinha2014@hotmail.com");

        AdministraDados.cadastraCliente();
        AdministraDados.clienteLista.get(1).setNome("Enzo Valentino");
        AdministraDados.clienteLista.get(1).setEmail("valenteenzo69@gmail.com");

        AdministraDados.cadastraVendedor();
        AdministraDados.funcionarioLista.get(1).setNome("Ana Gabriela de Passos Lima");
        AdministraDados.funcionarioLista.get(1).setEmail("anagabi@galpoes.com");
        AdministraDados.funcionarioLista.get(1).setSalarioBase(2200);

    }

    public static void main(String[] args) {

        rotinaInicializacao();

//        System.out.println(AdministraDados.listaCPU.get(0));
//        System.out.println(AdministraDados.listaDA.get(0));
//        System.out.println(AdministraDados.listaFonte.get(0));
//        System.out.println(AdministraDados.listaGPU.get(0));
//        System.out.println(AdministraDados.listaRAM.get(0));
//        System.out.println(AdministraDados.listaRAM.get(1));
//        System.out.println(AdministraDados.listaMB.get(0));
//        System.out.println("");
//        System.out.println(AdministraDados.clienteLista.get(0));
//        System.out.println("");
//        System.out.println(AdministraDados.funcionarioLista.get(0));
//        System.out.println("Salario: R$" + AdministraDados.funcionarioLista.get(0).calculaSalario());
//        System.out.println(AdministraDados.funcionarioLista.get(1));
//        System.out.println("Salario: R$" + AdministraDados.funcionarioLista.get(1).calculaSalario());
//        System.out.println("");
//        System.out.println(AdministraDados.funcionarioLista.get(1).vendasRealizadas.get(0));
//        System.out.println(AdministraDados.clienteLista.get(0).ordens.get(1));
//        System.out.println("Valor em caixa: R$" + Caixa.getCaixa());
//        System.out.println("Valor a pagar de salarios: R$" + Caixa.calculaPagamentoSalarios());
//        System.out.println("Saldo: R$" + Caixa.getSaldo());
//
        TelaLogin tela = new TelaLogin();
        tela.abreTela();

//        TelaProduto tela = new TelaProduto();
//        tela.incializaTelaProduto();
//        TelaPrincipal telaPrincipal = new TelaPrincipal(AdministraDados.funcionarioLista.get(1));
//        telaPrincipal.abreTela();
    }

}
