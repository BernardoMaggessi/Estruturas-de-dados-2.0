package ordenacao.implementation.entities;

public class Product {
	private String nome;
	private String descricao;
	private Double preco;
	
	public Product() {}
	
	public Product(String nome, String descricao, Double preco) {
		this.nome = nome;
		this.descricao = descricao;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public Double getPreco() {
		return preco;
	}
	public void setPreco(Double preco) {
		this.preco = preco;
	}
	@Override
	public String toString() {
		return "Produto -> "+nome+'\''+"Preco:"+preco+'\''+"Descricão do produto:"+descricao;
	}
	//Lógica implantada Em ProductService -- dentro do pacote service
}
