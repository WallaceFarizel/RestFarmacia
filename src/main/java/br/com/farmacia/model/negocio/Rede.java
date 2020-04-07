package br.com.farmacia.model.negocio;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "TRede")
public class Rede{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String nome;
	private String slogan;
	private int anoDeCriacao;

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
}
