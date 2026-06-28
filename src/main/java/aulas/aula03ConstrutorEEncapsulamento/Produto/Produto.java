package aulas.aula03ConstrutorEEncapsulamento.Produto;

public class Produto {
	private int codigo;
	private String descricao;
	private double precoCusto;
	private int estoque;
	
	Produto(int codigo, String descricao, double precoCusto){
		this.codigo       = codigo;
		this.descricao    = descricao;
		this.precoCusto   = precoCusto;
	}
	
	public int getCodigo() {
		return codigo;
	}
	
	public String getDescricao() {
		return descricao;
	}
	public double getPrecoCusto() {
		return precoCusto;
	}
	
	public int getEstoque() {
		return estoque;
	}
	//O código não tem o set pois não pode mudar por regra.
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public void setPrecoCusto(double precoCusto) {
		this.precoCusto = precoCusto;
	}
	//Set para estoque só pode ser feito com um método específcio da classe
	
	public void entradaProduto(int quantidade) {
		this.estoque += quantidade;
	}
	
	public boolean saidaProduto(int quantidade) {
		if(estoque >= quantidade) {
			estoque -= quantidade;
			return true;
		}
		return false;
	}
}
