package br.com.farmacia.model.negocio;

import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name = "TLivro")
@PrimaryKeyJoinColumn(name = "idProduto")
public class Beleza extends Produto{
	private String marca;
	private String descricao;
	private boolean promocao;
	
	public Beleza() {
		
	}
	
	public Beleza(String nome, float preco, String validade, String marca, String descricao, boolean promocao) {
		super(nome, preco, validade);
		this.marca = marca;
		this.descricao = descricao;
		this.promocao = promocao;
	}

	@Override
	public String toString() {
		return String.format("%sMarca: %s\nDescrição: %s\n%s", 
				super.toString(),
				this.getMarca(),
				this.getDescricao(),
				this.isPromocao() ? "Produto em promoção, procure um de nossos vendedores." : "Nenhuma promoção encontrada para o produto" 
			);
	}
	
	//getters and setters
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public boolean isPromocao() {
		return promocao;
	}
	public void setPromocao(boolean promocao) {
		this.promocao = promocao;
	}
}
