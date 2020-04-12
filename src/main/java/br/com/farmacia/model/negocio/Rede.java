package br.com.farmacia.model.negocio;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
@Table(name = "TRede")
public class Rede{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(unique = true)
	private String nome;
	private String slogan;
	private int anoDeCriacao;
	@OneToMany(
			mappedBy = "rede",
			fetch = FetchType.EAGER,
			cascade = CascadeType.ALL,
			orphanRemoval = true
		)
	@JsonManagedReference
	private List<Loja> lojas;
	
	public Rede() {
		
	}
	
	public Rede(Integer id) {
		this.id = id;
	}

	public Rede(String nome, String slogan, int anoDeCriacao) {
		this.nome = nome;
		this.slogan = slogan;
		this.anoDeCriacao = anoDeCriacao;
	}
	
	public Rede(int id, String nome, String slogan, int anoDeCriacao) {
		this(nome, slogan, anoDeCriacao);
		this.id = id;
	}
	
	@Override
	public String toString() {
		return String.format("%d - %s - %s - %d", 
				this.getId(),
				this.getNome(),
				this.getSlogan(),
				this.getAnoDeCriacao()
			);
	}
	
	public void exibir() {
		System.out.println(this);
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public String getSlogan() {
		return slogan;
	}
	public int getAnoDeCriacao() {
		return anoDeCriacao;
	}
	public List<Loja> getLojas() {
		return lojas;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public void setSlogan(String slogan) {
		this.slogan = slogan;
	}
	public void setAnoDeCriacao(int anoDeCriacao) {
		this.anoDeCriacao = anoDeCriacao;
	}
	public void setLojas(List<Loja> lojas) {
		this.lojas = lojas;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Rede other = (Rede) obj;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		return true;
	}
}
