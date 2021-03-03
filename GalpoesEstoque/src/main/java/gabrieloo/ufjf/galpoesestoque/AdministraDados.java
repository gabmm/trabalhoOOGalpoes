/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
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

/**
 *
 * @author gabriel
 */
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

    public static void cadastraProduto() {
        //pergunta categoria
        //instancia objeto na categoria
        //seta atributos do objeto
        //add novo objeto na lista
    }

    public static void adicionaProdutos() {
        //pergunta categoria
        //mostra lista de objetos da categoria
        //seleciona objeto
        //le valor (pode ser negativo)
        //quantidade do objeto += valor
        //quantidade da classe do objeto += valor
        //quantidadeProdutos += valor
    }

    public static void editaProduto() {
        //pergunta categoria
        //mostra lista de objetos da categoria
        //seleciona objeto
        //quantidade do objeto += valor
        //quantidade da classe do objeto += valor
        //quantidadeProdutos += valor
    }

    public static void removeProduto() {
        //descadastro de produto
        //pergunta categoria
        //mostra lista de objetos da categoria
        //seleciona objeto
        //seta atributos do objeto para atributos padrao (remover pode gerar execoes)
        //quantidade da classe do objeto -= quantidade do objeto
        //quantidadeProdutos -= quantidade do objeto
    }

    public static void cadastraUsuario() {
        //pergunta categoria de usuario (apenas gerentes podem cadastrar funcionarios)
        //instancia novo usuario daquela categoria
        //pergunta e seta atributos daquele cliente
        //adiciona cliente a lista de clientes
    }

    public static void editaUsuario() {
        //pergunta se cliente ou funcionario
        //mostra lista ded objetos da categoria selecionada
        //seleciona objeto
        //mostra atributos do objeto
        //seta os atributos desejados com novos valores
    }

    public static void removeUsuario() {
        //pergunta categoria de usuario (apenas gerentes podem remover funcionarios)
        //mostra lista de objetos da categoria selecionada
        //seleciona objeto
        //seta atributos do objeto para atributos padrao (remover pode gerar execoes)
    }

    public static void realizaVenda(Funcionario funcionario, Cliente cliente, boolean ehCartao, Produto... produtos) {
        Venda venda = new Venda();
        venda.setCliente(cliente);
        venda.setFuncionario(funcionario);
        venda.addProduto(produtos);
        venda.setEhCartao(ehCartao);
        Caixa.addCaixa(venda.getValorTotal());
        funcionario.addVenda(venda);
        cliente.addOrdem(venda);
        adicionaVenda(venda);
    }

    public static void cadastraCPU() {
        CPU cpu = new CPU();

        //mostra atributos
        //para todos os atributos:
        //setAtributo(valorLido)
        adicionaCPU(cpu);
    }

    public static void cadastraFonte() {
        Fonte fonte = new Fonte();

        //mostra atributos
        //para todos os atributos:
        //setAtributo(valorLido)
        adicionaFonte(fonte);
    }

    public static void cadastraGPU() {
        GPU gpu = new GPU();

        //mostra atributos
        //para todos os atributos:
        //setAtributo(valorLido)
        adicionaGPU(gpu);
    }

    public static void cadastraDA() {
        DispositivoArmazenamento DA = new DispositivoArmazenamento();

        //mostra atributos
        //para todos os atributos:
        //setAtributo(valorLido)
        adicionaDA(DA);
    }

    public static void cadastraRAM() {
        MemoriaRAM ram = new MemoriaRAM();

        //mostra atributos
        //para todos os atributos:
        //setAtributo(valorLido)
        adicionaRAM(ram);
    }

    public static void cadastraMotherboard() {
        Motherboard mb = new Motherboard();

        //mostra atributos
        //para todos os atributos:
        //setAtributo(valorLido)
        adicionaMotherboard(mb);
    }
    
    public static void cadastraCliente()
    {
        Cliente cliente = new Cliente();
        
        //mostra atributos
        //para todos os atributos:
        //setAtributo(valorLido)
        adicionaCliente(cliente);
    }
    
    public static void cadastraVendedor()
    {
        Vendedor vendedor = new Vendedor();
        
        //mostra atributos
        //para todos os atributos:
        //setAtributo(valorLido)
        adicionaFuncionario(vendedor);
    }
    
    public static void cadastraGerente()
    {
        Gerente gerente = new Gerente();
        
        //mostra atributos
        //para todos os atributos:
        //setAtributo(valorLido)
        adicionaFuncionario(gerente);
    }

    
}
