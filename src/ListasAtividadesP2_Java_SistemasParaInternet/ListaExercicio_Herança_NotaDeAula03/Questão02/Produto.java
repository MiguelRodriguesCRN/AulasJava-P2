package ListasAtividadesP2_Java_SistemasParaInternet.ListaExercicio_Herança_NotaDeAula03.Questão02;
import java.util.Scanner;
public class Produto {

    protected String nome;
    protected int estoque_tv, estoque_smartphone;
    protected int preco;

    public int select_cadastro, select_venda, select_geral, select_acao;


    public int getSelect_acao() {
        return select_acao;
    }

    public void setSelect_acao(int select_acao) {
        this.select_acao = select_acao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getEstoque_tv() {
        return estoque_tv;
    }

    public void setEstoque_tv(int estoque_tv) {
        this.estoque_tv = estoque_tv;
    }

    public int getEstoque_smartphone() {
        return estoque_smartphone;
    }

    public void setEstoque_smartphone(int estoque_smartphone) {
        this.estoque_smartphone = estoque_smartphone;
    }

    public int getPreco() {
        return preco;
    }

    public void setPreco(int preco) {
        this.preco = preco;
    }

    public int getSelect_cadastro() {
        return select_cadastro;
    }

    public void setSelect_cadastro(int select_cadastro) {
        this.select_cadastro = select_cadastro;
    }

    public int getSelect_venda() {
        return select_venda;
    }

    public void setSelect_venda(int select_venda) {
        this.select_venda = select_venda;
    }

    public int getSelect_geral() {
        return select_geral;
    }

    public void setSelect_geral(int select_geral) {
        this.select_geral = select_geral;
    }

    // Divisão Cadastro

    public void Cadastro() {

        if (select_cadastro == 1) {

            estoque_smartphone = estoque_smartphone + 1;
        } else {
            estoque_tv = estoque_tv + 1;
        }
    }

    public void exibirEstoque() {
        System.out.println("Estoques TV: "+estoque_tv);
        System.out.println("Estoques Smartphone: "+estoque_smartphone);
    }

    // Divisão Vendas

    public void Venda() {

        if (select_venda == 1) {

            estoque_smartphone = estoque_smartphone - 1;
        } else {
            estoque_tv = estoque_tv - 1;
        }

    }




}
