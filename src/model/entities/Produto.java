package model.entities;

public class Produto {
	private String nome;
	private Double preco;

	public Produto() {
		super();
	}

	public Produto(String nome, Double preco) {
		super();
		this.nome = nome;
		this.preco = preco;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getPreco() {
		return preco;
	}

	public void setPreco(Double preco) {
		this.preco = preco;
	}

	public static boolean staticProdutoPredicate(Produto p) {
		return p.getPreco() >= 100.00;
	}

	public static void staticAtualizaPrecoConsumer(Produto p) {
		p.setPreco(p.getPreco() * 1.1);
	}
	
	public static String staticUpperCaseName(Produto p) {
		return p.getNome().toUpperCase();
	}
	
	public void nonStatisAtualizaPrecoConsumer() {
		setPreco(getPreco() * 1.1);
	}
	
	public String nonStaticUpperCaseName() {
		return getNome().toUpperCase();
	}

	public boolean nonStaticProdutoPredicate() {
		return getPreco() >= 100.00;
	}

	@Override
	public String toString() {
		return " Produto [" + nome + ", " + String.format("%.2f", preco) + "]";
	}

}
