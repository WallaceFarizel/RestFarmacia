package br.com.farmacia.model.negocio;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

@Entity
@Table(name = "TProduto")
@Inheritance(strategy = InheritanceType.JOINED)
@JsonTypeInfo(
		use = JsonTypeInfo.Id.NAME, 
		include = JsonTypeInfo.As.PROPERTY, 
		property = "tipoProduto"
	)
@JsonSubTypes({
    @JsonSubTypes.Type(value=Pharmacos.class, name = "Pharmacos"),
    @JsonSubTypes.Type(value=Beleza.class, name = "Beleza")
})
public abstract class Produto{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String nome;
	private float preco;
	private String validade;
	@ManyToOne
	@JoinColumn(name = "idLoja")
	@JsonBackReference
	private Loja loja;
	
	public Produto() {	
	}
	
	public Produto(String nome, float preco, String validade) {
		super();
		this.nome = nome;
		this.preco = preco;
		this.validade = validade;
	}
	
	@Override
	public String toString() {
		return String.format("Produto: %s\nMarca: %s\nPreço: %.2f\n", 
				this.getNome(),
				this.getValidade(),
				this.getPreco()
			);
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public float getPreco() {
		return preco;
	}
	public void setPreco(float preco) {
		this.preco = preco;
	}
	public String getValidade() {
		return validade;
	}
	public void setValidade(String validade) {
		this.validade = validade;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Loja getLoja() {
		return loja;
	}
	public void setLoja(Loja loja) {
		this.loja = loja;
	}
}
