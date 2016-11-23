package aula6.sistema_de_compras_respostas;

public class Item {

	private Produto produto;
	private int qtd;

	public Item(Produto produto, int qtd) {
		this.produto = produto;
		this.qtd = qtd;
	}

	public String getNome() {
		return this.produto.getNome();
	}

	public int getQtd() {
		return this.qtd;
	}

	public double getValor() {
		return this.qtd * this.produto.getPreco();
	}

}
