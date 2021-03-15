/*Autores:
  Caio César Lima de Azevedo;
  Fernando Dellão Menini;
  Gabriel Martins da Costa Medeiros;
  Vinícius Barbosa Varoto;
  Weyder Luiz Gomes Gante.
 */
package gabrieloo.ufjf.galpoesestoque;

import gabrieloo.ufjf.galpoesestoque.pessoas.Cliente;
import gabrieloo.ufjf.galpoesestoque.pessoas.Funcionario;
import gabrieloo.ufjf.galpoesestoque.pessoas.Gerente;
import gabrieloo.ufjf.galpoesestoque.pessoas.Vendedor;
import gabrieloo.ufjf.galpoesestoque.produtos.CPU;
import gabrieloo.ufjf.galpoesestoque.produtos.DispositivoArmazenamento;
import gabrieloo.ufjf.galpoesestoque.produtos.Fonte;
import gabrieloo.ufjf.galpoesestoque.produtos.GPU;
import gabrieloo.ufjf.galpoesestoque.produtos.MemoriaRAM;
import gabrieloo.ufjf.galpoesestoque.produtos.Motherboard;
import gabrieloo.ufjf.galpoesestoque.produtos.Produto;
import gabrieloo.ufjf.galpoesestoque.vendas.Venda;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class AdministraDados {

    public static ArrayList<CPU> listaCPU;
    public static ArrayList<Fonte> listaFonte;
    public static ArrayList<GPU> listaGPU;
    public static ArrayList<MemoriaRAM> listaRAM;
    public static ArrayList<Motherboard> listaMB;
    public static ArrayList<DispositivoArmazenamento> listaDA;

    public static ArrayList<String> coreThreadLista;
    public static ArrayList<String> chipsetLista;
    public static ArrayList<String> plus80Lista;
    public static ArrayList<Integer> powerLista;
    public static ArrayList<String> tamanhoMBLista;
    public static ArrayList<String> memoriaCapacidadeLista;
    public static ArrayList<String> marcaLista;
    public static ArrayList<String> tipoArmazenamentoLista;
    public static ArrayList<String> capacidadeArmazenamentoLista;

    public static ArrayList<Cliente> clienteLista;
    public static ArrayList<Funcionario> funcionarioLista;
    public static ArrayList<Produto> produtoLista;

    public static ArrayList<Venda> vendaLista;

    private static ArrayList<String> categoria;
    private static int categoriaIndex;

    private static int quantidadeProdutos = 0;
    private static int quantidadeCPUs = 0;
    private static int quantidadeFontes = 0;
    private static int quantidadeGPUs = 0;
    private static int quantidadeRAMs = 0;
    private static int quantidadeMBs = 0;
    private static int quantidadeDAs = 0;

    private static int quantidadeClientes = 0;
    private static int quantidadeVendedores = 0;
    private static int quantidadeGerentes = 0;

    // <editor-fold defaultstate="collapsed" desc="Metodos de Inicializacao de Listas de produtos">
    public static void inicializacaoListas() {
        listaCPU = new ArrayList<>();
        listaFonte = new ArrayList<>();
        listaGPU = new ArrayList<>();
        listaRAM = new ArrayList<>();
        listaMB = new ArrayList<>();
        listaDA = new ArrayList<>();

        clienteLista = new ArrayList<>();
        funcionarioLista = new ArrayList<>();

        vendaLista = new ArrayList<>();

        categoria = new ArrayList<>();
        categoria.add("CPU");
        categoria.add("Fonte");
        categoria.add("GPU");
        categoria.add("Gabinete");
        categoria.add("Dispostivo de Armazenamento");
        categoria.add("Memória RAM");
        categoria.add("Placa-mãe");

        coreThreadLista = new ArrayList<>();
        chipsetLista = new ArrayList<>();
        plus80Lista = new ArrayList<>();
        powerLista = new ArrayList<>();
        tamanhoMBLista = new ArrayList<>();
        memoriaCapacidadeLista = new ArrayList<>();
        marcaLista = new ArrayList<>();
        tipoArmazenamentoLista = new ArrayList<>();
        capacidadeArmazenamentoLista = new ArrayList<>();

        adicionaCoreThreads(coreThreadLista);
        adicionaChipsets(chipsetLista);
        adicionaEficiencias(plus80Lista);
        adicionaPotencias(powerLista);
        adicionaTamanhosMB(tamanhoMBLista);
        adicionaCapacidadesMemorias(memoriaCapacidadeLista);
        adicionaMarcas(marcaLista);
        adicionaTipoArmazenamento(tipoArmazenamentoLista);
        adicionaCapacidadesArmazenamentos(capacidadeArmazenamentoLista);
    }

    private static void adicionaCoreThreads(ArrayList<String> coreThreadLista) {
        coreThreadLista.add("2/2");
        coreThreadLista.add("2/4");
        coreThreadLista.add("3/3");
        coreThreadLista.add("3/6");
        coreThreadLista.add("4/4");
        coreThreadLista.add("4/8");
        coreThreadLista.add("6/6");
        coreThreadLista.add("6/12");
        coreThreadLista.add("8/8");
        coreThreadLista.add("8/16");
        coreThreadLista.add("16/16");
        coreThreadLista.add("16/32");
    }

    private static void adicionaChipsets(ArrayList<String> chipsetLista) {
        chipsetLista.add("A320");
        chipsetLista.add("A520");
        chipsetLista.add("B350");
        chipsetLista.add("B450");
        chipsetLista.add("B550");
        chipsetLista.add("X370");
        chipsetLista.add("X470");
        chipsetLista.add("X399");
        chipsetLista.add("X570");
        chipsetLista.add("760G");
        chipsetLista.add("970");
        chipsetLista.add("A68H");
        chipsetLista.add("Q470");
        chipsetLista.add("W480");
        chipsetLista.add("B460");
        chipsetLista.add("H410");
        chipsetLista.add("Z490");
        chipsetLista.add("B365");
        chipsetLista.add("H310");
        chipsetLista.add("H370");
        chipsetLista.add("Q370");
        chipsetLista.add("B360");
        chipsetLista.add("Z370");
    }

    private static void adicionaEficiencias(ArrayList<String> plus80Lista) {
        plus80Lista.add("Standard");
        plus80Lista.add("Bronze");
        plus80Lista.add("Silver");
        plus80Lista.add("Gold");
        plus80Lista.add("Platinium");
        plus80Lista.add("Titanium");
    }

    private static void adicionaPotencias(ArrayList<Integer> powerLista) {
        for (int i = 300; i < 1001; i += 50) {
            powerLista.add(i);
        }
    }

    private static void adicionaTamanhosMB(ArrayList<String> tamanhoMBLista) {
        tamanhoMBLista.add("eATX");
        tamanhoMBLista.add("ATX");
        tamanhoMBLista.add("mATX");
        tamanhoMBLista.add("mini ITX");
    }

    private static void adicionaCapacidadesMemorias(ArrayList<String> memoriaCapacidadeLista) {
        memoriaCapacidadeLista.add("512 MB");
        memoriaCapacidadeLista.add("1 GB");
        memoriaCapacidadeLista.add("2 GB");
        memoriaCapacidadeLista.add("3 GB");
        memoriaCapacidadeLista.add("4 GB");
        memoriaCapacidadeLista.add("6 GB");
        memoriaCapacidadeLista.add("8 GB");
        memoriaCapacidadeLista.add("10 GB");
        memoriaCapacidadeLista.add("11 GB");
        memoriaCapacidadeLista.add("16 GB");
        memoriaCapacidadeLista.add("32 GB");
        memoriaCapacidadeLista.add("64 GB");
    }

    private static void adicionaMarcas(ArrayList<String> marcaLista) {
        marcaLista.add("EVGA");
        marcaLista.add("Asus");
        marcaLista.add("MSI");
        marcaLista.add("XFX");
        marcaLista.add("HyperX");
        marcaLista.add("Crucial");
        marcaLista.add("AMD");
        marcaLista.add("Adata");
        marcaLista.add("Intel");
        marcaLista.add("PowerColor");
        marcaLista.add("Kingston");
        marcaLista.add("Seagate");
        marcaLista.add("ATX");
        marcaLista.add("Corsair");
        marcaLista.add("Fortrek");
        marcaLista.add("Geforce");
        marcaLista.add("G.Skill");
        marcaLista.add("Gigabyte");
        marcaLista.add("ASRock");
        marcaLista.add("Biostar");
    }

    private static void adicionaTipoArmazenamento(ArrayList<String> tipoArmazenamentoLista) {
        tipoArmazenamentoLista.add("SSD");
        tipoArmazenamentoLista.add("HDD");
    }

    private static void adicionaCapacidadesArmazenamentos(ArrayList<String> capacidadeArmazenamentoLista) {
        capacidadeArmazenamentoLista.add("320 GB");
        capacidadeArmazenamentoLista.add("500 GB");
        capacidadeArmazenamentoLista.add("1 TB");
        capacidadeArmazenamentoLista.add("2 TB");
        capacidadeArmazenamentoLista.add("120 GB");
        capacidadeArmazenamentoLista.add("240 GB");
        capacidadeArmazenamentoLista.add("480 GB");
    }

    public static void adicionaCPU(CPU cpu) {
        listaCPU.add(cpu);
    }

    public static void adicionaFonte(Fonte fonte) {
        listaFonte.add(fonte);
    }

    public static void adicionaGPU(GPU gpu) {
        listaGPU.add(gpu);
    }

    public static void adicionaRAM(MemoriaRAM ram) {
        listaRAM.add(ram);
    }

    public static void adicionaMotherboard(Motherboard mb) {
        listaMB.add(mb);
    }

    public static void adicionaDA(DispositivoArmazenamento DA) {
        listaDA.add(DA);
    }

    public static void adicionaFuncionario(Funcionario funcionario) {
        funcionarioLista.add(funcionario);
    }

    public static void adicionaCliente(Cliente cliente) {
        clienteLista.add(cliente);
    }

    public static void adicionaVenda(Venda venda) {
        vendaLista.add(venda);
    }

    // </editor-fold>
    public static int getQuantidadeVendas() {
        return vendaLista.size();
    }

    public static void editaProduto(int categoria, int produto, int qtd) {
        String aux;
        int num = 0;
        if (categoria == 0) {
            aux = JOptionPane.showInputDialog("Digite a quantidade de "
                    + listaCPU.get(produto) + " que deseja editar. \nPor favor "
                    + "coloque o sinal de menos se a quanidade deva ser subtraida. ");
            if (verificaSeEhNumero(aux)) {
                num = Integer.parseInt(aux);
                num += listaCPU.get(produto).getQuantidade();
                if (num < 0) {
                    System.out.println("Não eh possivel registrar valor negativo!");
                    editaProduto(categoria, produto, qtd);
                } else {
                    listaCPU.get(produto).setQuantidade(num);
                }
            } else {
                System.out.println("Voce não digitou apenas numeros");
                editaProduto(categoria, produto, qtd);
            }
        } else if (categoria == 1) {
            aux = JOptionPane.showInputDialog("Digite a quantidade de "
                    + listaGPU.get(produto) + " que deseja editar. \nPor favor "
                    + "coloque o sinal de menos se a quanidade deva ser subtraida. ");
            if (verificaSeEhNumero(aux)) {
                num = Integer.parseInt(aux);
                num += listaGPU.get(produto).getQuantidade();
                if (num < 0) {
                    System.out.println("Não eh possivel registrar valor negativo!");
                    editaProduto(categoria, produto, qtd);
                } else {
                    listaGPU.get(produto).setQuantidade(num);
                }
            } else {
                System.out.println("Voce não digitou apenas numeros");
                editaProduto(categoria, produto, qtd);
            }
        } else if (categoria == 2) {
            aux = JOptionPane.showInputDialog("Digite a quantidade de "
                    + listaRAM.get(produto) + " que deseja editar. \nPor favor "
                    + "coloque o sinal de menos se a quanidade deva ser subtraida. ");
            if (verificaSeEhNumero(aux)) {
                num = Integer.parseInt(aux);
                num += listaRAM.get(produto).getQuantidade();
                if (num < 0) {
                    System.out.println("Não eh possivel registrar valor negativo!");
                    editaProduto(categoria, produto, qtd);
                } else {
                    listaRAM.get(produto).setQuantidade(num);
                }
            } else {
                System.out.println("Voce não digitou apenas numeros");
                editaProduto(categoria, produto, qtd);
            }
        } else if (categoria == 3) {
            aux = JOptionPane.showInputDialog("Digite a quantidade de "
                    + listaMB.get(produto) + " que deseja editar. \nPor favor "
                    + "coloque o sinal de menos se a quanidade deva ser subtraida. ");
            if (verificaSeEhNumero(aux)) {
                num = Integer.parseInt(aux);
                num += listaMB.get(produto).getQuantidade();
                if (num < 0) {
                    System.out.println("Não eh possivel registrar valor negativo!");
                    editaProduto(categoria, produto, qtd);
                } else {
                    listaMB.get(produto).setQuantidade(num);
                }
            } else {
                System.out.println("Voce não digitou apenas numeros");
                editaProduto(categoria, produto, qtd);
            }
        } else if (categoria == 4) {
            aux = JOptionPane.showInputDialog("Digite a quantidade de "
                    + listaDA.get(produto) + " que deseja editar. \nPor favor "
                    + "coloque o sinal de menos se a quanidade deva ser subtraida. ");
            if (verificaSeEhNumero(aux)) {
                num = Integer.parseInt(aux);
                num += listaDA.get(produto).getQuantidade();
                if (num < 0) {
                    System.out.println("Não eh possivel registrar valor negativo!");
                    editaProduto(categoria, produto, qtd);
                } else {
                    listaDA.get(produto).setQuantidade(num);
                }
            } else {
                System.out.println("Voce não digitou apenas numeros");
                editaProduto(categoria, produto, qtd);
            }
        } else if (categoria == 5) {
            aux = JOptionPane.showInputDialog("Digite a quantidade de "
                    + listaFonte.get(produto) + " que deseja editar. \nPor favor "
                    + "coloque o sinal de menos se a quanidade deva ser subtraida. ");
            if (verificaSeEhNumero(aux)) {
                num = Integer.parseInt(aux);
                num += listaFonte.get(produto).getQuantidade();
                if (num < 0) {
                    System.out.println("Não eh possivel registrar valor negativo!");
                    editaProduto(categoria, produto, qtd);
                } else {
                    listaFonte.get(produto).setQuantidade(num);
                }
            } else {
                System.out.println("Voce não digitou apenas numeros");
                editaProduto(categoria, produto, qtd);
            }
        }
    }

    public static boolean removeProduto(int categoria, int produto) {
        int aux;
        if (categoria == 0) {
            aux = JOptionPane.showConfirmDialog(null, "Você esta querendo remover: "
                    + listaCPU.get(produto));
            if (aux == JOptionPane.YES_OPTION) {
                listaCPU.remove(produto);
                return true;
            } else {
                return false;
            }
        } else if (categoria == 1) {
            aux = JOptionPane.showConfirmDialog(null, "Você esta querendo remover: "
                    + listaGPU.get(produto));
            if (aux == JOptionPane.YES_OPTION) {
                listaGPU.remove(produto);
                return true;
            } else {
                return false;
            }
        } else if (categoria == 2) {
            aux = JOptionPane.showConfirmDialog(null, "Você esta querendo remover: "
                    + listaRAM.get(produto));
            if (aux == JOptionPane.YES_OPTION) {
                listaRAM.remove(produto);
                return true;
            } else {
                return false;
            }
        } else if (categoria == 3) {
            aux = JOptionPane.showConfirmDialog(null, "Você esta querendo remover: "
                    + listaMB.get(produto));
            if (aux == JOptionPane.YES_OPTION) {
                listaMB.remove(produto);
                return true;
            } else {
                return false;
            }
        } else if (categoria == 4) {
            aux = JOptionPane.showConfirmDialog(null, "Você esta querendo remover: "
                    + listaDA.get(produto));
            if (aux == JOptionPane.YES_OPTION) {
                listaDA.remove(produto);
                return true;
            } else {
                return false;
            }
        } else if (categoria == 5) {
            aux = JOptionPane.showConfirmDialog(null, "Você esta querendo remover: "
                    + listaFonte.get(produto));
            if (aux == JOptionPane.YES_OPTION) {
                listaFonte.remove(produto);
                return true;
            } else {
                return false;
            }
        }
        return false;
    }

    public static boolean removeUsuario(int categoria, int usuario) {
        int aux;
        if (categoria == 0) {
            aux = JOptionPane.showConfirmDialog(null, "Você esta querendo remover: "
                    + clienteLista.get(usuario));
            if (aux == JOptionPane.YES_OPTION) {
                clienteLista.remove(usuario);
                return true;
            } else {
                return false;
            }
        } else if (categoria == 1) {
            aux = JOptionPane.showConfirmDialog(null, "Você esta querendo remover: "
                    + funcionarioLista.get(usuario));
            if (aux == JOptionPane.YES_OPTION) {
                funcionarioLista.remove(usuario);
                return true;
            } else {
                return false;
            }
        }
        return false;
    }

    public static void realizaVenda(Funcionario funcionario, Cliente cliente, boolean ehCartao, ArrayList<Produto> produtos) {
        Venda venda = new Venda();

        //mostrar lista clientes
        //escolher cliente da lista
        venda.setCliente(cliente);

        //seta funcionaro que fez login
        venda.setFuncionario(funcionario);

        //pergunta categoria do produto 1
        //mostra lista da categoria
        //seleciona o produto1
        //pergunta se quer outro produto...
        for (int i = 0; i < produtos.size(); i++) {
            if (produtos.get(i).getQuantidade() < 1) {
                JOptionPane.showMessageDialog(null, "Produto " + produtos.get(i) + " não vendido. Não há estoque suficiente.");
                produtos.remove(i);
            } else {
                produtos.get(i).setQuantidade(produtos.get(i).getQuantidade() - 1);
            }

        }
        venda.addProduto(produtos);

        //escolhe se eh cartao ou nao
        venda.setEhCartao(ehCartao);

        Caixa.addCaixa(venda.getValorTotal());
        funcionario.addVenda(venda);
        //cliente.addOrdem(venda);
        adicionaVenda(venda);
    }

    public static void cadastraCPU() {
        CPU cpu = new CPU();
        adicionaCPU(cpu);
    }

    public static void cadastraFonte() {
        Fonte fonte = new Fonte();
        adicionaFonte(fonte);
    }

    public static void cadastraGPU() {
        GPU gpu = new GPU();
        adicionaGPU(gpu);
    }

    public static void cadastraDA() {
        DispositivoArmazenamento DA = new DispositivoArmazenamento();
        adicionaDA(DA);
    }

    public static void cadastraRAM() {
        MemoriaRAM ram = new MemoriaRAM();
        adicionaRAM(ram);
    }

    public static void cadastraMotherboard() {
        Motherboard mb = new Motherboard();
        adicionaMotherboard(mb);
    }

    public static void cadastraCliente() {
        Cliente cliente = new Cliente();
        adicionaCliente(cliente);
    }

    public static void cadastraVendedor() {
        Vendedor vendedor = new Vendedor();
        adicionaFuncionario(vendedor);
    }

    public static void cadastraGerente() {
        Gerente gerente = new Gerente();
        adicionaFuncionario(gerente);
    }

    public static String[] transformaString(ArrayList<String> oqMuda) {
        String[] mudanca = new String[oqMuda.size()];
        for (int i = 0; i < oqMuda.size(); i++) {
            mudanca[i] = oqMuda.get(i);
        }
        return mudanca;
    }

    public static boolean verificaSeEhNumero(String verificar) {
        char[] numString = verificar.toCharArray();
        if (numString.length == 0) {
            return false;
        }
        for (int i = 0; i < numString.length; i++) {
            if (Character.isLetter(numString[i])) {
                return false;
            }
        }
        return true;
    }
}
